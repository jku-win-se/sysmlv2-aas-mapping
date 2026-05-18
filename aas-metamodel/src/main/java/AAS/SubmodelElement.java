/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.SubmodelElement#isIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link AAS.SubmodelElement#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link AAS.SubmodelElement#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getSubmodelElement()
 * @model abstract="true"
 * @generated
 */
public interface SubmodelElement extends Referable, HasKind, HasSemantics, HasDataSpecification, Qualifiable {
	/**
	 * Returns the value of the '<em><b>Is Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dynamic</em>' attribute.
	 * @see #setIsDynamic(boolean)
	 * @see AAS.AASPackage#getSubmodelElement_IsDynamic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDynamic();

	/**
	 * Sets the value of the '{@link AAS.SubmodelElement#isIsDynamic <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dynamic</em>' attribute.
	 * @see #isIsDynamic()
	 * @generated
	 */
	void setIsDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' containment reference.
	 * @see #setEndPoint(Endpoint)
	 * @see AAS.AASPackage#getSubmodelElement_EndPoint()
	 * @model containment="true"
	 * @generated
	 */
	Endpoint getEndPoint();

	/**
	 * Sets the value of the '{@link AAS.SubmodelElement#getEndPoint <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' containment reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #setNodeId(NodeId)
	 * @see AAS.AASPackage#getSubmodelElement_NodeId()
	 * @model containment="true"
	 * @generated
	 */
	NodeId getNodeId();

	/**
	 * Sets the value of the '{@link AAS.SubmodelElement#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(NodeId value);

} // SubmodelElement
