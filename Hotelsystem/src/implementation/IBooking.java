/**
 */
package implementation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getIBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBooking extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extrasListDataType="org.eclipse.uml2.types.String" extrasListRequired="true" extrasListOrdered="false" reservationIdDataType="org.eclipse.uml2.types.Integer" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	void selectExtras(String extrasList, int reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false" amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false" ageDataType="org.eclipse.uml2.types.Integer" ageRequired="true" ageOrdered="false" reservationIdDataType="org.eclipse.uml2.types.Integer" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	boolean makePayment(String cardDetails, double amount, int age, int reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="implementation.ConferenceRoom" ordered="false" startTimeRequired="true" startTimeOrdered="false" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList findAvailableConferenceRooms(Date startTime, Date endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nbrOfGuestsDataType="org.eclipse.uml2.types.Integer" nbrOfGuestsRequired="true" nbrOfGuestsOrdered="false" nbrOfRoomsDataType="org.eclipse.uml2.types.Integer" nbrOfRoomsRequired="true" nbrOfRoomsOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	boolean validateBookingData(int nbrOfGuests, int nbrOfRooms, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIDDataType="org.eclipse.uml2.types.Integer" reservationIDRequired="true" reservationIDOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void createBooking(int reservationID, Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIdDataType="org.eclipse.uml2.types.Integer" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	void removeReservation(int reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="implementation.Room" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	EList getAvaiableRooms(Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="implementation.RoomType" ordered="false" nbrOfGuestsDataType="org.eclipse.uml2.types.Integer" nbrOfGuestsRequired="true" nbrOfGuestsOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" nbrOfRoomsDataType="org.eclipse.uml2.types.Integer" nbrOfRoomsRequired="true" nbrOfRoomsOrdered="false"
	 * @generated
	 */
	EList findAvailableRoomTypes(int nbrOfGuests, Date startDate, Date endDate, int nbrOfRooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conferenceRoomRequired="true" conferenceRoomOrdered="false"
	 * @generated
	 */
	void requestConferenceRoom(ConferenceRoom conferenceRoom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" selectedRoomTypesType="implementation.RoomType" selectedRoomTypesMany="true" selectedRoomTypesOrdered="false"
	 * @generated
	 */
	int reserveRoomtype(Date startDate, Date endDate, EList selectedRoomTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false" reservationIdDataType="org.eclipse.uml2.types.Integer" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	void addGuest(String name, String ssn, int reservationId);
} // IBooking
