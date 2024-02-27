/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.ComposableElement;
import AAS.Entity;
import AAS.EntityType;
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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.EntityImpl#getSubmodelelement <em>Submodelelement</em>}</li>
 *   <li>{@link AAS.impl.EntityImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends SubmodelElementImpl implements Entity {
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
	 * The default value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final EntityType ENTITY_TYPE_EDEFAULT = EntityType.SELF_MANAGED_ENTITY;

	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EntityType entityType = ENTITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubmodelElement> getSubmodelelement() {
		if (submodelelement == null) {
			submodelelement = new EObjectContainmentEList<SubmodelElement>(SubmodelElement.class, this, AASPackage.ENTITY__SUBMODELELEMENT);
		}
		return submodelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityType(EntityType newEntityType) {
		EntityType oldEntityType = entityType;
		entityType = newEntityType == null ? ENTITY_TYPE_EDEFAULT : newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ENTITY__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.ENTITY__SUBMODELELEMENT:
				return ((InternalEList<?>)getSubmodelelement()).basicRemove(otherEnd, msgs);
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
			case AASPackage.ENTITY__SUBMODELELEMENT:
				return getSubmodelelement();
			case AASPackage.ENTITY__ENTITY_TYPE:
				return getEntityType();
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
			case AASPackage.ENTITY__SUBMODELELEMENT:
				getSubmodelelement().clear();
				getSubmodelelement().addAll((Collection<? extends SubmodelElement>)newValue);
				return;
			case AASPackage.ENTITY__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
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
			case AASPackage.ENTITY__SUBMODELELEMENT:
				getSubmodelelement().clear();
				return;
			case AASPackage.ENTITY__ENTITY_TYPE:
				setEntityType(ENTITY_TYPE_EDEFAULT);
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
			case AASPackage.ENTITY__SUBMODELELEMENT:
				return submodelelement != null && !submodelelement.isEmpty();
			case AASPackage.ENTITY__ENTITY_TYPE:
				return entityType != ENTITY_TYPE_EDEFAULT;
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
				case AASPackage.ENTITY__SUBMODELELEMENT: return AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT;
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
				case AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT: return AASPackage.ENTITY__SUBMODELELEMENT;
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
		result.append(" (entityType: ");
		result.append(entityType);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
