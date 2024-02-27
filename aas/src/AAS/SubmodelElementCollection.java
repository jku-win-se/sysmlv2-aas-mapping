/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.SubmodelElementCollection#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link AAS.SubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getSubmodelElementCollection()
 * @model
 * @generated
 */
public interface SubmodelElementCollection extends SubmodelElement, ComposableElement {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property base_Property : uml::Property[?];property base_DataType : uml::DataType[?];
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see AAS.AASPackage#getSubmodelElementCollection_Ordered()
	 * @model required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link AAS.SubmodelElementCollection#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(boolean)
	 * @see AAS.AASPackage#getSubmodelElementCollection_AllowDuplicates()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowDuplicates();

	/**
	 * Sets the value of the '{@link AAS.SubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #isAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(boolean value);

} // SubmodelElementCollection
