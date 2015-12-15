/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProfile</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getIProfile()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProfile extends EObject {
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
