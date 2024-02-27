/**
 */
package AAS.provider;


import AAS.AASFactory;
import AAS.AASPackage;
import AAS.DataSpecificationIEC61360;

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
 * This is the item provider adapter for a {@link AAS.DataSpecificationIEC61360} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSpecificationIEC61360ItemProvider 
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
	public DataSpecificationIEC61360ItemProvider(AdapterFactory adapterFactory) {
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

			addUnitPropertyDescriptor(object);
			addSourceOfDefinitionPropertyDescriptor(object);
			addSymbolPropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			addValueFormatPropertyDescriptor(object);
			addLevelTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_unit_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Of Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceOfDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_sourceOfDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_sourceOfDefinition_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_symbol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_symbol_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__SYMBOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_dataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_dataType_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_valueFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_valueFormat_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecificationIEC61360_levelType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecificationIEC61360_levelType_feature", "_UI_DataSpecificationIEC61360_type"),
				 AASPackage.Literals.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME);
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__SHORT_NAME);
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__UNIT_ID);
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__DEFINITION);
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_LIST);
			childrenFeatures.add(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_ID);
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
	 * This returns DataSpecificationIEC61360.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataSpecificationIEC61360"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataSpecificationIEC61360)object).getUnit();
		return label == null || label.length() == 0 ?
			getString("_UI_DataSpecificationIEC61360_type") :
			getString("_UI_DataSpecificationIEC61360_type") + " " + label;
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

		switch (notification.getFeatureID(DataSpecificationIEC61360.class)) {
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT:
			case AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION:
			case AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL:
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT:
			case AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
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
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME,
				 AASFactory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__SHORT_NAME,
				 AASFactory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__UNIT_ID,
				 AASFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__DEFINITION,
				 AASFactory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_LIST,
				 AASFactory.eINSTANCE.createValueReferencePairType()));

		newChildDescriptors.add
			(createChildParameter
				(AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_ID,
				 AASFactory.eINSTANCE.createReference()));
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
			childFeature == AASPackage.Literals.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME ||
			childFeature == AASPackage.Literals.DATA_SPECIFICATION_IEC61360__SHORT_NAME ||
			childFeature == AASPackage.Literals.DATA_SPECIFICATION_IEC61360__DEFINITION ||
			childFeature == AASPackage.Literals.DATA_SPECIFICATION_IEC61360__UNIT_ID ||
			childFeature == AASPackage.Literals.DATA_SPECIFICATION_IEC61360__VALUE_ID;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
