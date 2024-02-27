/**
 */
package AAS.impl;

import AAS.AASEndpoint;
import AAS.AASPackage;
import AAS.Asset;
import AAS.AssetAdministrationShell;
import AAS.AssetInformation;
import AAS.HasDataSpecification;
import AAS.Reference;
import AAS.Security;
import AAS.Submodel;

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
 * An implementation of the model object '<em><b>Asset Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getAssetInformation <em>Asset Information</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link AAS.impl.AssetAdministrationShellImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAdministrationShellImpl extends IdentifiableImpl implements AssetAdministrationShell {
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
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected AssetAdministrationShell derivedFrom;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Security security;

	/**
	 * The cached value of the '{@link #getAssetInformation() <em>Asset Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInformation()
	 * @generated
	 * @ordered
	 */
	protected AssetInformation assetInformation;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The cached value of the '{@link #getSubmodel() <em>Submodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<Submodel> submodel;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected AASEndpoint endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAdministrationShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ASSET_ADMINISTRATION_SHELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION);
		}
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetAdministrationShell getDerivedFrom() {
		if (derivedFrom != null && derivedFrom.eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (AssetAdministrationShell)eResolveProxy(oldDerivedFrom);
			if (derivedFrom != oldDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
			}
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAdministrationShell basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedFrom(AssetAdministrationShell newDerivedFrom) {
		AssetAdministrationShell oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security getSecurity() {
		if (security != null && security.eIsProxy()) {
			InternalEObject oldSecurity = (InternalEObject)security;
			security = (Security)eResolveProxy(oldSecurity);
			if (security != oldSecurity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, oldSecurity, security));
			}
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security basicGetSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Security newSecurity) {
		Security oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetInformation getAssetInformation() {
		return assetInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetInformation(AssetInformation newAssetInformation, NotificationChain msgs) {
		AssetInformation oldAssetInformation = assetInformation;
		assetInformation = newAssetInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION, oldAssetInformation, newAssetInformation);
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
	public void setAssetInformation(AssetInformation newAssetInformation) {
		if (newAssetInformation != assetInformation) {
			NotificationChain msgs = null;
			if (assetInformation != null)
				msgs = ((InternalEObject)assetInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION, null, msgs);
			if (newAssetInformation != null)
				msgs = ((InternalEObject)newAssetInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION, null, msgs);
			msgs = basicSetAssetInformation(newAssetInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION, newAssetInformation, newAssetInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET, oldAsset, newAsset);
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
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET, null, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET, null, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Submodel> getSubmodel() {
		if (submodel == null) {
			submodel = new EObjectContainmentEList<Submodel>(Submodel.class, this, AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL);
		}
		return submodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AASEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(AASEndpoint newEndpoint, NotificationChain msgs) {
		AASEndpoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT, oldEndpoint, newEndpoint);
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
	public void setEndpoint(AASEndpoint newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				return ((InternalEList<?>)getDataSpecification()).basicRemove(otherEnd, msgs);
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
				return basicSetAssetInformation(null, msgs);
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return basicSetAsset(null, msgs);
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return ((InternalEList<?>)getSubmodel()).basicRemove(otherEnd, msgs);
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
				return basicSetEndpoint(null, msgs);
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
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				return getDataSpecification();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				if (resolve) return getSecurity();
				return basicGetSecurity();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
				return getAssetInformation();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return getAsset();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return getSubmodel();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
				return getEndpoint();
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
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends Reference>)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((AssetAdministrationShell)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((Security)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
				setAssetInformation((AssetInformation)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((Asset)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				getSubmodel().addAll((Collection<? extends Submodel>)newValue);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
				setEndpoint((AASEndpoint)newValue);
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
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((AssetAdministrationShell)null);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((Security)null);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
				setAssetInformation((AssetInformation)null);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((Asset)null);
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				return;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
				setEndpoint((AASEndpoint)null);
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
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				return derivedFrom != null;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return security != null;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
				return assetInformation != null;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return asset != null;
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return submodel != null && !submodel.isEmpty();
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
				return endpoint != null;
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
		if (baseClass == HasDataSpecification.class) {
			switch (derivedFeatureID) {
				case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION: return AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;
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
		if (baseClass == HasDataSpecification.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION: return AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssetAdministrationShellImpl
