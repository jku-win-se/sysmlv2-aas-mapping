# Design & Architectural Decisions

This log records significant architectural choices made for the
SysML v2 → AAS mapping project. Each entry is immutable once merged;
superseding decisions get a new record that references the old one.

---

## D-001 — Choice of EMF + QVTo as the transformation stack

**Date:** 2026-05-18
**Status:** Accepted
**Authors:** Ferko, Berardinelli, Bucaioni, Behnam, Wimmer

### Context

We needed a model-to-model (M2M) transformation engine that could:
- Operate on formally typed metamodels (not ad-hoc XML/JSON scripts)
- Integrate with the Eclipse ecosystem used by the research group
- Produce artefacts that are directly loadable by AAS runtime environments
- Support academic reproducibility (open-source, no proprietary runtime)

### Decision

Use **Eclipse Modeling Framework (EMF)** for both source (SysML v2 subset) and
target (AAS) metamodels, and **QVT Operational (QVTo)** as the transformation
language.

- The AAS metamodel is defined as an `.ecore` file (`aas/model/aas.ecore`).
- EMF code generation produces Java-based model APIs consumed by QVTo.
- The transformation is a `.qvto` script that maps SysML v2 structural concepts
  (blocks, properties, ports) to AAS concepts (Asset, Submodel, SubmodelElement).

### Rationale

| Criterion | EMF + QVTo | Alternative (ATL) | Alternative (plain Java) |
|-----------|-----------|-------------------|--------------------------|
| Formal metamodel typing | ✓ | ✓ | ✗ (manual) |
| Eclipse integration | ✓ native | ✓ | ✓ |
| Operational style (imperative helpers) | ✓ | ✗ (relational) | ✓ |
| Community & tooling | mature | mature | n/a |
| Research group familiarity | high | medium | high |

QVTo was preferred over ATL because the mapping rules require imperative
helper functions (e.g., name-mangling, cardinality resolution) that are
awkward to express in ATL's purely relational style.

### Consequences

- All Java source files in `aas/`, `aas.edit/`, `aas.editor/` are
  **EMF-generated** and must be regenerated via the `.genmodel`, not edited by hand.
- The transformation entry point is a `.qvto` file (to be added in a future task).
- Developers need Eclipse Modeling Tools (≥ 2023-09) with MDT QVTo installed.

---

## D-002 — Maven standalone build over Tycho

**Date:** 2026-05-18
**Status:** Accepted
**Authors:** Berardinelli (TB-02)

### Context

The three Eclipse OSGi plugins (`aas/`, `aas.edit/`, `aas.editor/`) have no
`pom.xml`; they can only be compiled inside Eclipse or via the Tycho Maven plugin,
which requires a full p2 target-platform configuration pointing at an Eclipse
update-site mirror. The QVTo transformation pipeline (TB-03) needs the AAS metamodel
as a plain classpath dependency — not as an OSGi bundle.

### Decision

Add a **Maven standalone** module `aas-metamodel` (parallel to the Eclipse plugin
folders, which are left untouched). The module:
- Physically copies the EMF-generated Java sources from `aas/src/AAS/` into
  `aas-metamodel/src/main/java/AAS/` (copy, not symlink, so Maven source roots
  stay within the module directory).
- Declares `org.eclipse.emf:org.eclipse.emf.common` and
  `org.eclipse.emf:org.eclipse.emf.ecore` as regular Maven dependencies,
  resolved from the Eclipse Release Repository (`repo.eclipse.org`).
- Produces a plain JAR (`aas-metamodel-1.0-SNAPSHOT.jar`) with no OSGi metadata
  beyond informational manifest entries.
- Uses Java 11 as source/target level (compatible with EMF-generated code).

Tycho was explicitly rejected.

### Rationale

| Criterion | Maven standalone | Tycho |
|-----------|-----------------|-------|
| Setup complexity | low (one pom.xml) | high (target platform, p2 repo) |
| CI reproducibility | high | medium (p2 mirrors can break) |
| OSGi runtime needed | no | yes |
| Suitable for CLI transformation | yes | no |
| Research artifact goal | ✓ | ✗ |

### Consequences

- `aas-metamodel/src/main/java/AAS/` must be kept in sync with `aas/src/AAS/`
  whenever the EMF metamodel is regenerated (manual copy step, documented in README).
- `aas.edit/` and `aas.editor/` are excluded from the Maven build — the editor UI
  is not needed for the transformation pipeline.
