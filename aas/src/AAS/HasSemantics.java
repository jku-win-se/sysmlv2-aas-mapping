/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * semanticid is present in Basyx but not used
 * semanticid should be typed by an URI or a refereable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.HasSemantics#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getHasSemantics()
 * @model abstract="true"
 * @generated
 */
public interface HasSemantics extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * changed, non-breaking, set as optional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Id</em>' containment reference.
	 * @see #setSemanticId(Reference)
	 * @see AAS.AASPackage#getHasSemantics_SemanticId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSemanticId();

	/**
	 * Sets the value of the '{@link AAS.HasSemantics#getSemanticId <em>Semantic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Id</em>' containment reference.
	 * @see #getSemanticId()
	 * @generated
	 */
	void setSemanticId(Reference value);

} // HasSemantics
