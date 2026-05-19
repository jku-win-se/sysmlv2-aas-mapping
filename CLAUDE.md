# CLAUDE.md — Conventions for AI-assisted development

## Project Summary

This repository implements a **QVTo model-to-model transformation** from SysML v2
to Asset Administration Shell (AAS) models, as described in:

> Ferko, Berardinelli, Bucaioni, Behnam, Wimmer —
> "From engineering models to digital twins: Generating AAS from SysML v2 models"
> JSS 2026, DOI: 10.1016/j.jss.2025.112688

The codebase includes **Eclipse PDE plug-in projects** (EMF-generated metamodel) and a
**Maven standalone build** for the transformation runner (`aas-metamodel/`, `transformation/`).
EMF plugin Java code is generated and managed by EMF tooling; the Java runner in
`transformation/src/main/java/` is hand-authored.

---

## File Map

```
aas/               EMF metamodel — contains aas.ecore and generated Java sources
aas.edit/          EMF-generated edit plugin (item providers)
aas.editor/        EMF-generated tree editor plugin
aas-metamodel/     Maven module — standalone AAS metamodel JAR
transformation/    Maven module — QVTo scripts + Java/EMF CLI runner
  sysml2aas.qvto       QVTo entry point (namespace 20250201)
  mappings/            QVTo mapping rules (structural, behavioral, relationships, comments)
  lib/helpers.qvto     Shared navigation queries
  src/main/java/       RunTransformation.java, SysML2AASTransformer.java
examples/          Test suite (6/24; run-all.sh / run-all.ps1)
lib/metamodels/    Vendored sysml.ecore (nsURI 20250201)
docs/              Architecture docs, mapping tables, design decisions
  DESIGN-AND-PLAN.md   D-001…D-007 (append only, never delete)
  mapping-tables.md
  architecture.md
  how-to-extend.md
.github/workflows/ CI/CD (GitHub Actions)
pom.xml            Root Maven POM (modules: aas-metamodel, transformation)
task-briefs/       Engineering-process documents (gitignored, not for commits)
CLAUDE.md          This file
README.md          Public-facing project description
LICENSE            EPL v2
```

---

## Key Conventions

1. **No hand-editing of generated code.** `aas/`, `aas.edit/`, and `aas.editor/`
   contain EMF-generated Java. Regenerate via the `.genmodel` file in Eclipse;
   do not patch generated files manually.

2. **Surgical changes only.** Modify only the files explicitly listed in a task brief.
   Do not refactor surrounding code or reorganise packages as a side effect.

3. **No new dependencies without approval.** Do not add Maven/Gradle, new Eclipse
   plug-in dependencies, or third-party libraries without explicit user sign-off.

4. **Commit hygiene.** Commits should reference the relevant task brief ID
   (e.g., `TB-01`) in the message body when applicable.

5. **Documentation lives in `docs/`.** Architectural decisions go into
   `docs/DESIGN-AND-PLAN.md` as numbered records (D-001, D-002, …).

---

## What NOT to Touch

| Path | Reason |
|------|--------|
| `aas/` | EMF-generated metamodel plugin — regenerate, never hand-edit |
| `aas.edit/` | EMF-generated edit plugin |
| `aas.editor/` | EMF-generated tree editor plugin |
| `LICENSE` | Already correct (EPL v2) |
| `aas/**/*.java`, `aas.edit/**/*.java`, `aas.editor/**/*.java` | EMF-generated; changes will be overwritten on regeneration |

---

## Working Directory

`C:\Users\lucab\projects\sysmlv2-aas-mapping`

Platform: Windows 11 / PowerShell. Use PowerShell syntax in Bash tool calls when needed.
