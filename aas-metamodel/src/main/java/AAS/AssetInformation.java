/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AssetInformation/globalAssetId either is a reference
 * to an Asset object or a global reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.AssetInformation#getAssetKind <em>Asset Kind</em>}</li>
 *   <li>{@link AAS.AssetInformation#getGlobalAssetId <em>Global Asset Id</em>}</li>
 *   <li>{@link AAS.AssetInformation#getSpecificAssetId <em>Specific Asset Id</em>}</li>
 *   <li>{@link AAS.AssetInformation#getBillOfMaterial <em>Bill Of Material</em>}</li>
 *   <li>{@link AAS.AssetInformation#getDefaultThumbnail <em>Default Thumbnail</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAssetInformation()
 * @model
 * @generated
 */
public interface AssetInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.AssetKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Kind</em>' attribute.
	 * @see AAS.AssetKind
	 * @see #setAssetKind(AssetKind)
	 * @see AAS.AASPackage#getAssetInformation_AssetKind()
	 * @model required="true"
	 * @generated
	 */
	AssetKind getAssetKind();

	/**
	 * Sets the value of the '{@link AAS.AssetInformation#getAssetKind <em>Asset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Kind</em>' attribute.
	 * @see AAS.AssetKind
	 * @see #getAssetKind()
	 * @generated
	 */
	void setAssetKind(AssetKind value);

	/**
	 * Returns the value of the '<em><b>Global Asset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Asset Id</em>' containment reference.
	 * @see #setGlobalAssetId(Reference)
	 * @see AAS.AASPackage#getAssetInformation_GlobalAssetId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getGlobalAssetId();

	/**
	 * Sets the value of the '{@link AAS.AssetInformation#getGlobalAssetId <em>Global Asset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Asset Id</em>' containment reference.
	 * @see #getGlobalAssetId()
	 * @generated
	 */
	void setGlobalAssetId(Reference value);

	/**
	 * Returns the value of the '<em><b>Specific Asset Id</b></em>' reference list.
	 * The list contents are of type {@link AAS.IdentifierKeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Asset Id</em>' reference list.
	 * @see AAS.AASPackage#getAssetInformation_SpecificAssetId()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IdentifierKeyValuePair> getSpecificAssetId();

	/**
	 * Returns the value of the '<em><b>Bill Of Material</b></em>' reference list.
	 * The list contents are of type {@link AAS.Submodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Of Material</em>' reference list.
	 * @see AAS.AASPackage#getAssetInformation_BillOfMaterial()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Submodel> getBillOfMaterial();

	/**
	 * Returns the value of the '<em><b>Default Thumbnail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Thumbnail</em>' reference.
	 * @see #setDefaultThumbnail(File)
	 * @see AAS.AASPackage#getAssetInformation_DefaultThumbnail()
	 * @model
	 * @generated
	 */
	File getDefaultThumbnail();

	/**
	 * Sets the value of the '{@link AAS.AssetInformation#getDefaultThumbnail <em>Default Thumbnail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Thumbnail</em>' reference.
	 * @see #getDefaultThumbnail()
	 * @generated
	 */
	void setDefaultThumbnail(File value);

} // AssetInformation
