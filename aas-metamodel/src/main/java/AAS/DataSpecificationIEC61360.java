/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Specification IEC61360</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.DataSpecificationIEC61360#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getShortName <em>Short Name</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getUnit <em>Unit</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getSourceOfDefinition <em>Source Of Definition</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getDataType <em>Data Type</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getDefinition <em>Definition</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getValueList <em>Value List</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getValueId <em>Value Id</em>}</li>
 *   <li>{@link AAS.DataSpecificationIEC61360#getLevelType <em>Level Type</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getDataSpecificationIEC61360()
 * @model
 * @generated
 */
public interface DataSpecificationIEC61360 extends EObject {
	/**
	 * Returns the value of the '<em><b>Preferred Name</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.LangString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property base_Class : uml::Class[?];
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Name</em>' containment reference list.
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_PreferredName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<LangString> getPreferredName();

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.LangString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference list.
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_ShortName()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LangString> getShortName();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Id</em>' containment reference.
	 * @see #setUnitId(Reference)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_UnitId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getUnitId();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getUnitId <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Id</em>' containment reference.
	 * @see #getUnitId()
	 * @generated
	 */
	void setUnitId(Reference value);

	/**
	 * Returns the value of the '<em><b>Source Of Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of Definition</em>' attribute.
	 * @see #setSourceOfDefinition(String)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_SourceOfDefinition()
	 * @model
	 * @generated
	 */
	String getSourceOfDefinition();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getSourceOfDefinition <em>Source Of Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Of Definition</em>' attribute.
	 * @see #getSourceOfDefinition()
	 * @generated
	 */
	void setSourceOfDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataSpecificationIEC61360)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_DataType()
	 * @model
	 * @generated
	 */
	DataSpecificationIEC61360 getDataType();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataSpecificationIEC61360 value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.LangString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_Definition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LangString> getDefinition();

	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_ValueFormat()
	 * @model
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.ValueReferencePairType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference list.
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_ValueList()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueReferencePairType> getValueList();

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property value : uml::ValueSpecification[?];
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Reference)
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_ValueId()
	 * @model containment="true"
	 * @generated
	 */
	Reference getValueId();

	/**
	 * Sets the value of the '{@link AAS.DataSpecificationIEC61360#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Reference value);

	/**
	 * Returns the value of the '<em><b>Level Type</b></em>' attribute list.
	 * The list contents are of type {@link AAS.LevelType}.
	 * The literals are from the enumeration {@link AAS.LevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Type</em>' attribute list.
	 * @see AAS.LevelType
	 * @see AAS.AASPackage#getDataSpecificationIEC61360_LevelType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LevelType> getLevelType();

} // DataSpecificationIEC61360
