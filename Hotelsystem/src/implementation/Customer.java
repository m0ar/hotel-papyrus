/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Customer#getAddress <em>Address</em>}</li>
 *   <li>{@link implementation.Customer#getPhoneNbr <em>Phone Nbr</em>}</li>
 *   <li>{@link implementation.Customer#isMember <em>Member</em>}</li>
 *   <li>{@link implementation.Customer#getRoombooking <em>Roombooking</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see implementation.ImplementationPackage#getCustomer_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link implementation.Customer#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Nbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Nbr</em>' attribute.
	 * @see #setPhoneNbr(String)
	 * @see implementation.ImplementationPackage#getCustomer_PhoneNbr()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhoneNbr();

	/**
	 * Sets the value of the '{@link implementation.Customer#getPhoneNbr <em>Phone Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nbr</em>' attribute.
	 * @see #getPhoneNbr()
	 * @generated
	 */
	void setPhoneNbr(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute.
	 * @see #setMember(boolean)
	 * @see implementation.ImplementationPackage#getCustomer_Member()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMember();

	/**
	 * Sets the value of the '{@link implementation.Customer#isMember <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' attribute.
	 * @see #isMember()
	 * @generated
	 */
	void setMember(boolean value);

	/**
	 * Returns the value of the '<em><b>Roombooking</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombooking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombooking</em>' reference list.
	 * @see implementation.ImplementationPackage#getCustomer_Roombooking()
	 * @model type="implementation.RoomBooking" ordered="false"
	 * @generated
	 */
	EList getRoombooking();

} // Customer
