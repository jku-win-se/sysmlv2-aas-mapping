/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.AdministrativeInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrative Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.AdministrativeInformationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link AAS.impl.AdministrativeInformationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link AAS.impl.AdministrativeInformationImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link AAS.impl.AdministrativeInformationImpl#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrativeInformationImpl extends MinimalEObjectImpl.Container implements AdministrativeInformation {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrativeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.ADMINISTRATIVE_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ADMINISTRATIVE_INFORMATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ADMINISTRATIVE_INFORMATION__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ADMINISTRATIVE_INFORMATION__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.ADMINISTRATIVE_INFORMATION__TEMPLATE_ID, oldTemplateId, templateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AASPackage.ADMINISTRATIVE_INFORMATION__VERSION:
				return getVersion();
			case AASPackage.ADMINISTRATIVE_INFORMATION__REVISION:
				return getRevision();
			case AASPackage.ADMINISTRATIVE_INFORMATION__CREATOR:
				return getCreator();
			case AASPackage.ADMINISTRATIVE_INFORMATION__TEMPLATE_ID:
				return getTemplateId();
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
			case AASPackage.ADMINISTRATIVE_INFORMATION__VERSION:
				setVersion((String)newValue);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__REVISION:
				setRevision((String)newValue);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__CREATOR:
				setCreator((String)newValue);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__TEMPLATE_ID:
				setTemplateId((String)newValue);
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
			case AASPackage.ADMINISTRATIVE_INFORMATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AASPackage.ADMINISTRATIVE_INFORMATION__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
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
			case AASPackage.ADMINISTRATIVE_INFORMATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case AASPackage.ADMINISTRATIVE_INFORMATION__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case AASPackage.ADMINISTRATIVE_INFORMATION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AASPackage.ADMINISTRATIVE_INFORMATION__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? templateId != null : !TEMPLATE_ID_EDEFAULT.equals(templateId);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", revision: ");
		result.append(revision);
		result.append(", creator: ");
		result.append(creator);
		result.append(", templateId: ");
		result.append(templateId);
		result.append(')');
		return result.toString();
	}

} //AdministrativeInformationImpl
