/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.IdentifierKeyValuePair;
import AAS.Reference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.IdentifierKeyValuePairImpl#getKey <em>Key</em>}</li>
 *   <li>{@link AAS.impl.IdentifierKeyValuePairImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AAS.impl.IdentifierKeyValuePairImpl#getExternalSubjectId <em>External Subject Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierKeyValuePairImpl extends HasSemanticsImpl implements IdentifierKeyValuePair {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

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
	 * The cached value of the '{@link #getExternalSubjectId() <em>External Subject Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalSubjectId()
	 * @generated
	 * @ordered
	 */
	protected Reference externalSubjectId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierKeyValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.IDENTIFIER_KEY_VALUE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.IDENTIFIER_KEY_VALUE_PAIR__KEY, oldKey, key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.IDENTIFIER_KEY_VALUE_PAIR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getExternalSubjectId() {
		return externalSubjectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalSubjectId(Reference newExternalSubjectId, NotificationChain msgs) {
		Reference oldExternalSubjectId = externalSubjectId;
		externalSubjectId = newExternalSubjectId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID, oldExternalSubjectId, newExternalSubjectId);
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
	public void setExternalSubjectId(Reference newExternalSubjectId) {
		if (newExternalSubjectId != externalSubjectId) {
			NotificationChain msgs = null;
			if (externalSubjectId != null)
				msgs = ((InternalEObject)externalSubjectId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID, null, msgs);
			if (newExternalSubjectId != null)
				msgs = ((InternalEObject)newExternalSubjectId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID, null, msgs);
			msgs = basicSetExternalSubjectId(newExternalSubjectId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID, newExternalSubjectId, newExternalSubjectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID:
				return basicSetExternalSubjectId(null, msgs);
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
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__KEY:
				return getKey();
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__VALUE:
				return getValue();
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID:
				return getExternalSubjectId();
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
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__KEY:
				setKey((String)newValue);
				return;
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__VALUE:
				setValue((String)newValue);
				return;
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID:
				setExternalSubjectId((Reference)newValue);
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
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID:
				setExternalSubjectId((Reference)null);
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
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR__EXTERNAL_SUBJECT_ID:
				return externalSubjectId != null;
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
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IdentifierKeyValuePairImpl
