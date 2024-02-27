/**
 */
package AAS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type IEC61360</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AAS.AASPackage#getDataTypeIEC61360()
 * @model
 * @generated
 */
public enum DataTypeIEC61360 implements Enumerator {
	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * literal _'' { annotation _'http://www.eclipse.org/uml2/2.0.0/UML'
	 * (
	 * originalName = ''
	 * );
	 * <!-- end-model-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(1, "DATE", "DATE"),

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(2, "STRING", "STRING"),

	/**
	 * The '<em><b>STRING TRANSLATABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_TRANSLATABLE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_TRANSLATABLE(3, "STRING_TRANSLATABLE", "STRING_TRANSLATABLE"),

	/**
	 * The '<em><b>INTEGER MEASURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_MEASURE(4, "INTEGER_MEASURE", "INTEGER_MEASURE"),

	/**
	 * The '<em><b>INTEGER COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_COUNT(5, "INTEGER_COUNT", "INTEGER_COUNT"),

	/**
	 * The '<em><b>INTEGER CURRENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_CURRENCY(6, "INTEGER_CURRENCY", "INTEGER_CURRENCY"),

	/**
	 * The '<em><b>REAL MEASURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_MEASURE(7, "REAL_MEASURE", "REAL_MEASURE"),

	/**
	 * The '<em><b>REAL COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_COUNT(8, "REAL_COUNT", "REAL_COUNT"),

	/**
	 * The '<em><b>REAL CURRENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_CURRENCY(9, "REAL_CURRENCY", "REAL_CURRENCY"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(10, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(11, "URL", "URL"),

	/**
	 * The '<em><b>RATIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONAL(12, "RATIONAL", "RATIONAL"),

	/**
	 * The '<em><b>RATIONAL MEASURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONAL_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONAL_MEASURE(13, "RATIONAL_MEASURE", "RATIONAL_MEASURE"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(14, "TIME", "TIME"),

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(15, "TIMESTAMP", "TIMESTAMP");

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * literal _'' { annotation _'http://www.eclipse.org/uml2/2.0.0/UML'
	 * (
	 * originalName = ''
	 * );
	 * <!-- end-model-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 1;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 2;

	/**
	 * The '<em><b>STRING TRANSLATABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_TRANSLATABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TRANSLATABLE_VALUE = 3;

	/**
	 * The '<em><b>INTEGER MEASURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MEASURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_MEASURE_VALUE = 4;

	/**
	 * The '<em><b>INTEGER COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_COUNT_VALUE = 5;

	/**
	 * The '<em><b>INTEGER CURRENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_CURRENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_CURRENCY_VALUE = 6;

	/**
	 * The '<em><b>REAL MEASURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_MEASURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_MEASURE_VALUE = 7;

	/**
	 * The '<em><b>REAL COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_COUNT_VALUE = 8;

	/**
	 * The '<em><b>REAL CURRENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_CURRENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_CURRENCY_VALUE = 9;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 10;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 11;

	/**
	 * The '<em><b>RATIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RATIONAL_VALUE = 12;

	/**
	 * The '<em><b>RATIONAL MEASURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONAL_MEASURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RATIONAL_MEASURE_VALUE = 13;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 14;

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 15;

	/**
	 * An array of all the '<em><b>Data Type IEC61360</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeIEC61360[] VALUES_ARRAY =
		new DataTypeIEC61360[] {
			DATE,
			STRING,
			STRING_TRANSLATABLE,
			INTEGER_MEASURE,
			INTEGER_COUNT,
			INTEGER_CURRENCY,
			REAL_MEASURE,
			REAL_COUNT,
			REAL_CURRENCY,
			BOOLEAN,
			URL,
			RATIONAL,
			RATIONAL_MEASURE,
			TIME,
			TIMESTAMP,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type IEC61360</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeIEC61360> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type IEC61360</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeIEC61360 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeIEC61360 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type IEC61360</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeIEC61360 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeIEC61360 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type IEC61360</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeIEC61360 get(int value) {
		switch (value) {
			case DATE_VALUE: return DATE;
			case STRING_VALUE: return STRING;
			case STRING_TRANSLATABLE_VALUE: return STRING_TRANSLATABLE;
			case INTEGER_MEASURE_VALUE: return INTEGER_MEASURE;
			case INTEGER_COUNT_VALUE: return INTEGER_COUNT;
			case INTEGER_CURRENCY_VALUE: return INTEGER_CURRENCY;
			case REAL_MEASURE_VALUE: return REAL_MEASURE;
			case REAL_COUNT_VALUE: return REAL_COUNT;
			case REAL_CURRENCY_VALUE: return REAL_CURRENCY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case URL_VALUE: return URL;
			case RATIONAL_VALUE: return RATIONAL;
			case RATIONAL_MEASURE_VALUE: return RATIONAL_MEASURE;
			case TIME_VALUE: return TIME;
			case TIMESTAMP_VALUE: return TIMESTAMP;
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
	private DataTypeIEC61360(int value, String name, String literal) {
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
	
} //DataTypeIEC61360
