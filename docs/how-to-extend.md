# How to Extend the SysML v2 → AAS Transformation

This guide walks through adding a new mapping rule to the transformation. The exemplar file is `transformation/mappings/structural.qvto` — read it alongside this guide.

---

## Overview

The transformation follows a dual-layer design:

1. **QVTo scripts** (`transformation/mappings/*.qvto`) — the authoritative specification, runnable in Eclipse M2M QVTo.
2. **Java runner** (`transformation/src/.../SysML2AASTransformer.java`) — the standalone CLI executor using EMF reflective API.

When you add a new mapping rule, you should implement it in **both layers** to keep them in sync. Start with the QVTo script (it defines the rule precisely), then mirror it in the Java runner.

---

## Step-by-Step: Adding a New Mapping Rule

### 1. Identify the source metaclass

Find the SysML v2 metaclass you want to map. Browse `lib/metamodels/sysml.ecore` in Eclipse (EMF tree editor) or search by name. Common entry points:

- Structural elements: `PartDefinition`, `AttributeDefinition`, `PortDefinition`, `ConnectionDefinition`
- Behavioral: `ActionDefinition`, `StateDefinition`, `TransitionUsage`
- Relationships: `Dependency`, `FeatureMembership`, `Subsetting`

### 2. Identify the AAS target concept

Find the corresponding AAS concept in `aas/model/aas.ecore`. Common targets:

- `Entity`, `Property`, `SubmodelElementCollection`, `RelationshipElement`, `Operation`, `File`, `Extension`, `Qualifier`

Refer to `docs/mapping-tables.md` for existing mappings; do not duplicate them.

### 3. Choose the QVTo file to extend

| What you're mapping | File to edit |
|---------------------|-------------|
| Structural elements (blocks, attributes, ports) | `transformation/mappings/structural.qvto` |
| Behavioral elements (actions, states) | `transformation/mappings/behavioral.qvto` |
| Typed cross-references and links | `transformation/mappings/relationships.qvto` |
| Comments and documentation | `transformation/mappings/comments.qvto` |
| Shared queries (navigation helpers) | `transformation/lib/helpers.qvto` |

### 4. Write the QVTo mapping

The standard pattern, following the existing rules in `structural.qvto`:

```qvto
-- Maps MySourceClass to an AAS SubmodelElementCollection
-- Table N, row M: <brief description>
mapping SysMLv2MM::MySourceClass::toMyTarget() : AASMM::SubmodelElementCollection {
    idShort := self.name;
    -- extract the metaclass name as a qualifier (standard pattern)
    var qualifier := object AASMM::Qualifier {
        type := self.owningMembership.memberElement.toString()
                    .substringBefore("Impl@")
                    .substringAfter('org.omg.sysml.lang.sysml.impl.');
    };
    qualifiers += qualifier;
    value := self.ownedAttributes() -> map toProperty();
}
```

Key conventions:
- **`idShort`**: always set from `self.name` or a derived string.
- **Qualifier pattern**: use `substringBefore("Impl@").substringAfter('org.omg.sysml.lang.sysml.impl.')` on the owning membership to extract the runtime metaclass name. This is the standard approach used throughout `structural.qvto` (see `toEntity()`).
- **Queries from `helpers.qvto`**: call `self.ownedMembers()`, `self.ownedAttributes()`, `self.ownedActions()`, etc. rather than navigating containment directly.
- **Cross-references**: if you need to reference another mapped element (e.g., in a `RelationshipElement`), create the relationship in a separate mapping called after all entities are created. See `toRelationElement()` in `relationships.qvto` and its note about deferred `secondReferable` resolution.

### 5. Register the mapping

In `transformation/sysml2aas.qvto`, the `main()` function drives the top-level traversal via `rootNamespace.ownedPackages() -> map toAssetAdministrationShell()`. Nested mappings are called from within structural/behavioral mappings.

To wire in your new rule:
- If it applies to owned members of an `Element`, add a call in `toEntity()` alongside existing calls to `toOperation()`, `toSubmodelelementCollection4State()`.
- If it applies to a top-level package feature, add it in `toAssetAdministrationShell()`.

### 6. Add a helper query (if needed)

If your new source class requires a new navigation query, add it to `transformation/lib/helpers.qvto`:

```qvto
-- Returns owned port definitions of an Element
query SysMLv2MM::Element::ownedPorts() : OrderedSet(SysMLv2MM::PortDefinition) {
    return self.ownedRelationship[SysMLv2MM::OwningMembership]
               .ownedRelatedElement[SysMLv2MM::PortDefinition];
}
```

Use `ownedRelationship[OwningMembership].ownedRelatedElement` — this is the canonical SysML v2 XMI containment path used by all existing helpers.

### 7. Mirror the rule in the Java runner

Open `transformation/src/main/java/.../SysML2AASTransformer.java` and find `mapElement()`. Add a branch for your new metaclass:

```java
} else if (eClass.getName().equals("MySourceClass")) {
    SubmodelElementCollection smc = AasFactory.eINSTANCE.createSubmodelElementCollection();
    smc.setIdShort(source.eGet(eClass.getEStructuralFeature("name")).toString());
    // ... populate smc ...
    return smc;
}
```

The Java runner uses the EMF reflective API (`eGet`, `eClass().getName()`) because SysML v2 sources are loaded dynamically without generated Java classes.

### 8. Add an example

Place a SysML v2 XMI input file at `examples/NN-new-feature/input/model.xmi` (where `NN` is the next available number). If you have a corresponding expected output, put it at `examples/NN-new-feature/expected/model.aas`.

Run the test suite locally to verify:

```bash
# Linux / macOS / CI
bash examples/run-all.sh

# Windows PowerShell
.\examples\run-all.ps1
```

The new example transitions from `SKIP` (no XMI) to `PASS` once the input file is present and the transformation produces a structurally valid AAS output.

---

## Checklist

- [ ] New QVTo mapping added to the appropriate `mappings/*.qvto` file
- [ ] `idShort` set; Qualifier uses the `substringBefore`/`substringAfter` pattern
- [ ] Helper query added to `lib/helpers.qvto` if new navigation needed
- [ ] New mapping wired into `toEntity()` or `toAssetAdministrationShell()` in `sysml2aas.qvto`
- [ ] Java runner `mapElement()` updated with matching branch
- [ ] Example XMI added under `examples/NN-*/input/`
- [ ] `docs/mapping-tables.md` updated with the new row
