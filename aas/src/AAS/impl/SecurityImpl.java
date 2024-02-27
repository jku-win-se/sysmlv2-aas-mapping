/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.AccessControlPolicyPoints;
import AAS.Certificate;
import AAS.Reference;
import AAS.Security;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.SecurityImpl#getAccessControlPolicyPoints <em>Access Control Policy Points</em>}</li>
 *   <li>{@link AAS.impl.SecurityImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link AAS.impl.SecurityImpl#getRequiredCertificateExtension <em>Required Certificate Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityImpl extends MinimalEObjectImpl.Container implements Security {
	/**
	 * The cached value of the '{@link #getAccessControlPolicyPoints() <em>Access Control Policy Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 * @ordered
	 */
	protected AccessControlPolicyPoints accessControlPolicyPoints;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificate> certificate;

	/**
	 * The cached value of the '{@link #getRequiredCertificateExtension() <em>Required Certificate Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCertificateExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> requiredCertificateExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.SECURITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControlPolicyPoints getAccessControlPolicyPoints() {
		return accessControlPolicyPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControlPolicyPoints(AccessControlPolicyPoints newAccessControlPolicyPoints, NotificationChain msgs) {
		AccessControlPolicyPoints oldAccessControlPolicyPoints = accessControlPolicyPoints;
		accessControlPolicyPoints = newAccessControlPolicyPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS, oldAccessControlPolicyPoints, newAccessControlPolicyPoints);
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
	public void setAccessControlPolicyPoints(AccessControlPolicyPoints newAccessControlPolicyPoints) {
		if (newAccessControlPolicyPoints != accessControlPolicyPoints) {
			NotificationChain msgs = null;
			if (accessControlPolicyPoints != null)
				msgs = ((InternalEObject)accessControlPolicyPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS, null, msgs);
			if (newAccessControlPolicyPoints != null)
				msgs = ((InternalEObject)newAccessControlPolicyPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS, null, msgs);
			msgs = basicSetAccessControlPolicyPoints(newAccessControlPolicyPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS, newAccessControlPolicyPoints, newAccessControlPolicyPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Certificate> getCertificate() {
		if (certificate == null) {
			certificate = new EObjectContainmentEList<Certificate>(Certificate.class, this, AASPackage.SECURITY__CERTIFICATE);
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRequiredCertificateExtension() {
		if (requiredCertificateExtension == null) {
			requiredCertificateExtension = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION);
		}
		return requiredCertificateExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS:
				return basicSetAccessControlPolicyPoints(null, msgs);
			case AASPackage.SECURITY__CERTIFICATE:
				return ((InternalEList<?>)getCertificate()).basicRemove(otherEnd, msgs);
			case AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION:
				return ((InternalEList<?>)getRequiredCertificateExtension()).basicRemove(otherEnd, msgs);
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
			case AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS:
				return getAccessControlPolicyPoints();
			case AASPackage.SECURITY__CERTIFICATE:
				return getCertificate();
			case AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION:
				return getRequiredCertificateExtension();
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
			case AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS:
				setAccessControlPolicyPoints((AccessControlPolicyPoints)newValue);
				return;
			case AASPackage.SECURITY__CERTIFICATE:
				getCertificate().clear();
				getCertificate().addAll((Collection<? extends Certificate>)newValue);
				return;
			case AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION:
				getRequiredCertificateExtension().clear();
				getRequiredCertificateExtension().addAll((Collection<? extends Reference>)newValue);
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
			case AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS:
				setAccessControlPolicyPoints((AccessControlPolicyPoints)null);
				return;
			case AASPackage.SECURITY__CERTIFICATE:
				getCertificate().clear();
				return;
			case AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION:
				getRequiredCertificateExtension().clear();
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
			case AASPackage.SECURITY__ACCESS_CONTROL_POLICY_POINTS:
				return accessControlPolicyPoints != null;
			case AASPackage.SECURITY__CERTIFICATE:
				return certificate != null && !certificate.isEmpty();
			case AASPackage.SECURITY__REQUIRED_CERTIFICATE_EXTENSION:
				return requiredCertificateExtension != null && !requiredCertificateExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityImpl
