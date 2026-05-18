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
├── docs/              # Architecture decisions and design notes
│   └── DESIGN-AND-PLAN.md
├── task-briefs/       # Engineering-process docs (gitignored)
├── LICENSE            # Eclipse Public License v2
├── CLAUDE.md          # Conventions for AI-assisted development
└── README.md
```

---

## Prerequisites

| Tool | Version | Notes |
|------|---------|-------|
| Eclipse Modeling Tools | ≥ 2023-09 | Includes EMF, Xtext, QVTo |
| Java | ≥ 17 | Eclipse runtime requirement |
| QVT Operational (QVTo) | bundled with Eclipse MDT | For running the transformation |
| Git | any | Cloning and version control |

> **No Maven/Gradle build** — the project uses Eclipse PDE plug-in layout.

---

## Getting Started

```bash
# 1. Clone the repository
git clone https://github.com/jku-win-se/sysmlv2-aas-mapping.git

# 2. Open Eclipse Modeling Tools
# 3. File → Import → Existing Projects into Workspace
#    Select the cloned directory; import all three plug-in projects:
#      aas/  aas.edit/  aas.editor/

# 4. Run as Eclipse Application (PDE launch) to open the tree-based AAS editor

# 5. (Planned) Run the QVTo transformation:
#    Right-click the .qvto file → Run As → QVTo Transformation
```

---

## Planned Work

- [ ] QVTo transformation script (SysML v2 → AAS)
- [ ] Example SysML v2 input models
- [ ] Automated test suite for the transformation
- [ ] Documentation of the mapping rules

---

## License

Eclipse Public License v2 — see [LICENSE](LICENSE) or <https://www.eclipse.org/legal/epl-2.0/>.