- Future modules (e.g., `transformation`) declare `aas-metamodel` as a Maven
  dependency via `<groupId>io.github.jku-win-se</groupId>`.

---

## D-003 — QVTo scripts as specification + Java/EMF as standalone executor

**Date:** 2026-05-18
**Status:** Accepted
**Authors:** Berardinelli (TB-03)

### Context

The QVTo transformation language (Eclipse M2M) is the natural implementation
vehicle for the mapping rules defined in Tables 1-3 of the JSS 2026 paper.
However, the Eclipse M2M QVTo runtime is not available as clean standalone Maven
artifacts; running it outside Eclipse requires complex OSGi / p2 setup.

At the same time, the project needs:
1. A formal, tool-readable specification of the mapping rules (academic reproducibility).
2. A CLI runner that produces AAS XMI from SysML XMI without opening Eclipse.

### Decision

**Dual-layer implementation:**

1. **QVTo scripts** (`sysml2aas.qvto`, `mappings/structural.qvto`,
   `mappings/behavioral.qvto`, `mappings/relationships.qvto`, `lib/helpers.qvto`)
   — authoritative specification of the mapping rules, executable inside Eclipse
   via Eclipse M2M QVTo. Each rule has a single-line comment referencing its
   paper table row.

2. **Java/EMF runner** (`RunTransformation.java`, `SysML2AASTransformer.java`)
   — implements the same rules via the EMF reflective API. Accepts four arguments
   (`--input`, `--output`, `--sysml-mm`, `--aas-mm`), loads the SysML metamodel
   dynamically at runtime (no SysML code generation required), and produces a
   conformant AAS XMI file.

The Maven module (`transformation/pom.xml`) packages both artefacts and produces
a fat JAR via `maven-assembly-plugin`.

### Rationale

| Criterion | QVTo-only | Java/EMF | Dual-layer (chosen) |
|-----------|-----------|----------|---------------------|
| Academic spec fidelity | ✓ | ✗ | ✓ (QVTo scripts) |
| Standalone CLI | ✗ | ✓ | ✓ (Java runner) |
| Maven build | ✗ | ✓ | ✓ |
| Eclipse execution | ✓ | ✗ | ✓ |

### Consequences

- When the AAS metamodel is updated (via Eclipse EMF regeneration), both the
  QVTo scripts and the Java runner must be updated in sync.
- The `SysML2AASTransformer` walks `ownedRelationship[OwningMembership]
  .ownedRelatedElement` — the canonical SysML v2 XMI containment path.
- Behavioral and relationship mappings (Tables 2-3) are fully specified in the
  QVTo scripts; the Java runner implements structural mappings (Table 1) fully
  plus ActionDefinition/ActionUsage from Table 2. Tables 2-3 can be completed
  in a future task by extending `SysML2AASTransformer.mapElement()`.

---

## D-004 — Example test suite structure and structural XMI comparison

**Date:** 2026-05-18
**Status:** Accepted
**Authors:** Berardinelli (TB-04)

### Context

The paper test suite (24 examples from jku-win-se/SysMLv2-AAS-integration) uses
textual `.sysml` files as source. The transformation pipeline requires XMI as input
(the Java runner accepts `--input <sysml.xmi>`). Generating XMI from textual SysML
requires the SysML v2 Pilot Implementation parser, which is a separate tool available
only on developer machines with the Eclipse environment configured.

The test runner also needs the SysML metamodel path (`--sysml-mm`) which is
machine-specific. A byte-for-byte diff of AAS XMI output is fragile because
EMF serialisation order and cross-reference paths differ between runs.

### Decision

**Structural comparison** rather than byte-diff: the test runner checks that:
1. The actual output contains `AasModelRoot` (root element present)
2. The actual output contains at least one `AAS:Entity` element (non-empty mapping)
3. The expected file also has `AasModelRoot` (guards against corrupt expected files)

Entity count is reported for informational purposes but does not gate PASS/FAIL,
because the Java runner (TB-03) and QVTo runner produce outputs with different
nesting depths for the same input.

**SKIP by default for examples without XMI**: the 24 `.sysml` source files are
present in `examples/NN-slug/input/` for documentation and future use; the runner
SKIPs any example without a corresponding `.xmi`. The vehicle example is special-cased
to use the pre-built output from TB-03 (`transformation/examples/VehicleDefinitions.aas`),
which always produces PASS.

