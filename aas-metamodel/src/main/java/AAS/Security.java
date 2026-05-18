/**
 */
package AAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Security#getAccessControlPolicyPoints <em>Access Control Policy Points</em>}</li>
 *   <li>{@link AAS.Security#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link AAS.Security#getRequiredCertificateExtension <em>Required Certificate Extension</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control Policy Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * property base_Class : uml::Class[?];
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Control Policy Points</em>' containment reference.
	 * @see #setAccessControlPolicyPoints(AccessControlPolicyPoints)
	 * @see AAS.AASPackage#getSecurity_AccessControlPolicyPoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessControlPolicyPoints getAccessControlPolicyPoints();

	/**
	 * Sets the value of the '{@link AAS.Security#getAccessControlPolicyPoints <em>Access Control Policy Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control Policy Points</em>' containment reference.
	 * @see #getAccessControlPolicyPoints()
	 * @generated
	 */
	void setAccessControlPolicyPoints(AccessControlPolicyPoints value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Certificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see AAS.AASPackage#getSecurity_Certificate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Certificate> getCertificate();

	/**
	 * Returns the value of the '<em><b>Required Certificate Extension</b></em>' containment reference list.
	 * The list contents are of type {@link AAS.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Certificate Extension</em>' containment reference list.
	 * @see AAS.AASPackage#getSecurity_RequiredCertificateExtension()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getRequiredCertificateExtension();

} // Security
