# SysML v2 → AAS Mapping Tables

This document describes the mapping rules implemented in the QVTo transformation scripts under `transformation/mappings/`. Each rule is cross-referenced to the implementing function in the `.qvto` source.

The mapping covers three categories of SysML v2 constructs: structural elements, behavioral elements, and relationships. These correspond to Tables 1–3 in Ferko et al., JSS 2026.

---

## Table 1 — Structural Mappings

Structural mappings handle the core SysML v2 containment hierarchy: packages, definitions, and typed attributes.

| SysML v2 Metaclass | AAS Target | Mapping Strategy | QVTo Rule Reference |
|--------------------|-----------|-----------------|---------------------|
| `Namespace` (root) | `AasModelRoot` | Root container created in `main()`; owned packages become shells | `main()` in `sysml2aas.qvto` |
| `Package` | `AssetAdministrationShell` | One shell per package; a single "Hierarchical Structures" `Submodel` is created inside | `toAssetAdministrationShell()` in `mappings/structural.qvto` |
| `Element` (block/class) | `Entity` | Dynamic qualifier extracted from the runtime class name via `substringBefore`/`substringAfter` on the owning membership; owned features recurse | `toEntity()` in `mappings/structural.qvto` |
| `FeatureMembership` | nested `Entity` | Feature memberships of an entity are mapped recursively; a `RelationshipElement` "defined by" is added to each | `feature2Entity()` in `mappings/structural.qvto` |
| `AttributeDefinition` | `Property` | Typed attribute definition mapped to a leaf AAS property; idShort from member name | `toProperty()` in `mappings/structural.qvto` |
| `FeatureMembership` (AttributeUsage) | `SubmodelElementCollection` | Attribute usage wrapped in a collection; includes a `toRelationElement4Property()` "generalises" relationship | `toSubmodelElementCollection4NestedProperty()` in `mappings/structural.qvto` |
| `FeatureMembership` (leaf) | leaf `Property` | Terminal attribute usage mapped to a flat property element | `toNestedProperty()` in `mappings/structural.qvto` |

**Helper queries** (in `transformation/lib/helpers.qvto`):

| Query | Returns | Used by |
|-------|---------|---------|
| `ownedPackages()` | packages directly owned by an Element | `toAssetAdministrationShell()` |
| `ownedMembers()` | all owned member elements | `toEntity()` |
| `ownedAttributes()` | attribute definitions | `toProperty()`, `toSubmodelElementCollection4NestedProperty()` |
| `ownedComments()` | Comment elements | `toSubmodelelementCollection4ExtensionorDocument()` |
| `ownedMemberMemberships()` | feature memberships | `feature2Entity()` |
| `ownedActions()` | action definitions/usages | `toOperation()` |
| `ownedStateDef()` | state definitions | `toSubmodelelementCollection4State()` |

---

## Table 2 — Behavioral Mappings

Behavioral mappings cover executable and state-based SysML v2 constructs.

| SysML v2 Metaclass | AAS Target | Mapping Strategy | QVTo Rule Reference |
|--------------------|-----------|-----------------|---------------------|
| `ActionDefinition` / `ActionUsage` | `Operation` | Each action becomes an AAS operation; parameters are derived from the action's typed features | `toOperation()` in `mappings/behavioral.qvto` |
| `ActionDefinition` / `ActionUsage` | `SubmodelElementCollection` | Optional collection wrapper around the operation, used when actions appear as owned members of an entity | `toSubmodelelementCollection4Operation()` in `mappings/behavioral.qvto` |
| `StateDefinition` | `SubmodelElementCollection` | State definition mapped to a collection (stub — full state encoding is left as future work) | `toSubmodelelementCollection4State()` in `mappings/behavioral.qvto` |

---

## Table 3 — Relationship Mappings

Relationship mappings capture typed cross-references between model elements.

| SysML v2 Construct | AAS Target | Mapping Strategy | QVTo Rule Reference |
|-------------------|-----------|-----------------|---------------------|
| `FeatureMembership` (definition link) | `RelationshipElement` ("defined by") | The owning entity is `firstReferable`; `secondReferable` is left unresolved (cross-reference resolution requires a post-processing pass — see note below) | `toRelationElement(tempEntity)` in `mappings/relationships.qvto` |
| `FeatureMembership` (attribute usage, generalisation) | `RelationshipElement` ("generalises") | Created alongside `toSubmodelElementCollection4NestedProperty()`; captures the generalisation link from attribute usage to its definition | `toRelationElement4Property()` in `mappings/relationships.qvto` |

> **Note on `secondReferable`:** AAS cross-references require the target entity to already exist in the model graph. Because QVTo processes elements in declaration order, `toRelationElement` leaves `secondReferable.key.referable` unset. A post-processing pass (or deferred resolution in a future task) is needed to wire these references after all entities have been created.

---

## Comment / Documentation Mappings

Comments and documentation annotations are mapped to AAS metadata elements.

| SysML v2 Construct | AAS Target | Mapping Strategy | QVTo Rule Reference |
|-------------------|-----------|-----------------|---------------------|
| `Comment` (extension annotation) | `Extension` inside `SubmodelElementCollection` | Each comment becomes an AAS `Extension`; the collection is named after the annotated element | `toSubmodelelementCollection4ExtensionorDocument()` in `mappings/comments.qvto` |
| `Documentation` (doc annotation) | `File` inside `SubmodelElementCollection` | Documentation annotations are treated as file references; idShort is extracted from the body text | `toSubmodelelementCollection4ExtensionorDocument()` + `toFile()` in `mappings/comments.qvto` |
