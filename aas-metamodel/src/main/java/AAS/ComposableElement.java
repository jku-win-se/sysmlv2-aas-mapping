/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.ComposableElement#getSubmodelelement <em>Submodelelement</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getComposableElement()
 * @model abstract="true"
 * @generated
 */
public interface ComposableElement extends SubmodelElement {
	/**
	 * Returns the value of the '<em><b>Submodelelement</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.SubmodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodelelement</em>' containment reference list.
	 * @see AAS.AASPackage#getComposableElement_Submodelelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmodelElement> getSubmodelelement();

} // ComposableElement
