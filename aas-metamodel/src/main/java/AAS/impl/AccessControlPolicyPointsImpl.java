/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.AccessControl;
import AAS.AccessControlPolicyPoints;
import AAS.Submodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Policy Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#getLocalAccessControl <em>Local Access Control</em>}</li>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#isExternalAccessControl <em>External Access Control</em>}</li>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#isExternalInformationPoints <em>External Information Points</em>}</li>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#getInternalInformationPoint <em>Internal Information Point</em>}</li>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#isExternalPolicyDecisionPoints <em>External Policy Decision Points</em>}</li>
 *   <li>{@link AAS.impl.AccessControlPolicyPointsImpl#isExternalPolicyEnforcementPoint <em>External Policy Enforcement Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlPolicyPointsImpl extends MinimalEObjectImpl.Container implements AccessControlPolicyPoints {
	/**
	 * The cached value of the '{@link #getLocalAccessControl() <em>Local Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AccessControl localAccessControl;

	/**
	 * The default value of the '{@link #isExternalAccessControl() <em>External Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalAccessControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_ACCESS_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalAccessControl() <em>External Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalAccessControl()
	 * @generated
	 * @ordered
	 */
	protected boolean externalAccessControl = EXTERNAL_ACCESS_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternalInformationPoints() <em>External Information Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalInformationPoints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_INFORMATION_POINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalInformationPoints() <em>External Information Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalInformationPoints()
	 * @generated
	 * @ordered
	 */
	protected boolean externalInformationPoints = EXTERNAL_INFORMATION_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalInformationPoint() <em>Internal Information Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInformationPoint()
	 * @generated
	 * @ordered
	 */
	protected Submodel internalInformationPoint;

	/**
	 * The default value of the '{@link #isExternalPolicyDecisionPoints() <em>External Policy Decision Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalPolicyDecisionPoints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_POLICY_DECISION_POINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalPolicyDecisionPoints() <em>External Policy Decision Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalPolicyDecisionPoints()
	 * @generated
	 * @ordered
	 */
	protected boolean externalPolicyDecisionPoints = EXTERNAL_POLICY_DECISION_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternalPolicyEnforcementPoint() <em>External Policy Enforcement Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalPolicyEnforcementPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_POLICY_ENFORCEMENT_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalPolicyEnforcementPoint() <em>External Policy Enforcement Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalPolicyEnforcementPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean externalPolicyEnforcementPoint = EXTERNAL_POLICY_ENFORCEMENT_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlPolicyPointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControl getLocalAccessControl() {
		return localAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalAccessControl(AccessControl newLocalAccessControl, NotificationChain msgs) {
		AccessControl oldLocalAccessControl = localAccessControl;
		localAccessControl = newLocalAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL, oldLocalAccessControl, newLocalAccessControl);
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
	public void setLocalAccessControl(AccessControl newLocalAccessControl) {
		if (newLocalAccessControl != localAccessControl) {
			NotificationChain msgs = null;
			if (localAccessControl != null)
				msgs = ((InternalEObject)localAccessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL, null, msgs);
			if (newLocalAccessControl != null)
				msgs = ((InternalEObject)newLocalAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL, null, msgs);
			msgs = basicSetLocalAccessControl(newLocalAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL, newLocalAccessControl, newLocalAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternalAccessControl() {
		return externalAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalAccessControl(boolean newExternalAccessControl) {
		boolean oldExternalAccessControl = externalAccessControl;
		externalAccessControl = newExternalAccessControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL, oldExternalAccessControl, externalAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternalInformationPoints() {
		return externalInformationPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalInformationPoints(boolean newExternalInformationPoints) {
		boolean oldExternalInformationPoints = externalInformationPoints;
		externalInformationPoints = newExternalInformationPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS, oldExternalInformationPoints, externalInformationPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Submodel getInternalInformationPoint() {
		if (internalInformationPoint != null && internalInformationPoint.eIsProxy()) {
			InternalEObject oldInternalInformationPoint = (InternalEObject)internalInformationPoint;
			internalInformationPoint = (Submodel)eResolveProxy(oldInternalInformationPoint);
			if (internalInformationPoint != oldInternalInformationPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT, oldInternalInformationPoint, internalInformationPoint));
			}
		}
		return internalInformationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Submodel basicGetInternalInformationPoint() {
		return internalInformationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInformationPoint(Submodel newInternalInformationPoint) {
		Submodel oldInternalInformationPoint = internalInformationPoint;
		internalInformationPoint = newInternalInformationPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT, oldInternalInformationPoint, internalInformationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternalPolicyDecisionPoints() {
		return externalPolicyDecisionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalPolicyDecisionPoints(boolean newExternalPolicyDecisionPoints) {
		boolean oldExternalPolicyDecisionPoints = externalPolicyDecisionPoints;
		externalPolicyDecisionPoints = newExternalPolicyDecisionPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS, oldExternalPolicyDecisionPoints, externalPolicyDecisionPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternalPolicyEnforcementPoint() {
		return externalPolicyEnforcementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalPolicyEnforcementPoint(boolean newExternalPolicyEnforcementPoint) {
		boolean oldExternalPolicyEnforcementPoint = externalPolicyEnforcementPoint;
		externalPolicyEnforcementPoint = newExternalPolicyEnforcementPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT, oldExternalPolicyEnforcementPoint, externalPolicyEnforcementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				return basicSetLocalAccessControl(null, msgs);
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
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				return getLocalAccessControl();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL:
				return isExternalAccessControl();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS:
				return isExternalInformationPoints();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT:
				if (resolve) return getInternalInformationPoint();
				return basicGetInternalInformationPoint();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS:
				return isExternalPolicyDecisionPoints();
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT:
				return isExternalPolicyEnforcementPoint();
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
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				setLocalAccessControl((AccessControl)newValue);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL:
				setExternalAccessControl((Boolean)newValue);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS:
				setExternalInformationPoints((Boolean)newValue);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT:
				setInternalInformationPoint((Submodel)newValue);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS:
				setExternalPolicyDecisionPoints((Boolean)newValue);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT:
				setExternalPolicyEnforcementPoint((Boolean)newValue);
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
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				setLocalAccessControl((AccessControl)null);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL:
				setExternalAccessControl(EXTERNAL_ACCESS_CONTROL_EDEFAULT);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS:
				setExternalInformationPoints(EXTERNAL_INFORMATION_POINTS_EDEFAULT);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT:
				setInternalInformationPoint((Submodel)null);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS:
				setExternalPolicyDecisionPoints(EXTERNAL_POLICY_DECISION_POINTS_EDEFAULT);
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT:
				setExternalPolicyEnforcementPoint(EXTERNAL_POLICY_ENFORCEMENT_POINT_EDEFAULT);
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
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				return localAccessControl != null;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL:
				return externalAccessControl != EXTERNAL_ACCESS_CONTROL_EDEFAULT;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS:
				return externalInformationPoints != EXTERNAL_INFORMATION_POINTS_EDEFAULT;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT:
				return internalInformationPoint != null;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS:
				return externalPolicyDecisionPoints != EXTERNAL_POLICY_DECISION_POINTS_EDEFAULT;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT:
				return externalPolicyEnforcementPoint != EXTERNAL_POLICY_ENFORCEMENT_POINT_EDEFAULT;
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
		result.append(" (externalAccessControl: ");
		result.append(externalAccessControl);
		result.append(", externalInformationPoints: ");
		result.append(externalInformationPoints);
		result.append(", externalPolicyDecisionPoints: ");
		result.append(externalPolicyDecisionPoints);
		result.append(", externalPolicyEnforcementPoint: ");
		result.append(externalPolicyEnforcementPoint);
		result.append(')');
		return result.toString();
	}

} //AccessControlPolicyPointsImpl
