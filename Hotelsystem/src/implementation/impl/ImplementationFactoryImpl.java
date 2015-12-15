/**
 */
package implementation.impl;

import implementation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationFactoryImpl extends EFactoryImpl implements ImplementationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationFactory init() {
		try {
			ImplementationFactory theImplementationFactory = (ImplementationFactory)EPackage.Registry.INSTANCE.getEFactory(ImplementationPackage.eNS_URI);
			if (theImplementationFactory != null) {
				return theImplementationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImplementationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImplementationPackage.BOOKING_CONTROLLER: return createBookingController();
			case ImplementationPackage.MODEL: return createModel();
			case ImplementationPackage.ROOM_TYPE: return createRoomType();
			case ImplementationPackage.BED: return createBed();
			case ImplementationPackage.ROOM: return createRoom();
			case ImplementationPackage.BILL: return createBill();
			case ImplementationPackage.ROOM_ISSUE: return createRoomIssue();
			case ImplementationPackage.GUEST: return createGuest();
			case ImplementationPackage.KEY: return createKey();
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING: return createConferenceRoomBooking();
			case ImplementationPackage.ROOM_BOOKING: return createRoomBooking();
			case ImplementationPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case ImplementationPackage.CUSTOMER: return createCustomer();
			case ImplementationPackage.ADMIN_CONTROLLER: return createAdminController();
			case ImplementationPackage.MODEL_FACTORY: return createModelFactory();
			case ImplementationPackage.MAIN: return createMain();
			case ImplementationPackage.BANK: return createBank();
			case ImplementationPackage.PROFILE_HANDLER: return createProfileHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ImplementationPackage.ROOM_STATUS:
				return createRoomStatusFromString(eDataType, initialValue);
			case ImplementationPackage.PAYMENT_OPTION:
				return createPaymentOptionFromString(eDataType, initialValue);
			case ImplementationPackage.PENSION_TYPE:
				return createPensionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ImplementationPackage.ROOM_STATUS:
				return convertRoomStatusToString(eDataType, instanceValue);
			case ImplementationPackage.PAYMENT_OPTION:
				return convertPaymentOptionToString(eDataType, instanceValue);
			case ImplementationPackage.PENSION_TYPE:
				return convertPensionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingController createBookingController() {
		BookingControllerImpl bookingController = new BookingControllerImpl();
		return bookingController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bed createBed() {
		BedImpl bed = new BedImpl();
		return bed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomIssue createRoomIssue() {
		RoomIssueImpl roomIssue = new RoomIssueImpl();
		return roomIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomBooking createConferenceRoomBooking() {
		ConferenceRoomBookingImpl conferenceRoomBooking = new ConferenceRoomBookingImpl();
		return conferenceRoomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking createRoomBooking() {
		RoomBookingImpl roomBooking = new RoomBookingImpl();
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoomImpl conferenceRoom = new ConferenceRoomImpl();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminController createAdminController() {
		AdminControllerImpl adminController = new AdminControllerImpl();
		return adminController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank createBank() {
		BankImpl bank = new BankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHandler createProfileHandler() {
		ProfileHandlerImpl profileHandler = new ProfileHandlerImpl();
		return profileHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus createRoomStatusFromString(EDataType eDataType, String initialValue) {
		RoomStatus result = RoomStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentOption createPaymentOptionFromString(EDataType eDataType, String initialValue) {
		PaymentOption result = PaymentOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PensionType createPensionTypeFromString(EDataType eDataType, String initialValue) {
		PensionType result = PensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationPackage getImplementationPackage() {
		return (ImplementationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ImplementationPackage getPackage() {
		return ImplementationPackage.eINSTANCE;
	}

} //ImplementationFactoryImpl
