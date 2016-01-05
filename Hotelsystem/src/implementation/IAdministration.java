/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAdministration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getIAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAdministration extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false" amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean makePayment(String cardDetails, double amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false" billRequired="true" billOrdered="false"
	 * @generated
	 */
	void removeBill(int bookingID, Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void updateRoomStatus(Room room, RoomStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void createRoom(int roomID, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="implementation.Room" ordered="false" roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	EList getAvailableRooms(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false"
	 * @generated
	 */
	boolean reservePayment(double amount, String cardDetails);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingNrDataType="org.eclipse.uml2.types.Integer" bookingNrRequired="true" bookingNrOrdered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false"
	 * @generated
	 */
	boolean removeDeposition(int bookingNr, String cardDetails);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="implementation.RoomType" ordered="false"
	 * @generated
	 */
	EList getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	double getTotalCost(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	RoomBooking checkIn(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void updateRoom(int roomID, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" startTimeDataType="org.eclipse.uml2.types.String" startTimeRequired="true" startTimeOrdered="false" endTimeDataType="org.eclipse.uml2.types.String" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	void bookConferenceRoom(int roomID, String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void unassignGuestsFromRooms(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" key1Required="true" key1Ordered="false" key2Required="true" key2Ordered="false"
	 * @generated
	 */
	void assignKeysToRoom(int roomID, Key key1, Key key2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	Bill getFinalBill(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestsType="implementation.Guest" guestsRequired="true" guestsMany="true" guestsOrdered="false" roomsType="implementation.Room" roomsRequired="true" roomsMany="true" roomsOrdered="false"
	 * @generated
	 */
	void assignGuestsToRoom(EList guests, EList rooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false" billRequired="true" billOrdered="false"
	 * @generated
	 */
	void addBill(int bookingID, Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void deactivateKeysFromRoom(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Bill checkOut(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	void removeRoom(int roomID);
} // IAdministration
