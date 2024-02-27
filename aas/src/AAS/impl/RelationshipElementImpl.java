/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.ComposableElement;
import AAS.Reference;
import AAS.RelationshipElement;
import AAS.SubmodelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.RelationshipElementImpl#getSubmodelelement <em>Submodelelement</em>}</li>
 *   <li>{@link AAS.impl.RelationshipElementImpl#getFirst <em>First</em>}</li>
 *   <li>{@link AAS.impl.RelationshipElementImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link AAS.impl.RelationshipElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipElementImpl extends SubmodelElementImpl implements RelationshipElement {
	/**
	 * The cached value of the '{@link #getSubmodelelement() <em>Submodelelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodelelement()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmodelElement> submodelelement;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Reference first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Reference second;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.RELATIONSHIP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubmodelElement> getSubmodelelement() {
		if (submodelelement == null) {
			submodelelement = new EObjectContainmentEList<SubmodelElement>(SubmodelElement.class, this, AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT);
		}
		return submodelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(Reference newFirst, NotificationChain msgs) {
		Reference oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.RELATIONSHIP_ELEMENT__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirst(Reference newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.RELATIONSHIP_ELEMENT__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.RELATIONSHIP_ELEMENT__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.RELATIONSHIP_ELEMENT__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(Reference newSecond, NotificationChain msgs) {
		Reference oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.RELATIONSHIP_ELEMENT__SECOND, oldSecond, newSecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(Reference newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.RELATIONSHIP_ELEMENT__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.RELATIONSHIP_ELEMENT__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.RELATIONSHIP_ELEMENT__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.RELATIONSHIP_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT:
				return ((InternalEList<?>)getSubmodelelement()).basicRemove(otherEnd, msgs);
			case AASPackage.RELATIONSHIP_ELEMENT__FIRST:
				return basicSetFirst(null, msgs);
			case AASPackage.RELATIONSHIP_ELEMENT__SECOND:
				return basicSetSecond(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT:
				return getSubmodelelement();
			case AASPackage.RELATIONSHIP_ELEMENT__FIRST:
				return getFirst();
			case AASPackage.RELATIONSHIP_ELEMENT__SECOND:
				return getSecond();
			case AASPackage.RELATIONSHIP_ELEMENT__NAME:
				return getName();
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
			case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT:
				getSubmodelelement().clear();
				getSubmodelelement().addAll((Collection<? extends SubmodelElement>)newValue);
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__FIRST:
				setFirst((Reference)newValue);
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__SECOND:
				setSecond((Reference)newValue);
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__NAME:
				setName((String)newValue);
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
			case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT:
				getSubmodelelement().clear();
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__FIRST:
				setFirst((Reference)null);
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__SECOND:
				setSecond((Reference)null);
				return;
			case AASPackage.RELATIONSHIP_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT:
				return submodelelement != null && !submodelelement.isEmpty();
			case AASPackage.RELATIONSHIP_ELEMENT__FIRST:
				return first != null;
			case AASPackage.RELATIONSHIP_ELEMENT__SECOND:
				return second != null;
			case AASPackage.RELATIONSHIP_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComposableElement.class) {
			switch (derivedFeatureID) {
				case AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT: return AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ComposableElement.class) {
			switch (baseFeatureID) {
				case AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT: return AASPackage.RELATIONSHIP_ELEMENT__SUBMODELELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationshipElementImpl
