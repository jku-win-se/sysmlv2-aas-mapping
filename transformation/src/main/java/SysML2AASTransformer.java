import AAS.*;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.HashSet;
import java.util.Set;

/**
 * EMF reflective implementation of the SysML v2 → AAS mapping rules.
 *
 * Each method documents its paper table row in a single-line comment.
 * The same rules are expressed in QVTo in transformation/mappings/structural.qvto,
 * behavioral.qvto, and relationships.qvto.
 */
public class SysML2AASTransformer {

    private final AASFactory factory = AASFactory.eINSTANCE;

    // SysML EClass names handled at the top-level Package scan
    private static final Set<String> TOP_LEVEL_TYPES = new HashSet<>(java.util.Arrays.asList(
        "PartDefinition", "ItemDefinition", "OccurrenceDefinition",
        "PartUsage", "ItemUsage",
        "PortDefinition", "PortUsage",
        "AttributeUsage",
        "ActionDefinition", "ActionUsage",
        "StateDefinition", "TransitionUsage",
        "ConstraintUsage",
        "InterfaceDefinition", "ConnectionDefinition"
    ));

    // ── Entry point ───────────────────────────────────────────────────────────

    public AasModelRoot transform(Resource sysmlResource) {
        AasModelRoot root = factory.createAasModelRoot();

        // Find top-level Package elements
        for (EObject obj : sysmlResource.getContents()) {
            if ("Package".equals(className(obj))) {
                processPackage(obj, root);
            }
        }

        // Fallback: if root content isn't a Package, walk one level deeper
        if (root.getAssetadministrationshells().isEmpty()) {
            TreeIterator<EObject> iter = sysmlResource.getAllContents();
            while (iter.hasNext()) {
                EObject obj = iter.next();
                if ("Package".equals(className(obj))) {
                    processPackage(obj, root);
                    iter.prune();
                }
            }
        }

        return root;
    }

    // ── Table 1, Row 1: Package → AAS + Submodel + SubmodelElementCollection ─

    private void processPackage(EObject pkg, AasModelRoot root) {
        String pkgName = declaredName(pkg);
        if (pkgName == null) pkgName = "UnnamedPackage";
        root.setName(pkgName);

        // Asset
        Asset asset = factory.createAsset();
        asset.setIdShort(toIdShort(pkgName) + "Asset");
        asset.setKind(AssetKind.INSTANCE);
        asset.setIdentification(makeId("urn:asset:" + pkgName));

        // AssetAdministrationShell
        AssetAdministrationShell aas = factory.createAssetAdministrationShell();
        aas.setIdShort(toIdShort(pkgName) + "AAS");
        aas.setIdentification(makeId("urn:aas:" + pkgName));
        aas.setAsset(asset);

        // Submodel
        Submodel submodel = factory.createSubmodel();
        submodel.setIdShort(toIdShort(pkgName) + "SM");
        submodel.setIdentification(makeId("urn:sm:" + pkgName));

        // SubmodelElementCollection — Table 1, Row 1: Package → container SMC
        SubmodelElementCollection smc = factory.createSubmodelElementCollection();
        smc.setIdShort(toIdShort(pkgName));
        smc.setOrdered(false);
        smc.setAllowDuplicates(false);

        // Walk direct children of the Package via ownedRelationship → ownedRelatedElement
        collectDirectMembers(pkg, smc);

        submodel.getSubmodelelement().add(smc);
        aas.getSubmodel().add(submodel);
        root.getAssetadministrationshells().add(aas);
    }

    /** Walk ownedRelationship[OwningMembership/FeatureMembership].ownedRelatedElement */
    @SuppressWarnings("unchecked")
    private void collectDirectMembers(EObject container, SubmodelElementCollection target) {
        EStructuralFeature ownedRelF = container.eClass().getEStructuralFeature("ownedRelationship");
        if (ownedRelF == null) return;

        Iterable<EObject> ownedRels = (Iterable<EObject>) container.eGet(ownedRelF);
        for (EObject rel : ownedRels) {
            EStructuralFeature relElemF = rel.eClass().getEStructuralFeature("ownedRelatedElement");
            if (relElemF == null) continue;

            Iterable<EObject> children = (Iterable<EObject>) rel.eGet(relElemF);
            for (EObject child : children) {
                SubmodelElement elem = mapElement(child);
                if (elem != null) {
                    target.getSubmodelelement().add(elem);
                }
            }
        }
    }

