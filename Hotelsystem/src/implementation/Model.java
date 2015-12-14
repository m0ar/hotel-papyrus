/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Model#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.Model#getRoom <em>Room</em>}</li>
 *   <li>{@link implementation.Model#getConferenceroombooking <em>Conferenceroombooking</em>}</li>
 *   <li>{@link implementation.Model#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link implementation.Model#getKey <em>Key</em>}</li>
 *   <li>{@link implementation.Model#getConferenceroom <em>Conferenceroom</em>}</li>
 *   <li>{@link implementation.Model#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference list.
	 * @see implementation.ImplementationPackage#getModel_Roomtype()
	 * @model type="implementation.RoomType" ordered="false"
	 * @generated
	 */
	EList getRoomtype();

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
	 * @see implementation.ImplementationPackage#getModel_Room()
	 * @model type="implementation.Room" ordered="false"
	 * @generated
	 */
	EList getRoom();

	/**
	 * Returns the value of the '<em><b>Conferenceroombooking</b></em>' reference list.
	 * The list contents are of type {@link implementation.ConferenceRoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conferenceroombooking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conferenceroombooking</em>' reference list.
	 * @see implementation.ImplementationPackage#getModel_Conferenceroombooking()
	 * @model type="implementation.ConferenceRoomBooking" ordered="false"
	 * @generated
	 */
	EList getConferenceroombooking();

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
	 * @see implementation.ImplementationPackage#getModel_Roombooking()
	 * @model type="implementation.RoomBooking" ordered="false"
	 * @generated
	 */
	EList getRoombooking();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference list.
	 * The list contents are of type {@link implementation.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference list.
	 * @see implementation.ImplementationPackage#getModel_Key()
	 * @model type="implementation.Key" ordered="false"
	 * @generated
	 */
	EList getKey();

	/**
	 * Returns the value of the '<em><b>Conferenceroom</b></em>' reference list.
	 * The list contents are of type {@link implementation.ConferenceRoom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conferenceroom</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conferenceroom</em>' reference list.
	 * @see implementation.ImplementationPackage#getModel_Conferenceroom()
	 * @model type="implementation.ConferenceRoom" ordered="false"
	 * @generated
	 */
	EList getConferenceroom();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link implementation.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see implementation.ImplementationPackage#getModel_Customer()
	 * @model type="implementation.Customer" ordered="false"
	 * @generated
	 */
	EList getCustomer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ssnDataType="org.eclipse.uml2.types.String" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	Customer getCustomer(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.Integer" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	RoomBooking getRoomBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNrDataType="org.eclipse.uml2.types.Integer" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	RoomType getRoomType(String name);

} // Model
