/**
 */
package AAS.provider;


import AAS.AASFactory;
import AAS.AASPackage;
import AAS.AssetAdministrationShell;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link AAS.AssetAdministrationShell} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetAdministrationShellItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAdministrationShellItemProvider(AdapterFactory adapterFactory) {
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

			addDerivedFromPropertyDescriptor(object);
			addSecurityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_derivedFrom_feature", "_UI_AssetAdministrationShell_type"),
				 AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_security_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_security_feature", "_UI_AssetAdministrationShell_type"),
				 AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__SECURITY,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(AASPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION);
			childrenFeatures.add(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION);
			childrenFeatures.add(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ASSET);
			childrenFeatures.add(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__SUBMODEL);
			childrenFeatures.add(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ENDPOINT);
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
	 * This returns AssetAdministrationShell.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssetAdministrationShell"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssetAdministrationShell)object).getIdShort();
		return label == null || label.length() == 0 ?
			getString("_UI_AssetAdministrationShell_type") :
			getString("_UI_AssetAdministrationShell_type") + " " + label;
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

		switch (notification.getFeatureID(AssetAdministrationShell.class)) {
			case AASPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION:
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
			case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
			case AASPackage.ASSET_ADMINISTRATION_SHELL__ENDPOINT:
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
				(AASPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION,
				 AASFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ASSET_INFORMATION,
				 AASFactory.eINSTANCE.createAssetInformation()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ASSET,
				 AASFactory.eINSTANCE.createAsset()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__SUBMODEL,
				 AASFactory.eINSTANCE.createSubmodel()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.ASSET_ADMINISTRATION_SHELL__ENDPOINT,
				 AASFactory.eINSTANCE.createAASEndpoint()));
	}

}
