/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * There is no asset in Basyx
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Asset#getKind <em>Kind</em>}</li>
 *   <li>{@link AAS.Asset#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends Identifiable, HasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.AssetKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see AAS.AssetKind
	 * @see #setKind(AssetKind)
	 * @see AAS.AASPackage#getAsset_Kind()
	 * @model required="true"
	 * @generated
	 */
	AssetKind getKind();

	/**
	 * Sets the value of the '{@link AAS.Asset#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see AAS.AssetKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AssetKind value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see AAS.AASPackage#getAsset_Endpoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Endpoint> getEndpoint();

} // Asset
