/**
 */
package AAS.util;

import AAS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AAS.AASPackage
 * @generated
 */
public class AASSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AASPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AASSwitch() {
		if (modelPackage == null) {
			modelPackage = AASPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AASPackage.ASSET_ADMINISTRATION_SHELL: {
				AssetAdministrationShell assetAdministrationShell = (AssetAdministrationShell)theEObject;
				T result = caseAssetAdministrationShell(assetAdministrationShell);
				if (result == null) result = caseIdentifiable(assetAdministrationShell);
				if (result == null) result = caseHasDataSpecification(assetAdministrationShell);
				if (result == null) result = caseReferable(assetAdministrationShell);
				if (result == null) result = caseHasExtensions(assetAdministrationShell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = caseReferable(identifiable);
				if (result == null) result = caseHasExtensions(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.REFERABLE: {
				Referable referable = (Referable)theEObject;
				T result = caseReferable(referable);
				if (result == null) result = caseHasExtensions(referable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.LANG_STRING: {
				LangString langString = (LangString)theEObject;
				T result = caseLangString(langString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ADMINISTRATIVE_INFORMATION: {
				AdministrativeInformation administrativeInformation = (AdministrativeInformation)theEObject;
				T result = caseAdministrativeInformation(administrativeInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.HAS_DATA_SPECIFICATION: {
				HasDataSpecification hasDataSpecification = (HasDataSpecification)theEObject;
				T result = caseHasDataSpecification(hasDataSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ACCESS_CONTROL_POLICY_POINTS: {
				AccessControlPolicyPoints accessControlPolicyPoints = (AccessControlPolicyPoints)theEObject;
				T result = caseAccessControlPolicyPoints(accessControlPolicyPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ACCESS_CONTROL: {
				AccessControl accessControl = (AccessControl)theEObject;
				T result = caseAccessControl(accessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.SUBMODEL: {
				Submodel submodel = (Submodel)theEObject;
				T result = caseSubmodel(submodel);
				if (result == null) result = caseIdentifiable(submodel);
				if (result == null) result = caseHasKind(submodel);
				if (result == null) result = caseHasSemantics(submodel);
				if (result == null) result = caseHasDataSpecification(submodel);
				if (result == null) result = caseQualifiable(submodel);
				if (result == null) result = caseReferable(submodel);
				if (result == null) result = caseHasExtensions(submodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.HAS_KIND: {
				HasKind hasKind = (HasKind)theEObject;
				T result = caseHasKind(hasKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.HAS_SEMANTICS: {
				HasSemantics hasSemantics = (HasSemantics)theEObject;
				T result = caseHasSemantics(hasSemantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.SUBMODEL_ELEMENT: {
				SubmodelElement submodelElement = (SubmodelElement)theEObject;
				T result = caseSubmodelElement(submodelElement);
				if (result == null) result = caseReferable(submodelElement);
				if (result == null) result = caseHasKind(submodelElement);
				if (result == null) result = caseHasSemantics(submodelElement);
				if (result == null) result = caseHasDataSpecification(submodelElement);
				if (result == null) result = caseQualifiable(submodelElement);
				if (result == null) result = caseHasExtensions(submodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.NODE_ID: {
				NodeId nodeId = (NodeId)theEObject;
				T result = caseNodeId(nodeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.CERTIFICATE: {
				Certificate certificate = (Certificate)theEObject;
				T result = caseCertificate(certificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ASSET_INFORMATION: {
				AssetInformation assetInformation = (AssetInformation)theEObject;
				T result = caseAssetInformation(assetInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.IDENTIFIER_KEY_VALUE_PAIR: {
				IdentifierKeyValuePair identifierKeyValuePair = (IdentifierKeyValuePair)theEObject;
				T result = caseIdentifierKeyValuePair(identifierKeyValuePair);
				if (result == null) result = caseHasSemantics(identifierKeyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDataElement(file);
				if (result == null) result = caseSubmodelElement(file);
				if (result == null) result = caseReferable(file);
				if (result == null) result = caseHasKind(file);
				if (result == null) result = caseHasSemantics(file);
				if (result == null) result = caseHasDataSpecification(file);
				if (result == null) result = caseQualifiable(file);
				if (result == null) result = caseHasExtensions(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseSubmodelElement(dataElement);
				if (result == null) result = caseReferable(dataElement);
				if (result == null) result = caseHasKind(dataElement);
				if (result == null) result = caseHasSemantics(dataElement);
				if (result == null) result = caseHasDataSpecification(dataElement);
				if (result == null) result = caseQualifiable(dataElement);
				if (result == null) result = caseHasExtensions(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseIdentifiable(asset);
				if (result == null) result = caseHasDataSpecification(asset);
				if (result == null) result = caseReferable(asset);
				if (result == null) result = caseHasExtensions(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.AAS_ENDPOINT: {
				AASEndpoint aasEndpoint = (AASEndpoint)theEObject;
				T result = caseAASEndpoint(aasEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseComposableElement(entity);
				if (result == null) result = caseSubmodelElement(entity);
				if (result == null) result = caseReferable(entity);
				if (result == null) result = caseHasKind(entity);
				if (result == null) result = caseHasSemantics(entity);
				if (result == null) result = caseHasDataSpecification(entity);
				if (result == null) result = caseQualifiable(entity);
				if (result == null) result = caseHasExtensions(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.RELATIONSHIP_ELEMENT: {
				RelationshipElement relationshipElement = (RelationshipElement)theEObject;
				T result = caseRelationshipElement(relationshipElement);
				if (result == null) result = caseComposableElement(relationshipElement);
				if (result == null) result = caseSubmodelElement(relationshipElement);
				if (result == null) result = caseReferable(relationshipElement);
				if (result == null) result = caseHasKind(relationshipElement);
				if (result == null) result = caseHasSemantics(relationshipElement);
				if (result == null) result = caseHasDataSpecification(relationshipElement);
				if (result == null) result = caseQualifiable(relationshipElement);
				if (result == null) result = caseHasExtensions(relationshipElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseComposableElement(operation);
				if (result == null) result = caseSubmodelElement(operation);
				if (result == null) result = caseReferable(operation);
				if (result == null) result = caseHasKind(operation);
				if (result == null) result = caseHasSemantics(operation);
				if (result == null) result = caseHasDataSpecification(operation);
				if (result == null) result = caseQualifiable(operation);
				if (result == null) result = caseHasExtensions(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.SUBMODEL_ELEMENT_COLLECTION: {
				SubmodelElementCollection submodelElementCollection = (SubmodelElementCollection)theEObject;
				T result = caseSubmodelElementCollection(submodelElementCollection);
				if (result == null) result = caseComposableElement(submodelElementCollection);
				if (result == null) result = caseSubmodelElement(submodelElementCollection);
				if (result == null) result = caseReferable(submodelElementCollection);
				if (result == null) result = caseHasKind(submodelElementCollection);
				if (result == null) result = caseHasSemantics(submodelElementCollection);
				if (result == null) result = caseHasDataSpecification(submodelElementCollection);
				if (result == null) result = caseQualifiable(submodelElementCollection);
				if (result == null) result = caseHasExtensions(submodelElementCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseDataElement(property);
				if (result == null) result = caseSubmodelElement(property);
				if (result == null) result = caseReferable(property);
				if (result == null) result = caseHasKind(property);
				if (result == null) result = caseHasSemantics(property);
				if (result == null) result = caseHasDataSpecification(property);
				if (result == null) result = caseQualifiable(property);
				if (result == null) result = caseHasExtensions(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.REFERENCE_ELEMENT: {
				ReferenceElement referenceElement = (ReferenceElement)theEObject;
				T result = caseReferenceElement(referenceElement);
				if (result == null) result = caseDataElement(referenceElement);
				if (result == null) result = caseSubmodelElement(referenceElement);
				if (result == null) result = caseReferable(referenceElement);
				if (result == null) result = caseHasKind(referenceElement);
				if (result == null) result = caseHasSemantics(referenceElement);
				if (result == null) result = caseHasDataSpecification(referenceElement);
				if (result == null) result = caseQualifiable(referenceElement);
				if (result == null) result = caseHasExtensions(referenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseComposableElement(event);
				if (result == null) result = caseSubmodelElement(event);
				if (result == null) result = caseReferable(event);
				if (result == null) result = caseHasKind(event);
				if (result == null) result = caseHasSemantics(event);
				if (result == null) result = caseHasDataSpecification(event);
				if (result == null) result = caseQualifiable(event);
				if (result == null) result = caseHasExtensions(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.BASIC_EVENT: {
				BasicEvent basicEvent = (BasicEvent)theEObject;
				T result = caseBasicEvent(basicEvent);
				if (result == null) result = caseEvent(basicEvent);
				if (result == null) result = caseComposableElement(basicEvent);
				if (result == null) result = caseSubmodelElement(basicEvent);
				if (result == null) result = caseReferable(basicEvent);
				if (result == null) result = caseHasKind(basicEvent);
				if (result == null) result = caseHasSemantics(basicEvent);
				if (result == null) result = caseHasDataSpecification(basicEvent);
				if (result == null) result = caseQualifiable(basicEvent);
				if (result == null) result = caseHasExtensions(basicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseDataElement(range);
				if (result == null) result = caseSubmodelElement(range);
				if (result == null) result = caseReferable(range);
				if (result == null) result = caseHasKind(range);
				if (result == null) result = caseHasSemantics(range);
				if (result == null) result = caseHasDataSpecification(range);
				if (result == null) result = caseQualifiable(range);
				if (result == null) result = caseHasExtensions(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseComposableElement(capability);
				if (result == null) result = caseSubmodelElement(capability);
				if (result == null) result = caseReferable(capability);
				if (result == null) result = caseHasKind(capability);
				if (result == null) result = caseHasSemantics(capability);
				if (result == null) result = caseHasDataSpecification(capability);
				if (result == null) result = caseQualifiable(capability);
				if (result == null) result = caseHasExtensions(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.CONCEPT_DESCRIPTION: {
				ConceptDescription conceptDescription = (ConceptDescription)theEObject;
				T result = caseConceptDescription(conceptDescription);
				if (result == null) result = caseIdentifiable(conceptDescription);
				if (result == null) result = caseHasDataSpecification(conceptDescription);
				if (result == null) result = caseReferable(conceptDescription);
				if (result == null) result = caseHasExtensions(conceptDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.LANG_STRING_SET: {
				LangStringSet langStringSet = (LangStringSet)theEObject;
				T result = caseLangStringSet(langStringSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.DATA_SPECIFICATION_CONTENT: {
				DataSpecificationContent dataSpecificationContent = (DataSpecificationContent)theEObject;
				T result = caseDataSpecificationContent(dataSpecificationContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.DATA_SPECIFICATION_IEC61360: {
				DataSpecificationIEC61360 dataSpecificationIEC61360 = (DataSpecificationIEC61360)theEObject;
				T result = caseDataSpecificationIEC61360(dataSpecificationIEC61360);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.VALUE_REFERENCE_PAIR_TYPE: {
				ValueReferencePairType valueReferencePairType = (ValueReferencePairType)theEObject;
				T result = caseValueReferencePairType(valueReferencePairType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseReferable(view);
				if (result == null) result = caseHasSemantics(view);
				if (result == null) result = caseHasDataSpecification(view);
				if (result == null) result = caseHasExtensions(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.MULTI_LANGUAGE_PROPERTY: {
				MultiLanguageProperty multiLanguageProperty = (MultiLanguageProperty)theEObject;
				T result = caseMultiLanguageProperty(multiLanguageProperty);
				if (result == null) result = caseDataElement(multiLanguageProperty);
				if (result == null) result = caseSubmodelElement(multiLanguageProperty);
				if (result == null) result = caseReferable(multiLanguageProperty);
				if (result == null) result = caseHasKind(multiLanguageProperty);
				if (result == null) result = caseHasSemantics(multiLanguageProperty);
				if (result == null) result = caseHasDataSpecification(multiLanguageProperty);
				if (result == null) result = caseQualifiable(multiLanguageProperty);
				if (result == null) result = caseHasExtensions(multiLanguageProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.AAS_MODEL_ROOT: {
				AasModelRoot aasModelRoot = (AasModelRoot)theEObject;
				T result = caseAasModelRoot(aasModelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.HAS_EXTENSIONS: {
				HasExtensions hasExtensions = (HasExtensions)theEObject;
				T result = caseHasExtensions(hasExtensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.QUALIFIABLE: {
				Qualifiable qualifiable = (Qualifiable)theEObject;
				T result = caseQualifiable(qualifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.QUALIFIER: {
				Qualifier qualifier = (Qualifier)theEObject;
				T result = caseQualifier(qualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.ANNOTATED_RELATIONSHIP_ELEMENT: {
				AnnotatedRelationshipElement annotatedRelationshipElement = (AnnotatedRelationshipElement)theEObject;
				T result = caseAnnotatedRelationshipElement(annotatedRelationshipElement);
				if (result == null) result = caseRelationshipElement(annotatedRelationshipElement);
				if (result == null) result = caseComposableElement(annotatedRelationshipElement);
				if (result == null) result = caseSubmodelElement(annotatedRelationshipElement);
				if (result == null) result = caseReferable(annotatedRelationshipElement);
				if (result == null) result = caseHasKind(annotatedRelationshipElement);
				if (result == null) result = caseHasSemantics(annotatedRelationshipElement);
				if (result == null) result = caseHasDataSpecification(annotatedRelationshipElement);
				if (result == null) result = caseQualifiable(annotatedRelationshipElement);
				if (result == null) result = caseHasExtensions(annotatedRelationshipElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AASPackage.COMPOSABLE_ELEMENT: {
				ComposableElement composableElement = (ComposableElement)theEObject;
				T result = caseComposableElement(composableElement);
				if (result == null) result = caseSubmodelElement(composableElement);
				if (result == null) result = caseReferable(composableElement);
				if (result == null) result = caseHasKind(composableElement);
				if (result == null) result = caseHasSemantics(composableElement);
				if (result == null) result = caseHasDataSpecification(composableElement);
				if (result == null) result = caseQualifiable(composableElement);
				if (result == null) result = caseHasExtensions(composableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Administration Shell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Administration Shell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAdministrationShell(AssetAdministrationShell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferable(Referable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangString(LangString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeInformation(AdministrativeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Data Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Data Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasDataSpecification(HasDataSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control Policy Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control Policy Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlPolicyPoints(AccessControlPolicyPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControl(AccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodel(Submodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasKind(HasKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasSemantics(HasSemantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodelElement(SubmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeId(NodeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificate(Certificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetInformation(AssetInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierKeyValuePair(IdentifierKeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAASEndpoint(AASEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipElement(RelationshipElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel Element Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel Element Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodelElementCollection(SubmodelElementCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceElement(ReferenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(BasicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDescription(ConceptDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang String Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang String Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangStringSet(LangStringSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Specification Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Specification Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSpecificationContent(DataSpecificationContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Specification IEC61360</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Specification IEC61360</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSpecificationIEC61360(DataSpecificationIEC61360 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Reference Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Reference Pair Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueReferencePairType(ValueReferencePairType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Language Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Language Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLanguageProperty(MultiLanguageProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aas Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aas Model Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAasModelRoot(AasModelRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasExtensions(HasExtensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiable(Qualifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifier(Qualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Relationship Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Relationship Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedRelationshipElement(AnnotatedRelationshipElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposableElement(ComposableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AASSwitch
