/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Identifiable#getAdministration <em>Administration</em>}</li>
 *   <li>{@link AAS.Identifiable#getIdentification <em>Identification</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends Referable {
	/**
	 * Returns the value of the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration</em>' containment reference.
	 * @see #setAdministration(AdministrativeInformation)
	 * @see AAS.AASPackage#getIdentifiable_Administration()
	 * @model containment="true"
	 * @generated
	 */
	AdministrativeInformation getAdministration();

	/**
	 * Sets the value of the '{@link AAS.Identifiable#getAdministration <em>Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration</em>' containment reference.
	 * @see #getAdministration()
	 * @generated
	 */
	void setAdministration(AdministrativeInformation value);

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' containment reference.
	 * @see #setIdentification(Identifier)
	 * @see AAS.AASPackage#getIdentifiable_Identification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getIdentification();

	/**
	 * Sets the value of the '{@link AAS.Identifiable#getIdentification <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' containment reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(Identifier value);

} // Identifiable
