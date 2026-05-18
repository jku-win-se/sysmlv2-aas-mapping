/**
 */
package AAS.impl;

import AAS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AASFactoryImpl extends EFactoryImpl implements AASFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AASFactory init() {
		try {
			AASFactory theAASFactory = (AASFactory)EPackage.Registry.INSTANCE.getEFactory(AASPackage.eNS_URI);
			if (theAASFactory != null) {
				return theAASFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AASFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AASFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AASPackage.ASSET_ADMINISTRATION_SHELL: return createAssetAdministrationShell();
			case AASPackage.LANG_STRING: return createLangString();
			case AASPackage.ADMINISTRATIVE_INFORMATION: return createAdministrativeInformation();
			case AASPackage.IDENTIFIER: return createIdentifier();
			case AASPackage.REFERENCE: return createReference();
			case AASPackage.KEY: return createKey();
			case AASPackage.SECURITY: return createSecurity();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS: return createAccessControlPolicyPoints();
			case AASPackage.ACCESS_CONTROL: return createAccessControl();
			case AASPackage.SUBMODEL: return createSubmodel();
			case AASPackage.ENDPOINT: return createEndpoint();
			case AASPackage.NODE_ID: return createNodeId();
			case AASPackage.CERTIFICATE: return createCertificate();
			case AASPackage.ASSET_INFORMATION: return createAssetInformation();
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR: return createIdentifierKeyValuePair();
			case AASPackage.FILE: return createFile();
			case AASPackage.ASSET: return createAsset();
			case AASPackage.AAS_ENDPOINT: return createAASEndpoint();
			case AASPackage.ENTITY: return createEntity();
			case AASPackage.RELATIONSHIP_ELEMENT: return createRelationshipElement();
			case AASPackage.OPERATION: return createOperation();
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION: return createSubmodelElementCollection();
			case AASPackage.PROPERTY: return createProperty();
			case AASPackage.REFERENCE_ELEMENT: return createReferenceElement();
			case AASPackage.BASIC_EVENT: return createBasicEvent();
			case AASPackage.RANGE: return createRange();
			case AASPackage.CAPABILITY: return createCapability();
			case AASPackage.CONCEPT_DESCRIPTION: return createConceptDescription();
			case AASPackage.LANG_STRING_SET: return createLangStringSet();
			case AASPackage.DATA_SPECIFICATION_IEC61360: return createDataSpecificationIEC61360();
			case AASPackage.VALUE_REFERENCE_PAIR_TYPE: return createValueReferencePairType();
			case AASPackage.VIEW: return createView();
			case AASPackage.MULTI_LANGUAGE_PROPERTY: return createMultiLanguageProperty();
			case AASPackage.AAS_MODEL_ROOT: return createAasModelRoot();
			case AASPackage.EXTENSION: return createExtension();
			case AASPackage.QUALIFIER: return createQualifier();
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT: return createAnnotatedRelationshipElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AASPackage.IDENTIFIER_TYPE:
				return createIdentifierTypeFromString(eDataType, initialValue);
			case AASPackage.LANG_ENUM:
				return createLangEnumFromString(eDataType, initialValue);
			case AASPackage.KEY_ELEMENTS:
				return createKeyElementsFromString(eDataType, initialValue);
			case AASPackage.REFERABLE_ELEMENTS:
				return createReferableElementsFromString(eDataType, initialValue);
			case AASPackage.IDENTIFIABLE_ELEMENT:
				return createIdentifiableElementFromString(eDataType, initialValue);
			case AASPackage.KEY_TYPE:
				return createKeyTypeFromString(eDataType, initialValue);
			case AASPackage.LOCAL_KEY_TYPE:
				return createLocalKeyTypeFromString(eDataType, initialValue);
			case AASPackage.MODELING_KIND:
				return createModelingKindFromString(eDataType, initialValue);
			case AASPackage.PROTOCOL_KIND:
				return createProtocolKindFromString(eDataType, initialValue);
			case AASPackage.ID_TYPE:
				return createIdTypeFromString(eDataType, initialValue);
			case AASPackage.ASSET_KIND:
				return createAssetKindFromString(eDataType, initialValue);
			case AASPackage.MIME_TYPE:
				return createMimeTypeFromString(eDataType, initialValue);
			case AASPackage.ENTITY_TYPE:
				return createEntityTypeFromString(eDataType, initialValue);
			case AASPackage.LEVEL_TYPE:
				return createLevelTypeFromString(eDataType, initialValue);
			case AASPackage.DATA_TYPE_IEC61360:
				return createDataTypeIEC61360FromString(eDataType, initialValue);
			case AASPackage.DATA_TYPE_DEF_XSD:
				return createDataTypeDefXsdFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AASPackage.IDENTIFIER_TYPE:
				return convertIdentifierTypeToString(eDataType, instanceValue);
			case AASPackage.LANG_ENUM:
				return convertLangEnumToString(eDataType, instanceValue);
			case AASPackage.KEY_ELEMENTS:
				return convertKeyElementsToString(eDataType, instanceValue);
			case AASPackage.REFERABLE_ELEMENTS:
				return convertReferableElementsToString(eDataType, instanceValue);
			case AASPackage.IDENTIFIABLE_ELEMENT:
				return convertIdentifiableElementToString(eDataType, instanceValue);
			case AASPackage.KEY_TYPE:
				return convertKeyTypeToString(eDataType, instanceValue);
			case AASPackage.LOCAL_KEY_TYPE:
				return convertLocalKeyTypeToString(eDataType, instanceValue);
			case AASPackage.MODELING_KIND:
				return convertModelingKindToString(eDataType, instanceValue);
			case AASPackage.PROTOCOL_KIND:
				return convertProtocolKindToString(eDataType, instanceValue);
			case AASPackage.ID_TYPE:
				return convertIdTypeToString(eDataType, instanceValue);
			case AASPackage.ASSET_KIND:
				return convertAssetKindToString(eDataType, instanceValue);
			case AASPackage.MIME_TYPE:
				return convertMimeTypeToString(eDataType, instanceValue);
			case AASPackage.ENTITY_TYPE:
				return convertEntityTypeToString(eDataType, instanceValue);
			case AASPackage.LEVEL_TYPE:
				return convertLevelTypeToString(eDataType, instanceValue);
			case AASPackage.DATA_TYPE_IEC61360:
				return convertDataTypeIEC61360ToString(eDataType, instanceValue);
			case AASPackage.DATA_TYPE_DEF_XSD:
				return convertDataTypeDefXsdToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetAdministrationShell createAssetAdministrationShell() {
		AssetAdministrationShellImpl assetAdministrationShell = new AssetAdministrationShellImpl();
		return assetAdministrationShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangString createLangString() {
		LangStringImpl langString = new LangStringImpl();
		return langString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeInformation createAdministrativeInformation() {
		AdministrativeInformationImpl administrativeInformation = new AdministrativeInformationImpl();
		return administrativeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControlPolicyPoints createAccessControlPolicyPoints() {
		AccessControlPolicyPointsImpl accessControlPolicyPoints = new AccessControlPolicyPointsImpl();
		return accessControlPolicyPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControl createAccessControl() {
		AccessControlImpl accessControl = new AccessControlImpl();
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Submodel createSubmodel() {
		SubmodelImpl submodel = new SubmodelImpl();
		return submodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeId createNodeId() {
		NodeIdImpl nodeId = new NodeIdImpl();
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Certificate createCertificate() {
		CertificateImpl certificate = new CertificateImpl();
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetInformation createAssetInformation() {
		AssetInformationImpl assetInformation = new AssetInformationImpl();
		return assetInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierKeyValuePair createIdentifierKeyValuePair() {
		IdentifierKeyValuePairImpl identifierKeyValuePair = new IdentifierKeyValuePairImpl();
		return identifierKeyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AASEndpoint createAASEndpoint() {
		AASEndpointImpl aasEndpoint = new AASEndpointImpl();
		return aasEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipElement createRelationshipElement() {
		RelationshipElementImpl relationshipElement = new RelationshipElementImpl();
		return relationshipElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubmodelElementCollection createSubmodelElementCollection() {
		SubmodelElementCollectionImpl submodelElementCollection = new SubmodelElementCollectionImpl();
		return submodelElementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceElement createReferenceElement() {
		ReferenceElementImpl referenceElement = new ReferenceElementImpl();
		return referenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptDescription createConceptDescription() {
		ConceptDescriptionImpl conceptDescription = new ConceptDescriptionImpl();
		return conceptDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangStringSet createLangStringSet() {
		LangStringSetImpl langStringSet = new LangStringSetImpl();
		return langStringSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSpecificationIEC61360 createDataSpecificationIEC61360() {
		DataSpecificationIEC61360Impl dataSpecificationIEC61360 = new DataSpecificationIEC61360Impl();
		return dataSpecificationIEC61360;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueReferencePairType createValueReferencePairType() {
		ValueReferencePairTypeImpl valueReferencePairType = new ValueReferencePairTypeImpl();
		return valueReferencePairType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguageProperty createMultiLanguageProperty() {
		MultiLanguagePropertyImpl multiLanguageProperty = new MultiLanguagePropertyImpl();
		return multiLanguageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AasModelRoot createAasModelRoot() {
		AasModelRootImpl aasModelRoot = new AasModelRootImpl();
		return aasModelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qualifier createQualifier() {
		QualifierImpl qualifier = new QualifierImpl();
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatedRelationshipElement createAnnotatedRelationshipElement() {
		AnnotatedRelationshipElementImpl annotatedRelationshipElement = new AnnotatedRelationshipElementImpl();
		return annotatedRelationshipElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType createIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		IdentifierType result = IdentifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangEnum createLangEnumFromString(EDataType eDataType, String initialValue) {
		LangEnum result = LangEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLangEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyElements createKeyElementsFromString(EDataType eDataType, String initialValue) {
		KeyElements result = KeyElements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyElementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferableElements createReferableElementsFromString(EDataType eDataType, String initialValue) {
		ReferableElements result = ReferableElements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferableElementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement createIdentifiableElementFromString(EDataType eDataType, String initialValue) {
		IdentifiableElement result = IdentifiableElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifiableElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeFromString(EDataType eDataType, String initialValue) {
		KeyType result = KeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalKeyType createLocalKeyTypeFromString(EDataType eDataType, String initialValue) {
		LocalKeyType result = LocalKeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingKind createModelingKindFromString(EDataType eDataType, String initialValue) {
		ModelingKind result = ModelingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolKind createProtocolKindFromString(EDataType eDataType, String initialValue) {
		ProtocolKind result = ProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdType createIdTypeFromString(EDataType eDataType, String initialValue) {
		IdType result = IdType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetKind createAssetKindFromString(EDataType eDataType, String initialValue) {
		AssetKind result = AssetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeTypeFromString(EDataType eDataType, String initialValue) {
		MimeType result = MimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityTypeFromString(EDataType eDataType, String initialValue) {
		EntityType result = EntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelType createLevelTypeFromString(EDataType eDataType, String initialValue) {
		LevelType result = LevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeIEC61360 createDataTypeIEC61360FromString(EDataType eDataType, String initialValue) {
		DataTypeIEC61360 result = DataTypeIEC61360.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeIEC61360ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefXsd createDataTypeDefXsdFromString(EDataType eDataType, String initialValue) {
		DataTypeDefXsd result = DataTypeDefXsd.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeDefXsdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AASPackage getAASPackage() {
		return (AASPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AASPackage getPackage() {
		return AASPackage.eINSTANCE;
	}

} //AASFactoryImpl
