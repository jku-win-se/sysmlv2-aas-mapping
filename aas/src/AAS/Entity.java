/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Entity#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends SubmodelElement, ComposableElement {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see AAS.EntityType
	 * @see #setEntityType(EntityType)
	 * @see AAS.AASPackage#getEntity_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link AAS.Entity#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see AAS.EntityType
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

} // Entity
