/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.RoomBooking#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link implementation.RoomBooking#getPension <em>Pension</em>}</li>
 *   <li>{@link implementation.RoomBooking#getChosenroomtypes <em>Chosenroomtypes</em>}</li>
 *   <li>{@link implementation.RoomBooking#getGuests <em>Guests</em>}</li>
 *   <li>{@link implementation.RoomBooking#getRoom <em>Room</em>}</li>
 *   <li>{@link implementation.RoomBooking#isRentPayed <em>Rent Payed</em>}</li>
 *   <li>{@link implementation.RoomBooking#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getRoomBooking()
 * @model
 * @generated
 */
public interface RoomBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit</em>' attribute.
	 * @see #setDeposit(double)
	 * @see implementation.ImplementationPackage#getRoomBooking_Deposit()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getDeposit();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#getDeposit <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit</em>' attribute.
	 * @see #getDeposit()
	 * @generated
	 */
	void setDeposit(double value);

	/**
	 * Returns the value of the '<em><b>Pension</b></em>' attribute.
	 * The literals are from the enumeration {@link implementation.PensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pension</em>' attribute.
	 * @see implementation.PensionType
	 * @see #setPension(PensionType)
	 * @see implementation.ImplementationPackage#getRoomBooking_Pension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PensionType getPension();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#getPension <em>Pension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pension</em>' attribute.
	 * @see implementation.PensionType
	 * @see #getPension()
	 * @generated
	 */
	void setPension(PensionType value);

	/**
	 * Returns the value of the '<em><b>Chosenroomtypes</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chosenroomtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosenroomtypes</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Chosenroomtypes()
	 * @model type="implementation.RoomType" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='chosen roomtypes'"
	 * @generated
	 */
	EList getChosenroomtypes();

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link implementation.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Guests()
	 * @model type="implementation.Guest" required="true" ordered="false"
	 * @generated
	 */
	EList getGuests();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link implementation.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Room()
	 * @model type="implementation.Room" required="true" ordered="false"
	 * @generated
	 */
	EList getRoom();

	/**
	 * Returns the value of the '<em><b>Rent Payed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rent Payed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rent Payed</em>' attribute.
	 * @see #setRentPayed(boolean)
	 * @see implementation.ImplementationPackage#getRoomBooking_RentPayed()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRentPayed();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#isRentPayed <em>Rent Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rent Payed</em>' attribute.
	 * @see #isRentPayed()
	 * @generated
	 */
	void setRentPayed(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see implementation.ImplementationPackage#getRoomBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // RoomBooking
