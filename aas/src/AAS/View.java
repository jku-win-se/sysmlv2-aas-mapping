/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.View#getContainedElement <em>Contained Element</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getView()
 * @model
 * @generated
 */
public interface View extends Referable, HasSemantics, HasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Contained Element</b></em>' reference list.
	 * The list contents are of type {@link AAS.Referable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Element</em>' reference list.
	 * @see AAS.AASPackage#getView_ContainedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Referable> getContainedElement();

} // View
