/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.AssetInformation;
import AAS.AssetKind;
import AAS.File;
import AAS.IdentifierKeyValuePair;
import AAS.Reference;
import AAS.Submodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.AssetInformationImpl#getAssetKind <em>Asset Kind</em>}</li>
 *   <li>{@link AAS.impl.AssetInformationImpl#getGlobalAssetId <em>Global Asset Id</em>}</li>
 *   <li>{@link AAS.impl.AssetInformationImpl#getSpecificAssetId <em>Specific Asset Id</em>}</li>
 *   <li>{@link AAS.impl.AssetInformationImpl#getBillOfMaterial <em>Bill Of Material</em>}</li>
 *   <li>{@link AAS.impl.AssetInformationImpl#getDefaultThumbnail <em>Default Thumbnail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetInformationImpl extends MinimalEObjectImpl.Container implements AssetInformation {
	/**
	 * The default value of the '{@link #getAssetKind() <em>Asset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetKind()
	 * @generated
	 * @ordered
	 */
	protected static final AssetKind ASSET_KIND_EDEFAULT = AssetKind.TYPE;

	/**
	 * The cached value of the '{@link #getAssetKind() <em>Asset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetKind()
	 * @generated
	 * @ordered
	 */
	protected AssetKind assetKind = ASSET_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalAssetId() <em>Global Asset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAssetId()
	 * @generated
	 * @ordered
	 */
	protected Reference globalAssetId;

	/**
	 * The cached value of the '{@link #getSpecificAssetId() <em>Specific Asset Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificAssetId()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierKeyValuePair> specificAssetId;

	/**
	 * The cached value of the '{@link #getBillOfMaterial() <em>Bill Of Material</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillOfMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<Submodel> billOfMaterial;

	/**
	 * The cached value of the '{@link #getDefaultThumbnail() <em>Default Thumbnail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultThumbnail()
	 * @generated
	 * @ordered
	 */
	protected File defaultThumbnail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ASSET_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetKind getAssetKind() {
		return assetKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetKind(AssetKind newAssetKind) {
		AssetKind oldAssetKind = assetKind;
		assetKind = newAssetKind == null ? ASSET_KIND_EDEFAULT : newAssetKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_INFORMATION__ASSET_KIND, oldAssetKind, assetKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getGlobalAssetId() {
		return globalAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalAssetId(Reference newGlobalAssetId, NotificationChain msgs) {
		Reference oldGlobalAssetId = globalAssetId;
		globalAssetId = newGlobalAssetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID, oldGlobalAssetId, newGlobalAssetId);
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
	public void setGlobalAssetId(Reference newGlobalAssetId) {
		if (newGlobalAssetId != globalAssetId) {
			NotificationChain msgs = null;
			if (globalAssetId != null)
				msgs = ((InternalEObject)globalAssetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID, null, msgs);
			if (newGlobalAssetId != null)
				msgs = ((InternalEObject)newGlobalAssetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID, null, msgs);
			msgs = basicSetGlobalAssetId(newGlobalAssetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID, newGlobalAssetId, newGlobalAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierKeyValuePair> getSpecificAssetId() {
		if (specificAssetId == null) {
			specificAssetId = new EObjectResolvingEList<IdentifierKeyValuePair>(IdentifierKeyValuePair.class, this, AASPackage.ASSET_INFORMATION__SPECIFIC_ASSET_ID);
		}
		return specificAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Submodel> getBillOfMaterial() {
		if (billOfMaterial == null) {
			billOfMaterial = new EObjectResolvingEList<Submodel>(Submodel.class, this, AASPackage.ASSET_INFORMATION__BILL_OF_MATERIAL);
		}
		return billOfMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File getDefaultThumbnail() {
		if (defaultThumbnail != null && defaultThumbnail.eIsProxy()) {
			InternalEObject oldDefaultThumbnail = (InternalEObject)defaultThumbnail;
			defaultThumbnail = (File)eResolveProxy(oldDefaultThumbnail);
			if (defaultThumbnail != oldDefaultThumbnail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL, oldDefaultThumbnail, defaultThumbnail));
			}
		}
		return defaultThumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetDefaultThumbnail() {
		return defaultThumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultThumbnail(File newDefaultThumbnail) {
		File oldDefaultThumbnail = defaultThumbnail;
		defaultThumbnail = newDefaultThumbnail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL, oldDefaultThumbnail, defaultThumbnail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID:
				return basicSetGlobalAssetId(null, msgs);
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
			case AASPackage.ASSET_INFORMATION__ASSET_KIND:
				return getAssetKind();
			case AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID:
				return getGlobalAssetId();
			case AASPackage.ASSET_INFORMATION__SPECIFIC_ASSET_ID:
				return getSpecificAssetId();
			case AASPackage.ASSET_INFORMATION__BILL_OF_MATERIAL:
				return getBillOfMaterial();
			case AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL:
				if (resolve) return getDefaultThumbnail();
				return basicGetDefaultThumbnail();
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
			case AASPackage.ASSET_INFORMATION__ASSET_KIND:
				setAssetKind((AssetKind)newValue);
				return;
			case AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID:
				setGlobalAssetId((Reference)newValue);
				return;
			case AASPackage.ASSET_INFORMATION__SPECIFIC_ASSET_ID:
				getSpecificAssetId().clear();
				getSpecificAssetId().addAll((Collection<? extends IdentifierKeyValuePair>)newValue);
				return;
			case AASPackage.ASSET_INFORMATION__BILL_OF_MATERIAL:
				getBillOfMaterial().clear();
				getBillOfMaterial().addAll((Collection<? extends Submodel>)newValue);
				return;
			case AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL:
				setDefaultThumbnail((File)newValue);
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
			case AASPackage.ASSET_INFORMATION__ASSET_KIND:
				setAssetKind(ASSET_KIND_EDEFAULT);
				return;
			case AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID:
				setGlobalAssetId((Reference)null);
				return;
			case AASPackage.ASSET_INFORMATION__SPECIFIC_ASSET_ID:
				getSpecificAssetId().clear();
				return;
			case AASPackage.ASSET_INFORMATION__BILL_OF_MATERIAL:
				getBillOfMaterial().clear();
				return;
			case AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL:
				setDefaultThumbnail((File)null);
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
			case AASPackage.ASSET_INFORMATION__ASSET_KIND:
				return assetKind != ASSET_KIND_EDEFAULT;
			case AASPackage.ASSET_INFORMATION__GLOBAL_ASSET_ID:
				return globalAssetId != null;
			case AASPackage.ASSET_INFORMATION__SPECIFIC_ASSET_ID:
				return specificAssetId != null && !specificAssetId.isEmpty();
			case AASPackage.ASSET_INFORMATION__BILL_OF_MATERIAL:
				return billOfMaterial != null && !billOfMaterial.isEmpty();
			case AASPackage.ASSET_INFORMATION__DEFAULT_THUMBNAIL:
				return defaultThumbnail != null;
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
		result.append(" (assetKind: ");
		result.append(assetKind);
		result.append(')');
		return result.toString();
	}

} //AssetInformationImpl
