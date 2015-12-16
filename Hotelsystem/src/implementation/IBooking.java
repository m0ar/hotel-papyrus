/**
 */
package implementation;

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
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false" amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false" ageDataType="org.eclipse.uml2.types.Integer" ageRequired="true" ageOrdered="false"
	 * @generated
	 */
	boolean makePayment(String cardDetails, int amount, int age);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIDDataType="org.eclipse.uml2.types.Integer" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	void createBooking(int reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nbrOfGuestsDataType="org.eclipse.uml2.types.Integer" nbrOfGuestsRequired="true" nbrOfGuestsOrdered="false" nbrOfRoomsDataType="org.eclipse.uml2.types.Integer" nbrOfRoomsRequired="true" nbrOfRoomsOrdered="false" startDateDataType="org.eclipse.uml2.types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="org.eclipse.uml2.types.String" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	boolean validateBookingData(int nbrOfGuests, int nbrOfRooms, String startDate, String endDate);

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
	 * @model type="implementation.RoomType" ordered="false" nbrOfGuestsDataType="org.eclipse.uml2.types.Integer" nbrOfGuestsRequired="true" nbrOfGuestsOrdered="false" startDateDataType="org.eclipse.uml2.types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="org.eclipse.uml2.types.String" endDateRequired="true" endDateOrdered="false" nbrOfRoomsDataType="org.eclipse.uml2.types.Integer" nbrOfRoomsRequired="true" nbrOfRoomsOrdered="false"
	 * @generated
	 */
	EList findAvailableRoomTypes(int nbrOfGuests, String startDate, String endDate, int nbrOfRooms);

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
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDateDataType="org.eclipse.uml2.types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="org.eclipse.uml2.types.String" endDateRequired="true" endDateOrdered="false" selectedRoomTypesType="implementation.RoomType" selectedRoomTypesMany="true" selectedRoomTypesOrdered="false"
	 * @generated
	 */
	int reserveRoomtype(String startDate, String endDate, EList selectedRoomTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="implementation.ConferenceRoom" ordered="false" startTimeDataType="org.eclipse.uml2.types.String" startTimeRequired="true" startTimeOrdered="false" endTimeDataType="org.eclipse.uml2.types.String" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList findAvailableConferenceRooms(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model namesDataType="org.eclipse.uml2.types.String" namesRequired="true" namesOrdered="false" SSNsDataType="org.eclipse.uml2.types.String" SSNsRequired="true" SSNsOrdered="false" reservationIdDataType="org.eclipse.uml2.types.Integer" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	void enterResidentialsCredentials(String names, String SSNs, int reservationId);
} // IBooking