    /** Dispatch: map a SysML EObject to an AAS SubmodelElement (null = unmapped) */
    private SubmodelElement mapElement(EObject obj) {
        switch (className(obj)) {
            // Table 1, Row 2: PartDefinition / ItemDefinition → Entity (Template)
            case "PartDefinition":
            case "ItemDefinition":
                return makeEntity(obj, ModelingKind.TEMPLATE, null);

            // Table 1, Row 7: OccurrenceDefinition → Entity (Template)
            case "OccurrenceDefinition":
                return makeEntity(obj, ModelingKind.TEMPLATE, null);

            // Table 1, Row 3: PartUsage / ItemUsage → Entity (Instance)
            case "PartUsage":
            case "ItemUsage":
                return makeEntity(obj, ModelingKind.INSTANCE, null);

            // Table 1, Row 4: PortDefinition → Entity (Template) + Qualifier(type=PortDefinition)
            case "PortDefinition":
                return makeEntity(obj, ModelingKind.TEMPLATE, "PortDefinition");

            // Table 1, Row 5: PortUsage → Entity (Instance) + Qualifier(type=PortUsage)
            case "PortUsage":
                return makeEntity(obj, ModelingKind.INSTANCE, "PortUsage");

            // Table 1, Row 6: AttributeUsage → AAS:Property
            case "AttributeUsage":
                return makeProperty(obj);

            // Table 2, Row 3-4: ActionDefinition / ActionUsage → Operation
            case "ActionDefinition":
                return makeOperation(obj, ModelingKind.TEMPLATE);
            case "ActionUsage":
                return makeOperation(obj, ModelingKind.INSTANCE);

            default:
                return null;
        }
    }

    // ── Mapping helpers ───────────────────────────────────────────────────────

    /** Table 1, Rows 2-5: creates Entity, optionally with Qualifier */
    private Entity makeEntity(EObject src, ModelingKind kind, String qualifierType) {
        Entity e = factory.createEntity();
        e.setIdShort(safeIdShort(src));
        e.setKind(kind);
        e.setEntityType(EntityType.SELF_MANAGED_ENTITY);
        if (qualifierType != null) {
            Qualifier q = factory.createQualifier();
            q.setType(qualifierType);
            e.setQualifier(q);
        }
        return e;
    }

    /** Table 1, Row 6: AttributeUsage → AAS:Property */
    private Property makeProperty(EObject src) {
        Property p = factory.createProperty();
        p.setIdShort(safeIdShort(src));
        p.setKind(ModelingKind.INSTANCE);
        p.setValueType(DataTypeDefXsd.STRING);
        return p;
    }

    /** Table 2, Rows 3-4: ActionDefinition / ActionUsage → AAS:Operation */
    private AAS.Operation makeOperation(EObject src, ModelingKind kind) {
        AAS.Operation op = factory.createOperation();
        op.setIdShort(safeIdShort(src));
        op.setKind(kind);
        return op;
    }

    // ── Utility ───────────────────────────────────────────────────────────────

    private String className(EObject obj) {
        return obj.eClass().getName();
    }

    private String declaredName(EObject obj) {
        EStructuralFeature f = obj.eClass().getEStructuralFeature("declaredName");
        if (f == null) return null;
        Object v = obj.eGet(f);
        return v instanceof String ? (String) v : null;
    }

    private String safeIdShort(EObject obj) {
        String n = declaredName(obj);
        return toIdShort(n != null ? n : "Unknown");
    }

    /** Convert any string to a valid AAS idShort (only A-Za-z0-9 and underscore) */
    static String toIdShort(String name) {
        if (name == null || name.isEmpty()) return "Unknown";
        // idShort must start with a letter
        String safe = name.replaceAll("[^A-Za-z0-9_]", "_");
        if (!Character.isLetter(safe.charAt(0))) safe = "x_" + safe;
        return safe;
    }

    private Identifier makeId(String id) {
        Identifier ident = factory.createIdentifier();
        ident.setIdType(IdentifierType.CUSTOM);
        ident.setId(id);
        return ident;
    }
}
