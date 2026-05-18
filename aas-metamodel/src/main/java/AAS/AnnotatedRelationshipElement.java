/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * added to model custom relationships and annotate them using DataElements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.AnnotatedRelationshipElement#getDataelement <em>Dataelement</em>}</li>
 *   <li>{@link AAS.AnnotatedRelationshipElement#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAnnotatedRelationshipElement()
 * @model
 * @generated
 */
public interface AnnotatedRelationshipElement extends RelationshipElement {
	/**
	 * Returns the value of the '<em><b>Dataelement</b></em>' reference list.
	 * The list contents are of type {@link AAS.DataElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataelement</em>' reference list.
	 * @see AAS.AASPackage#getAnnotatedRelationshipElement_Dataelement()
	 * @model
	 * @generated
	 */
	EList<DataElement> getDataelement();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * added to identify custom relationship types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see AAS.AASPackage#getAnnotatedRelationshipElement_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link AAS.AnnotatedRelationshipElement#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

} // AnnotatedRelationshipElement
