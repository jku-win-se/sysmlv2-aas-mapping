/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.LangString;
import AAS.MultiLanguageProperty;
import AAS.Reference;

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
 * An implementation of the model object '<em><b>Multi Language Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.MultiLanguagePropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.impl.MultiLanguagePropertyImpl#getValueId <em>Value Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiLanguagePropertyImpl extends DataElementImpl implements MultiLanguageProperty {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<LangString> value;

	/**
	 * The cached value of the '{@link #getValueId() <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueId()
	 * @generated
	 * @ordered
	 */
	protected Reference valueId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiLanguagePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.MULTI_LANGUAGE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LangString> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<LangString>(LangString.class, this, AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueId() {
		return valueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueId(Reference newValueId, NotificationChain msgs) {
		Reference oldValueId = valueId;
		valueId = newValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID, oldValueId, newValueId);
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
	public void setValueId(Reference newValueId) {
		if (newValueId != valueId) {
			NotificationChain msgs = null;
			if (valueId != null)
				msgs = ((InternalEObject)valueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID, null, msgs);
			if (newValueId != null)
				msgs = ((InternalEObject)newValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID, null, msgs);
			msgs = basicSetValueId(newValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID, newValueId, newValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID:
				return basicSetValueId(null, msgs);
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
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE:
				return getValue();
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID:
				return getValueId();
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
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends LangString>)newValue);
				return;
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID:
				setValueId((Reference)newValue);
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
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE:
				getValue().clear();
				return;
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID:
				setValueId((Reference)null);
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
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE:
				return value != null && !value.isEmpty();
			case AASPackage.MULTI_LANGUAGE_PROPERTY__VALUE_ID:
				return valueId != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiLanguagePropertyImpl
