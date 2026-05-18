/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.HasDataSpecification;
import AAS.HasSemantics;
import AAS.Referable;
import AAS.Reference;
import AAS.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.ViewImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link AAS.impl.ViewImpl#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link AAS.impl.ViewImpl#getContainedElement <em>Contained Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends ReferableImpl implements View {
	/**
	 * The cached value of the '{@link #getSemanticId() <em>Semantic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticId()
	 * @generated
	 * @ordered
	 */
	protected Reference semanticId;

	/**
	 * The cached value of the '{@link #getDataSpecification() <em>Data Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> dataSpecification;

	/**
	 * The cached value of the '{@link #getContainedElement() <em>Contained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Referable> containedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSemanticId() {
		return semanticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticId(Reference newSemanticId, NotificationChain msgs) {
		Reference oldSemanticId = semanticId;
		semanticId = newSemanticId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.VIEW__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
	public void setSemanticId(Reference newSemanticId) {
		if (newSemanticId != semanticId) {
			NotificationChain msgs = null;
			if (semanticId != null)
				msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.VIEW__SEMANTIC_ID, null, msgs);
			if (newSemanticId != null)
				msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.VIEW__SEMANTIC_ID, null, msgs);
			msgs = basicSetSemanticId(newSemanticId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.VIEW__SEMANTIC_ID, newSemanticId, newSemanticId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.VIEW__DATA_SPECIFICATION);
		}
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Referable> getContainedElement() {
		if (containedElement == null) {
			containedElement = new EObjectResolvingEList<Referable>(Referable.class, this, AASPackage.VIEW__CONTAINED_ELEMENT);
		}
		return containedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.VIEW__SEMANTIC_ID:
				return basicSetSemanticId(null, msgs);
			case AASPackage.VIEW__DATA_SPECIFICATION:
				return ((InternalEList<?>)getDataSpecification()).basicRemove(otherEnd, msgs);
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
			case AASPackage.VIEW__SEMANTIC_ID:
				return getSemanticId();
			case AASPackage.VIEW__DATA_SPECIFICATION:
				return getDataSpecification();
			case AASPackage.VIEW__CONTAINED_ELEMENT:
				return getContainedElement();
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
			case AASPackage.VIEW__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AASPackage.VIEW__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends Reference>)newValue);
				return;
			case AASPackage.VIEW__CONTAINED_ELEMENT:
				getContainedElement().clear();
				getContainedElement().addAll((Collection<? extends Referable>)newValue);
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
			case AASPackage.VIEW__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AASPackage.VIEW__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case AASPackage.VIEW__CONTAINED_ELEMENT:
				getContainedElement().clear();
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
			case AASPackage.VIEW__SEMANTIC_ID:
				return semanticId != null;
			case AASPackage.VIEW__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case AASPackage.VIEW__CONTAINED_ELEMENT:
				return containedElement != null && !containedElement.isEmpty();
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
		if (baseClass == HasSemantics.class) {
			switch (derivedFeatureID) {
				case AASPackage.VIEW__SEMANTIC_ID: return AASPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == HasDataSpecification.class) {
			switch (derivedFeatureID) {
				case AASPackage.VIEW__DATA_SPECIFICATION: return AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;
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
		if (baseClass == HasSemantics.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_SEMANTICS__SEMANTIC_ID: return AASPackage.VIEW__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == HasDataSpecification.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION: return AASPackage.VIEW__DATA_SPECIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ViewImpl
