/**
 */
package AAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A File is a data element that represents an address to a file. The value is an URI that can represent an absolute or relative path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AAS.File#getPath <em>Path</em>}</li>
 *   <li>{@link AAS.File#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see AAS.AASPackage#getFile()
 * @model
 * @generated
 */
public interface File extends DataElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see AAS.AASPackage#getFile_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link AAS.File#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AAS.MimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see AAS.MimeType
	 * @see #setMimeType(MimeType)
	 * @see AAS.AASPackage#getFile_MimeType()
	 * @model required="true"
	 * @generated
	 */
	MimeType getMimeType();

	/**
	 * Sets the value of the '{@link AAS.File#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see AAS.MimeType
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeType value);

} // File
