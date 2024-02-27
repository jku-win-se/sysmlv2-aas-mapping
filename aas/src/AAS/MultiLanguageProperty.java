/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Language Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.MultiLanguageProperty#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.MultiLanguageProperty#getValueId <em>Value Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getMultiLanguageProperty()
 * @model
 * @generated
 */
public interface MultiLanguageProperty extends DataElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.LangString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see AAS.AASPackage#getMultiLanguageProperty_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<LangString> getValue();

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Reference)
	 * @see AAS.AASPackage#getMultiLanguageProperty_ValueId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getValueId();

	/**
	 * Sets the value of the '{@link AAS.MultiLanguageProperty#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Reference value);

} // MultiLanguageProperty
