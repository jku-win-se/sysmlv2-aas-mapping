/**
 */
package AAS;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.NodeId#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link AAS.NodeId#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link AAS.NodeId#getIdType <em>Id Type</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getNodeId()
 * @model
 * @generated
 */
public interface NodeId extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(BigInteger)
	 * @see AAS.AASPackage#getNodeId_Namespace()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNamespace();

	/**
	 * Sets the value of the '{@link AAS.NodeId#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see AAS.AASPackage#getNodeId_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link AAS.NodeId#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.IdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see AAS.IdType
	 * @see #setIdType(IdType)
	 * @see AAS.AASPackage#getNodeId_IdType()
	 * @model required="true"
	 * @generated
	 */
	IdType getIdType();

	/**
	 * Sets the value of the '{@link AAS.NodeId#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see AAS.IdType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(IdType value);

} // NodeId
