/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.IdentifierKeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link AAS.IdentifierKeyValuePair#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.IdentifierKeyValuePair#getExternalSubjectId <em>External Subject Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getIdentifierKeyValuePair()
 * @model
 * @generated
 */
public interface IdentifierKeyValuePair extends HasSemantics {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see AAS.AASPackage#getIdentifierKeyValuePair_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link AAS.IdentifierKeyValuePair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see AAS.AASPackage#getIdentifierKeyValuePair_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AAS.IdentifierKeyValuePair#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>External Subject Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Subject Id</em>' containment reference.
	 * @see #setExternalSubjectId(Reference)
	 * @see AAS.AASPackage#getIdentifierKeyValuePair_ExternalSubjectId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getExternalSubjectId();

	/**
	 * Sets the value of the '{@link AAS.IdentifierKeyValuePair#getExternalSubjectId <em>External Subject Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Subject Id</em>' containment reference.
	 * @see #getExternalSubjectId()
	 * @generated
	 */
	void setExternalSubjectId(Reference value);

} // IdentifierKeyValuePair
