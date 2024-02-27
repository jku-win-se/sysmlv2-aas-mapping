/**
 */
package AAS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type Def Xsd</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AAS.AASPackage#getDataTypeDefXsd()
 * @model
 * @generated
 */
public enum DataTypeDefXsd implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "string", "xs:string"),

	/**
	 * The '<em><b>Any URI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_URI_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_URI(0, "anyURI", "xs:anyURI"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(0, "base64Binary", "xs:base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(0, "boolean", "xs:boolean"),

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(0, "byte", "xs:byte"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(0, "date", "xs:date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(0, "dateTime", "xs:dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(0, "decimal", "xs:decimal"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(0, "double", "xs:double"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(0, "duration", "xs:duration"),

	/**
	 * The '<em><b>GDay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDAY_VALUE
	 * @generated
	 * @ordered
	 */
	GDAY(0, "gDay", "xs:gDay"),

	/**
	 * The '<em><b>GMonth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH_VALUE
	 * @generated
	 * @ordered
	 */
	GMONTH(0, "gMonth", "xs:gMonth"),

	/**
	 * The '<em><b>GMonth Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	GMONTH_DAY(0, "gMonthDay", "xs:gMonthDay"),

	/**
	 * The '<em><b>GYear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR_VALUE
	 * @generated
	 * @ordered
	 */
	GYEAR(0, "gYear", "xs:gYear"),

	/**
	 * The '<em><b>GYear Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	GYEAR_MONTH(0, "gYearMonth", "xs:gYearMonth"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(0, "float", "xs:float"),

	/**
	 * The '<em><b>Hex Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	HEX_BINARY(0, "hexBinary", "xs:hexBinary"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(0, "int", "xs:int"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(0, "integer", "xs:integer"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(0, "long", "xs:long"),

	/**
	 * The '<em><b>Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_INTEGER(0, "negativeInteger", "xs:negativeInteger"),

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NEGATIVE_INTEGER(0, "nonNegativeInteger", "xs:nonNegativeInteger"),

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_POSITIVE_INTEGER(0, "nonPositiveInteger", "xs:nonPositiveInteger"),

	/**
	 * The '<em><b>Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INTEGER(0, "positiveInteger", "xs:positiveInteger"),

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(0, "short", "xs:short"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(0, "time", "xs:time"),

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_BYTE(0, "unsignedByte", "xs:unsignedByte"),

	/**
	 * The '<em><b>Unsigend Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGEND_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGEND_INT(0, "unsigendInt", "xs:unsigendInt"),

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG(0, "unsignedLong", "xs:unsignedLong"),

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_SHORT(0, "unsignedShort", "xs:unsignedShort");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string" literal="xs:string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Any URI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_URI
	 * @model name="anyURI" literal="xs:anyURI"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_URI_VALUE = 0;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary" literal="xs:base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 0;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean" literal="xs:boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="byte" literal="xs:byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 0;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date" literal="xs:date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 0;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime" literal="xs:dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 0;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="decimal" literal="xs:decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 0;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double" literal="xs:double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 0;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION
	 * @model name="duration" literal="xs:duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 0;

	/**
	 * The '<em><b>GDay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDAY
	 * @model name="gDay" literal="xs:gDay"
	 * @generated
	 * @ordered
	 */
	public static final int GDAY_VALUE = 0;

	/**
	 * The '<em><b>GMonth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH
	 * @model name="gMonth" literal="xs:gMonth"
	 * @generated
	 * @ordered
	 */
	public static final int GMONTH_VALUE = 0;

	/**
	 * The '<em><b>GMonth Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH_DAY
	 * @model name="gMonthDay" literal="xs:gMonthDay"
	 * @generated
	 * @ordered
	 */
	public static final int GMONTH_DAY_VALUE = 0;

	/**
	 * The '<em><b>GYear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR
	 * @model name="gYear" literal="xs:gYear"
	 * @generated
	 * @ordered
	 */
	public static final int GYEAR_VALUE = 0;

	/**
	 * The '<em><b>GYear Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR_MONTH
	 * @model name="gYearMonth" literal="xs:gYearMonth"
	 * @generated
	 * @ordered
	 */
	public static final int GYEAR_MONTH_VALUE = 0;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float" literal="xs:float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 0;

	/**
	 * The '<em><b>Hex Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY
	 * @model name="hexBinary" literal="xs:hexBinary"
	 * @generated
	 * @ordered
	 */
	public static final int HEX_BINARY_VALUE = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int" literal="xs:int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 0;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="integer" literal="xs:integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long" literal="xs:long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 0;

	/**
	 * The '<em><b>Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER
	 * @model name="negativeInteger" literal="xs:negativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER
	 * @model name="nonNegativeInteger" literal="xs:nonNegativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NEGATIVE_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER
	 * @model name="nonPositiveInteger" literal="xs:nonPositiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_POSITIVE_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER
	 * @model name="positiveInteger" literal="xs:positiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="short" literal="xs:short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 0;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time" literal="xs:time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 0;

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE
	 * @model name="unsignedByte" literal="xs:unsignedByte"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_BYTE_VALUE = 0;

	/**
	 * The '<em><b>Unsigend Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGEND_INT
	 * @model name="unsigendInt" literal="xs:unsigendInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGEND_INT_VALUE = 0;

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @model name="unsignedLong" literal="xs:unsignedLong"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_VALUE = 0;

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT
	 * @model name="unsignedShort" literal="xs:unsignedShort"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_SHORT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Data Type Def Xsd</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeDefXsd[] VALUES_ARRAY =
		new DataTypeDefXsd[] {
			STRING,
			ANY_URI,
			BASE64_BINARY,
			BOOLEAN,
			BYTE,
			DATE,
			DATE_TIME,
			DECIMAL,
			DOUBLE,
			DURATION,
			GDAY,
			GMONTH,
			GMONTH_DAY,
			GYEAR,
			GYEAR_MONTH,
			FLOAT,
			HEX_BINARY,
			INT,
			INTEGER,
			LONG,
			NEGATIVE_INTEGER,
			NON_NEGATIVE_INTEGER,
			NON_POSITIVE_INTEGER,
			POSITIVE_INTEGER,
			SHORT,
			TIME,
			UNSIGNED_BYTE,
			UNSIGEND_INT,
			UNSIGNED_LONG,
			UNSIGNED_SHORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type Def Xsd</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeDefXsd> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type Def Xsd</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeDefXsd get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeDefXsd result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Def Xsd</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeDefXsd getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeDefXsd result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Def Xsd</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeDefXsd get(int value) {
		switch (value) {
			case STRING_VALUE: return STRING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataTypeDefXsd(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataTypeDefXsd
