/**
 */
package implementation.util;

import implementation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage
 * @generated
 */
public class ImplementationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImplementationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImplementationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationSwitch modelSwitch =
		new ImplementationSwitch() {
			public Object caseBookingController(BookingController object) {
				return createBookingControllerAdapter();
			}
			public Object caseModel(Model object) {
				return createModelAdapter();
			}
			public Object caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			public Object caseBed(Bed object) {
				return createBedAdapter();
			}
			public Object caseRoom(Room object) {
				return createRoomAdapter();
			}
			public Object caseBill(Bill object) {
				return createBillAdapter();
			}
			public Object caseRoomIssue(RoomIssue object) {
				return createRoomIssueAdapter();
			}
			public Object caseGuest(Guest object) {
				return createGuestAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object caseKey(Key object) {
				return createKeyAdapter();
			}
			public Object caseConferenceRoomBooking(ConferenceRoomBooking object) {
				return createConferenceRoomBookingAdapter();
			}
			public Object caseBooking(Booking object) {
				return createBookingAdapter();
			}
			public Object caseRoomBooking(RoomBooking object) {
				return createRoomBookingAdapter();
			}
			public Object caseConferenceRoom(ConferenceRoom object) {
				return createConferenceRoomAdapter();
			}
			public Object caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			public Object caseIProfile(IProfile object) {
				return createIProfileAdapter();
			}
			public Object caseProfileHandler(ProfileHandler object) {
				return createProfileHandlerAdapter();
			}
			public Object caseIBooking(IBooking object) {
				return createIBookingAdapter();
			}
			public Object caseAdminController(AdminController object) {
				return createAdminControllerAdapter();
			}
			public Object caseIAdministration(IAdministration object) {
				return createIAdministrationAdapter();
			}
			public Object caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			public Object caseMain(Main object) {
				return createMainAdapter();
			}
			public Object caseBankProvides(BankProvides object) {
				return createBankProvidesAdapter();
			}
			public Object caseBank(Bank object) {
				return createBankAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link implementation.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BookingController
	 * @generated
	 */
	public Adapter createBookingControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Bed <em>Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Bed
	 * @generated
	 */
	public Adapter createBedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomIssue <em>Room Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomIssue
	 * @generated
	 */
	public Adapter createRoomIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.ConferenceRoomBooking <em>Conference Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.ConferenceRoomBooking
	 * @generated
	 */
	public Adapter createConferenceRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.RoomBooking
	 * @generated
	 */
	public Adapter createRoomBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.ConferenceRoom
	 * @generated
	 */
	public Adapter createConferenceRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.IBooking
	 * @generated
	 */
	public Adapter createIBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.AdminController
	 * @generated
	 */
	public Adapter createAdminControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.BankProvides <em>Bank Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.BankProvides
	 * @generated
	 */
	public Adapter createBankProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.IAdministration <em>IAdministration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.IAdministration
	 * @generated
	 */
	public Adapter createIAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Main
	 * @generated
	 */
	public Adapter createMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.Bank
	 * @generated
	 */
	public Adapter createBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.ProfileHandler <em>Profile Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.ProfileHandler
	 * @generated
	 */
	public Adapter createProfileHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link implementation.IProfile <em>IProfile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see implementation.IProfile
	 * @generated
	 */
	public Adapter createIProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImplementationAdapterFactory
