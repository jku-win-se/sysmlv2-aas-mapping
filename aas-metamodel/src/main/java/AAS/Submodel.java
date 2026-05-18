/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model in Basyx
 * Basyx:
 * 
 * identifierType: IRDI (urn:...), URI, custom
 * identifier (for submodel or operation) ->generated automatically
 * resource name
 * idshort: string -> generated automatically
 * category:string
 * description:string
 * parent: not used
 * administration: not used
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Submodel#getSubmodelelement <em>Submodelelement</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getSubmodel()
 * @model
 * @generated
 */
public interface Submodel extends Identifiable, HasKind, HasSemantics, HasDataSpecification, Qualifiable {
	/**
	 * Returns the value of the '<em><b>Submodelelement</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.SubmodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodelelement</em>' containment reference list.
	 * @see AAS.AASPackage#getSubmodel_Submodelelement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SubmodelElement> getSubmodelelement();

} // Submodel
