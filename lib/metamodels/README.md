# lib/metamodels — Vendored Metamodels

This directory contains vendored copies of metamodel files required by the
transformation pipeline. Vendoring ensures hermetic CI builds with no runtime
dependency on external repositories.

---

## sysml.ecore

| Field        | Value |
|--------------|-------|
| Source repo  | https://github.com/Systems-Modeling/SysML-v2-Pilot-Implementation |
| File path    | `org.omg.sysml/model/SysML.ecore` |
| Repo HEAD    | `87eb9721263b6c5fc5af62bc66d2ecc8147321c9` |
| Last change  | `2c7a2a93f387640ff97746403bdaa7e4f9dd7e90` (2026-02-13, ST6RI-912 Removed isNonunique from Feature) |
| Vendored on  | 2026-05-18 |
| nsURI        | `https://www.omg.org/spec/SysML/20250201` |
| License      | GNU Lesser General Public License v3 (LGPL-3.0) |

**Usage:** passed as `--sysml-mm lib/metamodels/sysml.ecore` to the Java runner
(`transformation/target/transformation-1.0-SNAPSHOT.jar`). Also set via the
`SYSML_MM` environment variable in `examples/run-all.sh`.

**Update procedure:** when the SysML v2 metamodel is updated upstream, copy the
new `SysML.ecore` here and update this README with the new commit hash and date.
