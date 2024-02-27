/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Identifier#getIdType <em>Id Type</em>}</li>
 *   <li>{@link AAS.Identifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see AAS.IdentifierType
	 * @see #setIdType(IdentifierType)
	 * @see AAS.AASPackage#getIdentifier_IdType()
	 * @model required="true"
	 * @generated
	 */
	IdentifierType getIdType();

	/**
	 * Sets the value of the '{@link AAS.Identifier#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see AAS.IdentifierType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AAS.AASPackage#getIdentifier_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AAS.Identifier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Identifier
