/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lang String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.LangString#getLang <em>Lang</em>}</li>
 *   <li>{@link AAS.LangString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getLangString()
 * @model
 * @generated
 */
public interface LangString extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.LangEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see AAS.LangEnum
	 * @see #setLang(LangEnum)
	 * @see AAS.AASPackage#getLangString_Lang()
	 * @model required="true"
	 * @generated
	 */
	LangEnum getLang();

	/**
	 * Sets the value of the '{@link AAS.LangString#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see AAS.LangEnum
	 * @see #getLang()
	 * @generated
	 */
	void setLang(LangEnum value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see AAS.AASPackage#getLangString_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AAS.LangString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LangString
