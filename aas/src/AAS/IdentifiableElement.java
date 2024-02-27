/**
 */
package AAS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Identifiable Element</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AAS.AASPackage#getIdentifiableElement()
 * @model
 * @generated
 */
public enum IdentifiableElement implements Enumerator {
	/**
	 * The '<em><b>Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	ASSET(0, "Asset", "Asset"),

	/**
	 * The '<em><b>Asset Administration Shell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_ADMINISTRATION_SHELL_VALUE
	 * @generated
	 * @ordered
	 */
	ASSET_ADMINISTRATION_SHELL(1, "AssetAdministrationShell", "AssetAdministrationShell"),

	/**
	 * The '<em><b>Concept Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_DESCRIPTION(2, "ConceptDescription", "ConceptDescription"),

	/**
	 * The '<em><b>Submodel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMODEL(3, "Submodel", "Submodel");

	/**
	 * The '<em><b>Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET
	 * @model name="Asset"
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_VALUE = 0;

	/**
	 * The '<em><b>Asset Administration Shell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_ADMINISTRATION_SHELL
	 * @model name="AssetAdministrationShell"
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ADMINISTRATION_SHELL_VALUE = 1;

	/**
	 * The '<em><b>Concept Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DESCRIPTION
	 * @model name="ConceptDescription"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_DESCRIPTION_VALUE = 2;

	/**
	 * The '<em><b>Submodel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL
	 * @model name="Submodel"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMODEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Identifiable Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifiableElement[] VALUES_ARRAY =
		new IdentifiableElement[] {
			ASSET,
			ASSET_ADMINISTRATION_SHELL,
			CONCEPT_DESCRIPTION,
			SUBMODEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifiable Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifiableElement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifiable Element</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifiableElement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifiableElement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifiable Element</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifiableElement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifiableElement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifiable Element</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifiableElement get(int value) {
		switch (value) {
			case ASSET_VALUE: return ASSET;
			case ASSET_ADMINISTRATION_SHELL_VALUE: return ASSET_ADMINISTRATION_SHELL;
			case CONCEPT_DESCRIPTION_VALUE: return CONCEPT_DESCRIPTION;
			case SUBMODEL_VALUE: return SUBMODEL;
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
	private IdentifiableElement(int value, String name, String literal) {
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
	
} //IdentifiableElement
