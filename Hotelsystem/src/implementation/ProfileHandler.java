/**
 */
package implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.ProfileHandler#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getProfileHandler()
 * @model
 * @generated
 */
public interface ProfileHandler extends IProfile {

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see implementation.ImplementationPackage#getProfileHandler_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link implementation.ProfileHandler#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);
} // ProfileHandler
