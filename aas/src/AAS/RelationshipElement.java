/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.RelationshipElement#getFirst <em>First</em>}</li>
 *   <li>{@link AAS.RelationshipElement#getSecond <em>Second</em>}</li>
 *   <li>{@link AAS.RelationshipElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getRelationshipElement()
 * @model
 * @generated
 */
public interface RelationshipElement extends SubmodelElement, ComposableElement {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(Reference)
	 * @see AAS.AASPackage#getRelationshipElement_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getFirst();

	/**
	 * Sets the value of the '{@link AAS.RelationshipElement#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Reference value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(Reference)
	 * @see AAS.AASPackage#getRelationshipElement_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSecond();

	/**
	 * Sets the value of the '{@link AAS.RelationshipElement#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Reference value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AAS.AASPackage#getRelationshipElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AAS.RelationshipElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RelationshipElement
