/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Extensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * added
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.HasExtensions#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getHasExtensions()
 * @model abstract="true"
 * @generated
 */
public interface HasExtensions extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link AAS.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see AAS.AASPackage#getHasExtensions_Extension()
	 * @model
	 * @generated
	 */
	EList<Extension> getExtension();

} // HasExtensions
