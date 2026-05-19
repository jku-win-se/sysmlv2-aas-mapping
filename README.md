# SysML v2 → AAS Mapping

[![CI](https://github.com/jku-win-se/sysmlv2-aas-mapping/actions/workflows/ci.yml/badge.svg)](https://github.com/jku-win-se/sysmlv2-aas-mapping/actions/workflows/ci.yml)

Model-to-model transformation that generates **Asset Administration Shell (AAS)** models
from **SysML v2** system-engineering models, implemented with Eclipse EMF and QVTo.

---

## Abstract

Digital twins require standardised, machine-readable descriptions of assets.
This repository implements a QVTo model transformation that automatically derives
an AAS model (conforming to IEC 63278 / Part 1) from a SysML v2 source model,
bridging the gap between system-engineering practice and Industry 4.0 infrastructure.
The transformation covers structural SysML constructs (blocks, properties, ports,
connections) and maps them to the corresponding AAS concepts (Asset, Submodel,
SubmodelElement, ConceptDescription).

---

## Publication

> **From engineering models to digital twins: Generating AAS from SysML v2 models**
> Nikolaus Ferko, Luca Berardinelli, Alessio Bucaioni, Reza Behnam, Manuel Wimmer
> *Journal of Systems and Software (JSS)*, 2026
> DOI: [10.1016/j.jss.2025.112688](https://doi.org/10.1016/j.jss.2025.112688)
> Authors' preprint: <https://epub.jku.at/obvulioa/content/pageview/9826739>

---

## Repository Structure

```
sysmlv2-aas-mapping/
├── aas/               # EMF metamodel plugin — AAS Ecore metamodel (aas.ecore)
├── aas.edit/          # EMF-generated edit plugin (item providers, adapters)
├── aas.editor/        # EMF-generated tree-based editor plugin
├── aas-metamodel/     # Maven module — standalone AAS metamodel JAR
├── transformation/    # Maven module — QVTo scripts + Java/EMF CLI runner
│   ├── sysml2aas.qvto            # QVTo entry point
│   ├── mappings/                  # QVTo mapping rules (structural, behavioral, relationships, comments)
│   ├── lib/helpers.qvto           # Shared navigation queries
│   └── src/main/java/             # RunTransformation.java + SysML2AASTransformer.java
├── examples/          # Test suite (6/24 implemented; run-all.sh / run-all.ps1)
├── lib/metamodels/    # Vendored sysml.ecore (nsURI 20250201)
├── docs/              # Architecture docs, mapping tables, design decisions
│   ├── DESIGN-AND-PLAN.md        # D-001 … D-007 (ADRs)
│   ├── mapping-tables.md
│   ├── architecture.md
│   └── how-to-extend.md
├── .github/workflows/ # CI/CD (GitHub Actions — build + transform)
├── pom.xml            # Root Maven POM (modules: aas-metamodel, transformation)
├── LICENSE            # Eclipse Public License v2
├── CLAUDE.md          # Conventions for AI-assisted development
└── README.md
```

---

## Getting Started

### Prerequisites

| Tool | Version | Notes |
|------|---------|-------|
| Java | 11+ | Maven build |
| Maven | 3.8+ | Build system |
| Eclipse Modeling Tools | ≥ 2023-09 | Optional — for editing .qvto scripts in Eclipse |

### Build

```bash
git clone https://github.com/jku-win-se/sysmlv2-aas-mapping.git
cd sysmlv2-aas-mapping
mvn package -pl aas-metamodel,transformation --also-make
```

### Run the transformation

```bash
java -jar transformation/target/transformation-1.0-SNAPSHOT-jar-with-dependencies.jar \
  --input   path/to/input.xmi \
  --output  path/to/output.aas \
  --sysml-mm lib/metamodels/sysml.ecore \
  --aas-mm   aas/model/aas.ecore
```

### Run the test suite

```bash
# Linux/macOS
bash examples/run-all.sh

# Windows
pwsh examples/run-all.ps1
```

---

## Status

| Component | State |
|---|---|
| AAS Ecore metamodel (`aas/`) | ✅ Complete |
| Maven standalone build (`aas-metamodel/`, `transformation/`) | ✅ Complete |
| QVTo transformation (`transformation/*.qvto`) | ✅ Complete (structural + behavioral + relationships) |
| Java/EMF CLI runner (`RunTransformation.java`) | ✅ Complete |
| Example test suite (`examples/`, 6/24) | ⚠️ Partial — 5 SKIP, 1 PASS |
| CI/CD (GitHub Actions) | ✅ Green |
| Mapping rule documentation (`docs/mapping-tables.md`) | ✅ Complete |
| Architecture documentation (`docs/architecture.md`) | ✅ Complete |

### Open items

- Expand example coverage from 6/24 to 24/24 (requires XMI serialisation of remaining `.sysml` inputs)
- Complete behavioral and relationship mapping coverage in Java runner
- Cross-reference resolution in `toRelationElement()` (known limitation, documented in `transformation/mappings/relationships.qvto`)

---

## License

Eclipse Public License v2 — see [LICENSE](LICENSE) or <https://www.eclipse.org/legal/epl-2.0/>.
