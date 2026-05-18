import AAS.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.*;

/**
 * Standalone CLI runner for the SysML v2 → AAS model transformation.
 *
 * Usage:
 *   java -jar transformation.jar \
 *     --input   VehicleDefinitions.xmi \
 *     --output  vehicle.aas \
 *     --sysml-mm /path/to/SysML.ecore \
 *     --aas-mm   /path/to/aas.ecore
 *
 * The QVTo scripts in sysml2aas.qvto / mappings/ / lib/ document the same
 * mapping rules in the QVTo language (for Eclipse-based execution).
 * This Java runner implements the same rules via EMF reflective API.
 */
public class RunTransformation {

    public static void main(String[] args) throws Exception {
        Map<String, String> params = parseArgs(args);

        String inputPath  = require(params, "input",    "--input  <sysml.xmi>");
        String outputPath = require(params, "output",   "--output <out.aas>");
        String sysmlMm    = require(params, "sysml-mm", "--sysml-mm <SysML.ecore>");
        // --aas-mm is accepted but not required (we use the generated AAS classes)
        params.get("aas-mm");

        System.out.println("[TB-03] SysML v2 → AAS transformation starting");
        System.out.println("  input    : " + inputPath);
        System.out.println("  output   : " + outputPath);
        System.out.println("  sysml-mm : " + sysmlMm);

        // ── EMF standalone setup ──────────────────────────────────────────────
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("ecore", new EcoreResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi",   new XMIResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("*",     new XMIResourceFactoryImpl());

        // Register generated AAS package
        AASPackage.eINSTANCE.eClass();

        // Load SysML metamodel dynamically (all three ecores are co-located)
        URI sysmlUri = URI.createFileURI(new java.io.File(sysmlMm).getAbsolutePath());
        Resource sysmlEcoreRes = rs.getResource(sysmlUri, true);
        try {
            EcoreUtil.resolveAll(sysmlEcoreRes);
        } catch (Exception e) {
            System.err.println("[WARN] Partial resolution of SysML metamodel: " + e.getMessage());
        }
        EPackage sysmlPkg = (EPackage) sysmlEcoreRes.getContents().get(0);
        rs.getPackageRegistry().put(sysmlPkg.getNsURI(), sysmlPkg);
        System.out.println("  SysML nsURI registered: " + sysmlPkg.getNsURI());

        // ── Load SysML input model ────────────────────────────────────────────
        URI inputUri   = URI.createFileURI(new java.io.File(inputPath).getAbsolutePath());
        Map<String, Object> loadOpts = new HashMap<>();
        loadOpts.put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        Resource inputRes = rs.createResource(inputUri);
        inputRes.load(loadOpts);
        System.out.println("  SysML model loaded: " + inputRes.getContents().size()
                           + " root object(s)");

        // ── Transform ─────────────────────────────────────────────────────────
        SysML2AASTransformer transformer = new SysML2AASTransformer();
        AasModelRoot aasRoot = transformer.transform(inputRes);

        int shellCount = aasRoot.getAssetadministrationshells().size();
        System.out.println("  AAS shells produced: " + shellCount);
        if (shellCount == 0) {
            System.err.println("[WARN] No AAS shells produced — check that the input"
                               + " contains top-level Package elements");
        }

        // ── Save AAS model ────────────────────────────────────────────────────
        URI outputUri = URI.createFileURI(new java.io.File(outputPath).getAbsolutePath());
        Resource outputRes = rs.createResource(outputUri);
        outputRes.getContents().add(aasRoot);
        Map<String, Object> saveOpts = new HashMap<>();
        saveOpts.put(XMIResource.OPTION_ENCODING, "UTF-8");
        saveOpts.put(XMIResource.OPTION_FORMATTED, Boolean.TRUE);
        outputRes.save(saveOpts);
        System.out.println("[TB-03] AAS model written to: " + outputPath);
    }

    // ── Argument parsing ──────────────────────────────────────────────────────

    private static Map<String, String> parseArgs(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < args.length - 1; i++) {
            String key = args[i];
            if (key.startsWith("--")) {
                map.put(key.substring(2), args[++i]);
            }
        }
        return map;
    }

    private static String require(Map<String, String> map, String key, String usage) {
        String val = map.get(key);
        if (val == null) {
            System.err.println("Missing required argument: " + usage);
            System.err.println("Usage: java -jar transformation.jar"
                + " --input <sysml.xmi> --output <out.aas>"
                + " --sysml-mm <SysML.ecore> --aas-mm <aas.ecore>");
            System.exit(1);
        }
        return val;
    }
}
