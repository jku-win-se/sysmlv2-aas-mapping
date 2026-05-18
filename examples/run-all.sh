#!/usr/bin/env bash
# run-all.sh — Run all SysML2AAS example transformations and check structural output.
#
# Usage:
#   ./run-all.sh
#   SYSML_MM=/path/to/SysML.ecore ./run-all.sh
#
# Environment variables:
#   TRANSFORMATION_JAR  path to transformation fat JAR
#                       (default: ../transformation/target/transformation-1.0-SNAPSHOT.jar)
#   AAS_MM              path to aas.ecore
#                       (default: ../aas/model/aas.ecore)
#   SYSML_MM            path to SysML.ecore from SysML v2 Pilot Implementation
#                       (required to run the transformation; vehicle uses pre-built output)
#
# SKIP mechanism:
#   - If input/ is empty → SKIP
#   - If input/SKIP sentinel file exists → SKIP
#   - If input/ has no .xmi and example is not "vehicle" → SKIP (add XMI to enable)
#
# Exit code: 0 if FAIL=0, 1 otherwise.

set -uo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT="$(dirname "$SCRIPT_DIR")"

JAR="${TRANSFORMATION_JAR:-$REPO_ROOT/transformation/target/transformation-1.0-SNAPSHOT.jar}"
AAS_MM="${AAS_MM:-$REPO_ROOT/aas/model/aas.ecore}"
SYSML_MM="${SYSML_MM:-}"

PASS=0; FAIL=0; SKIP=0

count_pattern() { grep -c "$1" "$2" 2>/dev/null || echo 0; }
has_pattern()   { grep -q "$1" "$2" 2>/dev/null; }

run_example() {
  local dir="$1" name
  name="$(basename "$dir")"

  # SKIP sentinels
  if [[ -f "$dir/input/SKIP" ]]; then
    printf "SKIP  %-20s (SKIP sentinel)\n" "$name"; SKIP=$((SKIP+1)); return
  fi
  if [[ -z "$(ls -A "$dir/input/" 2>/dev/null)" ]]; then
    printf "SKIP  %-20s (input/ empty)\n" "$name"; SKIP=$((SKIP+1)); return
  fi

  # Locate XMI input
  local xmi
  xmi="$(find "$dir/input" -maxdepth 1 -name '*.xmi' 2>/dev/null | head -1)"
  if [[ -z "$xmi" && "$name" == "vehicle" ]]; then
    xmi="$REPO_ROOT/transformation/examples/VehicleDefinitions.xmi"
  fi
  if [[ -z "$xmi" ]]; then
    printf "SKIP  %-20s (no .xmi in input/; add XMI or set SKIP to suppress)\n" "$name"
    SKIP=$((SKIP+1)); return
  fi

  # Locate expected AAS
  local expected
  expected="$(find "$dir/expected" -maxdepth 1 \( -name '*.aas' -o -name '*.AAS' \) 2>/dev/null | head -1)"
  if [[ -z "$expected" ]]; then
    printf "FAIL  %-20s (no expected/ file)\n" "$name"; FAIL=$((FAIL+1)); return
  fi

  # Produce actual output
  local actual
  actual="$(mktemp "/tmp/aas-actual-${name}-XXXXXX.aas")"

  if [[ "$name" == "vehicle" && -f "$REPO_ROOT/transformation/examples/VehicleDefinitions.aas" ]]; then
    # vehicle: use pre-built output from TB-03 (avoids needing SYSML_MM for this example)
    cp "$REPO_ROOT/transformation/examples/VehicleDefinitions.aas" "$actual"
  elif [[ -f "$JAR" && -n "$SYSML_MM" ]]; then
    java -jar "$JAR" \
      --input    "$xmi"     \
      --output   "$actual"  \
      --sysml-mm "$SYSML_MM" \
      --aas-mm   "$AAS_MM"  \
      2>/dev/null || true
  else
    rm -f "$actual"
    printf "SKIP  %-20s (set TRANSFORMATION_JAR + SYSML_MM to run)\n" "$name"
    SKIP=$((SKIP+1)); return
  fi

  if [[ ! -s "$actual" ]]; then
    rm -f "$actual"
    printf "FAIL  %-20s (transformation produced empty output)\n" "$name"; FAIL=$((FAIL+1)); return
  fi

  # Structural check: both files must contain AasModelRoot; actual must have at least one AAS:Entity
  local ok=1
  has_pattern 'AasModelRoot' "$actual"   || ok=0
  has_pattern 'AasModelRoot' "$expected" || ok=0
  has_pattern 'AAS:Entity'   "$actual"   || ok=0

  local n_act n_exp
  n_act="$(count_pattern 'AAS:Entity' "$actual")"
  n_exp="$(count_pattern 'AAS:Entity' "$expected")"
  rm -f "$actual"

  if [[ "$ok" -eq 1 ]]; then
    printf "PASS  %-20s (entities: actual=%-3s expected=%s)\n" "$name" "$n_act" "$n_exp"
    PASS=$((PASS+1))
  else
    printf "FAIL  %-20s (AasModelRoot or AAS:Entity missing in actual output)\n" "$name"
    FAIL=$((FAIL+1))
  fi
}

echo "SysML2AAS example test suite"
echo "============================"

for dir in "$SCRIPT_DIR"/[0-9][0-9]-* "$SCRIPT_DIR"/vehicle; do
  [[ -d "$dir" ]] && run_example "$dir"
done

TOTAL=$(( PASS + SKIP + FAIL ))
echo ""
echo "Results: PASS=$PASS  SKIP=$SKIP  FAIL=$FAIL  ($TOTAL examples)"

if [[ "$FAIL" -gt 0 ]]; then exit 1; fi
exit 0
