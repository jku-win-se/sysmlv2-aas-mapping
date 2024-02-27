/**
 */
package AAS.impl;

import AAS.AASEndpoint;
import AAS.AASFactory;
import AAS.AASPackage;
import AAS.AasModelRoot;
import AAS.AccessControl;
import AAS.AccessControlPolicyPoints;
import AAS.AdministrativeInformation;
import AAS.AnnotatedRelationshipElement;
import AAS.Asset;
import AAS.AssetAdministrationShell;
import AAS.AssetInformation;
import AAS.AssetKind;
import AAS.BasicEvent;
import AAS.Capability;
import AAS.Certificate;
import AAS.ComposableElement;
import AAS.ConceptDescription;
import AAS.DataElement;
import AAS.DataSpecificationContent;
import AAS.DataSpecificationIEC61360;
import AAS.DataTypeDefXsd;
import AAS.DataTypeIEC61360;
import AAS.Endpoint;
import AAS.Entity;
import AAS.EntityType;
import AAS.Event;
import AAS.Extension;
import AAS.File;
import AAS.HasDataSpecification;
import AAS.HasExtensions;
import AAS.HasKind;
import AAS.HasSemantics;
import AAS.IdType;
import AAS.Identifiable;
import AAS.IdentifiableElement;
import AAS.Identifier;
import AAS.IdentifierKeyValuePair;
import AAS.IdentifierType;
import AAS.Key;
import AAS.KeyElements;
import AAS.KeyType;
import AAS.LangEnum;
import AAS.LangString;
import AAS.LangStringSet;
import AAS.LevelType;
import AAS.LocalKeyType;
import AAS.MimeType;
import AAS.ModelingKind;
import AAS.MultiLanguageProperty;
import AAS.NodeId;
import AAS.Operation;
import AAS.Property;
import AAS.ProtocolKind;
import AAS.Qualifiable;
import AAS.Qualifier;
import AAS.Range;
import AAS.Referable;
import AAS.ReferableElements;
import AAS.Reference;
import AAS.ReferenceElement;
import AAS.RelationshipElement;
import AAS.Security;
import AAS.Submodel;
import AAS.SubmodelElement;
import AAS.SubmodelElementCollection;
import AAS.ValueReferencePairType;
import AAS.View;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AASPackageImpl extends EPackageImpl implements AASPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetAdministrationShellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasDataSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlPolicyPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSemanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierKeyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aasEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelElementCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langStringSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpecificationContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpecificationIEC61360EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueReferencePairTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLanguagePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aasModelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasExtensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedRelationshipElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum langEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyElementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referableElementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifiableElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localKeyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeIEC61360EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeDefXsdEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AAS.AASPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AASPackageImpl() {
		super(eNS_URI, AASFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AASPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AASPackage init() {
		if (isInited) return (AASPackage)EPackage.Registry.INSTANCE.getEPackage(AASPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAASPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AASPackageImpl theAASPackage = registeredAASPackage instanceof AASPackageImpl ? (AASPackageImpl)registeredAASPackage : new AASPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAASPackage.createPackageContents();

		// Initialize created meta-data
		theAASPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAASPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AASPackage.eNS_URI, theAASPackage);
		return theAASPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetAdministrationShell() {
		return assetAdministrationShellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_DerivedFrom() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Security() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_AssetInformation() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Asset() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Submodel() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Endpoint() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiable_Administration() {
		return (EReference)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiable_Identification() {
		return (EReference)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferable() {
		return referableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferable_IdShort() {
		return (EAttribute)referableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferable_Category() {
		return (EAttribute)referableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferable_Description() {
		return (EReference)referableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLangString() {
		return langStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLangString_Lang() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLangString_Value() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrativeInformation() {
		return administrativeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_Version() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_Revision() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_Creator() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_TemplateId() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifier_IdType() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasDataSpecification() {
		return hasDataSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasDataSpecification_DataSpecification() {
		return (EReference)hasDataSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Key() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Name() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Type() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Value() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_IdType() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKey_Referable() {
		return (EReference)keyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurity_AccessControlPolicyPoints() {
		return (EReference)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurity_Certificate() {
		return (EReference)securityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurity_RequiredCertificateExtension() {
		return (EReference)securityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControlPolicyPoints() {
		return accessControlPolicyPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlPolicyPoints_LocalAccessControl() {
		return (EReference)accessControlPolicyPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlPolicyPoints_ExternalAccessControl() {
		return (EAttribute)accessControlPolicyPointsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlPolicyPoints_ExternalInformationPoints() {
		return (EAttribute)accessControlPolicyPointsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlPolicyPoints_InternalInformationPoint() {
		return (EReference)accessControlPolicyPointsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlPolicyPoints_ExternalPolicyDecisionPoints() {
		return (EAttribute)accessControlPolicyPointsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlPolicyPoints_ExternalPolicyEnforcementPoint() {
		return (EAttribute)accessControlPolicyPointsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControl() {
		return accessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodel() {
		return submodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodel_Submodelelement() {
		return (EReference)submodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasKind() {
		return hasKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasKind_Kind() {
		return (EAttribute)hasKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasSemantics() {
		return hasSemanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasSemantics_SemanticId() {
		return (EReference)hasSemanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodelElement() {
		return submodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodelElement_IsDynamic() {
		return (EAttribute)submodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodelElement_EndPoint() {
		return (EReference)submodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodelElement_NodeId() {
		return (EReference)submodelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpoint_Address() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpoint_Protocol() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpoint_Name() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeId() {
		return nodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeId_Namespace() {
		return (EAttribute)nodeIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeId_Identifier() {
		return (EAttribute)nodeIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeId_IdType() {
		return (EAttribute)nodeIdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificate() {
		return certificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetInformation() {
		return assetInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetInformation_AssetKind() {
		return (EAttribute)assetInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetInformation_GlobalAssetId() {
		return (EReference)assetInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetInformation_SpecificAssetId() {
		return (EReference)assetInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetInformation_BillOfMaterial() {
		return (EReference)assetInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetInformation_DefaultThumbnail() {
		return (EReference)assetInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifierKeyValuePair() {
		return identifierKeyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierKeyValuePair_Key() {
		return (EAttribute)identifierKeyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierKeyValuePair_Value() {
		return (EAttribute)identifierKeyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifierKeyValuePair_ExternalSubjectId() {
		return (EReference)identifierKeyValuePairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_MimeType() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Kind() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Endpoint() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAASEndpoint() {
		return aasEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAASEndpoint_Address() {
		return (EAttribute)aasEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAASEndpoint_Port() {
		return (EAttribute)aasEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_EntityType() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipElement() {
		return relationshipElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipElement_First() {
		return (EReference)relationshipElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipElement_Second() {
		return (EReference)relationshipElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipElement_Name() {
		return (EAttribute)relationshipElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodelElementCollection() {
		return submodelElementCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodelElementCollection_Ordered() {
		return (EAttribute)submodelElementCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodelElementCollection_AllowDuplicates() {
		return (EAttribute)submodelElementCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_ValueType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_ValueId() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceElement() {
		return referenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceElement_Value() {
		return (EReference)referenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Min() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Max() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptDescription() {
		return conceptDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConceptDescription_IsCaseOf() {
		return (EReference)conceptDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLangStringSet() {
		return langStringSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSpecificationContent() {
		return dataSpecificationContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSpecificationIEC61360() {
		return dataSpecificationIEC61360EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_PreferredName() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_ShortName() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpecificationIEC61360_Unit() {
		return (EAttribute)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_UnitId() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpecificationIEC61360_SourceOfDefinition() {
		return (EAttribute)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpecificationIEC61360_Symbol() {
		return (EAttribute)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_DataType() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_Definition() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpecificationIEC61360_ValueFormat() {
		return (EAttribute)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_ValueList() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpecificationIEC61360_ValueId() {
		return (EReference)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpecificationIEC61360_LevelType() {
		return (EAttribute)dataSpecificationIEC61360EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueReferencePairType() {
		return valueReferencePairTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueReferencePairType_ValueId() {
		return (EReference)valueReferencePairTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_ContainedElement() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiLanguageProperty() {
		return multiLanguagePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiLanguageProperty_Value() {
		return (EReference)multiLanguagePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiLanguageProperty_ValueId() {
		return (EReference)multiLanguagePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAasModelRoot() {
		return aasModelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAasModelRoot_Assetadministrationshells() {
		return (EReference)aasModelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAasModelRoot_Name() {
		return (EAttribute)aasModelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasExtensions() {
		return hasExtensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasExtensions_Extension() {
		return (EReference)hasExtensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Name() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_ValueType() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Value() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifiable() {
		return qualifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifiable_Qualifier() {
		return (EReference)qualifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifier() {
		return qualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_Type() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_ValueType() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_Value() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifier_ValueId() {
		return (EReference)qualifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotatedRelationshipElement() {
		return annotatedRelationshipElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatedRelationshipElement_Dataelement() {
		return (EReference)annotatedRelationshipElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotatedRelationshipElement_Note() {
		return (EAttribute)annotatedRelationshipElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposableElement() {
		return composableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposableElement_Submodelelement() {
		return (EReference)composableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierType() {
		return identifierTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLangEnum() {
		return langEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKeyElements() {
		return keyElementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferableElements() {
		return referableElementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifiableElement() {
		return identifiableElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKeyType() {
		return keyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocalKeyType() {
		return localKeyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelingKind() {
		return modelingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtocolKind() {
		return protocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdType() {
		return idTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetKind() {
		return assetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMimeType() {
		return mimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntityType() {
		return entityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLevelType() {
		return levelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTypeIEC61360() {
		return dataTypeIEC61360EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTypeDefXsd() {
		return dataTypeDefXsdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AASFactory getAASFactory() {
		return (AASFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assetAdministrationShellEClass = createEClass(ASSET_ADMINISTRATION_SHELL);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__DERIVED_FROM);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__SECURITY);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__ASSET);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__SUBMODEL);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__ENDPOINT);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEReference(identifiableEClass, IDENTIFIABLE__ADMINISTRATION);
		createEReference(identifiableEClass, IDENTIFIABLE__IDENTIFICATION);

		referableEClass = createEClass(REFERABLE);
		createEAttribute(referableEClass, REFERABLE__ID_SHORT);
		createEAttribute(referableEClass, REFERABLE__CATEGORY);
		createEReference(referableEClass, REFERABLE__DESCRIPTION);

		langStringEClass = createEClass(LANG_STRING);
		createEAttribute(langStringEClass, LANG_STRING__LANG);
		createEAttribute(langStringEClass, LANG_STRING__VALUE);

		administrativeInformationEClass = createEClass(ADMINISTRATIVE_INFORMATION);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__VERSION);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__REVISION);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__CREATOR);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__TEMPLATE_ID);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID_TYPE);
		createEAttribute(identifierEClass, IDENTIFIER__ID);

		hasDataSpecificationEClass = createEClass(HAS_DATA_SPECIFICATION);
		createEReference(hasDataSpecificationEClass, HAS_DATA_SPECIFICATION__DATA_SPECIFICATION);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__KEY);
		createEAttribute(referenceEClass, REFERENCE__NAME);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__TYPE);
		createEAttribute(keyEClass, KEY__VALUE);
		createEAttribute(keyEClass, KEY__ID_TYPE);
		createEReference(keyEClass, KEY__REFERABLE);

		securityEClass = createEClass(SECURITY);
		createEReference(securityEClass, SECURITY__ACCESS_CONTROL_POLICY_POINTS);
		createEReference(securityEClass, SECURITY__CERTIFICATE);
		createEReference(securityEClass, SECURITY__REQUIRED_CERTIFICATE_EXTENSION);

		accessControlPolicyPointsEClass = createEClass(ACCESS_CONTROL_POLICY_POINTS);
		createEReference(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL);
		createEAttribute(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL);
		createEAttribute(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS);
		createEReference(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT);
		createEAttribute(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS);
		createEAttribute(accessControlPolicyPointsEClass, ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT);

		accessControlEClass = createEClass(ACCESS_CONTROL);

		submodelEClass = createEClass(SUBMODEL);
		createEReference(submodelEClass, SUBMODEL__SUBMODELELEMENT);

		hasKindEClass = createEClass(HAS_KIND);
		createEAttribute(hasKindEClass, HAS_KIND__KIND);

		hasSemanticsEClass = createEClass(HAS_SEMANTICS);
		createEReference(hasSemanticsEClass, HAS_SEMANTICS__SEMANTIC_ID);

		submodelElementEClass = createEClass(SUBMODEL_ELEMENT);
		createEAttribute(submodelElementEClass, SUBMODEL_ELEMENT__IS_DYNAMIC);
		createEReference(submodelElementEClass, SUBMODEL_ELEMENT__END_POINT);
		createEReference(submodelElementEClass, SUBMODEL_ELEMENT__NODE_ID);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__ADDRESS);
		createEAttribute(endpointEClass, ENDPOINT__PROTOCOL);
		createEAttribute(endpointEClass, ENDPOINT__NAME);

		nodeIdEClass = createEClass(NODE_ID);
		createEAttribute(nodeIdEClass, NODE_ID__NAMESPACE);
		createEAttribute(nodeIdEClass, NODE_ID__IDENTIFIER);
		createEAttribute(nodeIdEClass, NODE_ID__ID_TYPE);

		certificateEClass = createEClass(CERTIFICATE);

		assetInformationEClass = createEClass(ASSET_INFORMATION);
		createEAttribute(assetInformationEClass, ASSET_INFORMATION__ASSET_KIND);
		createEReference(assetInformationEClass, ASSET_INFORMATION__GLOBAL_ASSET_ID);
		createEReference(assetInformationEClass, ASSET_INFORMATION__SPECIFIC_ASSET_ID);
		createEReference(assetInformationEClass, ASSET_INFORMATION__BILL_OF_MATERIAL);
		createEReference(assetInformationEClass, ASSET_INFORMATION__DEFAULT_THUMBNAIL);

		identifierKeyValuePairEClass = createEClass(IDENTIFIER_KEY_VALUE_PAIR);
		createEAttribute(identifierKeyValuePairEClass, IDENTIFIER_KEY_VALUE_PAIR__KEY);
		createEAttribute(identifierKeyValuePairEClass, IDENTIFIER_KEY_VALUE_PAIR__VALUE);
		createEReference(identifierKeyValuePairEClass, IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__PATH);
		createEAttribute(fileEClass, FILE__MIME_TYPE);

		dataElementEClass = createEClass(DATA_ELEMENT);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__KIND);
		createEReference(assetEClass, ASSET__ENDPOINT);

		aasEndpointEClass = createEClass(AAS_ENDPOINT);
		createEAttribute(aasEndpointEClass, AAS_ENDPOINT__ADDRESS);
		createEAttribute(aasEndpointEClass, AAS_ENDPOINT__PORT);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ENTITY_TYPE);

		relationshipElementEClass = createEClass(RELATIONSHIP_ELEMENT);
		createEReference(relationshipElementEClass, RELATIONSHIP_ELEMENT__FIRST);
		createEReference(relationshipElementEClass, RELATIONSHIP_ELEMENT__SECOND);
		createEAttribute(relationshipElementEClass, RELATIONSHIP_ELEMENT__NAME);

		operationEClass = createEClass(OPERATION);

		submodelElementCollectionEClass = createEClass(SUBMODEL_ELEMENT_COLLECTION);
		createEAttribute(submodelElementCollectionEClass, SUBMODEL_ELEMENT_COLLECTION__ORDERED);
		createEAttribute(submodelElementCollectionEClass, SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE_TYPE);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEReference(propertyEClass, PROPERTY__VALUE_ID);

		referenceElementEClass = createEClass(REFERENCE_ELEMENT);
		createEReference(referenceElementEClass, REFERENCE_ELEMENT__VALUE);

		eventEClass = createEClass(EVENT);

		basicEventEClass = createEClass(BASIC_EVENT);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__MIN);
		createEAttribute(rangeEClass, RANGE__MAX);

		capabilityEClass = createEClass(CAPABILITY);

		conceptDescriptionEClass = createEClass(CONCEPT_DESCRIPTION);
		createEReference(conceptDescriptionEClass, CONCEPT_DESCRIPTION__IS_CASE_OF);

		langStringSetEClass = createEClass(LANG_STRING_SET);

		dataSpecificationContentEClass = createEClass(DATA_SPECIFICATION_CONTENT);

		dataSpecificationIEC61360EClass = createEClass(DATA_SPECIFICATION_IEC61360);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__PREFERRED_NAME);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__SHORT_NAME);
		createEAttribute(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__UNIT);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__UNIT_ID);
		createEAttribute(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION);
		createEAttribute(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__SYMBOL);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__DATA_TYPE);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__DEFINITION);
		createEAttribute(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__VALUE_FORMAT);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__VALUE_LIST);
		createEReference(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__VALUE_ID);
		createEAttribute(dataSpecificationIEC61360EClass, DATA_SPECIFICATION_IEC61360__LEVEL_TYPE);

		valueReferencePairTypeEClass = createEClass(VALUE_REFERENCE_PAIR_TYPE);
		createEReference(valueReferencePairTypeEClass, VALUE_REFERENCE_PAIR_TYPE__VALUE_ID);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__CONTAINED_ELEMENT);

		multiLanguagePropertyEClass = createEClass(MULTI_LANGUAGE_PROPERTY);
		createEReference(multiLanguagePropertyEClass, MULTI_LANGUAGE_PROPERTY__VALUE);
		createEReference(multiLanguagePropertyEClass, MULTI_LANGUAGE_PROPERTY__VALUE_ID);

		aasModelRootEClass = createEClass(AAS_MODEL_ROOT);
		createEReference(aasModelRootEClass, AAS_MODEL_ROOT__ASSETADMINISTRATIONSHELLS);
		createEAttribute(aasModelRootEClass, AAS_MODEL_ROOT__NAME);

		hasExtensionsEClass = createEClass(HAS_EXTENSIONS);
		createEReference(hasExtensionsEClass, HAS_EXTENSIONS__EXTENSION);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__NAME);
		createEAttribute(extensionEClass, EXTENSION__VALUE_TYPE);
		createEAttribute(extensionEClass, EXTENSION__VALUE);

		qualifiableEClass = createEClass(QUALIFIABLE);
		createEReference(qualifiableEClass, QUALIFIABLE__QUALIFIER);

		qualifierEClass = createEClass(QUALIFIER);
		createEAttribute(qualifierEClass, QUALIFIER__TYPE);
		createEAttribute(qualifierEClass, QUALIFIER__VALUE_TYPE);
		createEAttribute(qualifierEClass, QUALIFIER__VALUE);
		createEReference(qualifierEClass, QUALIFIER__VALUE_ID);

		annotatedRelationshipElementEClass = createEClass(ANNOTATED_RELATIONSHIP_ELEMENT);
		createEReference(annotatedRelationshipElementEClass, ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT);
		createEAttribute(annotatedRelationshipElementEClass, ANNOTATED_RELATIONSHIP_ELEMENT__NOTE);

		composableElementEClass = createEClass(COMPOSABLE_ELEMENT);
		createEReference(composableElementEClass, COMPOSABLE_ELEMENT__SUBMODELELEMENT);

		// Create enums
		identifierTypeEEnum = createEEnum(IDENTIFIER_TYPE);
		langEnumEEnum = createEEnum(LANG_ENUM);
		keyElementsEEnum = createEEnum(KEY_ELEMENTS);
		referableElementsEEnum = createEEnum(REFERABLE_ELEMENTS);
		identifiableElementEEnum = createEEnum(IDENTIFIABLE_ELEMENT);
		keyTypeEEnum = createEEnum(KEY_TYPE);
		localKeyTypeEEnum = createEEnum(LOCAL_KEY_TYPE);
		modelingKindEEnum = createEEnum(MODELING_KIND);
		protocolKindEEnum = createEEnum(PROTOCOL_KIND);
		idTypeEEnum = createEEnum(ID_TYPE);
		assetKindEEnum = createEEnum(ASSET_KIND);
		mimeTypeEEnum = createEEnum(MIME_TYPE);
		entityTypeEEnum = createEEnum(ENTITY_TYPE);
		levelTypeEEnum = createEEnum(LEVEL_TYPE);
		dataTypeIEC61360EEnum = createEEnum(DATA_TYPE_IEC61360);
		dataTypeDefXsdEEnum = createEEnum(DATA_TYPE_DEF_XSD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assetAdministrationShellEClass.getESuperTypes().add(this.getIdentifiable());
		assetAdministrationShellEClass.getESuperTypes().add(this.getHasDataSpecification());
		identifiableEClass.getESuperTypes().add(this.getReferable());
		referableEClass.getESuperTypes().add(this.getHasExtensions());
		submodelEClass.getESuperTypes().add(this.getIdentifiable());
		submodelEClass.getESuperTypes().add(this.getHasKind());
		submodelEClass.getESuperTypes().add(this.getHasSemantics());
		submodelEClass.getESuperTypes().add(this.getHasDataSpecification());
		submodelEClass.getESuperTypes().add(this.getQualifiable());
		submodelElementEClass.getESuperTypes().add(this.getReferable());
		submodelElementEClass.getESuperTypes().add(this.getHasKind());
		submodelElementEClass.getESuperTypes().add(this.getHasSemantics());
		submodelElementEClass.getESuperTypes().add(this.getHasDataSpecification());
		submodelElementEClass.getESuperTypes().add(this.getQualifiable());
		identifierKeyValuePairEClass.getESuperTypes().add(this.getHasSemantics());
		fileEClass.getESuperTypes().add(this.getDataElement());
		dataElementEClass.getESuperTypes().add(this.getSubmodelElement());
		assetEClass.getESuperTypes().add(this.getIdentifiable());
		assetEClass.getESuperTypes().add(this.getHasDataSpecification());
		entityEClass.getESuperTypes().add(this.getSubmodelElement());
		entityEClass.getESuperTypes().add(this.getComposableElement());
		relationshipElementEClass.getESuperTypes().add(this.getSubmodelElement());
		relationshipElementEClass.getESuperTypes().add(this.getComposableElement());
		operationEClass.getESuperTypes().add(this.getSubmodelElement());
		operationEClass.getESuperTypes().add(this.getComposableElement());
		submodelElementCollectionEClass.getESuperTypes().add(this.getSubmodelElement());
		submodelElementCollectionEClass.getESuperTypes().add(this.getComposableElement());
		propertyEClass.getESuperTypes().add(this.getDataElement());
		referenceElementEClass.getESuperTypes().add(this.getDataElement());
		eventEClass.getESuperTypes().add(this.getSubmodelElement());
		eventEClass.getESuperTypes().add(this.getComposableElement());
		basicEventEClass.getESuperTypes().add(this.getEvent());
		rangeEClass.getESuperTypes().add(this.getDataElement());
		capabilityEClass.getESuperTypes().add(this.getSubmodelElement());
		capabilityEClass.getESuperTypes().add(this.getComposableElement());
		conceptDescriptionEClass.getESuperTypes().add(this.getIdentifiable());
		conceptDescriptionEClass.getESuperTypes().add(this.getHasDataSpecification());
		viewEClass.getESuperTypes().add(this.getReferable());
		viewEClass.getESuperTypes().add(this.getHasSemantics());
		viewEClass.getESuperTypes().add(this.getHasDataSpecification());
		multiLanguagePropertyEClass.getESuperTypes().add(this.getDataElement());
		annotatedRelationshipElementEClass.getESuperTypes().add(this.getRelationshipElement());
		composableElementEClass.getESuperTypes().add(this.getSubmodelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetAdministrationShellEClass, AssetAdministrationShell.class, "AssetAdministrationShell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetAdministrationShell_DerivedFrom(), this.getAssetAdministrationShell(), null, "derivedFrom", null, 0, 1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Security(), this.getSecurity(), null, "security", null, 0, 1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_AssetInformation(), this.getAssetInformation(), null, "assetInformation", null, 1, 1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Asset(), this.getAsset(), null, "asset", null, 1, 1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Submodel(), this.getSubmodel(), null, "submodel", null, 0, -1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssetAdministrationShell_Endpoint(), this.getAASEndpoint(), null, "endpoint", null, 0, 1, AssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiable_Administration(), this.getAdministrativeInformation(), null, "administration", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiable_Identification(), this.getIdentifier(), null, "identification", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referableEClass, Referable.class, "Referable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferable_IdShort(), ecorePackage.getEString(), "idShort", null, 1, 1, Referable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferable_Category(), ecorePackage.getEString(), "category", null, 0, 1, Referable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferable_Description(), this.getLangString(), null, "description", null, 0, -1, Referable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(langStringEClass, LangString.class, "LangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangString_Lang(), this.getLangEnum(), "lang", null, 1, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangString_Value(), ecorePackage.getEString(), "value", null, 1, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrativeInformationEClass, AdministrativeInformation.class, "AdministrativeInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrativeInformation_Version(), ecorePackage.getEString(), "version", null, 0, 1, AdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativeInformation_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, AdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativeInformation_Creator(), ecorePackage.getEString(), "creator", null, 0, 1, AdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativeInformation_TemplateId(), ecorePackage.getEString(), "templateId", null, 0, 1, AdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_IdType(), this.getIdentifierType(), "idType", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasDataSpecificationEClass, HasDataSpecification.class, "HasDataSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasDataSpecification_DataSpecification(), this.getReference(), null, "dataSpecification", null, 0, -1, HasDataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Key(), this.getKey(), null, "key", null, 1, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Type(), this.getKeyElements(), "type", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Value(), ecorePackage.getEString(), "value", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_IdType(), this.getKeyType(), "idType", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKey_Referable(), this.getReferable(), null, "referable", null, 1, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurity_AccessControlPolicyPoints(), this.getAccessControlPolicyPoints(), null, "accessControlPolicyPoints", null, 1, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurity_Certificate(), this.getCertificate(), null, "certificate", null, 0, -1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurity_RequiredCertificateExtension(), this.getReference(), null, "requiredCertificateExtension", null, 0, -1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessControlPolicyPointsEClass, AccessControlPolicyPoints.class, "AccessControlPolicyPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControlPolicyPoints_LocalAccessControl(), this.getAccessControl(), null, "localAccessControl", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlPolicyPoints_ExternalAccessControl(), ecorePackage.getEBoolean(), "externalAccessControl", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlPolicyPoints_ExternalInformationPoints(), ecorePackage.getEBoolean(), "externalInformationPoints", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlPolicyPoints_InternalInformationPoint(), this.getSubmodel(), null, "internalInformationPoint", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlPolicyPoints_ExternalPolicyDecisionPoints(), ecorePackage.getEBoolean(), "externalPolicyDecisionPoints", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlPolicyPoints_ExternalPolicyEnforcementPoint(), ecorePackage.getEBoolean(), "externalPolicyEnforcementPoint", null, 1, 1, AccessControlPolicyPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlEClass, AccessControl.class, "AccessControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(submodelEClass, Submodel.class, "Submodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmodel_Submodelelement(), this.getSubmodelElement(), null, "submodelelement", null, 0, -1, Submodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hasKindEClass, HasKind.class, "HasKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasKind_Kind(), this.getModelingKind(), "kind", null, 0, 1, HasKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasSemanticsEClass, HasSemantics.class, "HasSemantics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasSemantics_SemanticId(), this.getReference(), null, "semanticId", null, 0, 1, HasSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submodelElementEClass, SubmodelElement.class, "SubmodelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmodelElement_IsDynamic(), ecorePackage.getEBoolean(), "isDynamic", null, 1, 1, SubmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodelElement_EndPoint(), this.getEndpoint(), null, "endPoint", null, 0, 1, SubmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodelElement_NodeId(), this.getNodeId(), null, "nodeId", null, 0, 1, SubmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoint_Address(), ecorePackage.getEString(), "address", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Protocol(), this.getProtocolKind(), "protocol", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIdEClass, NodeId.class, "NodeId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeId_Namespace(), ecorePackage.getEBigInteger(), "namespace", null, 1, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeId_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeId_IdType(), this.getIdType(), "idType", null, 1, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateEClass, Certificate.class, "Certificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetInformationEClass, AssetInformation.class, "AssetInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetInformation_AssetKind(), this.getAssetKind(), "assetKind", null, 1, 1, AssetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetInformation_GlobalAssetId(), this.getReference(), null, "globalAssetId", null, 0, 1, AssetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetInformation_SpecificAssetId(), this.getIdentifierKeyValuePair(), null, "specificAssetId", null, 0, -1, AssetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssetInformation_BillOfMaterial(), this.getSubmodel(), null, "billOfMaterial", null, 0, -1, AssetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssetInformation_DefaultThumbnail(), this.getFile(), null, "defaultThumbnail", null, 0, 1, AssetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierKeyValuePairEClass, IdentifierKeyValuePair.class, "IdentifierKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 1, 1, IdentifierKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifierKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 1, 1, IdentifierKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifierKeyValuePair_ExternalSubjectId(), this.getReference(), null, "externalSubjectId", null, 0, 1, IdentifierKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_MimeType(), this.getMimeType(), "mimeType", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataElementEClass, DataElement.class, "DataElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Kind(), this.getAssetKind(), "kind", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Endpoint(), this.getEndpoint(), null, "endpoint", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aasEndpointEClass, AASEndpoint.class, "AASEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAASEndpoint_Address(), ecorePackage.getEString(), "address", null, 1, 1, AASEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAASEndpoint_Port(), ecorePackage.getEBigInteger(), "port", null, 1, 1, AASEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_EntityType(), this.getEntityType(), "entityType", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipElementEClass, RelationshipElement.class, "RelationshipElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipElement_First(), this.getReference(), null, "first", null, 1, 1, RelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipElement_Second(), this.getReference(), null, "second", null, 1, 1, RelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(submodelElementCollectionEClass, SubmodelElementCollection.class, "SubmodelElementCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmodelElementCollection_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 1, 1, SubmodelElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmodelElementCollection_AllowDuplicates(), ecorePackage.getEBoolean(), "allowDuplicates", null, 1, 1, SubmodelElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_ValueType(), this.getDataTypeDefXsd(), "valueType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ValueId(), this.getReference(), null, "valueId", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceElementEClass, ReferenceElement.class, "ReferenceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceElement_Value(), this.getReference(), null, "value", null, 0, 1, ReferenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Min(), ecorePackage.getEBigInteger(), "min", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Max(), ecorePackage.getEBigInteger(), "max", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptDescriptionEClass, ConceptDescription.class, "ConceptDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptDescription_IsCaseOf(), this.getReference(), null, "isCaseOf", null, 0, -1, ConceptDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(langStringSetEClass, LangStringSet.class, "LangStringSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSpecificationContentEClass, DataSpecificationContent.class, "DataSpecificationContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSpecificationIEC61360EClass, DataSpecificationIEC61360.class, "DataSpecificationIEC61360", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSpecificationIEC61360_PreferredName(), this.getLangString(), null, "preferredName", null, 1, -1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_ShortName(), this.getLangString(), null, "shortName", null, 0, -1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSpecificationIEC61360_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_UnitId(), this.getReference(), null, "unitId", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpecificationIEC61360_SourceOfDefinition(), ecorePackage.getEString(), "sourceOfDefinition", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpecificationIEC61360_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_DataType(), this.getDataSpecificationIEC61360(), null, "dataType", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_Definition(), this.getLangString(), null, "definition", null, 0, -1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSpecificationIEC61360_ValueFormat(), ecorePackage.getEString(), "valueFormat", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_ValueList(), this.getValueReferencePairType(), null, "valueList", null, 0, -1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataSpecificationIEC61360_ValueId(), this.getReference(), null, "valueId", null, 0, 1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpecificationIEC61360_LevelType(), this.getLevelType(), "levelType", null, 0, -1, DataSpecificationIEC61360.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueReferencePairTypeEClass, ValueReferencePairType.class, "ValueReferencePairType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueReferencePairType_ValueId(), this.getReference(), null, "valueId", null, 1, 1, ValueReferencePairType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_ContainedElement(), this.getReferable(), null, "containedElement", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiLanguagePropertyEClass, MultiLanguageProperty.class, "MultiLanguageProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiLanguageProperty_Value(), this.getLangString(), null, "value", null, 0, -1, MultiLanguageProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiLanguageProperty_ValueId(), this.getReference(), null, "valueId", null, 0, 1, MultiLanguageProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aasModelRootEClass, AasModelRoot.class, "AasModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAasModelRoot_Assetadministrationshells(), this.getAssetAdministrationShell(), null, "assetadministrationshells", null, 1, -1, AasModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAasModelRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, AasModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasExtensionsEClass, HasExtensions.class, "HasExtensions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasExtensions_Extension(), this.getExtension(), null, "extension", null, 0, -1, HasExtensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Name(), ecorePackage.getEString(), "name", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_ValueType(), this.getDataTypeDefXsd(), "valueType", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Value(), ecorePackage.getEString(), "value", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiableEClass, Qualifiable.class, "Qualifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiable_Qualifier(), this.getQualifier(), null, "qualifier", null, 1, 1, Qualifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifierEClass, Qualifier.class, "Qualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifier_Type(), ecorePackage.getEString(), "type", null, 0, 1, Qualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifier_ValueType(), this.getDataTypeDefXsd(), "valueType", null, 0, 1, Qualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifier_Value(), ecorePackage.getEString(), "value", null, 0, 1, Qualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifier_ValueId(), this.getReference(), null, "valueId", null, 0, 1, Qualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedRelationshipElementEClass, AnnotatedRelationshipElement.class, "AnnotatedRelationshipElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedRelationshipElement_Dataelement(), this.getDataElement(), null, "dataelement", null, 0, -1, AnnotatedRelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotatedRelationshipElement_Note(), ecorePackage.getEString(), "note", null, 0, 1, AnnotatedRelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composableElementEClass, ComposableElement.class, "ComposableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposableElement_Submodelelement(), this.getSubmodelElement(), null, "submodelelement", null, 0, -1, ComposableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(identifierTypeEEnum, IdentifierType.class, "IdentifierType");
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.CUSTOM);
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.IRDI);
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.IRI);

		initEEnum(langEnumEEnum, LangEnum.class, "LangEnum");
		addEEnumLiteral(langEnumEEnum, LangEnum.EN);
		addEEnumLiteral(langEnumEEnum, LangEnum.AR);
		addEEnumLiteral(langEnumEEnum, LangEnum.CS);
		addEEnumLiteral(langEnumEEnum, LangEnum.DA);
		addEEnumLiteral(langEnumEEnum, LangEnum.DE);
		addEEnumLiteral(langEnumEEnum, LangEnum.ES);
		addEEnumLiteral(langEnumEEnum, LangEnum.FR);
		addEEnumLiteral(langEnumEEnum, LangEnum.HI);
		addEEnumLiteral(langEnumEEnum, LangEnum.ID);
		addEEnumLiteral(langEnumEEnum, LangEnum.IT);
		addEEnumLiteral(langEnumEEnum, LangEnum.JA);
		addEEnumLiteral(langEnumEEnum, LangEnum.KO);
		addEEnumLiteral(langEnumEEnum, LangEnum.ML);
		addEEnumLiteral(langEnumEEnum, LangEnum.NL);
		addEEnumLiteral(langEnumEEnum, LangEnum.NO);
		addEEnumLiteral(langEnumEEnum, LangEnum.PL);
		addEEnumLiteral(langEnumEEnum, LangEnum.PT);
		addEEnumLiteral(langEnumEEnum, LangEnum.RO);
		addEEnumLiteral(langEnumEEnum, LangEnum.RU);
		addEEnumLiteral(langEnumEEnum, LangEnum.SR);
		addEEnumLiteral(langEnumEEnum, LangEnum.SV);
		addEEnumLiteral(langEnumEEnum, LangEnum.TH);
		addEEnumLiteral(langEnumEEnum, LangEnum.TR);
		addEEnumLiteral(langEnumEEnum, LangEnum.ZH);

		initEEnum(keyElementsEEnum, KeyElements.class, "KeyElements");
		addEEnumLiteral(keyElementsEEnum, KeyElements.GLOBAL_REFERENCE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.FRAGMENT_REFERENCE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ACCESS_PERMISSION_RULE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ANNOTATED_RELATIONSHIP_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.BASIC_EVENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.BLOB);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CAPABILITY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CONCEPT_DICTIONARY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.DATA_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.FILE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ENTITY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.EVENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.MULTI_LANGUAGE_PROPERTY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.OPERATION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.PROPERTY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.RANGE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.REFERENCE_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.RELATIONSHIP_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL_ELEMENT_COLLECTION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.VIEW);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CONCEPT_DESCRIPTION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ASSET);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ASSET_ADMINISTRATION_SHELL);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL);

		initEEnum(referableElementsEEnum, ReferableElements.class, "ReferableElements");
		addEEnumLiteral(referableElementsEEnum, ReferableElements.ACCESS_PERMISSION_RULE);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.ANNOTATED_RELATIONSHIP_ELEMENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.BASIC_EVENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.BLOB);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.CAPABILITY);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.CONCEPT_DICTIONARY);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.DATA_ELEMENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.FILE);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.ENTITY);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.EVENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.MULTI_LANGUAGE_PROPERTY);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.OPERATION);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.PROPERTY);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.RANGE);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.REFERENCE_ELEMENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.RELATIONSHIP_ELEMENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.SUBMODEL_ELEMENT);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.SUBMODEL_ELEMENT_COLLECTION);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.VIEW);
		addEEnumLiteral(referableElementsEEnum, ReferableElements.CONCEPT_DESCRIPTION);

		initEEnum(identifiableElementEEnum, IdentifiableElement.class, "IdentifiableElement");
		addEEnumLiteral(identifiableElementEEnum, IdentifiableElement.ASSET);
		addEEnumLiteral(identifiableElementEEnum, IdentifiableElement.ASSET_ADMINISTRATION_SHELL);
		addEEnumLiteral(identifiableElementEEnum, IdentifiableElement.CONCEPT_DESCRIPTION);
		addEEnumLiteral(identifiableElementEEnum, IdentifiableElement.SUBMODEL);

		initEEnum(keyTypeEEnum, KeyType.class, "KeyType");
		addEEnumLiteral(keyTypeEEnum, KeyType.CUSTOM);
		addEEnumLiteral(keyTypeEEnum, KeyType.IRDI);
		addEEnumLiteral(keyTypeEEnum, KeyType.IRI);
		addEEnumLiteral(keyTypeEEnum, KeyType.ID_SHORT);
		addEEnumLiteral(keyTypeEEnum, KeyType.FRAGMENT_ID);

		initEEnum(localKeyTypeEEnum, LocalKeyType.class, "LocalKeyType");
		addEEnumLiteral(localKeyTypeEEnum, LocalKeyType.ID_SHORT);
		addEEnumLiteral(localKeyTypeEEnum, LocalKeyType.FRAGMENT_ID);

		initEEnum(modelingKindEEnum, ModelingKind.class, "ModelingKind");
		addEEnumLiteral(modelingKindEEnum, ModelingKind.TEMPLATE);
		addEEnumLiteral(modelingKindEEnum, ModelingKind.INSTANCE);

		initEEnum(protocolKindEEnum, ProtocolKind.class, "ProtocolKind");
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.HTTP);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.MQTT);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.OPCUA);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.CO_AP);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.OTHER);

		initEEnum(idTypeEEnum, IdType.class, "IdType");
		addEEnumLiteral(idTypeEEnum, IdType.STRING);
		addEEnumLiteral(idTypeEEnum, IdType.INTEGER);
		addEEnumLiteral(idTypeEEnum, IdType.LONG);
		addEEnumLiteral(idTypeEEnum, IdType.BYTE_ARRAY);
		addEEnumLiteral(idTypeEEnum, IdType.UUID);

		initEEnum(assetKindEEnum, AssetKind.class, "AssetKind");
		addEEnumLiteral(assetKindEEnum, AssetKind.TYPE);
		addEEnumLiteral(assetKindEEnum, AssetKind.INSTANCE);

		initEEnum(mimeTypeEEnum, MimeType.class, "MimeType");

		initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
		addEEnumLiteral(entityTypeEEnum, EntityType.SELF_MANAGED_ENTITY);
		addEEnumLiteral(entityTypeEEnum, EntityType.CO_MANAGED_ENTITY);

		initEEnum(levelTypeEEnum, LevelType.class, "LevelType");
		addEEnumLiteral(levelTypeEEnum, LevelType.MIN);
		addEEnumLiteral(levelTypeEEnum, LevelType.MAX);
		addEEnumLiteral(levelTypeEEnum, LevelType.NOM);
		addEEnumLiteral(levelTypeEEnum, LevelType.TYP);

		initEEnum(dataTypeIEC61360EEnum, DataTypeIEC61360.class, "DataTypeIEC61360");
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.DATE);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.STRING);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.STRING_TRANSLATABLE);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.INTEGER_MEASURE);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.INTEGER_COUNT);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.INTEGER_CURRENCY);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.REAL_MEASURE);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.REAL_COUNT);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.REAL_CURRENCY);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.BOOLEAN);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.URL);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.RATIONAL);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.RATIONAL_MEASURE);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.TIME);
		addEEnumLiteral(dataTypeIEC61360EEnum, DataTypeIEC61360.TIMESTAMP);

		initEEnum(dataTypeDefXsdEEnum, DataTypeDefXsd.class, "DataTypeDefXsd");
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.STRING);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.ANY_URI);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.BASE64_BINARY);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.BOOLEAN);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.BYTE);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.DATE);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.DATE_TIME);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.DECIMAL);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.DOUBLE);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.DURATION);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.GDAY);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.GMONTH);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.GMONTH_DAY);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.GYEAR);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.GYEAR_MONTH);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.FLOAT);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.HEX_BINARY);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.INT);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.INTEGER);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.LONG);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.NEGATIVE_INTEGER);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.NON_NEGATIVE_INTEGER);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.NON_POSITIVE_INTEGER);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.POSITIVE_INTEGER);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.SHORT);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.TIME);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.UNSIGNED_BYTE);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.UNSIGEND_INT);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.UNSIGNED_LONG);
		addEEnumLiteral(dataTypeDefXsdEEnum, DataTypeDefXsd.UNSIGNED_SHORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (aasModelRootEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
	}

} //AASPackageImpl
