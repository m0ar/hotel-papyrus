/**
 */
package implementation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see implementation.ImplementationFactory
 * @model kind="package"
 * @generated
 */
public interface ImplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///implementation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "implementation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationPackage eINSTANCE = implementation.impl.ImplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link implementation.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.IBooking
	 * @see implementation.impl.ImplementationPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 15;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingControllerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBookingController()
	 * @generated
	 */
	int BOOKING_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__MODEL = IBOOKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_FEATURE_COUNT = IBOOKING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link implementation.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ModelImpl
	 * @see implementation.impl.ImplementationPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOMTYPE = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Conferenceroombooking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONFERENCEROOMBOOKING = 2;

	/**
	 * The feature id for the '<em><b>Roombooking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOMBOOKING = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KEY = 4;

	/**
	 * The feature id for the '<em><b>Conferenceroom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONFERENCEROOM = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CUSTOMER = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomTypeImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Non Smoking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NON_SMOKING = 3;

	/**
	 * The feature id for the '<em><b>Wifi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__WIFI = 4;

	/**
	 * The feature id for the '<em><b>Mini Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__MINI_BAR = 5;

	/**
	 * The feature id for the '<em><b>Tv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__TV = 6;

	/**
	 * The feature id for the '<em><b>Balcony</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BALCONY = 7;

	/**
	 * The feature id for the '<em><b>Max Nbr Of Extra Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS = 8;

	/**
	 * The feature id for the '<em><b>Bed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BED = 9;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link implementation.impl.BedImpl <em>Bed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BedImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBed()
	 * @generated
	 */
	int BED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nbr Of Spots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED__NBR_OF_SPOTS = 1;

	/**
	 * The number of structural features of the '<em>Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = 2;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BILL = 3;

	/**
	 * The feature id for the '<em><b>Roomissue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMISSUE = 4;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__GUEST = 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link implementation.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BillImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 5;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__COST = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__DATE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomIssueImpl <em>Room Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomIssueImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomIssue()
	 * @generated
	 */
	int ROOM_ISSUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ISSUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ISSUE__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Finish Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ISSUE__FINISH_DATE = 2;

	/**
	 * The number of structural features of the '<em>Room Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ISSUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link implementation.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.PersonImpl
	 * @see implementation.impl.ImplementationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SECURITY_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.GuestImpl
	 * @see implementation.impl.ImplementationPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__SOCIAL_SECURITY_NUMBER = PERSON__SOCIAL_SECURITY_NUMBER;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BookingImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 10;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__COST = 0;

	/**
	 * The feature id for the '<em><b>Payment Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Booking Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_NR = 4;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link implementation.impl.ConferenceRoomBookingImpl <em>Conference Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ConferenceRoomBookingImpl
	 * @see implementation.impl.ImplementationPackageImpl#getConferenceRoomBooking()
	 * @generated
	 */
	int CONFERENCE_ROOM_BOOKING = 9;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__COST = BOOKING__COST;

	/**
	 * The feature id for the '<em><b>Payment Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__PAYMENT_OPTION = BOOKING__PAYMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__START_DATE = BOOKING__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__END_DATE = BOOKING__END_DATE;

	/**
	 * The feature id for the '<em><b>Booking Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__BOOKING_NR = BOOKING__BOOKING_NR;

	/**
	 * The feature id for the '<em><b>Nbr Of People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE = BOOKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conference Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_BOOKING_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link implementation.impl.RoomBookingImpl <em>Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RoomBookingImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRoomBooking()
	 * @generated
	 */
	int ROOM_BOOKING = 11;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__COST = BOOKING__COST;

	/**
	 * The feature id for the '<em><b>Payment Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__PAYMENT_OPTION = BOOKING__PAYMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__START_DATE = BOOKING__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__END_DATE = BOOKING__END_DATE;

	/**
	 * The feature id for the '<em><b>Booking Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__BOOKING_NR = BOOKING__BOOKING_NR;

	/**
	 * The feature id for the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__DEPOSIT = BOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__PENSION = BOOKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOMTYPE = BOOKING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__GUEST = BOOKING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOM = BOOKING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link implementation.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.KeyImpl
	 * @see implementation.impl.ImplementationPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ACCESS = 1;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ConferenceRoomImpl
	 * @see implementation.impl.ImplementationPackageImpl#getConferenceRoom()
	 * @generated
	 */
	int CONFERENCE_ROOM = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__COST_PER_HOUR = 2;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__EQUIPMENT = 3;

	/**
	 * The number of structural features of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link implementation.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.CustomerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SOCIAL_SECURITY_NUMBER = PERSON__SOCIAL_SECURITY_NUMBER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NBR = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MEMBER = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roombooking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ROOMBOOKING = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link implementation.IAdministration <em>IAdministration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.IAdministration
	 * @see implementation.impl.ImplementationPackageImpl#getIAdministration()
	 * @generated
	 */
	int IADMINISTRATION = 18;

	/**
	 * The number of structural features of the '<em>IAdministration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.AdminControllerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getAdminController()
	 * @generated
	 */
	int ADMIN_CONTROLLER = 16;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__MODEL = IADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bankprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__BANKPROVIDES = IADMINISTRATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Admin Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER_FEATURE_COUNT = IADMINISTRATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link implementation.BankProvides <em>Bank Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.BankProvides
	 * @see implementation.impl.ImplementationPackageImpl#getBankProvides()
	 * @generated
	 */
	int BANK_PROVIDES = 17;

	/**
	 * The number of structural features of the '<em>Bank Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ModelFactoryImpl
	 * @see implementation.impl.ImplementationPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 19;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.MainImpl
	 * @see implementation.impl.ImplementationPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 20;

	/**
	 * The feature id for the '<em><b>Iadministration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__IADMINISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Ibooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__IBOOKING = 1;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link implementation.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.BankImpl
	 * @see implementation.impl.ImplementationPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 21;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = BANK_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.ProfileHandlerImpl <em>Profile Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ProfileHandlerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getProfileHandler()
	 * @generated
	 */
	int PROFILE_HANDLER = 22;

	/**
	 * The meta object id for the '{@link implementation.IProfile <em>IProfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.IProfile
	 * @see implementation.impl.ImplementationPackageImpl#getIProfile()
	 * @generated
	 */
	int IPROFILE = 23;

	/**
	 * The number of structural features of the '<em>IProfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROFILE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLER__MODEL = IPROFILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Profile Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_HANDLER_FEATURE_COUNT = IPROFILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link implementation.RoomStatus <em>Room Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.RoomStatus
	 * @see implementation.impl.ImplementationPackageImpl#getRoomStatus()
	 * @generated
	 */
	int ROOM_STATUS = 24;

	/**
	 * The meta object id for the '{@link implementation.PaymentOption <em>Payment Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.PaymentOption
	 * @see implementation.impl.ImplementationPackageImpl#getPaymentOption()
	 * @generated
	 */
	int PAYMENT_OPTION = 25;

	/**
	 * The meta object id for the '{@link implementation.PensionType <em>Pension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.PensionType
	 * @see implementation.impl.ImplementationPackageImpl#getPensionType()
	 * @generated
	 */
	int PENSION_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link implementation.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Controller</em>'.
	 * @see implementation.BookingController
	 * @generated
	 */
	EClass getBookingController();

	/**
	 * Returns the meta object for the reference '{@link implementation.BookingController#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see implementation.BookingController#getModel()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_Model();

	/**
	 * Returns the meta object for class '{@link implementation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see implementation.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomtype</em>'.
	 * @see implementation.Model#getRoomtype()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Roomtype();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see implementation.Model#getRoom()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Room();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getConferenceroombooking <em>Conferenceroombooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conferenceroombooking</em>'.
	 * @see implementation.Model#getConferenceroombooking()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Conferenceroombooking();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getRoombooking <em>Roombooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roombooking</em>'.
	 * @see implementation.Model#getRoombooking()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Roombooking();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key</em>'.
	 * @see implementation.Model#getKey()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Key();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getConferenceroom <em>Conferenceroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conferenceroom</em>'.
	 * @see implementation.Model#getConferenceroom()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Conferenceroom();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Model#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see implementation.Model#getCustomer()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Customer();

	/**
	 * Returns the meta object for class '{@link implementation.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see implementation.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see implementation.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see implementation.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#isNonSmoking <em>Non Smoking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Smoking</em>'.
	 * @see implementation.RoomType#isNonSmoking()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NonSmoking();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#isWifi <em>Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wifi</em>'.
	 * @see implementation.RoomType#isWifi()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Wifi();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#isMiniBar <em>Mini Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mini Bar</em>'.
	 * @see implementation.RoomType#isMiniBar()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_MiniBar();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#isTv <em>Tv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tv</em>'.
	 * @see implementation.RoomType#isTv()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Tv();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#isBalcony <em>Balcony</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balcony</em>'.
	 * @see implementation.RoomType#isBalcony()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Balcony();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomType#getMaxNbrOfExtraBeds <em>Max Nbr Of Extra Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nbr Of Extra Beds</em>'.
	 * @see implementation.RoomType#getMaxNbrOfExtraBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_MaxNbrOfExtraBeds();

	/**
	 * Returns the meta object for the reference list '{@link implementation.RoomType#getBed <em>Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bed</em>'.
	 * @see implementation.RoomType#getBed()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Bed();

	/**
	 * Returns the meta object for class '{@link implementation.Bed <em>Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bed</em>'.
	 * @see implementation.Bed
	 * @generated
	 */
	EClass getBed();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Bed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see implementation.Bed#getType()
	 * @see #getBed()
	 * @generated
	 */
	EAttribute getBed_Type();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Bed#getNbrOfSpots <em>Nbr Of Spots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of Spots</em>'.
	 * @see implementation.Bed#getNbrOfSpots()
	 * @see #getBed()
	 * @generated
	 */
	EAttribute getBed_NbrOfSpots();

	/**
	 * Returns the meta object for class '{@link implementation.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see implementation.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see implementation.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Room#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see implementation.Room#getStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Status();

	/**
	 * Returns the meta object for the reference '{@link implementation.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see implementation.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Room#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bill</em>'.
	 * @see implementation.Room#getBill()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Bill();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Room#getRoomissue <em>Roomissue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomissue</em>'.
	 * @see implementation.Room#getRoomissue()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomissue();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Room#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see implementation.Room#getGuest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Guest();

	/**
	 * Returns the meta object for class '{@link implementation.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see implementation.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Bill#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see implementation.Bill#getCost()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Cost();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Bill#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see implementation.Bill#getDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Date();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Bill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see implementation.Bill#getDescription()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Description();

	/**
	 * Returns the meta object for class '{@link implementation.RoomIssue <em>Room Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Issue</em>'.
	 * @see implementation.RoomIssue
	 * @generated
	 */
	EClass getRoomIssue();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomIssue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see implementation.RoomIssue#getType()
	 * @see #getRoomIssue()
	 * @generated
	 */
	EAttribute getRoomIssue_Type();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomIssue#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see implementation.RoomIssue#getStartDate()
	 * @see #getRoomIssue()
	 * @generated
	 */
	EAttribute getRoomIssue_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomIssue#getFinishDate <em>Finish Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Date</em>'.
	 * @see implementation.RoomIssue#getFinishDate()
	 * @see #getRoomIssue()
	 * @generated
	 */
	EAttribute getRoomIssue_FinishDate();

	/**
	 * Returns the meta object for class '{@link implementation.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see implementation.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for class '{@link implementation.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see implementation.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see implementation.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for class '{@link implementation.ConferenceRoomBooking <em>Conference Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room Booking</em>'.
	 * @see implementation.ConferenceRoomBooking
	 * @generated
	 */
	EClass getConferenceRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link implementation.ConferenceRoomBooking#getNbrOfPeople <em>Nbr Of People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of People</em>'.
	 * @see implementation.ConferenceRoomBooking#getNbrOfPeople()
	 * @see #getConferenceRoomBooking()
	 * @generated
	 */
	EAttribute getConferenceRoomBooking_NbrOfPeople();

	/**
	 * Returns the meta object for class '{@link implementation.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see implementation.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Booking#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see implementation.Booking#getCost()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Cost();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Booking#getPaymentOption <em>Payment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Option</em>'.
	 * @see implementation.Booking#getPaymentOption()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PaymentOption();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see implementation.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see implementation.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Booking#getBookingNr <em>Booking Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Nr</em>'.
	 * @see implementation.Booking#getBookingNr()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingNr();

	/**
	 * Returns the meta object for class '{@link implementation.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking</em>'.
	 * @see implementation.RoomBooking
	 * @generated
	 */
	EClass getRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomBooking#getDeposit <em>Deposit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposit</em>'.
	 * @see implementation.RoomBooking#getDeposit()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_Deposit();

	/**
	 * Returns the meta object for the attribute '{@link implementation.RoomBooking#getPension <em>Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pension</em>'.
	 * @see implementation.RoomBooking#getPension()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_Pension();

	/**
	 * Returns the meta object for the reference list '{@link implementation.RoomBooking#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomtype</em>'.
	 * @see implementation.RoomBooking#getRoomtype()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Roomtype();

	/**
	 * Returns the meta object for the reference list '{@link implementation.RoomBooking#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see implementation.RoomBooking#getGuest()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Guest();

	/**
	 * Returns the meta object for the reference list '{@link implementation.RoomBooking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see implementation.RoomBooking#getRoom()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Room();

	/**
	 * Returns the meta object for class '{@link implementation.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see implementation.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see implementation.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Key#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see implementation.Key#getAccess()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Access();

	/**
	 * Returns the meta object for class '{@link implementation.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see implementation.ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link implementation.ConferenceRoom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see implementation.ConferenceRoom#getType()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Type();

	/**
	 * Returns the meta object for the attribute '{@link implementation.ConferenceRoom#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see implementation.ConferenceRoom#getSize()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Size();

	/**
	 * Returns the meta object for the attribute '{@link implementation.ConferenceRoom#getCostPerHour <em>Cost Per Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Hour</em>'.
	 * @see implementation.ConferenceRoom#getCostPerHour()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_CostPerHour();

	/**
	 * Returns the meta object for the attribute '{@link implementation.ConferenceRoom#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipment</em>'.
	 * @see implementation.ConferenceRoom#getEquipment()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Equipment();

	/**
	 * Returns the meta object for class '{@link implementation.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see implementation.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for class '{@link implementation.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see implementation.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see implementation.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Customer#getPhoneNbr <em>Phone Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Nbr</em>'.
	 * @see implementation.Customer#getPhoneNbr()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNbr();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Customer#isMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member</em>'.
	 * @see implementation.Customer#isMember()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Member();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Customer#getRoombooking <em>Roombooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roombooking</em>'.
	 * @see implementation.Customer#getRoombooking()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Roombooking();

	/**
	 * Returns the meta object for class '{@link implementation.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Controller</em>'.
	 * @see implementation.AdminController
	 * @generated
	 */
	EClass getAdminController();

	/**
	 * Returns the meta object for the reference '{@link implementation.AdminController#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see implementation.AdminController#getModel()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_Model();

	/**
	 * Returns the meta object for the reference '{@link implementation.AdminController#getBankprovides <em>Bankprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bankprovides</em>'.
	 * @see implementation.AdminController#getBankprovides()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_Bankprovides();

	/**
	 * Returns the meta object for class '{@link implementation.BankProvides <em>Bank Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Provides</em>'.
	 * @see implementation.BankProvides
	 * @generated
	 */
	EClass getBankProvides();

	/**
	 * Returns the meta object for class '{@link implementation.IAdministration <em>IAdministration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdministration</em>'.
	 * @see implementation.IAdministration
	 * @generated
	 */
	EClass getIAdministration();

	/**
	 * Returns the meta object for class '{@link implementation.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see implementation.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for class '{@link implementation.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see implementation.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the reference '{@link implementation.Main#getIadministration <em>Iadministration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iadministration</em>'.
	 * @see implementation.Main#getIadministration()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Iadministration();

	/**
	 * Returns the meta object for the reference '{@link implementation.Main#getIbooking <em>Ibooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ibooking</em>'.
	 * @see implementation.Main#getIbooking()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Ibooking();

	/**
	 * Returns the meta object for class '{@link implementation.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see implementation.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for class '{@link implementation.ProfileHandler <em>Profile Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Handler</em>'.
	 * @see implementation.ProfileHandler
	 * @generated
	 */
	EClass getProfileHandler();

	/**
	 * Returns the meta object for the reference '{@link implementation.ProfileHandler#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see implementation.ProfileHandler#getModel()
	 * @see #getProfileHandler()
	 * @generated
	 */
	EReference getProfileHandler_Model();

	/**
	 * Returns the meta object for class '{@link implementation.IProfile <em>IProfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProfile</em>'.
	 * @see implementation.IProfile
	 * @generated
	 */
	EClass getIProfile();

	/**
	 * Returns the meta object for enum '{@link implementation.RoomStatus <em>Room Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Status</em>'.
	 * @see implementation.RoomStatus
	 * @generated
	 */
	EEnum getRoomStatus();

	/**
	 * Returns the meta object for enum '{@link implementation.PaymentOption <em>Payment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Option</em>'.
	 * @see implementation.PaymentOption
	 * @generated
	 */
	EEnum getPaymentOption();

	/**
	 * Returns the meta object for enum '{@link implementation.PensionType <em>Pension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pension Type</em>'.
	 * @see implementation.PensionType
	 * @generated
	 */
	EEnum getPensionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationFactory getImplementationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link implementation.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingControllerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBookingController()
		 * @generated
		 */
		EClass BOOKING_CONTROLLER = eINSTANCE.getBookingController();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__MODEL = eINSTANCE.getBookingController_Model();

		/**
		 * The meta object literal for the '{@link implementation.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ModelImpl
		 * @see implementation.impl.ImplementationPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOMTYPE = eINSTANCE.getModel_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOM = eINSTANCE.getModel_Room();

		/**
		 * The meta object literal for the '<em><b>Conferenceroombooking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONFERENCEROOMBOOKING = eINSTANCE.getModel_Conferenceroombooking();

		/**
		 * The meta object literal for the '<em><b>Roombooking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOMBOOKING = eINSTANCE.getModel_Roombooking();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__KEY = eINSTANCE.getModel_Key();

		/**
		 * The meta object literal for the '<em><b>Conferenceroom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONFERENCEROOM = eINSTANCE.getModel_Conferenceroom();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CUSTOMER = eINSTANCE.getModel_Customer();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomTypeImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Non Smoking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NON_SMOKING = eINSTANCE.getRoomType_NonSmoking();

		/**
		 * The meta object literal for the '<em><b>Wifi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__WIFI = eINSTANCE.getRoomType_Wifi();

		/**
		 * The meta object literal for the '<em><b>Mini Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__MINI_BAR = eINSTANCE.getRoomType_MiniBar();

		/**
		 * The meta object literal for the '<em><b>Tv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__TV = eINSTANCE.getRoomType_Tv();

		/**
		 * The meta object literal for the '<em><b>Balcony</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__BALCONY = eINSTANCE.getRoomType_Balcony();

		/**
		 * The meta object literal for the '<em><b>Max Nbr Of Extra Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS = eINSTANCE.getRoomType_MaxNbrOfExtraBeds();

		/**
		 * The meta object literal for the '<em><b>Bed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__BED = eINSTANCE.getRoomType_Bed();

		/**
		 * The meta object literal for the '{@link implementation.impl.BedImpl <em>Bed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BedImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBed()
		 * @generated
		 */
		EClass BED = eINSTANCE.getBed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED__TYPE = eINSTANCE.getBed_Type();

		/**
		 * The meta object literal for the '<em><b>Nbr Of Spots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BED__NBR_OF_SPOTS = eINSTANCE.getBed_NbrOfSpots();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STATUS = eINSTANCE.getRoom_Status();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BILL = eINSTANCE.getRoom_Bill();

		/**
		 * The meta object literal for the '<em><b>Roomissue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMISSUE = eINSTANCE.getRoom_Roomissue();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__GUEST = eINSTANCE.getRoom_Guest();

		/**
		 * The meta object literal for the '{@link implementation.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BillImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__COST = eINSTANCE.getBill_Cost();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__DATE = eINSTANCE.getBill_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__DESCRIPTION = eINSTANCE.getBill_Description();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomIssueImpl <em>Room Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomIssueImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomIssue()
		 * @generated
		 */
		EClass ROOM_ISSUE = eINSTANCE.getRoomIssue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ISSUE__TYPE = eINSTANCE.getRoomIssue_Type();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ISSUE__START_DATE = eINSTANCE.getRoomIssue_StartDate();

		/**
		 * The meta object literal for the '<em><b>Finish Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ISSUE__FINISH_DATE = eINSTANCE.getRoomIssue_FinishDate();

		/**
		 * The meta object literal for the '{@link implementation.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.GuestImpl
		 * @see implementation.impl.ImplementationPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '{@link implementation.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.PersonImpl
		 * @see implementation.impl.ImplementationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPerson_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link implementation.impl.ConferenceRoomBookingImpl <em>Conference Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ConferenceRoomBookingImpl
		 * @see implementation.impl.ImplementationPackageImpl#getConferenceRoomBooking()
		 * @generated
		 */
		EClass CONFERENCE_ROOM_BOOKING = eINSTANCE.getConferenceRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Nbr Of People</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE = eINSTANCE.getConferenceRoomBooking_NbrOfPeople();

		/**
		 * The meta object literal for the '{@link implementation.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BookingImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__COST = eINSTANCE.getBooking_Cost();

		/**
		 * The meta object literal for the '<em><b>Payment Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT_OPTION = eINSTANCE.getBooking_PaymentOption();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Booking Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_NR = eINSTANCE.getBooking_BookingNr();

		/**
		 * The meta object literal for the '{@link implementation.impl.RoomBookingImpl <em>Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RoomBookingImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRoomBooking()
		 * @generated
		 */
		EClass ROOM_BOOKING = eINSTANCE.getRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Deposit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__DEPOSIT = eINSTANCE.getRoomBooking_Deposit();

		/**
		 * The meta object literal for the '<em><b>Pension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__PENSION = eINSTANCE.getRoomBooking_Pension();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOMTYPE = eINSTANCE.getRoomBooking_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__GUEST = eINSTANCE.getRoomBooking_Guest();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOM = eINSTANCE.getRoomBooking_Room();

		/**
		 * The meta object literal for the '{@link implementation.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.KeyImpl
		 * @see implementation.impl.ImplementationPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ID = eINSTANCE.getKey_Id();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ACCESS = eINSTANCE.getKey_Access();

		/**
		 * The meta object literal for the '{@link implementation.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ConferenceRoomImpl
		 * @see implementation.impl.ImplementationPackageImpl#getConferenceRoom()
		 * @generated
		 */
		EClass CONFERENCE_ROOM = eINSTANCE.getConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__TYPE = eINSTANCE.getConferenceRoom_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__SIZE = eINSTANCE.getConferenceRoom_Size();

		/**
		 * The meta object literal for the '<em><b>Cost Per Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__COST_PER_HOUR = eINSTANCE.getConferenceRoom_CostPerHour();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__EQUIPMENT = eINSTANCE.getConferenceRoom_Equipment();

		/**
		 * The meta object literal for the '{@link implementation.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.IBooking
		 * @see implementation.impl.ImplementationPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '{@link implementation.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.CustomerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NBR = eINSTANCE.getCustomer_PhoneNbr();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__MEMBER = eINSTANCE.getCustomer_Member();

		/**
		 * The meta object literal for the '<em><b>Roombooking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ROOMBOOKING = eINSTANCE.getCustomer_Roombooking();

		/**
		 * The meta object literal for the '{@link implementation.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.AdminControllerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getAdminController()
		 * @generated
		 */
		EClass ADMIN_CONTROLLER = eINSTANCE.getAdminController();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__MODEL = eINSTANCE.getAdminController_Model();

		/**
		 * The meta object literal for the '<em><b>Bankprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__BANKPROVIDES = eINSTANCE.getAdminController_Bankprovides();

		/**
		 * The meta object literal for the '{@link implementation.BankProvides <em>Bank Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.BankProvides
		 * @see implementation.impl.ImplementationPackageImpl#getBankProvides()
		 * @generated
		 */
		EClass BANK_PROVIDES = eINSTANCE.getBankProvides();

		/**
		 * The meta object literal for the '{@link implementation.IAdministration <em>IAdministration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.IAdministration
		 * @see implementation.impl.ImplementationPackageImpl#getIAdministration()
		 * @generated
		 */
		EClass IADMINISTRATION = eINSTANCE.getIAdministration();

		/**
		 * The meta object literal for the '{@link implementation.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ModelFactoryImpl
		 * @see implementation.impl.ImplementationPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '{@link implementation.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.MainImpl
		 * @see implementation.impl.ImplementationPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Iadministration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__IADMINISTRATION = eINSTANCE.getMain_Iadministration();

		/**
		 * The meta object literal for the '<em><b>Ibooking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__IBOOKING = eINSTANCE.getMain_Ibooking();

		/**
		 * The meta object literal for the '{@link implementation.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.BankImpl
		 * @see implementation.impl.ImplementationPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '{@link implementation.impl.ProfileHandlerImpl <em>Profile Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ProfileHandlerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getProfileHandler()
		 * @generated
		 */
		EClass PROFILE_HANDLER = eINSTANCE.getProfileHandler();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_HANDLER__MODEL = eINSTANCE.getProfileHandler_Model();

		/**
		 * The meta object literal for the '{@link implementation.IProfile <em>IProfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.IProfile
		 * @see implementation.impl.ImplementationPackageImpl#getIProfile()
		 * @generated
		 */
		EClass IPROFILE = eINSTANCE.getIProfile();

		/**
		 * The meta object literal for the '{@link implementation.RoomStatus <em>Room Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.RoomStatus
		 * @see implementation.impl.ImplementationPackageImpl#getRoomStatus()
		 * @generated
		 */
		EEnum ROOM_STATUS = eINSTANCE.getRoomStatus();

		/**
		 * The meta object literal for the '{@link implementation.PaymentOption <em>Payment Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.PaymentOption
		 * @see implementation.impl.ImplementationPackageImpl#getPaymentOption()
		 * @generated
		 */
		EEnum PAYMENT_OPTION = eINSTANCE.getPaymentOption();

		/**
		 * The meta object literal for the '{@link implementation.PensionType <em>Pension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.PensionType
		 * @see implementation.impl.ImplementationPackageImpl#getPensionType()
		 * @generated
		 */
		EEnum PENSION_TYPE = eINSTANCE.getPensionType();

	}

} //ImplementationPackage
