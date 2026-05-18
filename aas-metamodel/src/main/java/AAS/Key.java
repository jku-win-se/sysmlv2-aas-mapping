/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Key#getType <em>Type</em>}</li>
 *   <li>{@link AAS.Key#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.Key#getIdType <em>Id Type</em>}</li>
 *   <li>{@link AAS.Key#getReferable <em>Referable</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.KeyElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see AAS.KeyElements
	 * @see #setType(KeyElements)
	 * @see AAS.AASPackage#getKey_Type()
	 * @model
	 * @generated
	 */
	KeyElements getType();

	/**
	 * Sets the value of the '{@link AAS.Key#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see AAS.KeyElements
	 * @see #getType()
	 * @generated
	 */
	void setType(KeyElements value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see AAS.AASPackage#getKey_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AAS.Key#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.KeyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see AAS.KeyType
	 * @see #setIdType(KeyType)
	 * @see AAS.AASPackage#getKey_IdType()
	 * @model
	 * @generated
	 */
	KeyType getIdType();

	/**
	 * Sets the value of the '{@link AAS.Key#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see AAS.KeyType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(KeyType value);

	/**
	 * Returns the value of the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * added as workaround for modeling relationships by references rather than id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referable</em>' reference.
	 * @see #setReferable(Referable)
	 * @see AAS.AASPackage#getKey_Referable()
	 * @model required="true"
	 * @generated
	 */
	Referable getReferable();

	/**
	 * Sets the value of the '{@link AAS.Key#getReferable <em>Referable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referable</em>' reference.
	 * @see #getReferable()
	 * @generated
	 */
	void setReferable(Referable value);

} // Key
