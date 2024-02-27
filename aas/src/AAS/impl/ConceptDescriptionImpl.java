/**
 */
package AAS.impl;

import AAS.AASPackage;
import AAS.ConceptDescription;
import AAS.HasDataSpecification;
import AAS.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AAS.impl.ConceptDescriptionImpl#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link AAS.impl.ConceptDescriptionImpl#getIsCaseOf <em>Is Case Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptDescriptionImpl extends IdentifiableImpl implements ConceptDescription {
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
	 * The cached value of the '{@link #getIsCaseOf() <em>Is Case Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> isCaseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AASPackage.Literals.CONCEPT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION);
		}
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getIsCaseOf() {
		if (isCaseOf == null) {
			isCaseOf = new EObjectContainmentEList<Reference>(Reference.class, this, AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF);
		}
		return isCaseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				return ((InternalEList<?>)getDataSpecification()).basicRemove(otherEnd, msgs);
			case AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return ((InternalEList<?>)getIsCaseOf()).basicRemove(otherEnd, msgs);
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
			case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				return getDataSpecification();
			case AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return getIsCaseOf();
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
			case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends Reference>)newValue);
				return;
			case AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				getIsCaseOf().clear();
				getIsCaseOf().addAll((Collection<? extends Reference>)newValue);
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
			case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				getIsCaseOf().clear();
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
			case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case AASPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return isCaseOf != null && !isCaseOf.isEmpty();
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
		if (baseClass == HasDataSpecification.class) {
			switch (derivedFeatureID) {
				case AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION: return AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;
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
		if (baseClass == HasDataSpecification.class) {
			switch (baseFeatureID) {
				case AASPackage.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION: return AASPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConceptDescriptionImpl
