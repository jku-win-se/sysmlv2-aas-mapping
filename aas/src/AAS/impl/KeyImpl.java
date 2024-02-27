/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.Key;
import AAS.KeyElements;
import AAS.KeyType;
import AAS.Referable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.KeyImpl#getType <em>Type</em>}</li>
 *   <li>{@link AAS.impl.KeyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.impl.KeyImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link AAS.impl.KeyImpl#getReferable <em>Referable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final KeyElements TYPE_EDEFAULT = KeyElements.GLOBAL_REFERENCE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected KeyElements type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected static final KeyType ID_TYPE_EDEFAULT = KeyType.CUSTOM;

	/**
	 * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected KeyType idType = ID_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferable() <em>Referable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferable()
	 * @generated
	 * @ordered
	 */
	protected Referable referable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyElements getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(KeyElements newType) {
		KeyElements oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.KEY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.KEY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyType getIdType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdType(KeyType newIdType) {
		KeyType oldIdType = idType;
		idType = newIdType == null ? ID_TYPE_EDEFAULT : newIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.KEY__ID_TYPE, oldIdType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referable getReferable() {
		if (referable != null && referable.eIsProxy()) {
			InternalEObject oldReferable = (InternalEObject)referable;
			referable = (Referable)eResolveProxy(oldReferable);
			if (referable != oldReferable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.KEY__REFERABLE, oldReferable, referable));
			}
		}
		return referable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable basicGetReferable() {
		return referable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferable(Referable newReferable) {
		Referable oldReferable = referable;
		referable = newReferable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.KEY__REFERABLE, oldReferable, referable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.KEY__TYPE:
				return getType();
			case AASPackage.KEY__VALUE:
				return getValue();
			case AASPackage.KEY__ID_TYPE:
				return getIdType();
			case AASPackage.KEY__REFERABLE:
				if (resolve) return getReferable();
				return basicGetReferable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AASPackage.KEY__TYPE:
				setType((KeyElements)newValue);
				return;
			case AASPackage.KEY__VALUE:
				setValue((String)newValue);
				return;
			case AASPackage.KEY__ID_TYPE:
				setIdType((KeyType)newValue);
				return;
			case AASPackage.KEY__REFERABLE:
				setReferable((Referable)newValue);
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
			case AASPackage.KEY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AASPackage.KEY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AASPackage.KEY__ID_TYPE:
				setIdType(ID_TYPE_EDEFAULT);
				return;
			case AASPackage.KEY__REFERABLE:
				setReferable((Referable)null);
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
			case AASPackage.KEY__TYPE:
				return type != TYPE_EDEFAULT;
			case AASPackage.KEY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AASPackage.KEY__ID_TYPE:
				return idType != ID_TYPE_EDEFAULT;
			case AASPackage.KEY__REFERABLE:
				return referable != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", idType: ");
		result.append(idType);
		result.append(')');
		return result.toString();
	}

} //KeyImpl
