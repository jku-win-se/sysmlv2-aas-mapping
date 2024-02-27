/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.HasKind#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getHasKind()
 * @model abstract="true"
 * @generated
 */
public interface HasKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.ModelingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see AAS.ModelingKind
	 * @see #setKind(ModelingKind)
	 * @see AAS.AASPackage#getHasKind_Kind()
	 * @model
	 * @generated
	 */
	ModelingKind getKind();

	/**
	 * Sets the value of the '{@link AAS.HasKind#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see AAS.ModelingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ModelingKind value);

} // HasKind
