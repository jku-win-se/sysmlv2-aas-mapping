/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.ConceptDescription#getIsCaseOf <em>Is Case Of</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getConceptDescription()
 * @model
 * @generated
 */
public interface ConceptDescription extends Identifiable, HasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Is Case Of</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Of</em>' containment reference list.
	 * @see AAS.AASPackage#getConceptDescription_IsCaseOf()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getIsCaseOf();

} // ConceptDescription
