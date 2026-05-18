/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.Endpoint;
import AAS.HasDataSpecification;
import AAS.HasKind;
import AAS.HasSemantics;
import AAS.ModelingKind;
import AAS.NodeId;
import AAS.Qualifiable;
import AAS.Qualifier;
import AAS.Reference;
import AAS.SubmodelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#isIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link AAS.impl.SubmodelElementImpl#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubmodelElementImpl extends ReferableImpl implements SubmodelElement {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ModelingKind KIND_EDEFAULT = ModelingKind.TEMPLATE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ModelingKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticId() <em>Semantic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticId()
	 * @generated
	 * @ordered
	 */
	protected Reference semanticId;

	/**
	 * The cached value of the '{@link #getDataSpecification() <em>Data Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> dataSpecification;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected Qualifier qualifier;

	/**
	 * The default value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DYNAMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected boolean isDynamic = IS_DYNAMIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint endPoint;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected NodeId nodeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.SUBMODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelingKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ModelingKind newKind) {
		ModelingKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSemanticId() {
		return semanticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticId(Reference newSemanticId, NotificationChain msgs) {
		Reference oldSemanticId = semanticId;
		semanticId = newSemanticId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
	public void setSemanticId(Reference newSemanticId) {
		if (newSemanticId != semanticId) {
			NotificationChain msgs = null;
			if (semanticId != null)
				msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, null, msgs);
			if (newSemanticId != null)
				msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, null, msgs);
			msgs = basicSetSemanticId(newSemanticId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, newSemanticId, newSemanticId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION);
		}
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qualifier getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(Qualifier newQualifier, NotificationChain msgs) {
		Qualifier oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__QUALIFIER, oldQualifier, newQualifier);
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
	public void setQualifier(Qualifier newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDynamic() {
		return isDynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDynamic(boolean newIsDynamic) {
		boolean oldIsDynamic = isDynamic;
		isDynamic = newIsDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC, oldIsDynamic, isDynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endpoint getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPoint(Endpoint newEndPoint, NotificationChain msgs) {
		Endpoint oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__END_POINT, oldEndPoint, newEndPoint);
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
	public void setEndPoint(Endpoint newEndPoint) {
		if (newEndPoint != endPoint) {
			NotificationChain msgs = null;
			if (endPoint != null)
				msgs = ((InternalEObject)endPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__END_POINT, null, msgs);
			if (newEndPoint != null)
				msgs = ((InternalEObject)newEndPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__END_POINT, null, msgs);
			msgs = basicSetEndPoint(newEndPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__END_POINT, newEndPoint, newEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeId getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(NodeId newNodeId, NotificationChain msgs) {
		NodeId oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__NODE_ID, oldNodeId, newNodeId);
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
	public void setNodeId(NodeId newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AASPackage.SUBMODEL_ELEMENT__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AASPackage.SUBMODEL_ELEMENT__NODE_ID, newNodeId, newNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				return basicSetSemanticId(null, msgs);
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
				return ((InternalEList<?>)getDataSpecification()).basicRemove(otherEnd, msgs);
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
				return basicSetEndPoint(null, msgs);
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
				return basicSetNodeId(null, msgs);
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
			case AASPackage.SUBMODEL_ELEMENT__KIND:
				return getKind();
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				return getSemanticId();
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
				return getDataSpecification();
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return getQualifier();
			case AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC:
				return isIsDynamic();
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
				return getEndPoint();
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
				return getNodeId();
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
			case AASPackage.SUBMODEL_ELEMENT__KIND:
				setKind((ModelingKind)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends Reference>)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC:
				setIsDynamic((Boolean)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
				setEndPoint((Endpoint)newValue);
				return;
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
				setNodeId((NodeId)newValue);
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
			case AASPackage.SUBMODEL_ELEMENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)null);
				return;
			case AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC:
				setIsDynamic(IS_DYNAMIC_EDEFAULT);
				return;
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
				setEndPoint((Endpoint)null);
				return;
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
				setNodeId((NodeId)null);
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
			case AASPackage.SUBMODEL_ELEMENT__KIND:
				return kind != KIND_EDEFAULT;
			case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				return semanticId != null;
			case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case AASPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return qualifier != null;
			case AASPackage.SUBMODEL_ELEMENT__IS_DYNAMIC:
				return isDynamic != IS_DYNAMIC_EDEFAULT;
			case AASPackage.SUBMODEL_ELEMENT__END_POINT:
				return endPoint != null;
			case AASPackage.SUBMODEL_ELEMENT__NODE_ID:
				return nodeId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasKind.class) {
			switch (derivedFeatureID) {
				case AASPackage.SUBMODEL_ELEMENT__KIND: return AASPackage.HAS_KIND__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (derivedFeatureID) {
				case AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID: return AASPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == HasDataSpecification.class) {
			switch (derivedFeatureID) {
				case AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION: return AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (derivedFeatureID) {
				case AASPackage.SUBMODEL_ELEMENT__QUALIFIER: return AASPackage.QUALIFIABLE__QUALIFIER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasKind.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_KIND__KIND: return AASPackage.SUBMODEL_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_SEMANTICS__SEMANTIC_ID: return AASPackage.SUBMODEL_ELEMENT__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == HasDataSpecification.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION: return AASPackage.SUBMODEL_ELEMENT__DATA_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (baseFeatureID) {
				case AASPackage.QUALIFIABLE__QUALIFIER: return AASPackage.SUBMODEL_ELEMENT__QUALIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", isDynamic: ");
		result.append(isDynamic);
		result.append(')');
		return result.toString();
	}

} //SubmodelElementImpl
