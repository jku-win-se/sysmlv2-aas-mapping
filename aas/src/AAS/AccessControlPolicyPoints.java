/**
 */
package AAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Policy Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.AccessControlPolicyPoints#getLocalAccessControl <em>Local Access Control</em>}</li>
 *   <li>{@link AAS.AccessControlPolicyPoints#isExternalAccessControl <em>External Access Control</em>}</li>
 *   <li>{@link AAS.AccessControlPolicyPoints#isExternalInformationPoints <em>External Information Points</em>}</li>
 *   <li>{@link AAS.AccessControlPolicyPoints#getInternalInformationPoint <em>Internal Information Point</em>}</li>
 *   <li>{@link AAS.AccessControlPolicyPoints#isExternalPolicyDecisionPoints <em>External Policy Decision Points</em>}</li>
 *   <li>{@link AAS.AccessControlPolicyPoints#isExternalPolicyEnforcementPoint <em>External Policy Enforcement Point</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getAccessControlPolicyPoints()
 * @model
 * @generated
 */
public interface AccessControlPolicyPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Access Control</em>' containment reference.
	 * @see #setLocalAccessControl(AccessControl)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_LocalAccessControl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessControl getLocalAccessControl();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#getLocalAccessControl <em>Local Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Access Control</em>' containment reference.
	 * @see #getLocalAccessControl()
	 * @generated
	 */
	void setLocalAccessControl(AccessControl value);

	/**
	 * Returns the value of the '<em><b>External Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Access Control</em>' attribute.
	 * @see #setExternalAccessControl(boolean)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_ExternalAccessControl()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternalAccessControl();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#isExternalAccessControl <em>External Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Access Control</em>' attribute.
	 * @see #isExternalAccessControl()
	 * @generated
	 */
	void setExternalAccessControl(boolean value);

	/**
	 * Returns the value of the '<em><b>External Information Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Information Points</em>' attribute.
	 * @see #setExternalInformationPoints(boolean)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_ExternalInformationPoints()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternalInformationPoints();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#isExternalInformationPoints <em>External Information Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Information Points</em>' attribute.
	 * @see #isExternalInformationPoints()
	 * @generated
	 */
	void setExternalInformationPoints(boolean value);

	/**
	 * Returns the value of the '<em><b>Internal Information Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Information Point</em>' reference.
	 * @see #setInternalInformationPoint(Submodel)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_InternalInformationPoint()
	 * @model required="true"
	 * @generated
	 */
	Submodel getInternalInformationPoint();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#getInternalInformationPoint <em>Internal Information Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Information Point</em>' reference.
	 * @see #getInternalInformationPoint()
	 * @generated
	 */
	void setInternalInformationPoint(Submodel value);

	/**
	 * Returns the value of the '<em><b>External Policy Decision Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Policy Decision Points</em>' attribute.
	 * @see #setExternalPolicyDecisionPoints(boolean)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_ExternalPolicyDecisionPoints()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternalPolicyDecisionPoints();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#isExternalPolicyDecisionPoints <em>External Policy Decision Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Policy Decision Points</em>' attribute.
	 * @see #isExternalPolicyDecisionPoints()
	 * @generated
	 */
	void setExternalPolicyDecisionPoints(boolean value);

	/**
	 * Returns the value of the '<em><b>External Policy Enforcement Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Policy Enforcement Point</em>' attribute.
	 * @see #setExternalPolicyEnforcementPoint(boolean)
	 * @see AAS.AASPackage#getAccessControlPolicyPoints_ExternalPolicyEnforcementPoint()
	 * @model required="true"
	 * @generated
	 */
	boolean isExternalPolicyEnforcementPoint();

	/**
	 * Sets the value of the '{@link AAS.AccessControlPolicyPoints#isExternalPolicyEnforcementPoint <em>External Policy Enforcement Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Policy Enforcement Point</em>' attribute.
	 * @see #isExternalPolicyEnforcementPoint()
	 * @generated
	 */
	void setExternalPolicyEnforcementPoint(boolean value);

} // AccessControlPolicyPoints
