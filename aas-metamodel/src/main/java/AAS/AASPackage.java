/**
 */
package AAS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AAS.AASFactory
 * @model kind="package"
 * @generated
 */
public interface AASPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AAS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.jku.at/AAS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AAS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AASPackage eINSTANCE = AAS.impl.AASPackageImpl.init();

	/**
	 * The meta object id for the '{@link AAS.impl.HasExtensionsImpl <em>Has Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.HasExtensionsImpl
	 * @see AAS.impl.AASPackageImpl#getHasExtensions()
	 * @generated
	 */
	int HAS_EXTENSIONS = 43;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_EXTENSIONS__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Has Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_EXTENSIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_EXTENSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ReferableImpl <em>Referable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ReferableImpl
	 * @see AAS.impl.AASPackageImpl#getReferable()
	 * @generated
	 */
	int REFERABLE = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__EXTENSION = HAS_EXTENSIONS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__ID_SHORT = HAS_EXTENSIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__CATEGORY = HAS_EXTENSIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__DESCRIPTION = HAS_EXTENSIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Referable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_FEATURE_COUNT = HAS_EXTENSIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Referable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OPERATION_COUNT = HAS_EXTENSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.IdentifiableImpl
	 * @see AAS.impl.AASPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__EXTENSION = REFERABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID_SHORT = REFERABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__CATEGORY = REFERABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DESCRIPTION = REFERABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ADMINISTRATION = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFICATION = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = REFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AssetAdministrationShellImpl <em>Asset Administration Shell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AssetAdministrationShellImpl
	 * @see AAS.impl.AASPackageImpl#getAssetAdministrationShell()
	 * @generated
	 */
	int ASSET_ADMINISTRATION_SHELL = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__EXTENSION = IDENTIFIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ID_SHORT = IDENTIFIABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ADMINISTRATION = IDENTIFIABLE__ADMINISTRATION;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__IDENTIFICATION = IDENTIFIABLE__IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DERIVED_FROM = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SECURITY = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ASSET = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Submodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SUBMODEL = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ENDPOINT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.LangStringImpl <em>Lang String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.LangStringImpl
	 * @see AAS.impl.AASPackageImpl#getLangString()
	 * @generated
	 */
	int LANG_STRING = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING__LANG = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AdministrativeInformationImpl <em>Administrative Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AdministrativeInformationImpl
	 * @see AAS.impl.AASPackageImpl#getAdministrativeInformation()
	 * @generated
	 */
	int ADMINISTRATIVE_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__REVISION = 1;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__CREATOR = 2;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__TEMPLATE_ID = 3;

	/**
	 * The number of structural features of the '<em>Administrative Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Administrative Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.IdentifierImpl
	 * @see AAS.impl.AASPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.HasDataSpecificationImpl <em>Has Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.HasDataSpecificationImpl
	 * @see AAS.impl.AASPackageImpl#getHasDataSpecification()
	 * @generated
	 */
	int HAS_DATA_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION__DATA_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ReferenceImpl
	 * @see AAS.impl.AASPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.KeyImpl
	 * @see AAS.impl.AASPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__REFERABLE = 3;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.SecurityImpl
	 * @see AAS.impl.AASPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 9;

	/**
	 * The feature id for the '<em><b>Access Control Policy Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__ACCESS_CONTROL_POLICY_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__CERTIFICATE = 1;

	/**
	 * The feature id for the '<em><b>Required Certificate Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__REQUIRED_CERTIFICATE_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AccessControlPolicyPointsImpl <em>Access Control Policy Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AccessControlPolicyPointsImpl
	 * @see AAS.impl.AASPackageImpl#getAccessControlPolicyPoints()
	 * @generated
	 */
	int ACCESS_CONTROL_POLICY_POINTS = 10;

	/**
	 * The feature id for the '<em><b>Local Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>External Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>External Information Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Internal Information Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT = 3;

	/**
	 * The feature id for the '<em><b>External Policy Decision Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS = 4;

	/**
	 * The feature id for the '<em><b>External Policy Enforcement Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT = 5;

	/**
	 * The number of structural features of the '<em>Access Control Policy Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Access Control Policy Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_POLICY_POINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AccessControlImpl
	 * @see AAS.impl.AASPackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 11;

	/**
	 * The number of structural features of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.SubmodelImpl <em>Submodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.SubmodelImpl
	 * @see AAS.impl.AASPackageImpl#getSubmodel()
	 * @generated
	 */
	int SUBMODEL = 12;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__EXTENSION = IDENTIFIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__ID_SHORT = IDENTIFIABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__ADMINISTRATION = IDENTIFIABLE__ADMINISTRATION;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__IDENTIFICATION = IDENTIFIABLE__IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__KIND = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SEMANTIC_ID = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__DATA_SPECIFICATION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__QUALIFIER = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SUBMODELELEMENT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.HasKindImpl <em>Has Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.HasKindImpl
	 * @see AAS.impl.AASPackageImpl#getHasKind()
	 * @generated
	 */
	int HAS_KIND = 13;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND__KIND = 0;

	/**
	 * The number of structural features of the '<em>Has Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.HasSemanticsImpl <em>Has Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.HasSemanticsImpl
	 * @see AAS.impl.AASPackageImpl#getHasSemantics()
	 * @generated
	 */
	int HAS_SEMANTICS = 14;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS__SEMANTIC_ID = 0;

	/**
	 * The number of structural features of the '<em>Has Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.SubmodelElementImpl <em>Submodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.SubmodelElementImpl
	 * @see AAS.impl.AASPackageImpl#getSubmodelElement()
	 * @generated
	 */
	int SUBMODEL_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__EXTENSION = REFERABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__ID_SHORT = REFERABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__CATEGORY = REFERABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__DESCRIPTION = REFERABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__KIND = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__SEMANTIC_ID = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__DATA_SPECIFICATION = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__QUALIFIER = REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__IS_DYNAMIC = REFERABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__END_POINT = REFERABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__NODE_ID = REFERABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Submodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Submodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_OPERATION_COUNT = REFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.EndpointImpl
	 * @see AAS.impl.AASPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 16;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.NodeIdImpl <em>Node Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.NodeIdImpl
	 * @see AAS.impl.AASPackageImpl#getNodeId()
	 * @generated
	 */
	int NODE_ID = 17;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID__ID_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Node Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.CertificateImpl
	 * @see AAS.impl.AASPackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 18;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AssetInformationImpl <em>Asset Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AssetInformationImpl
	 * @see AAS.impl.AASPackageImpl#getAssetInformation()
	 * @generated
	 */
	int ASSET_INFORMATION = 19;

	/**
	 * The feature id for the '<em><b>Asset Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION__ASSET_KIND = 0;

	/**
	 * The feature id for the '<em><b>Global Asset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION__GLOBAL_ASSET_ID = 1;

	/**
	 * The feature id for the '<em><b>Specific Asset Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION__SPECIFIC_ASSET_ID = 2;

	/**
	 * The feature id for the '<em><b>Bill Of Material</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION__BILL_OF_MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Default Thumbnail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION__DEFAULT_THUMBNAIL = 4;

	/**
	 * The number of structural features of the '<em>Asset Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Asset Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.IdentifierKeyValuePairImpl <em>Identifier Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.IdentifierKeyValuePairImpl
	 * @see AAS.impl.AASPackageImpl#getIdentifierKeyValuePair()
	 * @generated
	 */
	int IDENTIFIER_KEY_VALUE_PAIR = 20;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR__SEMANTIC_ID = HAS_SEMANTICS__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR__KEY = HAS_SEMANTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR__VALUE = HAS_SEMANTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Subject Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID = HAS_SEMANTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identifier Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR_FEATURE_COUNT = HAS_SEMANTICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Identifier Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_KEY_VALUE_PAIR_OPERATION_COUNT = HAS_SEMANTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.DataElementImpl
	 * @see AAS.impl.AASPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.FileImpl
	 * @see AAS.impl.AASPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 21;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = DATA_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_DYNAMIC = DATA_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__END_POINT = DATA_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NODE_ID = DATA_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MIME_TYPE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AssetImpl
	 * @see AAS.impl.AASPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 23;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__EXTENSION = IDENTIFIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID_SHORT = IDENTIFIABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ADMINISTRATION = IDENTIFIABLE__ADMINISTRATION;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__IDENTIFICATION = IDENTIFIABLE__IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DATA_SPECIFICATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__KIND = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ENDPOINT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AASEndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AASEndpointImpl
	 * @see AAS.impl.AASPackageImpl#getAASEndpoint()
	 * @generated
	 */
	int AAS_ENDPOINT = 24;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_ENDPOINT__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_ENDPOINT__PORT = 1;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_ENDPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.EntityImpl
	 * @see AAS.impl.AASPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 25;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_TYPE = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.RelationshipElementImpl <em>Relationship Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.RelationshipElementImpl
	 * @see AAS.impl.AASPackageImpl#getRelationshipElement()
	 * @generated
	 */
	int RELATIONSHIP_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__FIRST = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SECOND = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__NAME = SUBMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.OperationImpl
	 * @see AAS.impl.AASPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 27;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.SubmodelElementCollectionImpl <em>Submodel Element Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.SubmodelElementCollectionImpl
	 * @see AAS.impl.AASPackageImpl#getSubmodelElementCollection()
	 * @generated
	 */
	int SUBMODEL_ELEMENT_COLLECTION = 28;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ORDERED = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Submodel Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Submodel Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.PropertyImpl
	 * @see AAS.impl.AASPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXTENSION = DATA_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DYNAMIC = DATA_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END_POINT = DATA_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NODE_ID = DATA_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_ID = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ReferenceElementImpl <em>Reference Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ReferenceElementImpl
	 * @see AAS.impl.AASPackageImpl#getReferenceElement()
	 * @generated
	 */
	int REFERENCE_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__EXTENSION = DATA_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__IS_DYNAMIC = DATA_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__END_POINT = DATA_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__NODE_ID = DATA_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.EventImpl
	 * @see AAS.impl.AASPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 31;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.BasicEventImpl
	 * @see AAS.impl.AASPackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 32;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__EXTENSION = EVENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ID_SHORT = EVENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__CATEGORY = EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__KIND = EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__SEMANTIC_ID = EVENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DATA_SPECIFICATION = EVENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__QUALIFIER = EVENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__IS_DYNAMIC = EVENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__END_POINT = EVENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NODE_ID = EVENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__SUBMODELELEMENT = EVENT__SUBMODELELEMENT;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.RangeImpl
	 * @see AAS.impl.AASPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 33;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXTENSION = DATA_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__IS_DYNAMIC = DATA_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__END_POINT = DATA_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__NODE_ID = DATA_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.CapabilityImpl
	 * @see AAS.impl.AASPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 34;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ConceptDescriptionImpl <em>Concept Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ConceptDescriptionImpl
	 * @see AAS.impl.AASPackageImpl#getConceptDescription()
	 * @generated
	 */
	int CONCEPT_DESCRIPTION = 35;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__EXTENSION = IDENTIFIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__ID_SHORT = IDENTIFIABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__ADMINISTRATION = IDENTIFIABLE__ADMINISTRATION;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__IDENTIFICATION = IDENTIFIABLE__IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__DATA_SPECIFICATION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Case Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__IS_CASE_OF = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concept Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.LangStringSetImpl <em>Lang String Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.LangStringSetImpl
	 * @see AAS.impl.AASPackageImpl#getLangStringSet()
	 * @generated
	 */
	int LANG_STRING_SET = 36;

	/**
	 * The number of structural features of the '<em>Lang String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_SET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lang String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.DataSpecificationContentImpl <em>Data Specification Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.DataSpecificationContentImpl
	 * @see AAS.impl.AASPackageImpl#getDataSpecificationContent()
	 * @generated
	 */
	int DATA_SPECIFICATION_CONTENT = 37;

	/**
	 * The number of structural features of the '<em>Data Specification Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Specification Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.DataSpecificationIEC61360Impl <em>Data Specification IEC61360</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.DataSpecificationIEC61360Impl
	 * @see AAS.impl.AASPackageImpl#getDataSpecificationIEC61360()
	 * @generated
	 */
	int DATA_SPECIFICATION_IEC61360 = 38;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__PREFERRED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__UNIT_ID = 3;

	/**
	 * The feature id for the '<em><b>Source Of Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__SYMBOL = 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__VALUE_FORMAT = 8;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__VALUE_LIST = 9;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__VALUE_ID = 10;

	/**
	 * The feature id for the '<em><b>Level Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360__LEVEL_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Data Specification IEC61360</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Data Specification IEC61360</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_IEC61360_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ValueReferencePairTypeImpl <em>Value Reference Pair Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ValueReferencePairTypeImpl
	 * @see AAS.impl.AASPackageImpl#getValueReferencePairType()
	 * @generated
	 */
	int VALUE_REFERENCE_PAIR_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_PAIR_TYPE__VALUE_ID = 0;

	/**
	 * The number of structural features of the '<em>Value Reference Pair Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_PAIR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Reference Pair Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_REFERENCE_PAIR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ViewImpl
	 * @see AAS.impl.AASPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 40;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EXTENSION = REFERABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID_SHORT = REFERABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CATEGORY = REFERABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = REFERABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SEMANTIC_ID = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DATA_SPECIFICATION = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTAINED_ELEMENT = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = REFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.MultiLanguagePropertyImpl <em>Multi Language Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.MultiLanguagePropertyImpl
	 * @see AAS.impl.AASPackageImpl#getMultiLanguageProperty()
	 * @generated
	 */
	int MULTI_LANGUAGE_PROPERTY = 41;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__EXTENSION = DATA_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__IS_DYNAMIC = DATA_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__END_POINT = DATA_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__NODE_ID = DATA_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__VALUE_ID = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Language Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Language Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AasModelRootImpl <em>Aas Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AasModelRootImpl
	 * @see AAS.impl.AASPackageImpl#getAasModelRoot()
	 * @generated
	 */
	int AAS_MODEL_ROOT = 42;

	/**
	 * The feature id for the '<em><b>Assetadministrationshells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_MODEL_ROOT__ASSETADMINISTRATIONSHELLS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_MODEL_ROOT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Aas Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_MODEL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aas Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAS_MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ExtensionImpl
	 * @see AAS.impl.AASPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.QualifiableImpl <em>Qualifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.QualifiableImpl
	 * @see AAS.impl.AASPackageImpl#getQualifiable()
	 * @generated
	 */
	int QUALIFIABLE = 45;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE__QUALIFIER = 0;

	/**
	 * The number of structural features of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.QualifierImpl
	 * @see AAS.impl.AASPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE_ID = 3;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AAS.impl.AnnotatedRelationshipElementImpl <em>Annotated Relationship Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.AnnotatedRelationshipElementImpl
	 * @see AAS.impl.AASPackageImpl#getAnnotatedRelationshipElement()
	 * @generated
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__EXTENSION = RELATIONSHIP_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__ID_SHORT = RELATIONSHIP_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__CATEGORY = RELATIONSHIP_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__DESCRIPTION = RELATIONSHIP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__KIND = RELATIONSHIP_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__SEMANTIC_ID = RELATIONSHIP_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__DATA_SPECIFICATION = RELATIONSHIP_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__QUALIFIER = RELATIONSHIP_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__IS_DYNAMIC = RELATIONSHIP_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__END_POINT = RELATIONSHIP_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__NODE_ID = RELATIONSHIP_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__SUBMODELELEMENT = RELATIONSHIP_ELEMENT__SUBMODELELEMENT;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__FIRST = RELATIONSHIP_ELEMENT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__SECOND = RELATIONSHIP_ELEMENT__SECOND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__NAME = RELATIONSHIP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dataelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT = RELATIONSHIP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__NOTE = RELATIONSHIP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotated Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT_FEATURE_COUNT = RELATIONSHIP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotated Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT_OPERATION_COUNT = RELATIONSHIP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.impl.ComposableElementImpl <em>Composable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.impl.ComposableElementImpl
	 * @see AAS.impl.AASPackageImpl#getComposableElement()
	 * @generated
	 */
	int COMPOSABLE_ELEMENT = 48;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__EXTENSION = SUBMODEL_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__IS_DYNAMIC = SUBMODEL_ELEMENT__IS_DYNAMIC;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__END_POINT = SUBMODEL_ELEMENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__NODE_ID = SUBMODEL_ELEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__SUBMODELELEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AAS.IdentifierType <em>Identifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.IdentifierType
	 * @see AAS.impl.AASPackageImpl#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 49;

	/**
	 * The meta object id for the '{@link AAS.LangEnum <em>Lang Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.LangEnum
	 * @see AAS.impl.AASPackageImpl#getLangEnum()
	 * @generated
	 */
	int LANG_ENUM = 50;

	/**
	 * The meta object id for the '{@link AAS.KeyElements <em>Key Elements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.KeyElements
	 * @see AAS.impl.AASPackageImpl#getKeyElements()
	 * @generated
	 */
	int KEY_ELEMENTS = 51;

	/**
	 * The meta object id for the '{@link AAS.ReferableElements <em>Referable Elements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.ReferableElements
	 * @see AAS.impl.AASPackageImpl#getReferableElements()
	 * @generated
	 */
	int REFERABLE_ELEMENTS = 52;

	/**
	 * The meta object id for the '{@link AAS.IdentifiableElement <em>Identifiable Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.IdentifiableElement
	 * @see AAS.impl.AASPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 53;

	/**
	 * The meta object id for the '{@link AAS.KeyType <em>Key Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.KeyType
	 * @see AAS.impl.AASPackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 54;

	/**
	 * The meta object id for the '{@link AAS.LocalKeyType <em>Local Key Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.LocalKeyType
	 * @see AAS.impl.AASPackageImpl#getLocalKeyType()
	 * @generated
	 */
	int LOCAL_KEY_TYPE = 55;

	/**
	 * The meta object id for the '{@link AAS.ModelingKind <em>Modeling Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.ModelingKind
	 * @see AAS.impl.AASPackageImpl#getModelingKind()
	 * @generated
	 */
	int MODELING_KIND = 56;

	/**
	 * The meta object id for the '{@link AAS.ProtocolKind <em>Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.ProtocolKind
	 * @see AAS.impl.AASPackageImpl#getProtocolKind()
	 * @generated
	 */
	int PROTOCOL_KIND = 57;

	/**
	 * The meta object id for the '{@link AAS.IdType <em>Id Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.IdType
	 * @see AAS.impl.AASPackageImpl#getIdType()
	 * @generated
	 */
	int ID_TYPE = 58;

	/**
	 * The meta object id for the '{@link AAS.AssetKind <em>Asset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.AssetKind
	 * @see AAS.impl.AASPackageImpl#getAssetKind()
	 * @generated
	 */
	int ASSET_KIND = 59;

	/**
	 * The meta object id for the '{@link AAS.MimeType <em>Mime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.MimeType
	 * @see AAS.impl.AASPackageImpl#getMimeType()
	 * @generated
	 */
	int MIME_TYPE = 60;

	/**
	 * The meta object id for the '{@link AAS.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.EntityType
	 * @see AAS.impl.AASPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 61;

	/**
	 * The meta object id for the '{@link AAS.LevelType <em>Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.LevelType
	 * @see AAS.impl.AASPackageImpl#getLevelType()
	 * @generated
	 */
	int LEVEL_TYPE = 62;

	/**
	 * The meta object id for the '{@link AAS.DataTypeIEC61360 <em>Data Type IEC61360</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.DataTypeIEC61360
	 * @see AAS.impl.AASPackageImpl#getDataTypeIEC61360()
	 * @generated
	 */
	int DATA_TYPE_IEC61360 = 63;

	/**
	 * The meta object id for the '{@link AAS.DataTypeDefXsd <em>Data Type Def Xsd</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AAS.DataTypeDefXsd
	 * @see AAS.impl.AASPackageImpl#getDataTypeDefXsd()
	 * @generated
	 */
	int DATA_TYPE_DEF_XSD = 64;


	/**
	 * Returns the meta object for class '{@link AAS.AssetAdministrationShell <em>Asset Administration Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Administration Shell</em>'.
	 * @see AAS.AssetAdministrationShell
	 * @generated
	 */
	EClass getAssetAdministrationShell();

	/**
	 * Returns the meta object for the reference '{@link AAS.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see AAS.AssetAdministrationShell#getDerivedFrom()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_DerivedFrom();

	/**
	 * Returns the meta object for the reference '{@link AAS.AssetAdministrationShell#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security</em>'.
	 * @see AAS.AssetAdministrationShell#getSecurity()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Security();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.AssetAdministrationShell#getAssetInformation <em>Asset Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset Information</em>'.
	 * @see AAS.AssetAdministrationShell#getAssetInformation()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_AssetInformation();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.AssetAdministrationShell#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see AAS.AssetAdministrationShell#getAsset()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Asset();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.AssetAdministrationShell#getSubmodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodel</em>'.
	 * @see AAS.AssetAdministrationShell#getSubmodel()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Submodel();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.AssetAdministrationShell#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see AAS.AssetAdministrationShell#getEndpoint()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Endpoint();

	/**
	 * Returns the meta object for class '{@link AAS.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see AAS.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Identifiable#getAdministration <em>Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administration</em>'.
	 * @see AAS.Identifiable#getAdministration()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Administration();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Identifiable#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identification</em>'.
	 * @see AAS.Identifiable#getIdentification()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Identification();

	/**
	 * Returns the meta object for class '{@link AAS.Referable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable</em>'.
	 * @see AAS.Referable
	 * @generated
	 */
	EClass getReferable();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Referable#getIdShort <em>Id Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Short</em>'.
	 * @see AAS.Referable#getIdShort()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_IdShort();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Referable#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see AAS.Referable#getCategory()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Referable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see AAS.Referable#getDescription()
	 * @see #getReferable()
	 * @generated
	 */
	EReference getReferable_Description();

	/**
	 * Returns the meta object for class '{@link AAS.LangString <em>Lang String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang String</em>'.
	 * @see AAS.LangString
	 * @generated
	 */
	EClass getLangString();

	/**
	 * Returns the meta object for the attribute '{@link AAS.LangString#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see AAS.LangString#getLang()
	 * @see #getLangString()
	 * @generated
	 */
	EAttribute getLangString_Lang();

	/**
	 * Returns the meta object for the attribute '{@link AAS.LangString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.LangString#getValue()
	 * @see #getLangString()
	 * @generated
	 */
	EAttribute getLangString_Value();

	/**
	 * Returns the meta object for class '{@link AAS.AdministrativeInformation <em>Administrative Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Information</em>'.
	 * @see AAS.AdministrativeInformation
	 * @generated
	 */
	EClass getAdministrativeInformation();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AdministrativeInformation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see AAS.AdministrativeInformation#getVersion()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Version();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AdministrativeInformation#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see AAS.AdministrativeInformation#getRevision()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Revision();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AdministrativeInformation#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see AAS.AdministrativeInformation#getCreator()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Creator();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AdministrativeInformation#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see AAS.AdministrativeInformation#getTemplateId()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_TemplateId();

	/**
	 * Returns the meta object for class '{@link AAS.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see AAS.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Identifier#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see AAS.Identifier#getIdType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_IdType();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AAS.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link AAS.HasDataSpecification <em>Has Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Data Specification</em>'.
	 * @see AAS.HasDataSpecification
	 * @generated
	 */
	EClass getHasDataSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.HasDataSpecification#getDataSpecification <em>Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Specification</em>'.
	 * @see AAS.HasDataSpecification#getDataSpecification()
	 * @see #getHasDataSpecification()
	 * @generated
	 */
	EReference getHasDataSpecification_DataSpecification();

	/**
	 * Returns the meta object for class '{@link AAS.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see AAS.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Reference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see AAS.Reference#getKey()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Key();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AAS.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for class '{@link AAS.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see AAS.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Key#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AAS.Key#getType()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Type();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Key#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.Key#getValue()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Value();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Key#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see AAS.Key#getIdType()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_IdType();

	/**
	 * Returns the meta object for the reference '{@link AAS.Key#getReferable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referable</em>'.
	 * @see AAS.Key#getReferable()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Referable();

	/**
	 * Returns the meta object for class '{@link AAS.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see AAS.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Security#getAccessControlPolicyPoints <em>Access Control Policy Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control Policy Points</em>'.
	 * @see AAS.Security#getAccessControlPolicyPoints()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_AccessControlPolicyPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Security#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificate</em>'.
	 * @see AAS.Security#getCertificate()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Certificate();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Security#getRequiredCertificateExtension <em>Required Certificate Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Certificate Extension</em>'.
	 * @see AAS.Security#getRequiredCertificateExtension()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_RequiredCertificateExtension();

	/**
	 * Returns the meta object for class '{@link AAS.AccessControlPolicyPoints <em>Access Control Policy Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Policy Points</em>'.
	 * @see AAS.AccessControlPolicyPoints
	 * @generated
	 */
	EClass getAccessControlPolicyPoints();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.AccessControlPolicyPoints#getLocalAccessControl <em>Local Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Access Control</em>'.
	 * @see AAS.AccessControlPolicyPoints#getLocalAccessControl()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EReference getAccessControlPolicyPoints_LocalAccessControl();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AccessControlPolicyPoints#isExternalAccessControl <em>External Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Access Control</em>'.
	 * @see AAS.AccessControlPolicyPoints#isExternalAccessControl()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EAttribute getAccessControlPolicyPoints_ExternalAccessControl();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AccessControlPolicyPoints#isExternalInformationPoints <em>External Information Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Information Points</em>'.
	 * @see AAS.AccessControlPolicyPoints#isExternalInformationPoints()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EAttribute getAccessControlPolicyPoints_ExternalInformationPoints();

	/**
	 * Returns the meta object for the reference '{@link AAS.AccessControlPolicyPoints#getInternalInformationPoint <em>Internal Information Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Information Point</em>'.
	 * @see AAS.AccessControlPolicyPoints#getInternalInformationPoint()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EReference getAccessControlPolicyPoints_InternalInformationPoint();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AccessControlPolicyPoints#isExternalPolicyDecisionPoints <em>External Policy Decision Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Policy Decision Points</em>'.
	 * @see AAS.AccessControlPolicyPoints#isExternalPolicyDecisionPoints()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EAttribute getAccessControlPolicyPoints_ExternalPolicyDecisionPoints();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AccessControlPolicyPoints#isExternalPolicyEnforcementPoint <em>External Policy Enforcement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Policy Enforcement Point</em>'.
	 * @see AAS.AccessControlPolicyPoints#isExternalPolicyEnforcementPoint()
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	EAttribute getAccessControlPolicyPoints_ExternalPolicyEnforcementPoint();

	/**
	 * Returns the meta object for class '{@link AAS.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see AAS.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for class '{@link AAS.Submodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel</em>'.
	 * @see AAS.Submodel
	 * @generated
	 */
	EClass getSubmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Submodel#getSubmodelelement <em>Submodelelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodelelement</em>'.
	 * @see AAS.Submodel#getSubmodelelement()
	 * @see #getSubmodel()
	 * @generated
	 */
	EReference getSubmodel_Submodelelement();

	/**
	 * Returns the meta object for class '{@link AAS.HasKind <em>Has Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Kind</em>'.
	 * @see AAS.HasKind
	 * @generated
	 */
	EClass getHasKind();

	/**
	 * Returns the meta object for the attribute '{@link AAS.HasKind#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see AAS.HasKind#getKind()
	 * @see #getHasKind()
	 * @generated
	 */
	EAttribute getHasKind_Kind();

	/**
	 * Returns the meta object for class '{@link AAS.HasSemantics <em>Has Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Semantics</em>'.
	 * @see AAS.HasSemantics
	 * @generated
	 */
	EClass getHasSemantics();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.HasSemantics#getSemanticId <em>Semantic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantic Id</em>'.
	 * @see AAS.HasSemantics#getSemanticId()
	 * @see #getHasSemantics()
	 * @generated
	 */
	EReference getHasSemantics_SemanticId();

	/**
	 * Returns the meta object for class '{@link AAS.SubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element</em>'.
	 * @see AAS.SubmodelElement
	 * @generated
	 */
	EClass getSubmodelElement();

	/**
	 * Returns the meta object for the attribute '{@link AAS.SubmodelElement#isIsDynamic <em>Is Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dynamic</em>'.
	 * @see AAS.SubmodelElement#isIsDynamic()
	 * @see #getSubmodelElement()
	 * @generated
	 */
	EAttribute getSubmodelElement_IsDynamic();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.SubmodelElement#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point</em>'.
	 * @see AAS.SubmodelElement#getEndPoint()
	 * @see #getSubmodelElement()
	 * @generated
	 */
	EReference getSubmodelElement_EndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.SubmodelElement#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Id</em>'.
	 * @see AAS.SubmodelElement#getNodeId()
	 * @see #getSubmodelElement()
	 * @generated
	 */
	EReference getSubmodelElement_NodeId();

	/**
	 * Returns the meta object for class '{@link AAS.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see AAS.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Endpoint#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see AAS.Endpoint#getAddress()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Address();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Endpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see AAS.Endpoint#getProtocol()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Endpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AAS.Endpoint#getName()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Name();

	/**
	 * Returns the meta object for class '{@link AAS.NodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Id</em>'.
	 * @see AAS.NodeId
	 * @generated
	 */
	EClass getNodeId();

	/**
	 * Returns the meta object for the attribute '{@link AAS.NodeId#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see AAS.NodeId#getNamespace()
	 * @see #getNodeId()
	 * @generated
	 */
	EAttribute getNodeId_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link AAS.NodeId#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see AAS.NodeId#getIdentifier()
	 * @see #getNodeId()
	 * @generated
	 */
	EAttribute getNodeId_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link AAS.NodeId#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see AAS.NodeId#getIdType()
	 * @see #getNodeId()
	 * @generated
	 */
	EAttribute getNodeId_IdType();

	/**
	 * Returns the meta object for class '{@link AAS.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see AAS.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for class '{@link AAS.AssetInformation <em>Asset Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Information</em>'.
	 * @see AAS.AssetInformation
	 * @generated
	 */
	EClass getAssetInformation();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AssetInformation#getAssetKind <em>Asset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Kind</em>'.
	 * @see AAS.AssetInformation#getAssetKind()
	 * @see #getAssetInformation()
	 * @generated
	 */
	EAttribute getAssetInformation_AssetKind();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.AssetInformation#getGlobalAssetId <em>Global Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Asset Id</em>'.
	 * @see AAS.AssetInformation#getGlobalAssetId()
	 * @see #getAssetInformation()
	 * @generated
	 */
	EReference getAssetInformation_GlobalAssetId();

	/**
	 * Returns the meta object for the reference list '{@link AAS.AssetInformation#getSpecificAssetId <em>Specific Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specific Asset Id</em>'.
	 * @see AAS.AssetInformation#getSpecificAssetId()
	 * @see #getAssetInformation()
	 * @generated
	 */
	EReference getAssetInformation_SpecificAssetId();

	/**
	 * Returns the meta object for the reference list '{@link AAS.AssetInformation#getBillOfMaterial <em>Bill Of Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bill Of Material</em>'.
	 * @see AAS.AssetInformation#getBillOfMaterial()
	 * @see #getAssetInformation()
	 * @generated
	 */
	EReference getAssetInformation_BillOfMaterial();

	/**
	 * Returns the meta object for the reference '{@link AAS.AssetInformation#getDefaultThumbnail <em>Default Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Thumbnail</em>'.
	 * @see AAS.AssetInformation#getDefaultThumbnail()
	 * @see #getAssetInformation()
	 * @generated
	 */
	EReference getAssetInformation_DefaultThumbnail();

	/**
	 * Returns the meta object for class '{@link AAS.IdentifierKeyValuePair <em>Identifier Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Key Value Pair</em>'.
	 * @see AAS.IdentifierKeyValuePair
	 * @generated
	 */
	EClass getIdentifierKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link AAS.IdentifierKeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see AAS.IdentifierKeyValuePair#getKey()
	 * @see #getIdentifierKeyValuePair()
	 * @generated
	 */
	EAttribute getIdentifierKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link AAS.IdentifierKeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.IdentifierKeyValuePair#getValue()
	 * @see #getIdentifierKeyValuePair()
	 * @generated
	 */
	EAttribute getIdentifierKeyValuePair_Value();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.IdentifierKeyValuePair#getExternalSubjectId <em>External Subject Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Subject Id</em>'.
	 * @see AAS.IdentifierKeyValuePair#getExternalSubjectId()
	 * @see #getIdentifierKeyValuePair()
	 * @generated
	 */
	EReference getIdentifierKeyValuePair_ExternalSubjectId();

	/**
	 * Returns the meta object for class '{@link AAS.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see AAS.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link AAS.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see AAS.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the attribute '{@link AAS.File#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see AAS.File#getMimeType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_MimeType();

	/**
	 * Returns the meta object for class '{@link AAS.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see AAS.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for class '{@link AAS.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see AAS.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Asset#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see AAS.Asset#getKind()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.Asset#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint</em>'.
	 * @see AAS.Asset#getEndpoint()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Endpoint();

	/**
	 * Returns the meta object for class '{@link AAS.AASEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see AAS.AASEndpoint
	 * @generated
	 */
	EClass getAASEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AASEndpoint#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see AAS.AASEndpoint#getAddress()
	 * @see #getAASEndpoint()
	 * @generated
	 */
	EAttribute getAASEndpoint_Address();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AASEndpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see AAS.AASEndpoint#getPort()
	 * @see #getAASEndpoint()
	 * @generated
	 */
	EAttribute getAASEndpoint_Port();

	/**
	 * Returns the meta object for class '{@link AAS.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see AAS.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Entity#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see AAS.Entity#getEntityType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_EntityType();

	/**
	 * Returns the meta object for class '{@link AAS.RelationshipElement <em>Relationship Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Element</em>'.
	 * @see AAS.RelationshipElement
	 * @generated
	 */
	EClass getRelationshipElement();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.RelationshipElement#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see AAS.RelationshipElement#getFirst()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_First();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.RelationshipElement#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see AAS.RelationshipElement#getSecond()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_Second();

	/**
	 * Returns the meta object for the attribute '{@link AAS.RelationshipElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AAS.RelationshipElement#getName()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EAttribute getRelationshipElement_Name();

	/**
	 * Returns the meta object for class '{@link AAS.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see AAS.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link AAS.SubmodelElementCollection <em>Submodel Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element Collection</em>'.
	 * @see AAS.SubmodelElementCollection
	 * @generated
	 */
	EClass getSubmodelElementCollection();

	/**
	 * Returns the meta object for the attribute '{@link AAS.SubmodelElementCollection#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see AAS.SubmodelElementCollection#isOrdered()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link AAS.SubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see AAS.SubmodelElementCollection#isAllowDuplicates()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_AllowDuplicates();

	/**
	 * Returns the meta object for class '{@link AAS.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see AAS.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Property#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see AAS.Property#getValueType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Property#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see AAS.Property#getValueId()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ValueId();

	/**
	 * Returns the meta object for class '{@link AAS.ReferenceElement <em>Reference Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Element</em>'.
	 * @see AAS.ReferenceElement
	 * @generated
	 */
	EClass getReferenceElement();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.ReferenceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see AAS.ReferenceElement#getValue()
	 * @see #getReferenceElement()
	 * @generated
	 */
	EReference getReferenceElement_Value();

	/**
	 * Returns the meta object for class '{@link AAS.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see AAS.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link AAS.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see AAS.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for class '{@link AAS.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see AAS.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Range#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see AAS.Range#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Range#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see AAS.Range#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for class '{@link AAS.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see AAS.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link AAS.ConceptDescription <em>Concept Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Description</em>'.
	 * @see AAS.ConceptDescription
	 * @generated
	 */
	EClass getConceptDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.ConceptDescription#getIsCaseOf <em>Is Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Case Of</em>'.
	 * @see AAS.ConceptDescription#getIsCaseOf()
	 * @see #getConceptDescription()
	 * @generated
	 */
	EReference getConceptDescription_IsCaseOf();

	/**
	 * Returns the meta object for class '{@link AAS.LangStringSet <em>Lang String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang String Set</em>'.
	 * @see AAS.LangStringSet
	 * @generated
	 */
	EClass getLangStringSet();

	/**
	 * Returns the meta object for class '{@link AAS.DataSpecificationContent <em>Data Specification Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Specification Content</em>'.
	 * @see AAS.DataSpecificationContent
	 * @generated
	 */
	EClass getDataSpecificationContent();

	/**
	 * Returns the meta object for class '{@link AAS.DataSpecificationIEC61360 <em>Data Specification IEC61360</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Specification IEC61360</em>'.
	 * @see AAS.DataSpecificationIEC61360
	 * @generated
	 */
	EClass getDataSpecificationIEC61360();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.DataSpecificationIEC61360#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Name</em>'.
	 * @see AAS.DataSpecificationIEC61360#getPreferredName()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_PreferredName();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.DataSpecificationIEC61360#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Name</em>'.
	 * @see AAS.DataSpecificationIEC61360#getShortName()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link AAS.DataSpecificationIEC61360#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see AAS.DataSpecificationIEC61360#getUnit()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EAttribute getDataSpecificationIEC61360_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.DataSpecificationIEC61360#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Id</em>'.
	 * @see AAS.DataSpecificationIEC61360#getUnitId()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_UnitId();

	/**
	 * Returns the meta object for the attribute '{@link AAS.DataSpecificationIEC61360#getSourceOfDefinition <em>Source Of Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Of Definition</em>'.
	 * @see AAS.DataSpecificationIEC61360#getSourceOfDefinition()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EAttribute getDataSpecificationIEC61360_SourceOfDefinition();

	/**
	 * Returns the meta object for the attribute '{@link AAS.DataSpecificationIEC61360#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see AAS.DataSpecificationIEC61360#getSymbol()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EAttribute getDataSpecificationIEC61360_Symbol();

	/**
	 * Returns the meta object for the reference '{@link AAS.DataSpecificationIEC61360#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see AAS.DataSpecificationIEC61360#getDataType()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.DataSpecificationIEC61360#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see AAS.DataSpecificationIEC61360#getDefinition()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_Definition();

	/**
	 * Returns the meta object for the attribute '{@link AAS.DataSpecificationIEC61360#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see AAS.DataSpecificationIEC61360#getValueFormat()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EAttribute getDataSpecificationIEC61360_ValueFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.DataSpecificationIEC61360#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value List</em>'.
	 * @see AAS.DataSpecificationIEC61360#getValueList()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_ValueList();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.DataSpecificationIEC61360#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see AAS.DataSpecificationIEC61360#getValueId()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EReference getDataSpecificationIEC61360_ValueId();

	/**
	 * Returns the meta object for the attribute list '{@link AAS.DataSpecificationIEC61360#getLevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Level Type</em>'.
	 * @see AAS.DataSpecificationIEC61360#getLevelType()
	 * @see #getDataSpecificationIEC61360()
	 * @generated
	 */
	EAttribute getDataSpecificationIEC61360_LevelType();

	/**
	 * Returns the meta object for class '{@link AAS.ValueReferencePairType <em>Value Reference Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Reference Pair Type</em>'.
	 * @see AAS.ValueReferencePairType
	 * @generated
	 */
	EClass getValueReferencePairType();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.ValueReferencePairType#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see AAS.ValueReferencePairType#getValueId()
	 * @see #getValueReferencePairType()
	 * @generated
	 */
	EReference getValueReferencePairType_ValueId();

	/**
	 * Returns the meta object for class '{@link AAS.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see AAS.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link AAS.View#getContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Element</em>'.
	 * @see AAS.View#getContainedElement()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ContainedElement();

	/**
	 * Returns the meta object for class '{@link AAS.MultiLanguageProperty <em>Multi Language Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Language Property</em>'.
	 * @see AAS.MultiLanguageProperty
	 * @generated
	 */
	EClass getMultiLanguageProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.MultiLanguageProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see AAS.MultiLanguageProperty#getValue()
	 * @see #getMultiLanguageProperty()
	 * @generated
	 */
	EReference getMultiLanguageProperty_Value();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.MultiLanguageProperty#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see AAS.MultiLanguageProperty#getValueId()
	 * @see #getMultiLanguageProperty()
	 * @generated
	 */
	EReference getMultiLanguageProperty_ValueId();

	/**
	 * Returns the meta object for class '{@link AAS.AasModelRoot <em>Aas Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aas Model Root</em>'.
	 * @see AAS.AasModelRoot
	 * @generated
	 */
	EClass getAasModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.AasModelRoot#getAssetadministrationshells <em>Assetadministrationshells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assetadministrationshells</em>'.
	 * @see AAS.AasModelRoot#getAssetadministrationshells()
	 * @see #getAasModelRoot()
	 * @generated
	 */
	EReference getAasModelRoot_Assetadministrationshells();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AasModelRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AAS.AasModelRoot#getName()
	 * @see #getAasModelRoot()
	 * @generated
	 */
	EAttribute getAasModelRoot_Name();

	/**
	 * Returns the meta object for class '{@link AAS.HasExtensions <em>Has Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Extensions</em>'.
	 * @see AAS.HasExtensions
	 * @generated
	 */
	EClass getHasExtensions();

	/**
	 * Returns the meta object for the reference list '{@link AAS.HasExtensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see AAS.HasExtensions#getExtension()
	 * @see #getHasExtensions()
	 * @generated
	 */
	EReference getHasExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link AAS.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see AAS.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AAS.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Extension#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see AAS.Extension#getValueType()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Extension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.Extension#getValue()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Value();

	/**
	 * Returns the meta object for class '{@link AAS.Qualifiable <em>Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifiable</em>'.
	 * @see AAS.Qualifiable
	 * @generated
	 */
	EClass getQualifiable();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Qualifiable#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see AAS.Qualifiable#getQualifier()
	 * @see #getQualifiable()
	 * @generated
	 */
	EReference getQualifiable_Qualifier();

	/**
	 * Returns the meta object for class '{@link AAS.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see AAS.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Qualifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AAS.Qualifier#getType()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_Type();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Qualifier#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see AAS.Qualifier#getValueType()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link AAS.Qualifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AAS.Qualifier#getValue()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_Value();

	/**
	 * Returns the meta object for the containment reference '{@link AAS.Qualifier#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see AAS.Qualifier#getValueId()
	 * @see #getQualifier()
	 * @generated
	 */
	EReference getQualifier_ValueId();

	/**
	 * Returns the meta object for class '{@link AAS.AnnotatedRelationshipElement <em>Annotated Relationship Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Relationship Element</em>'.
	 * @see AAS.AnnotatedRelationshipElement
	 * @generated
	 */
	EClass getAnnotatedRelationshipElement();

	/**
	 * Returns the meta object for the reference list '{@link AAS.AnnotatedRelationshipElement#getDataelement <em>Dataelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataelement</em>'.
	 * @see AAS.AnnotatedRelationshipElement#getDataelement()
	 * @see #getAnnotatedRelationshipElement()
	 * @generated
	 */
	EReference getAnnotatedRelationshipElement_Dataelement();

	/**
	 * Returns the meta object for the attribute '{@link AAS.AnnotatedRelationshipElement#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see AAS.AnnotatedRelationshipElement#getNote()
	 * @see #getAnnotatedRelationshipElement()
	 * @generated
	 */
	EAttribute getAnnotatedRelationshipElement_Note();

	/**
	 * Returns the meta object for class '{@link AAS.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Element</em>'.
	 * @see AAS.ComposableElement
	 * @generated
	 */
	EClass getComposableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link AAS.ComposableElement#getSubmodelelement <em>Submodelelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodelelement</em>'.
	 * @see AAS.ComposableElement#getSubmodelelement()
	 * @see #getComposableElement()
	 * @generated
	 */
	EReference getComposableElement_Submodelelement();

	/**
	 * Returns the meta object for enum '{@link AAS.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type</em>'.
	 * @see AAS.IdentifierType
	 * @generated
	 */
	EEnum getIdentifierType();

	/**
	 * Returns the meta object for enum '{@link AAS.LangEnum <em>Lang Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lang Enum</em>'.
	 * @see AAS.LangEnum
	 * @generated
	 */
	EEnum getLangEnum();

	/**
	 * Returns the meta object for enum '{@link AAS.KeyElements <em>Key Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Elements</em>'.
	 * @see AAS.KeyElements
	 * @generated
	 */
	EEnum getKeyElements();

	/**
	 * Returns the meta object for enum '{@link AAS.ReferableElements <em>Referable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referable Elements</em>'.
	 * @see AAS.ReferableElements
	 * @generated
	 */
	EEnum getReferableElements();

	/**
	 * Returns the meta object for enum '{@link AAS.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifiable Element</em>'.
	 * @see AAS.IdentifiableElement
	 * @generated
	 */
	EEnum getIdentifiableElement();

	/**
	 * Returns the meta object for enum '{@link AAS.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type</em>'.
	 * @see AAS.KeyType
	 * @generated
	 */
	EEnum getKeyType();

	/**
	 * Returns the meta object for enum '{@link AAS.LocalKeyType <em>Local Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Local Key Type</em>'.
	 * @see AAS.LocalKeyType
	 * @generated
	 */
	EEnum getLocalKeyType();

	/**
	 * Returns the meta object for enum '{@link AAS.ModelingKind <em>Modeling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modeling Kind</em>'.
	 * @see AAS.ModelingKind
	 * @generated
	 */
	EEnum getModelingKind();

	/**
	 * Returns the meta object for enum '{@link AAS.ProtocolKind <em>Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Kind</em>'.
	 * @see AAS.ProtocolKind
	 * @generated
	 */
	EEnum getProtocolKind();

	/**
	 * Returns the meta object for enum '{@link AAS.IdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Id Type</em>'.
	 * @see AAS.IdType
	 * @generated
	 */
	EEnum getIdType();

	/**
	 * Returns the meta object for enum '{@link AAS.AssetKind <em>Asset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Kind</em>'.
	 * @see AAS.AssetKind
	 * @generated
	 */
	EEnum getAssetKind();

	/**
	 * Returns the meta object for enum '{@link AAS.MimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mime Type</em>'.
	 * @see AAS.MimeType
	 * @generated
	 */
	EEnum getMimeType();

	/**
	 * Returns the meta object for enum '{@link AAS.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see AAS.EntityType
	 * @generated
	 */
	EEnum getEntityType();

	/**
	 * Returns the meta object for enum '{@link AAS.LevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level Type</em>'.
	 * @see AAS.LevelType
	 * @generated
	 */
	EEnum getLevelType();

	/**
	 * Returns the meta object for enum '{@link AAS.DataTypeIEC61360 <em>Data Type IEC61360</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type IEC61360</em>'.
	 * @see AAS.DataTypeIEC61360
	 * @generated
	 */
	EEnum getDataTypeIEC61360();

	/**
	 * Returns the meta object for enum '{@link AAS.DataTypeDefXsd <em>Data Type Def Xsd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Def Xsd</em>'.
	 * @see AAS.DataTypeDefXsd
	 * @generated
	 */
	EEnum getDataTypeDefXsd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AASFactory getAASFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AAS.impl.AssetAdministrationShellImpl <em>Asset Administration Shell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AssetAdministrationShellImpl
		 * @see AAS.impl.AASPackageImpl#getAssetAdministrationShell()
		 * @generated
		 */
		EClass ASSET_ADMINISTRATION_SHELL = eINSTANCE.getAssetAdministrationShell();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__DERIVED_FROM = eINSTANCE.getAssetAdministrationShell_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__SECURITY = eINSTANCE.getAssetAdministrationShell_Security();

		/**
		 * The meta object literal for the '<em><b>Asset Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION = eINSTANCE.getAssetAdministrationShell_AssetInformation();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__ASSET = eINSTANCE.getAssetAdministrationShell_Asset();

		/**
		 * The meta object literal for the '<em><b>Submodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__SUBMODEL = eINSTANCE.getAssetAdministrationShell_Submodel();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__ENDPOINT = eINSTANCE.getAssetAdministrationShell_Endpoint();

		/**
		 * The meta object literal for the '{@link AAS.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.IdentifiableImpl
		 * @see AAS.impl.AASPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Administration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__ADMINISTRATION = eINSTANCE.getIdentifiable_Administration();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__IDENTIFICATION = eINSTANCE.getIdentifiable_Identification();

		/**
		 * The meta object literal for the '{@link AAS.impl.ReferableImpl <em>Referable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ReferableImpl
		 * @see AAS.impl.AASPackageImpl#getReferable()
		 * @generated
		 */
		EClass REFERABLE = eINSTANCE.getReferable();

		/**
		 * The meta object literal for the '<em><b>Id Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__ID_SHORT = eINSTANCE.getReferable_IdShort();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__CATEGORY = eINSTANCE.getReferable_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERABLE__DESCRIPTION = eINSTANCE.getReferable_Description();

		/**
		 * The meta object literal for the '{@link AAS.impl.LangStringImpl <em>Lang String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.LangStringImpl
		 * @see AAS.impl.AASPackageImpl#getLangString()
		 * @generated
		 */
		EClass LANG_STRING = eINSTANCE.getLangString();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_STRING__LANG = eINSTANCE.getLangString_Lang();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_STRING__VALUE = eINSTANCE.getLangString_Value();

		/**
		 * The meta object literal for the '{@link AAS.impl.AdministrativeInformationImpl <em>Administrative Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AdministrativeInformationImpl
		 * @see AAS.impl.AASPackageImpl#getAdministrativeInformation()
		 * @generated
		 */
		EClass ADMINISTRATIVE_INFORMATION = eINSTANCE.getAdministrativeInformation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__VERSION = eINSTANCE.getAdministrativeInformation_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__REVISION = eINSTANCE.getAdministrativeInformation_Revision();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__CREATOR = eINSTANCE.getAdministrativeInformation_Creator();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__TEMPLATE_ID = eINSTANCE.getAdministrativeInformation_TemplateId();

		/**
		 * The meta object literal for the '{@link AAS.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.IdentifierImpl
		 * @see AAS.impl.AASPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID_TYPE = eINSTANCE.getIdentifier_IdType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link AAS.impl.HasDataSpecificationImpl <em>Has Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.HasDataSpecificationImpl
		 * @see AAS.impl.AASPackageImpl#getHasDataSpecification()
		 * @generated
		 */
		EClass HAS_DATA_SPECIFICATION = eINSTANCE.getHasDataSpecification();

		/**
		 * The meta object literal for the '<em><b>Data Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_DATA_SPECIFICATION__DATA_SPECIFICATION = eINSTANCE.getHasDataSpecification_DataSpecification();

		/**
		 * The meta object literal for the '{@link AAS.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ReferenceImpl
		 * @see AAS.impl.AASPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__KEY = eINSTANCE.getReference_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '{@link AAS.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.KeyImpl
		 * @see AAS.impl.AASPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__TYPE = eINSTANCE.getKey_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__VALUE = eINSTANCE.getKey_Value();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ID_TYPE = eINSTANCE.getKey_IdType();

		/**
		 * The meta object literal for the '<em><b>Referable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__REFERABLE = eINSTANCE.getKey_Referable();

		/**
		 * The meta object literal for the '{@link AAS.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.SecurityImpl
		 * @see AAS.impl.AASPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Access Control Policy Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__ACCESS_CONTROL_POLICY_POINTS = eINSTANCE.getSecurity_AccessControlPolicyPoints();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__CERTIFICATE = eINSTANCE.getSecurity_Certificate();

		/**
		 * The meta object literal for the '<em><b>Required Certificate Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__REQUIRED_CERTIFICATE_EXTENSION = eINSTANCE.getSecurity_RequiredCertificateExtension();

		/**
		 * The meta object literal for the '{@link AAS.impl.AccessControlPolicyPointsImpl <em>Access Control Policy Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AccessControlPolicyPointsImpl
		 * @see AAS.impl.AASPackageImpl#getAccessControlPolicyPoints()
		 * @generated
		 */
		EClass ACCESS_CONTROL_POLICY_POINTS = eINSTANCE.getAccessControlPolicyPoints();

		/**
		 * The meta object literal for the '<em><b>Local Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL = eINSTANCE.getAccessControlPolicyPoints_LocalAccessControl();

		/**
		 * The meta object literal for the '<em><b>External Access Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL = eINSTANCE.getAccessControlPolicyPoints_ExternalAccessControl();

		/**
		 * The meta object literal for the '<em><b>External Information Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS = eINSTANCE.getAccessControlPolicyPoints_ExternalInformationPoints();

		/**
		 * The meta object literal for the '<em><b>Internal Information Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT = eINSTANCE.getAccessControlPolicyPoints_InternalInformationPoint();

		/**
		 * The meta object literal for the '<em><b>External Policy Decision Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS = eINSTANCE.getAccessControlPolicyPoints_ExternalPolicyDecisionPoints();

		/**
		 * The meta object literal for the '<em><b>External Policy Enforcement Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT = eINSTANCE.getAccessControlPolicyPoints_ExternalPolicyEnforcementPoint();

		/**
		 * The meta object literal for the '{@link AAS.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AccessControlImpl
		 * @see AAS.impl.AASPackageImpl#getAccessControl()
		 * @generated
		 */
		EClass ACCESS_CONTROL = eINSTANCE.getAccessControl();

		/**
		 * The meta object literal for the '{@link AAS.impl.SubmodelImpl <em>Submodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.SubmodelImpl
		 * @see AAS.impl.AASPackageImpl#getSubmodel()
		 * @generated
		 */
		EClass SUBMODEL = eINSTANCE.getSubmodel();

		/**
		 * The meta object literal for the '<em><b>Submodelelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL__SUBMODELELEMENT = eINSTANCE.getSubmodel_Submodelelement();

		/**
		 * The meta object literal for the '{@link AAS.impl.HasKindImpl <em>Has Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.HasKindImpl
		 * @see AAS.impl.AASPackageImpl#getHasKind()
		 * @generated
		 */
		EClass HAS_KIND = eINSTANCE.getHasKind();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_KIND__KIND = eINSTANCE.getHasKind_Kind();

		/**
		 * The meta object literal for the '{@link AAS.impl.HasSemanticsImpl <em>Has Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.HasSemanticsImpl
		 * @see AAS.impl.AASPackageImpl#getHasSemantics()
		 * @generated
		 */
		EClass HAS_SEMANTICS = eINSTANCE.getHasSemantics();

		/**
		 * The meta object literal for the '<em><b>Semantic Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SEMANTICS__SEMANTIC_ID = eINSTANCE.getHasSemantics_SemanticId();

		/**
		 * The meta object literal for the '{@link AAS.impl.SubmodelElementImpl <em>Submodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.SubmodelElementImpl
		 * @see AAS.impl.AASPackageImpl#getSubmodelElement()
		 * @generated
		 */
		EClass SUBMODEL_ELEMENT = eINSTANCE.getSubmodelElement();

		/**
		 * The meta object literal for the '<em><b>Is Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODEL_ELEMENT__IS_DYNAMIC = eINSTANCE.getSubmodelElement_IsDynamic();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL_ELEMENT__END_POINT = eINSTANCE.getSubmodelElement_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL_ELEMENT__NODE_ID = eINSTANCE.getSubmodelElement_NodeId();

		/**
		 * The meta object literal for the '{@link AAS.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.EndpointImpl
		 * @see AAS.impl.AASPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__ADDRESS = eINSTANCE.getEndpoint_Address();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__PROTOCOL = eINSTANCE.getEndpoint_Protocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__NAME = eINSTANCE.getEndpoint_Name();

		/**
		 * The meta object literal for the '{@link AAS.impl.NodeIdImpl <em>Node Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.NodeIdImpl
		 * @see AAS.impl.AASPackageImpl#getNodeId()
		 * @generated
		 */
		EClass NODE_ID = eINSTANCE.getNodeId();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ID__NAMESPACE = eINSTANCE.getNodeId_Namespace();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ID__IDENTIFIER = eINSTANCE.getNodeId_Identifier();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ID__ID_TYPE = eINSTANCE.getNodeId_IdType();

		/**
		 * The meta object literal for the '{@link AAS.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.CertificateImpl
		 * @see AAS.impl.AASPackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();

		/**
		 * The meta object literal for the '{@link AAS.impl.AssetInformationImpl <em>Asset Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AssetInformationImpl
		 * @see AAS.impl.AASPackageImpl#getAssetInformation()
		 * @generated
		 */
		EClass ASSET_INFORMATION = eINSTANCE.getAssetInformation();

		/**
		 * The meta object literal for the '<em><b>Asset Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_INFORMATION__ASSET_KIND = eINSTANCE.getAssetInformation_AssetKind();

		/**
		 * The meta object literal for the '<em><b>Global Asset Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_INFORMATION__GLOBAL_ASSET_ID = eINSTANCE.getAssetInformation_GlobalAssetId();

		/**
		 * The meta object literal for the '<em><b>Specific Asset Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_INFORMATION__SPECIFIC_ASSET_ID = eINSTANCE.getAssetInformation_SpecificAssetId();

		/**
		 * The meta object literal for the '<em><b>Bill Of Material</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_INFORMATION__BILL_OF_MATERIAL = eINSTANCE.getAssetInformation_BillOfMaterial();

		/**
		 * The meta object literal for the '<em><b>Default Thumbnail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_INFORMATION__DEFAULT_THUMBNAIL = eINSTANCE.getAssetInformation_DefaultThumbnail();

		/**
		 * The meta object literal for the '{@link AAS.impl.IdentifierKeyValuePairImpl <em>Identifier Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.IdentifierKeyValuePairImpl
		 * @see AAS.impl.AASPackageImpl#getIdentifierKeyValuePair()
		 * @generated
		 */
		EClass IDENTIFIER_KEY_VALUE_PAIR = eINSTANCE.getIdentifierKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_KEY_VALUE_PAIR__KEY = eINSTANCE.getIdentifierKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_KEY_VALUE_PAIR__VALUE = eINSTANCE.getIdentifierKeyValuePair_Value();

		/**
		 * The meta object literal for the '<em><b>External Subject Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID = eINSTANCE.getIdentifierKeyValuePair_ExternalSubjectId();

		/**
		 * The meta object literal for the '{@link AAS.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.FileImpl
		 * @see AAS.impl.AASPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MIME_TYPE = eINSTANCE.getFile_MimeType();

		/**
		 * The meta object literal for the '{@link AAS.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.DataElementImpl
		 * @see AAS.impl.AASPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '{@link AAS.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AssetImpl
		 * @see AAS.impl.AASPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__KIND = eINSTANCE.getAsset_Kind();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ENDPOINT = eINSTANCE.getAsset_Endpoint();

		/**
		 * The meta object literal for the '{@link AAS.impl.AASEndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AASEndpointImpl
		 * @see AAS.impl.AASPackageImpl#getAASEndpoint()
		 * @generated
		 */
		EClass AAS_ENDPOINT = eINSTANCE.getAASEndpoint();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAS_ENDPOINT__ADDRESS = eINSTANCE.getAASEndpoint_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAS_ENDPOINT__PORT = eINSTANCE.getAASEndpoint_Port();

		/**
		 * The meta object literal for the '{@link AAS.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.EntityImpl
		 * @see AAS.impl.AASPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENTITY_TYPE = eINSTANCE.getEntity_EntityType();

		/**
		 * The meta object literal for the '{@link AAS.impl.RelationshipElementImpl <em>Relationship Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.RelationshipElementImpl
		 * @see AAS.impl.AASPackageImpl#getRelationshipElement()
		 * @generated
		 */
		EClass RELATIONSHIP_ELEMENT = eINSTANCE.getRelationshipElement();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ELEMENT__FIRST = eINSTANCE.getRelationshipElement_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ELEMENT__SECOND = eINSTANCE.getRelationshipElement_Second();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ELEMENT__NAME = eINSTANCE.getRelationshipElement_Name();

		/**
		 * The meta object literal for the '{@link AAS.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.OperationImpl
		 * @see AAS.impl.AASPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link AAS.impl.SubmodelElementCollectionImpl <em>Submodel Element Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.SubmodelElementCollectionImpl
		 * @see AAS.impl.AASPackageImpl#getSubmodelElementCollection()
		 * @generated
		 */
		EClass SUBMODEL_ELEMENT_COLLECTION = eINSTANCE.getSubmodelElementCollection();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODEL_ELEMENT_COLLECTION__ORDERED = eINSTANCE.getSubmodelElementCollection_Ordered();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES = eINSTANCE.getSubmodelElementCollection_AllowDuplicates();

		/**
		 * The meta object literal for the '{@link AAS.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.PropertyImpl
		 * @see AAS.impl.AASPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE_TYPE = eINSTANCE.getProperty_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE_ID = eINSTANCE.getProperty_ValueId();

		/**
		 * The meta object literal for the '{@link AAS.impl.ReferenceElementImpl <em>Reference Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ReferenceElementImpl
		 * @see AAS.impl.AASPackageImpl#getReferenceElement()
		 * @generated
		 */
		EClass REFERENCE_ELEMENT = eINSTANCE.getReferenceElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ELEMENT__VALUE = eINSTANCE.getReferenceElement_Value();

		/**
		 * The meta object literal for the '{@link AAS.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.EventImpl
		 * @see AAS.impl.AASPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link AAS.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.BasicEventImpl
		 * @see AAS.impl.AASPackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '{@link AAS.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.RangeImpl
		 * @see AAS.impl.AASPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '{@link AAS.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.CapabilityImpl
		 * @see AAS.impl.AASPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link AAS.impl.ConceptDescriptionImpl <em>Concept Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ConceptDescriptionImpl
		 * @see AAS.impl.AASPackageImpl#getConceptDescription()
		 * @generated
		 */
		EClass CONCEPT_DESCRIPTION = eINSTANCE.getConceptDescription();

		/**
		 * The meta object literal for the '<em><b>Is Case Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DESCRIPTION__IS_CASE_OF = eINSTANCE.getConceptDescription_IsCaseOf();

		/**
		 * The meta object literal for the '{@link AAS.impl.LangStringSetImpl <em>Lang String Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.LangStringSetImpl
		 * @see AAS.impl.AASPackageImpl#getLangStringSet()
		 * @generated
		 */
		EClass LANG_STRING_SET = eINSTANCE.getLangStringSet();

		/**
		 * The meta object literal for the '{@link AAS.impl.DataSpecificationContentImpl <em>Data Specification Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.DataSpecificationContentImpl
		 * @see AAS.impl.AASPackageImpl#getDataSpecificationContent()
		 * @generated
		 */
		EClass DATA_SPECIFICATION_CONTENT = eINSTANCE.getDataSpecificationContent();

		/**
		 * The meta object literal for the '{@link AAS.impl.DataSpecificationIEC61360Impl <em>Data Specification IEC61360</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.DataSpecificationIEC61360Impl
		 * @see AAS.impl.AASPackageImpl#getDataSpecificationIEC61360()
		 * @generated
		 */
		EClass DATA_SPECIFICATION_IEC61360 = eINSTANCE.getDataSpecificationIEC61360();

		/**
		 * The meta object literal for the '<em><b>Preferred Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__PREFERRED_NAME = eINSTANCE.getDataSpecificationIEC61360_PreferredName();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__SHORT_NAME = eINSTANCE.getDataSpecificationIEC61360_ShortName();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPECIFICATION_IEC61360__UNIT = eINSTANCE.getDataSpecificationIEC61360_Unit();

		/**
		 * The meta object literal for the '<em><b>Unit Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__UNIT_ID = eINSTANCE.getDataSpecificationIEC61360_UnitId();

		/**
		 * The meta object literal for the '<em><b>Source Of Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION = eINSTANCE.getDataSpecificationIEC61360_SourceOfDefinition();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPECIFICATION_IEC61360__SYMBOL = eINSTANCE.getDataSpecificationIEC61360_Symbol();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__DATA_TYPE = eINSTANCE.getDataSpecificationIEC61360_DataType();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__DEFINITION = eINSTANCE.getDataSpecificationIEC61360_Definition();

		/**
		 * The meta object literal for the '<em><b>Value Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPECIFICATION_IEC61360__VALUE_FORMAT = eINSTANCE.getDataSpecificationIEC61360_ValueFormat();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__VALUE_LIST = eINSTANCE.getDataSpecificationIEC61360_ValueList();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_IEC61360__VALUE_ID = eINSTANCE.getDataSpecificationIEC61360_ValueId();

		/**
		 * The meta object literal for the '<em><b>Level Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPECIFICATION_IEC61360__LEVEL_TYPE = eINSTANCE.getDataSpecificationIEC61360_LevelType();

		/**
		 * The meta object literal for the '{@link AAS.impl.ValueReferencePairTypeImpl <em>Value Reference Pair Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ValueReferencePairTypeImpl
		 * @see AAS.impl.AASPackageImpl#getValueReferencePairType()
		 * @generated
		 */
		EClass VALUE_REFERENCE_PAIR_TYPE = eINSTANCE.getValueReferencePairType();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_REFERENCE_PAIR_TYPE__VALUE_ID = eINSTANCE.getValueReferencePairType_ValueId();

		/**
		 * The meta object literal for the '{@link AAS.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ViewImpl
		 * @see AAS.impl.AASPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Contained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CONTAINED_ELEMENT = eINSTANCE.getView_ContainedElement();

		/**
		 * The meta object literal for the '{@link AAS.impl.MultiLanguagePropertyImpl <em>Multi Language Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.MultiLanguagePropertyImpl
		 * @see AAS.impl.AASPackageImpl#getMultiLanguageProperty()
		 * @generated
		 */
		EClass MULTI_LANGUAGE_PROPERTY = eINSTANCE.getMultiLanguageProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANGUAGE_PROPERTY__VALUE = eINSTANCE.getMultiLanguageProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANGUAGE_PROPERTY__VALUE_ID = eINSTANCE.getMultiLanguageProperty_ValueId();

		/**
		 * The meta object literal for the '{@link AAS.impl.AasModelRootImpl <em>Aas Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AasModelRootImpl
		 * @see AAS.impl.AASPackageImpl#getAasModelRoot()
		 * @generated
		 */
		EClass AAS_MODEL_ROOT = eINSTANCE.getAasModelRoot();

		/**
		 * The meta object literal for the '<em><b>Assetadministrationshells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AAS_MODEL_ROOT__ASSETADMINISTRATIONSHELLS = eINSTANCE.getAasModelRoot_Assetadministrationshells();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAS_MODEL_ROOT__NAME = eINSTANCE.getAasModelRoot_Name();

		/**
		 * The meta object literal for the '{@link AAS.impl.HasExtensionsImpl <em>Has Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.HasExtensionsImpl
		 * @see AAS.impl.AASPackageImpl#getHasExtensions()
		 * @generated
		 */
		EClass HAS_EXTENSIONS = eINSTANCE.getHasExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_EXTENSIONS__EXTENSION = eINSTANCE.getHasExtensions_Extension();

		/**
		 * The meta object literal for the '{@link AAS.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ExtensionImpl
		 * @see AAS.impl.AASPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE_TYPE = eINSTANCE.getExtension_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE = eINSTANCE.getExtension_Value();

		/**
		 * The meta object literal for the '{@link AAS.impl.QualifiableImpl <em>Qualifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.QualifiableImpl
		 * @see AAS.impl.AASPackageImpl#getQualifiable()
		 * @generated
		 */
		EClass QUALIFIABLE = eINSTANCE.getQualifiable();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIABLE__QUALIFIER = eINSTANCE.getQualifiable_Qualifier();

		/**
		 * The meta object literal for the '{@link AAS.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.QualifierImpl
		 * @see AAS.impl.AASPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__TYPE = eINSTANCE.getQualifier_Type();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__VALUE_TYPE = eINSTANCE.getQualifier_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__VALUE = eINSTANCE.getQualifier_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER__VALUE_ID = eINSTANCE.getQualifier_ValueId();

		/**
		 * The meta object literal for the '{@link AAS.impl.AnnotatedRelationshipElementImpl <em>Annotated Relationship Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.AnnotatedRelationshipElementImpl
		 * @see AAS.impl.AASPackageImpl#getAnnotatedRelationshipElement()
		 * @generated
		 */
		EClass ANNOTATED_RELATIONSHIP_ELEMENT = eINSTANCE.getAnnotatedRelationshipElement();

		/**
		 * The meta object literal for the '<em><b>Dataelement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT = eINSTANCE.getAnnotatedRelationshipElement_Dataelement();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATED_RELATIONSHIP_ELEMENT__NOTE = eINSTANCE.getAnnotatedRelationshipElement_Note();

		/**
		 * The meta object literal for the '{@link AAS.impl.ComposableElementImpl <em>Composable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.impl.ComposableElementImpl
		 * @see AAS.impl.AASPackageImpl#getComposableElement()
		 * @generated
		 */
		EClass COMPOSABLE_ELEMENT = eINSTANCE.getComposableElement();

		/**
		 * The meta object literal for the '<em><b>Submodelelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSABLE_ELEMENT__SUBMODELELEMENT = eINSTANCE.getComposableElement_Submodelelement();

		/**
		 * The meta object literal for the '{@link AAS.IdentifierType <em>Identifier Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.IdentifierType
		 * @see AAS.impl.AASPackageImpl#getIdentifierType()
		 * @generated
		 */
		EEnum IDENTIFIER_TYPE = eINSTANCE.getIdentifierType();

		/**
		 * The meta object literal for the '{@link AAS.LangEnum <em>Lang Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.LangEnum
		 * @see AAS.impl.AASPackageImpl#getLangEnum()
		 * @generated
		 */
		EEnum LANG_ENUM = eINSTANCE.getLangEnum();

		/**
		 * The meta object literal for the '{@link AAS.KeyElements <em>Key Elements</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.KeyElements
		 * @see AAS.impl.AASPackageImpl#getKeyElements()
		 * @generated
		 */
		EEnum KEY_ELEMENTS = eINSTANCE.getKeyElements();

		/**
		 * The meta object literal for the '{@link AAS.ReferableElements <em>Referable Elements</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.ReferableElements
		 * @see AAS.impl.AASPackageImpl#getReferableElements()
		 * @generated
		 */
		EEnum REFERABLE_ELEMENTS = eINSTANCE.getReferableElements();

		/**
		 * The meta object literal for the '{@link AAS.IdentifiableElement <em>Identifiable Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.IdentifiableElement
		 * @see AAS.impl.AASPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EEnum IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '{@link AAS.KeyType <em>Key Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.KeyType
		 * @see AAS.impl.AASPackageImpl#getKeyType()
		 * @generated
		 */
		EEnum KEY_TYPE = eINSTANCE.getKeyType();

		/**
		 * The meta object literal for the '{@link AAS.LocalKeyType <em>Local Key Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.LocalKeyType
		 * @see AAS.impl.AASPackageImpl#getLocalKeyType()
		 * @generated
		 */
		EEnum LOCAL_KEY_TYPE = eINSTANCE.getLocalKeyType();

		/**
		 * The meta object literal for the '{@link AAS.ModelingKind <em>Modeling Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.ModelingKind
		 * @see AAS.impl.AASPackageImpl#getModelingKind()
		 * @generated
		 */
		EEnum MODELING_KIND = eINSTANCE.getModelingKind();

		/**
		 * The meta object literal for the '{@link AAS.ProtocolKind <em>Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.ProtocolKind
		 * @see AAS.impl.AASPackageImpl#getProtocolKind()
		 * @generated
		 */
		EEnum PROTOCOL_KIND = eINSTANCE.getProtocolKind();

		/**
		 * The meta object literal for the '{@link AAS.IdType <em>Id Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.IdType
		 * @see AAS.impl.AASPackageImpl#getIdType()
		 * @generated
		 */
		EEnum ID_TYPE = eINSTANCE.getIdType();

		/**
		 * The meta object literal for the '{@link AAS.AssetKind <em>Asset Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.AssetKind
		 * @see AAS.impl.AASPackageImpl#getAssetKind()
		 * @generated
		 */
		EEnum ASSET_KIND = eINSTANCE.getAssetKind();

		/**
		 * The meta object literal for the '{@link AAS.MimeType <em>Mime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.MimeType
		 * @see AAS.impl.AASPackageImpl#getMimeType()
		 * @generated
		 */
		EEnum MIME_TYPE = eINSTANCE.getMimeType();

		/**
		 * The meta object literal for the '{@link AAS.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.EntityType
		 * @see AAS.impl.AASPackageImpl#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '{@link AAS.LevelType <em>Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.LevelType
		 * @see AAS.impl.AASPackageImpl#getLevelType()
		 * @generated
		 */
		EEnum LEVEL_TYPE = eINSTANCE.getLevelType();

		/**
		 * The meta object literal for the '{@link AAS.DataTypeIEC61360 <em>Data Type IEC61360</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.DataTypeIEC61360
		 * @see AAS.impl.AASPackageImpl#getDataTypeIEC61360()
		 * @generated
		 */
		EEnum DATA_TYPE_IEC61360 = eINSTANCE.getDataTypeIEC61360();

		/**
		 * The meta object literal for the '{@link AAS.DataTypeDefXsd <em>Data Type Def Xsd</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AAS.DataTypeDefXsd
		 * @see AAS.impl.AASPackageImpl#getDataTypeDefXsd()
		 * @generated
		 */
		EEnum DATA_TYPE_DEF_XSD = eINSTANCE.getDataTypeDefXsd();

	}

} //AASPackage
