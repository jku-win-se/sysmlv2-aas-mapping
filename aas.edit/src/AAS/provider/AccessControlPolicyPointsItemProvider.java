/**
 */
package AAS.provider;


import AAS.AASFactory;
import AAS.AASPackage;
import AAS.AccessControlPolicyPoints;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link AAS.AccessControlPolicyPoints} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessControlPolicyPointsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlPolicyPointsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addExternalAccessControlPropertyDescriptor(object);
			addExternalInformationPointsPropertyDescriptor(object);
			addInternalInformationPointPropertyDescriptor(object);
			addExternalPolicyDecisionPointsPropertyDescriptor(object);
			addExternalPolicyEnforcementPointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the External Access Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalAccessControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccessControlPolicyPoints_externalAccessControl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccessControlPolicyPoints_externalAccessControl_feature", "_UI_AccessControlPolicyPoints_type"),
				 AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Information Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalInformationPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccessControlPolicyPoints_externalInformationPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccessControlPolicyPoints_externalInformationPoints_feature", "_UI_AccessControlPolicyPoints_type"),
				 AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal Information Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalInformationPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccessControlPolicyPoints_internalInformationPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccessControlPolicyPoints_internalInformationPoint_feature", "_UI_AccessControlPolicyPoints_type"),
				 AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__INTERNAL_INFORMATION_POINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Policy Decision Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalPolicyDecisionPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccessControlPolicyPoints_externalPolicyDecisionPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccessControlPolicyPoints_externalPolicyDecisionPoints_feature", "_UI_AccessControlPolicyPoints_type"),
				 AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Policy Enforcement Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalPolicyEnforcementPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccessControlPolicyPoints_externalPolicyEnforcementPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccessControlPolicyPoints_externalPolicyEnforcementPoint_feature", "_UI_AccessControlPolicyPoints_type"),
				 AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AccessControlPolicyPoints.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AccessControlPolicyPoints"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AccessControlPolicyPoints accessControlPolicyPoints = (AccessControlPolicyPoints)object;
		return getString("_UI_AccessControlPolicyPoints_type") + " " + accessControlPolicyPoints.isExternalAccessControl();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AccessControlPolicyPoints.class)) {
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_ACCESS_CONTROL:
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_INFORMATION_POINTS:
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_DECISION_POINTS:
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__EXTERNAL_POLICY_ENFORCEMENT_POINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.ACCESS_CONTROL_POLICY_POINTS__LOCAL_ACCESS_CONTROL,
				 AASFactory.eINSTANCE.createAccessControl()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AasEditPlugin.INSTANCE;
	}

}
