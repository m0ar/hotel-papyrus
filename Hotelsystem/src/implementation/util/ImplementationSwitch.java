/**
 */
package implementation.util;

import implementation.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage
 * @generated
 */
public class ImplementationSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplementationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationSwitch() {
		if (modelPackage == null) {
			modelPackage = ImplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ImplementationPackage.BOOKING_CONTROLLER: {
				BookingController bookingController = (BookingController)theEObject;
				Object result = caseBookingController(bookingController);
				if (result == null) result = caseIBooking(bookingController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				Object result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BED: {
				Bed bed = (Bed)theEObject;
				Object result = caseBed(bed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM: {
				Room room = (Room)theEObject;
				Object result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BILL: {
				Bill bill = (Bill)theEObject;
				Object result = caseBill(bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_ISSUE: {
				RoomIssue roomIssue = (RoomIssue)theEObject;
				Object result = caseRoomIssue(roomIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				Object result = caseGuest(guest);
				if (result == null) result = casePerson(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PERSON: {
				Person person = (Person)theEObject;
				Object result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.KEY: {
				Key key = (Key)theEObject;
				Object result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING: {
				ConferenceRoomBooking conferenceRoomBooking = (ConferenceRoomBooking)theEObject;
				Object result = caseConferenceRoomBooking(conferenceRoomBooking);
				if (result == null) result = caseBooking(conferenceRoomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				Object result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ROOM_BOOKING: {
				RoomBooking roomBooking = (RoomBooking)theEObject;
				Object result = caseRoomBooking(roomBooking);
				if (result == null) result = caseBooking(roomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				Object result = caseCustomer(customer);
				if (result == null) result = casePerson(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.CONFERENCE_ROOM: {
				ConferenceRoom conferenceRoom = (ConferenceRoom)theEObject;
				Object result = caseConferenceRoom(conferenceRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.IPROFILE: {
				IProfile iProfile = (IProfile)theEObject;
				Object result = caseIProfile(iProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.PROFILE_HANDLER: {
				ProfileHandler profileHandler = (ProfileHandler)theEObject;
				Object result = caseProfileHandler(profileHandler);
				if (result == null) result = caseIProfile(profileHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BANK_PROVIDES: {
				BankProvides bankProvides = (BankProvides)theEObject;
				Object result = caseBankProvides(bankProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.IBOOKING: {
				IBooking iBooking = (IBooking)theEObject;
				Object result = caseIBooking(iBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.ADMIN_CONTROLLER: {
				AdminController adminController = (AdminController)theEObject;
				Object result = caseAdminController(adminController);
				if (result == null) result = caseIAdministration(adminController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.IADMINISTRATION: {
				IAdministration iAdministration = (IAdministration)theEObject;
				Object result = caseIAdministration(iAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.MODEL_FACTORY: {
				ModelFactory modelFactory = (ModelFactory)theEObject;
				Object result = caseModelFactory(modelFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.MAIN: {
				Main main = (Main)theEObject;
				Object result = caseMain(main);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImplementationPackage.BANK: {
				Bank bank = (Bank)theEObject;
				Object result = caseBank(bank);
				if (result == null) result = caseBankProvides(bank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBookingController(BookingController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBed(Bed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBill(Bill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomIssue(RoomIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConferenceRoomBooking(ConferenceRoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomBooking(RoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConferenceRoom(ConferenceRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIBooking(IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdminController(AdminController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBankProvides(BankProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdministration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdministration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIAdministration(IAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelFactory(ModelFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBank(Bank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProfileHandler(ProfileHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProfile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProfile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIProfile(IProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ImplementationSwitch
