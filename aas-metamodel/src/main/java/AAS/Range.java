/**
 */
package AAS;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.Range#getMin <em>Min</em>}</li>
 *   <li>{@link AAS.Range#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends DataElement {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(BigInteger)
	 * @see AAS.AASPackage#getRange_Min()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMin();

	/**
	 * Sets the value of the '{@link AAS.Range#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(BigInteger)
	 * @see AAS.AASPackage#getRange_Max()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMax();

	/**
	 * Sets the value of the '{@link AAS.Range#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(BigInteger value);

} // Range
