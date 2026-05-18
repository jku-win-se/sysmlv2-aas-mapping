/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.DataSpecificationIEC61360;
import AAS.LangString;
import AAS.LevelType;
import AAS.Reference;
import AAS.ValueReferencePairType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Specification IEC61360</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getUnit <em>Unit</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getSourceOfDefinition <em>Source Of Definition</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getValueList <em>Value List</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getValueId <em>Value Id</em>}</li>
 *   <li>{@link AAS.impl.DataSpecificationIEC61360Impl#getLevelType <em>Level Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSpecificationIEC61360Impl extends MinimalEObjectImpl.Container implements DataSpecificationIEC61360 {
	/**
	 * The cached value of the '{@link #getPreferredName() <em>Preferred Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredName()
	 * @generated
	 * @ordered
	 */
	protected EList<LangString> preferredName;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<LangString> shortName;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitId() <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected Reference unitId;

	/**
	 * The default value of the '{@link #getSourceOfDefinition() <em>Source Of Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOfDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_OF_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceOfDefinition() <em>Source Of Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOfDefinition()
	 * @generated
	 * @ordered
	 */
	protected String sourceOfDefinition = SOURCE_OF_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataSpecificationIEC61360 dataType;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<LangString> definition;

	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueList()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueReferencePairType> valueList;

	/**
	 * The cached value of the '{@link #getValueId() <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueId()
	 * @generated
	 * @ordered
	 */
	protected Reference valueId;

	/**
	 * The cached value of the '{@link #getLevelType() <em>Level Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelType()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelType> levelType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpecificationIEC61360Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.DATA_SPECIFICATION_IEC61360;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LangString> getPreferredName() {
		if (preferredName == null) {
			preferredName = new EObjectContainmentEList<LangString>(LangString.class, this, AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME);
		}
		return preferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LangString> getShortName() {
		if (shortName == null) {
			shortName = new EObjectContainmentEList<LangString>(LangString.class, this, AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME);
		}
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getUnitId() {
		return unitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitId(Reference newUnitId, NotificationChain msgs) {
		Reference oldUnitId = unitId;
		unitId = newUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID, oldUnitId, newUnitId);
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
	public void setUnitId(Reference newUnitId) {
		if (newUnitId != unitId) {
			NotificationChain msgs = null;
			if (unitId != null)
				msgs = ((InternalEObject)unitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID, null, msgs);
			if (newUnitId != null)
				msgs = ((InternalEObject)newUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID, null, msgs);
			msgs = basicSetUnitId(newUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID, newUnitId, newUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceOfDefinition() {
		return sourceOfDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceOfDefinition(String newSourceOfDefinition) {
		String oldSourceOfDefinition = sourceOfDefinition;
		sourceOfDefinition = newSourceOfDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION, oldSourceOfDefinition, sourceOfDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSpecificationIEC61360 getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataSpecificationIEC61360)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationIEC61360 basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataSpecificationIEC61360 newDataType) {
		DataSpecificationIEC61360 oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LangString> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<LangString>(LangString.class, this, AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueReferencePairType> getValueList() {
		if (valueList == null) {
			valueList = new EObjectContainmentEList<ValueReferencePairType>(ValueReferencePairType.class, this, AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST);
		}
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueId() {
		return valueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueId(Reference newValueId, NotificationChain msgs) {
		Reference oldValueId = valueId;
		valueId = newValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID, oldValueId, newValueId);
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
	public void setValueId(Reference newValueId) {
		if (newValueId != valueId) {
			NotificationChain msgs = null;
			if (valueId != null)
				msgs = ((InternalEObject)valueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID, null, msgs);
			if (newValueId != null)
				msgs = ((InternalEObject)newValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID, null, msgs);
			msgs = basicSetValueId(newValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID, newValueId, newValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LevelType> getLevelType() {
		if (levelType == null) {
			levelType = new EDataTypeUniqueEList<LevelType>(LevelType.class, this, AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE);
		}
		return levelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
				return ((InternalEList<?>)getPreferredName()).basicRemove(otherEnd, msgs);
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
				return ((InternalEList<?>)getShortName()).basicRemove(otherEnd, msgs);
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
				return basicSetUnitId(null, msgs);
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
				return ((InternalEList<?>)getValueList()).basicRemove(otherEnd, msgs);
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
				return basicSetValueId(null, msgs);
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
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
				return getPreferredName();
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
				return getShortName();
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT:
				return getUnit();
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
				return getUnitId();
			case AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION:
				return getSourceOfDefinition();
			case AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL:
				return getSymbol();
			case AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
				return getDefinition();
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT:
				return getValueFormat();
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
				return getValueList();
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
				return getValueId();
			case AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE:
				return getLevelType();
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
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
				getPreferredName().clear();
				getPreferredName().addAll((Collection<? extends LangString>)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
				getShortName().clear();
				getShortName().addAll((Collection<? extends LangString>)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT:
				setUnit((String)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
				setUnitId((Reference)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION:
				setSourceOfDefinition((String)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL:
				setSymbol((String)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE:
				setDataType((DataSpecificationIEC61360)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends LangString>)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
				getValueList().clear();
				getValueList().addAll((Collection<? extends ValueReferencePairType>)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
				setValueId((Reference)newValue);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE:
				getLevelType().clear();
				getLevelType().addAll((Collection<? extends LevelType>)newValue);
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
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
				getPreferredName().clear();
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
				getShortName().clear();
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
				setUnitId((Reference)null);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION:
				setSourceOfDefinition(SOURCE_OF_DEFINITION_EDEFAULT);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE:
				setDataType((DataSpecificationIEC61360)null);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
				getDefinition().clear();
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
				getValueList().clear();
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
				setValueId((Reference)null);
				return;
			case AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE:
				getLevelType().clear();
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
			case AASPackage.DATA_SPECIFICATION_IEC61360__PREFERRED_NAME:
				return preferredName != null && !preferredName.isEmpty();
			case AASPackage.DATA_SPECIFICATION_IEC61360__SHORT_NAME:
				return shortName != null && !shortName.isEmpty();
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case AASPackage.DATA_SPECIFICATION_IEC61360__UNIT_ID:
				return unitId != null;
			case AASPackage.DATA_SPECIFICATION_IEC61360__SOURCE_OF_DEFINITION:
				return SOURCE_OF_DEFINITION_EDEFAULT == null ? sourceOfDefinition != null : !SOURCE_OF_DEFINITION_EDEFAULT.equals(sourceOfDefinition);
			case AASPackage.DATA_SPECIFICATION_IEC61360__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case AASPackage.DATA_SPECIFICATION_IEC61360__DATA_TYPE:
				return dataType != null;
			case AASPackage.DATA_SPECIFICATION_IEC61360__DEFINITION:
				return definition != null && !definition.isEmpty();
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_LIST:
				return valueList != null && !valueList.isEmpty();
			case AASPackage.DATA_SPECIFICATION_IEC61360__VALUE_ID:
				return valueId != null;
			case AASPackage.DATA_SPECIFICATION_IEC61360__LEVEL_TYPE:
				return levelType != null && !levelType.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", sourceOfDefinition: ");
		result.append(sourceOfDefinition);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", valueFormat: ");
		result.append(valueFormat);
		result.append(", levelType: ");
		result.append(levelType);
		result.append(')');
		return result.toString();
	}

} //DataSpecificationIEC61360Impl
