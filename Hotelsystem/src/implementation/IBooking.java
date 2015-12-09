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
	 * @model startDateDataType="org.eclipse.uml2.types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="org.eclipse.uml2.types.String" endDateRequired="true" endDateOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void reserveRoomtype(String startDate, String endDate, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extrasListDataType="org.eclipse.uml2.types.String" extrasListRequired="true" extrasListOrdered="false"
	 * @generated
	 */
	void selectExtras(String extrasList);

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
	 * @model
	 * @generated
	 */
	void confirmBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nbrOfGuestsDataType="org.eclipse.uml2.types.Integer" nbrOfGuestsRequired="true" nbrOfGuestsOrdered="false" startDateDataType="org.eclipse.uml2.types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="org.eclipse.uml2.types.String" endDateRequired="true" endDateOrdered="false" nbrOfRoomsDataType="org.eclipse.uml2.types.Integer" nbrOfRoomsRequired="true" nbrOfRoomsOrdered="false"
	 * @generated
	 */
	RoomType findAvailableRoomTypes(int nbrOfGuests, String startDate, String endDate, int nbrOfRooms);

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
	 * @model type="implementation.ConferenceRoom" ordered="false" startTimeDataType="org.eclipse.uml2.types.String" startTimeRequired="true" startTimeOrdered="false" endTimeDataType="org.eclipse.uml2.types.String" endTimeRequired="true" endTimeOrdered="false"
	 * @generated
	 */
	EList findAvailableConferenceRooms(String startTime, String endTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model namesDataType="org.eclipse.uml2.types.String" namesRequired="true" namesOrdered="false" SSNsDataType="org.eclipse.uml2.types.Integer" SSNsRequired="true" SSNsOrdered="false"
	 * @generated
	 */
	void enterResidentialsCredentials(String names, int SSNs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false" amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	void makePayment(String cardDetails, int amount);
} // IBooking
