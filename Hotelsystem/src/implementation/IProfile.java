/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.IProfile#getProfilehandler <em>Profilehandler</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getIProfile()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Profilehandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profilehandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profilehandler</em>' reference.
	 * @see #setProfilehandler(ProfileHandler)
	 * @see implementation.ImplementationPackage#getIProfile_Profilehandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProfileHandler getProfilehandler();

	/**
	 * Sets the value of the '{@link implementation.IProfile#getProfilehandler <em>Profilehandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profilehandler</em>' reference.
	 * @see #getProfilehandler()
	 * @generated
	 */
	void setProfilehandler(ProfileHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void editInformation(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void removeProfile(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	Customer getCustomerDetails(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void createProfile(Customer customer);

} // IProfile
