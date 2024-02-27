/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Reference Pair Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.ValueReferencePairType#getValueId <em>Value Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getValueReferencePairType()
 * @model
 * @generated
 */
public interface ValueReferencePairType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property value : uml::ValueSpecification[1];
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Reference)
	 * @see AAS.AASPackage#getValueReferencePairType_ValueId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getValueId();

	/**
	 * Sets the value of the '{@link AAS.ValueReferencePairType#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Reference value);

} // ValueReferencePairType
