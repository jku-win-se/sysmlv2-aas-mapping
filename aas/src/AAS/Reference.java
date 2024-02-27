/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Reference#getKey <em>Key</em>}</li>
 *   <li>{@link AAS.Reference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Key}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see AAS.AASPackage#getReference_Key()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Key> getKey();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AAS.AASPackage#getReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AAS.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Reference
