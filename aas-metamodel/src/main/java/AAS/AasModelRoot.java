/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aas Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.AasModelRoot#getAssetadministrationshells <em>Assetadministrationshells</em>}</li>
 *   <li>{@link AAS.AasModelRoot#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAasModelRoot()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface AasModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Assetadministrationshells</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.AssetAdministrationShell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assetadministrationshells</em>' containment reference list.
	 * @see AAS.AASPackage#getAasModelRoot_Assetadministrationshells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AssetAdministrationShell> getAssetadministrationshells();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AAS.AASPackage#getAasModelRoot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AAS.AasModelRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AasModelRoot
