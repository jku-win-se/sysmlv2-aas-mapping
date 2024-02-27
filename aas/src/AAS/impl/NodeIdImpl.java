/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.IdType;
import AAS.NodeId;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.NodeIdImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link AAS.impl.NodeIdImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link AAS.impl.NodeIdImpl#getIdType <em>Id Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeIdImpl extends MinimalEObjectImpl.Container implements NodeId {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected BigInteger namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected static final IdType ID_TYPE_EDEFAULT = IdType.STRING;

	/**
	 * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected IdType idType = ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.NODE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(BigInteger newNamespace) {
		BigInteger oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.NODE_ID__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.NODE_ID__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdType getIdType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdType(IdType newIdType) {
		IdType oldIdType = idType;
		idType = newIdType == null ? ID_TYPE_EDEFAULT : newIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.NODE_ID__ID_TYPE, oldIdType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.NODE_ID__NAMESPACE:
				return getNamespace();
			case AASPackage.NODE_ID__IDENTIFIER:
				return getIdentifier();
			case AASPackage.NODE_ID__ID_TYPE:
				return getIdType();
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
			case AASPackage.NODE_ID__NAMESPACE:
				setNamespace((BigInteger)newValue);
				return;
			case AASPackage.NODE_ID__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case AASPackage.NODE_ID__ID_TYPE:
				setIdType((IdType)newValue);
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
			case AASPackage.NODE_ID__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case AASPackage.NODE_ID__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case AASPackage.NODE_ID__ID_TYPE:
				setIdType(ID_TYPE_EDEFAULT);
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
			case AASPackage.NODE_ID__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case AASPackage.NODE_ID__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case AASPackage.NODE_ID__ID_TYPE:
				return idType != ID_TYPE_EDEFAULT;
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", idType: ");
		result.append(idType);
		result.append(')');
		return result.toString();
	}

} //NodeIdImpl
