/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.ComposableElement;
import AAS.Event;
import AAS.SubmodelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.EventImpl#getSubmodelelement <em>Submodelelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventImpl extends SubmodelElementImpl implements Event {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubmodelElement> getSubmodelelement() {
		if (submodelelement == null) {
			submodelelement = new EObjectContainmentEList<SubmodelElement>(SubmodelElement.class, this, AASPackage.EVENT__SUBMODELELEMENT);
		}
		return submodelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.EVENT__SUBMODELELEMENT:
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
			case AASPackage.EVENT__SUBMODELELEMENT:
				return getSubmodelelement();
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
			case AASPackage.EVENT__SUBMODELELEMENT:
				getSubmodelelement().clear();
				getSubmodelelement().addAll((Collection<? extends SubmodelElement>)newValue);
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
			case AASPackage.EVENT__SUBMODELELEMENT:
				getSubmodelelement().clear();
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
			case AASPackage.EVENT__SUBMODELELEMENT:
				return submodelelement != null && !submodelelement.isEmpty();
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
				case AASPackage.EVENT__SUBMODELELEMENT: return AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT;
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
				case AASPackage.COMPOSABLE_ELEMENT__SUBMODELELEMENT: return AASPackage.EVENT__SUBMODELELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EventImpl
