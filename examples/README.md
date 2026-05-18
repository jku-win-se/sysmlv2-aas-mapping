# SysML2AAS Example Test Suite

Examples sourced from [jku-win-se/SysMLv2-AAS-integration](https://github.com/jku-win-se/SysMLv2-AAS-integration),
`MDE artifact/SysML v2 test suite/` (input) and `MDE artifact/AAS models/` (expected output).

When this repo is merged into SysMLv2-AAS-integration, the original `MDE artifact/` will become
`legacy/` and this `examples/` directory will be the canonical test suite.

## Running the suite

**Linux / macOS / CI:**
```bash
# Structural check only (vehicle uses pre-built TB-03 output):
./run-all.sh

# Full run (requires SysML v2 Pilot Implementation metamodel):
SYSML_MM=/path/to/SysML-v2-Pilot-Implementation/.../SysML.ecore ./run-all.sh
```

**Windows (PowerShell):**
```powershell
.\run-all.ps1
# or
$env:SYSML_MM = "C:\path\to\SysML.ecore"; .\run-all.ps1
```

Exit code: `0` if no FAILs, `1` if any FAIL.

## SKIP mechanism

- `input/` is empty → SKIP
- `input/SKIP` sentinel file exists → SKIP
- `input/` has no `.xmi` file (only `.sysml`) → SKIP with message

To activate a SKIP'd example: generate the XMI from the `.sysml` source using the
SysML v2 Pilot Implementation parser and place the result in `input/`.

## Coverage: 6/24

| # | Dir | SysML Metaclass Tested | Source (test suite) | Expected AAS Elements | Status |
|---|-----|----------------------|---------------------|-----------------------|--------|
| 01 | `01-package` | `Package` | `01.package/Package Example.sysml` | `AssetAdministrationShell`, 1× `Entity(PartDefinition)` | SKIP (no XMI) |
| 02 | `02-part-def` | `PartDefinition`, `PartUsage`, `AttributeDefinition` | `02.part def/Part Definition Example.sysml` | 3× `Entity`, 1× `Property`, nested `RelationshipElement` | SKIP (no XMI) |
| 03 | `03-part` | `PartDefinition`, `PartUsage` (nested, redefinition) | `03.part/Parts Example-1.sysml` | 5× `Entity` with nesting | SKIP (no XMI) |
| 04 | `04-port-def` | `PortDefinition`, `PortUsage`, `ItemUsage`, `AttributeDefinition` | `04.port def/Port Example.sysml` | 5× `Entity` including PortDefinition/PortUsage Qualifiers | SKIP (no XMI) |
| 05 | `05-port` | same as 04 (port usage context) | `05.port/Port Example.sysml` | identical to 04 | SKIP (no XMI) |
| — | `vehicle` | Full vehicle: `PartDefinition`, `PortDefinition`, `InterfaceDefinition`, Comments | `Vehicle example/VehicleDefinitions.sysml` | 9+ entities, shells, submodel | **PASS** (pre-built) |

**TODO — remaining 18 examples (all SKIP until XMI generated):**

| # | Original dir | SysML Metaclass |
|---|-------------|-----------------|
| 06 | `06.interface def` | `InterfaceDefinition` |
| 07 | `07.interface` | `InterfaceUsage` |
| 08 | `08.occurence def` | `OccurrenceDefinition` |
| 09 | `09.occurence` | `OccurrenceUsage` |
| 10 | `10.item def` | `ItemDefinition` |
| 11 | `11.item` | `ItemUsage` |
| 12 | `12.attribute def` | `AttributeDefinition` |
| 13 | `13.attribute` | `AttributeUsage` |
| 14 | `14.comment` | `Comment` → `Extension` |
| 15 | `15.document` | `Documentation` → `File` |
| 16 | `16.action def` | `ActionDefinition` → `Operation` |
| 17 | `17_action` | `ActionUsage` → `Operation` |
| 18 | `18.state def` | `StateDefinition` |
| 19 | `19.state` | `StateUsage` |
| 20 | `20.constraint def` | `ConstraintDefinition` |
| 21 | `21.constraint` | `ConstraintUsage` |
| 22 | `22.transition` | `TransitionUsage` |
| 23 | `23.event` | `AcceptEventAction` |
| 24 | `24.relationships` | `FeatureMembership` → `RelationshipElement` |

To add a new example:
1. Generate XMI from the `.sysml` source
2. Copy XMI to `NN-slug/input/`
3. Copy expected AAS from `jku-win-se/SysMLv2-AAS-integration MDE artifact/AAS models/NN.slug/` to `NN-slug/expected/`
4. Re-run `./run-all.sh` to verify PASS
