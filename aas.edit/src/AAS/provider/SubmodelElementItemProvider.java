/**
 */
package AAS.provider;


import AAS.AASFactory;
import AAS.AASPackage;
import AAS.SubmodelElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link AAS.SubmodelElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubmodelElementItemProvider extends ReferableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmodelElementItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
			addIsDynamicPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HasKind_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HasKind_kind_feature", "_UI_HasKind_type"),
				 AASPackage.Literals.HAS_KIND__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Dynamic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDynamicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubmodelElement_isDynamic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubmodelElement_isDynamic_feature", "_UI_SubmodelElement_type"),
				 AASPackage.Literals.SUBMODEL_ELEMENT__IS_DYNAMIC,
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
			childrenFeatures.add(AASPackage.Literals.HAS_SEMANTICS__SEMANTIC_ID);
			childrenFeatures.add(AASPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION);
			childrenFeatures.add(AASPackage.Literals.QUALIFIABLE__QUALIFIER);
			childrenFeatures.add(AASPackage.Literals.SUBMODEL_ELEMENT__END_POINT);
			childrenFeatures.add(AASPackage.Literals.SUBMODEL_ELEMENT__NODE_ID);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubmodelElement)object).getIdShort();
		return label == null || label.length() == 0 ?
			getString("_UI_SubmodelElement_type") :
			getString("_UI_SubmodelElement_type") + " " + label;
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

		switch (notification.getFeatureID(SubmodelElement.class)) {
			case AASPackage.SUBMODEL_ELEMENT__KIND:
			case AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
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
				(AASPackage.Literals.HAS_SEMANTICS__SEMANTIC_ID,
				 AASFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION,
				 AASFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.QUALIFIABLE__QUALIFIER,
				 AASFactory.eINSTANCE.createQualifier()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.SUBMODEL_ELEMENT__END_POINT,
				 AASFactory.eINSTANCE.createEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.SUBMODEL_ELEMENT__NODE_ID,
				 AASFactory.eINSTANCE.createNodeId()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AASPackage.Literals.HAS_SEMANTICS__SEMANTIC_ID ||
			childFeature == AASPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
