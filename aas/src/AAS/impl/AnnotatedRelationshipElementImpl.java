/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.AnnotatedRelationshipElement;
import AAS.DataElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.AnnotatedRelationshipElementImpl#getDataelement <em>Dataelement</em>}</li>
 *   <li>{@link AAS.impl.AnnotatedRelationshipElementImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedRelationshipElementImpl extends RelationshipElementImpl implements AnnotatedRelationshipElement {
	/**
	 * The cached value of the '{@link #getDataelement() <em>Dataelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataelement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElement> dataelement;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedRelationshipElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ANNOTATED_RELATIONSHIP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataElement> getDataelement() {
		if (dataelement == null) {
			dataelement = new EObjectResolvingEList<DataElement>(DataElement.class, this, AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT);
		}
		return dataelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT:
				return getDataelement();
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__NOTE:
				return getNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT:
				getDataelement().clear();
				getDataelement().addAll((Collection<? extends DataElement>)newValue);
				return;
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__NOTE:
				setNote((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT:
				getDataelement().clear();
				return;
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__DATAELEMENT:
				return dataelement != null && !dataelement.isEmpty();
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //AnnotatedRelationshipElementImpl
