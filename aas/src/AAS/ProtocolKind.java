/**
 */
package AAS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AAS.AASPackage#getProtocolKind()
 * @model
 * @generated
 */
public enum ProtocolKind implements Enumerator {
	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(0, "HTTP", "HTTP"),

	/**
	 * The '<em><b>MQTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(1, "MQTT", "MQTT"),

	/**
	 * The '<em><b>OPCUA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPCUA_VALUE
	 * @generated
	 * @ordered
	 */
	OPCUA(2, "OPCUA", "OPCUA"),

	/**
	 * The '<em><b>Co AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_AP(3, "CoAP", "CoAP"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "OTHER", "OTHER");

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 0;

	/**
	 * The '<em><b>MQTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 1;

	/**
	 * The '<em><b>OPCUA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPCUA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPCUA_VALUE = 2;

	/**
	 * The '<em><b>Co AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP
	 * @model name="CoAP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_AP_VALUE = 3;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolKind[] VALUES_ARRAY =
		new ProtocolKind[] {
			HTTP,
			MQTT,
			OPCUA,
			CO_AP,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind get(int value) {
		switch (value) {
			case HTTP_VALUE: return HTTP;
			case MQTT_VALUE: return MQTT;
			case OPCUA_VALUE: return OPCUA;
			case CO_AP_VALUE: return CO_AP;
			case OTHER_VALUE: return OTHER;
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
	private ProtocolKind(int value, String name, String literal) {
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
	
} //ProtocolKind
