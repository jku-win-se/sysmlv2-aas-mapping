/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Referable#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link AAS.Referable#getCategory <em>Category</em>}</li>
 *   <li>{@link AAS.Referable#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getReferable()
 * @model abstract="true"
 * @generated
 */
public interface Referable extends HasExtensions {
	/**
	 * Returns the value of the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Short</em>' attribute.
	 * @see #setIdShort(String)
	 * @see AAS.AASPackage#getReferable_IdShort()
	 * @model required="true"
	 * @generated
	 */
	String getIdShort();

	/**
	 * Sets the value of the '{@link AAS.Referable#getIdShort <em>Id Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Short</em>' attribute.
	 * @see #getIdShort()
	 * @generated
	 */
	void setIdShort(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see AAS.AASPackage#getReferable_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link AAS.Referable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.LangString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see AAS.AASPackage#getReferable_Description()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LangString> getDescription();

} // Referable