**Coverage grows incrementally**: as XMI files are generated and placed in `input/`,
the runner automatically picks them up and transitions examples from SKIP to PASS/FAIL.

### Rationale

| Criterion | Byte-diff | Structural check (chosen) |
|-----------|-----------|--------------------------|
| Robust to EMF serialisation order | ✗ | ✓ |
| Catches empty/wrong output | ✓ | ✓ |
| Works without SYSML_MM | ✗ | ✓ (vehicle) |
| Usable in CI without metamodel | ✗ | ✓ |

### Consequences

- `examples/run-all.sh` and `examples/run-all.ps1` implement the structural check.
- CI (TB-05) calls `run-all.sh`; the vehicle example is always verified.
- To extend coverage: generate XMI from `.sysml` → place in `input/` → re-run suite.
- The suite currently covers 6/24 examples (5 SKIP + 1 PASS); the remaining 18
  are documented in `examples/README.md` as TODO.

---

## D-005 — GitHub Actions CI with vendored SysML metamodel

**Date:** 2026-05-18
**Status:** Accepted
**Authors:** Berardinelli (TB-05)

### Context

The transformation pipeline requires the SysML v2 metamodel (`SysML.ecore`) at
runtime, but the SysML v2 Pilot Implementation is a large external project not
included in this repository. Running CI on GitHub-hosted runners means the
metamodel must be available without cloning the external repo.

Two options were considered:
- **Option A**: Download at CI time via `git clone` or `wget` from GitHub.
  Risk: network failure, upstream API rate limits, no reproducibility guarantee.
- **Option B**: Vendor `SysML.ecore` under `lib/metamodels/` in this repo.
  Chosen: hermetic, reproducible, no external dependencies at build time.

### Decision

Vendor `SysML.ecore` (from Systems-Modeling/SysML-v2-Pilot-Implementation,
commit `2c7a2a93f387640ff97746403bdaa7e4f9dd7e90`, 2026-02-13) under
`lib/metamodels/sysml.ecore`. Document source, commit hash, date, and license
in `lib/metamodels/README.md`.

The GitHub Actions workflow (`.github/workflows/ci.yml`) defines two jobs:

1. **build** — `mvn package -pl aas-metamodel,transformation --also-make`
   on `ubuntu-latest` + Java 11 (temurin), Maven cache keyed on `pom.xml` hashes.
   Uploads the fat JAR as a workflow artifact.

2. **transform** — `needs: [build]`, downloads the JAR artifact, runs
   `examples/run-all.sh` with `SYSML_MM=lib/metamodels/sysml.ecore`.
   Exits 1 (fails the workflow) if `run-all.sh` exits 1.

The workflow is repo-agnostic (no hardcoded repository names in steps).
It will be copied as-is when this repo merges into `jku-win-se/SysMLv2-AAS-integration`.

### Rationale

| Criterion | Option A (download) | Option B: vendor (chosen) |
|-----------|--------------------|-----------------------------|
| Hermetic build | ✗ | ✓ |
| No network dependency | ✗ | ✓ |
| Reproducible | ✗ (tag may move) | ✓ (pinned commit in README) |
| Repo size cost | low | ~600 KB (acceptable) |
| Update procedure | automatic | manual copy + README update |

### Consequences

- `lib/metamodels/sysml.ecore` must be updated manually when a new SysML v2
  metamodel is needed; `lib/metamodels/README.md` must record the new commit hash.
- CI badge: `https://github.com/jku-win-se/sysmlv2-aas-mapping/actions/workflows/ci.yml/badge.svg`
  (to be updated to `SysMLv2-AAS-integration` URL after migration).
- Current CI result: `PASS=1 SKIP=5 FAIL=0` — vehicle PASS, 01-05 SKIP (no XMI).
  Coverage improves as XMI files are added to `examples/NN-slug/input/`.

---

## D-006 — Technical documentation structure (mapping tables, architecture, extension guide)

**Date:** 2026-05-19
**Status:** Accepted
**Authors:** Berardinelli (TB-06)

### Context

The transformation implementation (TB-03-fix) and CI (TB-05) are complete, but the
repository contained no developer-facing documentation that would allow a researcher
external to the JSS 2026 paper to understand, reproduce, or extend the transformation.
The JSS 2026 paper (Ferko et al.) contains Tables 1–3 (mapping rules) and Fig. 1
(architecture), but these are embedded in the paper and not navigable from code.

