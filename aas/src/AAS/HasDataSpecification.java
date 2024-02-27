/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Data Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.HasDataSpecification#getDataSpecification <em>Data Specification</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getHasDataSpecification()
 * @model abstract="true"
 * @generated
 */
public interface HasDataSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Specification</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Specification</em>' containment reference list.
	 * @see AAS.AASPackage#getHasDataSpecification_DataSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getDataSpecification();

} // HasDataSpecification
