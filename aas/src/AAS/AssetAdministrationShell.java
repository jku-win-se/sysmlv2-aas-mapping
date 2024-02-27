/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A project in Basyx
 * Basyx:
 * 
 * identifierType: IRDI (urn:...), URI, custom
 * identifier (for submodel or operation) ->generated automatically
 * resource name
 * idshort: string -> generated automatically
 * category:string
 * description:string
 * parent: not used
 * administration: not used
 * 
 * 
 * 
 * Security is not implemented, but is an ongoing project
 * 0 < port  <= 65535
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link AAS.AssetAdministrationShell#getSecurity <em>Security</em>}</li>
 *   <li>{@link AAS.AssetAdministrationShell#getAssetInformation <em>Asset Information</em>}</li>
 *   <li>{@link AAS.AssetAdministrationShell#getAsset <em>Asset</em>}</li>
 *   <li>{@link AAS.AssetAdministrationShell#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link AAS.AssetAdministrationShell#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAssetAdministrationShell()
 * @model
 * @generated
 */
public interface AssetAdministrationShell extends Identifiable, HasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference.
	 * @see #setDerivedFrom(AssetAdministrationShell)
	 * @see AAS.AASPackage#getAssetAdministrationShell_DerivedFrom()
	 * @model
	 * @generated
	 */
	AssetAdministrationShell getDerivedFrom();

	/**
	 * Sets the value of the '{@link AAS.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(AssetAdministrationShell value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' reference.
	 * @see #setSecurity(Security)
	 * @see AAS.AASPackage#getAssetAdministrationShell_Security()
	 * @model
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link AAS.AssetAdministrationShell#getSecurity <em>Security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>Asset Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Information</em>' containment reference.
	 * @see #setAssetInformation(AssetInformation)
	 * @see AAS.AASPackage#getAssetAdministrationShell_AssetInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssetInformation getAssetInformation();

	/**
	 * Sets the value of the '{@link AAS.AssetAdministrationShell#getAssetInformation <em>Asset Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Information</em>' containment reference.
	 * @see #getAssetInformation()
	 * @generated
	 */
	void setAssetInformation(AssetInformation value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see #setAsset(Asset)
	 * @see AAS.AASPackage#getAssetAdministrationShell_Asset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link AAS.AssetAdministrationShell#getAsset <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' containment reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Submodel</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Submodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel</em>' containment reference list.
	 * @see AAS.AASPackage#getAssetAdministrationShell_Submodel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Submodel> getSubmodel();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(AASEndpoint)
	 * @see AAS.AASPackage#getAssetAdministrationShell_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	AASEndpoint getEndpoint();

	/**
	 * Sets the value of the '{@link AAS.AssetAdministrationShell#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(AASEndpoint value);

} // AssetAdministrationShell
