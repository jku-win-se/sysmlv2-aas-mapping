# CLAUDE.md — Conventions for AI-assisted development

## Project Summary

This repository implements a **QVTo model-to-model transformation** from SysML v2
to Asset Administration Shell (AAS) models, as described in:

> Ferko, Berardinelli, Bucaioni, Behnam, Wimmer —
> "From engineering models to digital twins: Generating AAS from SysML v2 models"
> JSS 2026, DOI: 10.1016/j.jss.2025.112688

The codebase is an **Eclipse PDE plug-in project**; there is no Maven/Gradle build.
All Java code is generated or managed by EMF tooling.

---

## File Map

```
aas/               EMF metamodel — contains aas.ecore and generated Java sources
aas.edit/          EMF-generated edit plugin (item providers)
aas.editor/        EMF-generated tree editor plugin
docs/              Architecture decision records (ADRs) and design notes
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
| Any `.java` file | All Java is EMF-generated; changes will be overwritten |

---

## Working Directory

`C:\Users\lucab\projects\sysmlv2-aas-mapping`

Platform: Windows 11 / PowerShell. Use PowerShell syntax in Bash tool calls when needed.
