/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Property#getValueType <em>Value Type</em>}</li>
 *   <li>{@link AAS.Property#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.Property#getValueId <em>Value Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends DataElement {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.DataTypeDefXsd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see AAS.DataTypeDefXsd
	 * @see #setValueType(DataTypeDefXsd)
	 * @see AAS.AASPackage#getProperty_ValueType()
	 * @model
	 * @generated
	 */
	DataTypeDefXsd getValueType();

	/**
	 * Sets the value of the '{@link AAS.Property#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see AAS.DataTypeDefXsd
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(DataTypeDefXsd value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see AAS.AASPackage#getProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AAS.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Reference)
	 * @see AAS.AASPackage#getProperty_ValueId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getValueId();

	/**
	 * Sets the value of the '{@link AAS.Property#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Reference value);

} // Property
