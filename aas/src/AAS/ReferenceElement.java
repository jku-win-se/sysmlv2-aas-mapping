/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.ReferenceElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getReferenceElement()
 * @model
 * @generated
 */
public interface ReferenceElement extends DataElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Reference)
	 * @see AAS.AASPackage#getReferenceElement_Value()
	 * @model containment="true"
	 * @generated
	 */
	Reference getValue();

	/**
	 * Sets the value of the '{@link AAS.ReferenceElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Reference value);

} // ReferenceElement