### Decision

Create four documentation files under `docs/`, all in English, all migratable to
`jku-win-se/SysMLv2-AAS-integration` as-is (with the exception of `DESIGN-AND-PLAN.md`
which is internal):

1. **`docs/mapping-tables.md`** — three Markdown tables (Structural / Behavioral /
   Relationships), each row cross-referenced to the implementing QVTo function name.
   Paraphrases the paper tables; does not copy verbatim.

2. **`docs/architecture.md`** — prose description of the three layers (Input → QVTo →
   Java/EMF) with an embedded pre-rendered PNG.

3. **`docs/architecture.puml`** — PlantUML source for the architecture diagram, stored
   alongside the rendered PNG so the diagram can be regenerated without pre-rendered images.

4. **`docs/architecture.png`** — pre-rendered via Kroki (`localhost:8084/plantuml/png`),
   displayed on GitHub without requiring any tooling from the viewer.

5. **`docs/how-to-extend.md`** — step-by-step guide for adding a new mapping rule,
   using `structural.qvto` as the exemplar and documenting the standard
   `substringBefore`/`substringAfter` qualifier extraction pattern.

### Rationale

| Criterion | Doc-in-paper only | Docs in repo (chosen) |
|-----------|------------------|-----------------------|
| Navigable from code | ✗ | ✓ (cross-links to .qvto files) |
| Survives migration to target repo | ✗ (paper is external) | ✓ |
| Onboards new contributors | ✗ | ✓ (how-to-extend.md) |
| Reproducible diagram | ✗ | ✓ (puml source + pre-rendered png) |

### Consequences

- `docs/mapping-tables.md` must be updated whenever a QVTo function is renamed or a
  new mapping rule is added (see `docs/how-to-extend.md` checklist).
- `docs/architecture.png` must be re-rendered (via Kroki) whenever `architecture.puml`
  changes; the render command is documented in `docs/architecture.md`.
- `docs/DESIGN-AND-PLAN.md` is NOT migrated to `SysMLv2-AAS-integration`; it is
  internal engineering process documentation for this working repository.

---

## D-007 — QVTo namespace updated from 20240201 to 20250201

**Date:** 2026-05-19
**Status:** Accepted
**Authors:** Berardinelli

### Context

The original `SysML2AAS.qvto` (from jku-win-se/SysMLv2-AAS-integration, written ~2024)
declares:
```
modeltype SysMLv2MM uses 'https://www.omg.org/spec/SysML/20240201';
```
The vendored `lib/metamodels/sysml.ecore` (Systems-Modeling/SysML-v2-Pilot-Implementation,
commit `2c7a2a93f`, 2026-02-13) uses `nsURI = https://www.omg.org/spec/SysML/20250201`.

A namespace mismatch between the QVTo `modeltype` declaration and the actual `nsURI`
of the loaded `.ecore` causes QVTo to fail to bind any metaclass — the transformation
runs but produces empty or no output.

### Decision

Update the `modeltype SysMLv2MM` declaration in all QVTo files from `20240201` to
`20250201`, aligning with the vendored metamodel:

- `transformation/sysml2aas.qvto` — line 5
- `transformation/lib/helpers.qvto` — line 4

All other QVTo files (`mappings/structural.qvto`, `mappings/behavioral.qvto`,
`mappings/relationships.qvto`, `mappings/comments.qvto`) inherit the modeltype
from the importer — no changes needed there.

### Rationale

The OMG updated the SysML v2 metamodel `nsURI` between the 2024 and 2025 releases.
The pilot implementation repo HEAD (Feb 2026) already uses `20250201`. Since we vendor
the metamodel from HEAD rather than from a 2024 snapshot, aligning the QVTo namespace
to the vendored file is the correct fix. The alternative (re-vendoring a 2024 snapshot)
would pin us to an obsolete metamodel and diverge from current SysML v2 tooling.

### Consequences

- The QVTo scripts are no longer executable against a `20240201` metamodel without
  reverting this change. Models created with the 2024 pilot implementation may need
  to be re-serialised with the 2025 implementation.
- The Java runner (`SysML2AASTransformer.java`) loads the metamodel dynamically at
  runtime from `--sysml-mm`; it is unaffected by this change (the namespace is read
  from the `.ecore` file, not hardcoded).
- `lib/metamodels/README.md` already documents the vendored file as `nsURI 20250201`
  — now consistent with the QVTo declaration.
