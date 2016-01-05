/**
 */
package implementation.impl;

import implementation.BankProvides;
import implementation.BookingController;
import implementation.ConferenceRoom;
import implementation.Customer;
import implementation.IProfile;
import implementation.ImplementationPackage;
import implementation.Model;
import implementation.PensionType;
import implementation.RoomBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.BookingControllerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link implementation.impl.BookingControllerImpl#getIprofile <em>Iprofile</em>}</li>
 *   <li>{@link implementation.impl.BookingControllerImpl#getBankprovides <em>Bankprovides</em>}</li>
 *   <li>{@link implementation.impl.BookingControllerImpl#getNextBookingId <em>Next Booking Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingControllerImpl extends MinimalEObjectImpl.Container implements BookingController {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getIprofile() <em>Iprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIprofile()
	 * @generated
	 * @ordered
	 */
	protected IProfile iprofile;

	/**
	 * The cached value of the '{@link #getBankprovides() <em>Bankprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankprovides()
	 * @generated
	 * @ordered
	 */
	protected BankProvides bankprovides;

	/**
	 * The default value of the '{@link #getNextBookingId() <em>Next Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextBookingId() <em>Next Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextBookingId()
	 * @generated
	 * @ordered
	 */
	protected int nextBookingId = NEXT_BOOKING_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_CONTROLLER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_CONTROLLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProfile getIprofile() {
		if (iprofile != null && iprofile.eIsProxy()) {
			InternalEObject oldIprofile = (InternalEObject)iprofile;
			iprofile = (IProfile)eResolveProxy(oldIprofile);
			if (iprofile != oldIprofile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_CONTROLLER__IPROFILE, oldIprofile, iprofile));
			}
		}
		return iprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProfile basicGetIprofile() {
		return iprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIprofile(IProfile newIprofile) {
		IProfile oldIprofile = iprofile;
		iprofile = newIprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_CONTROLLER__IPROFILE, oldIprofile, iprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public BankProvides getBankprovides() {
		if (bankprovides != null && bankprovides.eIsProxy()) {
			InternalEObject oldBankprovides = (InternalEObject)bankprovides;
			bankprovides = (BankProvides)eResolveProxy(oldBankprovides);
			if (bankprovides != oldBankprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES, oldBankprovides, bankprovides));
			}
		}
		return bankprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankProvides basicGetBankprovides() {
		return bankprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankprovides(BankProvides newBankprovides) {
		BankProvides oldBankprovides = bankprovides;
		bankprovides = newBankprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES, oldBankprovides, bankprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextBookingId() {
		return nextBookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextBookingId(int newNextBookingId) {
		int oldNextBookingId = nextBookingId;
		nextBookingId = newNextBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_CONTROLLER__NEXT_BOOKING_ID, oldNextBookingId, nextBookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void selectExtras(String extrasList, int reservationId) {
		EList bookings = model.getRoombooking();
		for(int i = 0; i < bookings.size(); i++)
			if(((RoomBookingImpl)bookings.get(i)).isReservation() && ((RoomBookingImpl)bookings.get(i)).getBookingNr() == reservationId)
				((RoomBookingImpl)bookings.get(i)).pension = parsePensionType(extrasList);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean makePayment(String cardDetails, double amount, int age, int reservationId) {
		if(age < 18)
			return false;
		
		if(bankprovides.makePayment(amount, cardDetails)) {
			EList bookings = model.getRoombooking();
			for(int i = 0; i < bookings.size(); i++)
				if(((RoomBookingImpl)bookings.get(i)).isReservation() && ((RoomBookingImpl)bookings.get(i)).getBookingNr() == reservationId)
					((RoomBookingImpl)bookings.get(i)).setRentPayed(true);
			return true;
		}
		
		return false;
	}

	private PensionType parsePensionType(String pt) {
		for(int i = 0; i < PensionType.VALUES.size(); i++)
			if(PensionType.VALUES.get(i).toString().toLowerCase().equals(pt.toLowerCase()))
				return (PensionType)PensionType.VALUES.get(i);
		return PensionType.NONE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void createBooking(int reservationID, Customer customer) {
		EList bookings = model.getRoombooking();
		for(int i = 0; i < bookings.size(); i++){
			if(((RoomBooking)bookings.get(i)).isReservation() && ((RoomBooking)bookings.get(i)).getBookingNr() == reservationID){
				RoomBooking booking = (RoomBooking)bookings.get(i);
				booking.setReservation(false);
				booking.setCustomer(customer);
				booking.calculateCost();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateBookingData(int nbrOfGuests, int nbrOfRooms, String startDate, String endDate) {
		Date sd = parseDate(startDate);
		Date ed = parseDate(endDate);
		
		System.out.println(nbrOfGuests >= 1);
		System.out.println(nbrOfRooms >= 1);
		System.out.println(sd != null);
		System.out.println(ed != null);
		System.out.println(sd.before(ed));
		return nbrOfGuests >= 1 && nbrOfRooms >= 1 && sd != null && ed != null && sd.before(ed); 
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeReservation(int reservationId) {
		EList bookings = model.getRoombooking();
		for(int i = 0; i < bookings.size(); i++)
			if(((RoomBookingImpl)bookings.get(i)).isReservation() && ((RoomBookingImpl)bookings.get(i)).getBookingNr() == reservationId)
				bookings.remove(i);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList findAvailableRoomTypes(int nbrOfGuests, String startDate, String endDate, int nbrOfRooms) {
		if(!validateBookingData(1,1,startDate,endDate))
			return new BasicEList();
		
		Log.log("-------------------- Find available room types --------------------");
		
		EList availableRooms = getAvaiableRooms(startDate, endDate);
		EList summary = summarizeRooms(availableRooms);
		
		Log.log("Room type summaries:");
		for(int i = 0; i< summary.size(); i++) {
			Tuple t = ((Tuple)summary.get(i));
			Log.log(t.x + "\tNumber of available: " + t.y + "\n\n");
		}
		
		return summary;
	}

	private EList summarizeRooms(EList rooms) {
		EList summarize = new BasicEList();
		
		for(int i = 0; i < rooms.size(); i++) {
			if(!tryIncRoomType(summarize, (RoomTypeImpl)((RoomImpl)rooms.get(i)).getRoomtype()))
				summarize.add(new Tuple((RoomTypeImpl)((RoomImpl)rooms.get(i)).getRoomtype(), 1));
		}

		return summarize;
	}
	
	private boolean tryIncRoomType(EList list, RoomTypeImpl roomType) {
		for(int i = 0; i < list.size(); i++) { //Tuple<RoomTypeImpl, Integer> t : list) {
			Tuple t = (Tuple)list.get(i);
			if(t.x.equals(roomType)) {
				t.y = (int)t.y + 1;
				return true;
			}
		}
		return false;
	}
	
	public EList getAvaiableRooms(String startDate, String endDate) {
		Date sd = parseDate(startDate);
		Date ed = parseDate(endDate);
		
		Log.log("Requested start date: " + sd);
		Log.log("Requested end date: " + ed);
		
		EList unavailableRooms = getUnavailableRooms(sd, ed);
		
		Log.log("Number of unavailable rooms:" + unavailableRooms.size());
		
		EList roomClone = new BasicEList(model.getRoom());
		roomClone.removeAll(unavailableRooms);
		
		Log.log("Available rooms: " + roomClone.size());
		
		return roomClone;
	}

	private EList getUnavailableRooms(Date sd, Date ed) {
		EList unavailableRooms = new BasicEList();

		for(int i = 0; i < model.getRoombooking().size(); i++) { //RoomBookingImpl booking : (EList<RoomBookingImpl>)model.getRoombooking()) {
			RoomBookingImpl booking = (RoomBookingImpl)model.getRoombooking().get(i);
			Date bookingSd = parseDate(booking.startDate);
			Date bookingEd = parseDate(booking.endDate);

			// sd	bookingSd	  ed		=== overlap
			boolean overlapBookingSd = sd.before(bookingSd) && ed.after(bookingSd);
			
			// sd	bookingEd	  ed		=== overlap
			boolean overlapBookingEd = sd.before(bookingEd) && ed.after(bookingEd);

			if(overlapBookingEd || overlapBookingSd) {
				for(int j = 0; j < booking.getRoom().size(); j++)
					unavailableRooms.add(booking.getRoom().get(j));
			}
		}
		
		return unavailableRooms;
	}
	
	private Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void requestConferenceRoom(ConferenceRoom conferenceRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int reserveRoomtype(String startDate, String endDate, EList selectedRoomTypes) {
		RoomBookingImpl rb = new RoomBookingImpl();
		rb.setStartDate(startDate);
		rb.setEndDate(endDate);
		rb.setReservation(true);
		rb.setRentPayed(false);
		int bookingId = getNextBookingId();
		setNextBookingId(++bookingId);
		rb.setBookingNr(bookingId);
		
		EList rooms = getAvaiableRooms(startDate, endDate);
		
		for(int i = 0; i < selectedRoomTypes.size(); i++) {
			boolean foundRoom = false;
			
			for(int j = 0; j < rooms.size(); j++) {
				if(((RoomImpl)rooms.get(j)).getRoomtype().getName() == ((RoomTypeImpl)selectedRoomTypes.get(i)).getName()) {
					rb.getRoom().add((RoomImpl)rooms.get(j));
					rb.getChosenroomtypes().add(selectedRoomTypes.get(i));
					foundRoom = true;
					break;
				}
			}
			
			if(!foundRoom)
				return -1;
		}
		
		model.getRoombooking().add(rb);
		return rb.getBookingNr();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList findAvailableConferenceRooms(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addGuest(String name, String ssn, int reservationId) {
		EList bookings = model.getRoombooking();
		GuestImpl guest = new GuestImpl();
		guest.setName(name);
		guest.setSocialSecurityNumber(ssn);
		for(int i = 0; i < bookings.size(); i++)
			if(((RoomBookingImpl)bookings.get(i)).isReservation() && ((RoomBookingImpl)bookings.get(i)).getBookingNr() == reservationId)
				((RoomBookingImpl)bookings.get(i)).getGuests().add(guest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ImplementationPackage.BOOKING_CONTROLLER__IPROFILE:
				if (resolve) return getIprofile();
				return basicGetIprofile();
			case ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES:
				if (resolve) return getBankprovides();
				return basicGetBankprovides();
			case ImplementationPackage.BOOKING_CONTROLLER__NEXT_BOOKING_ID:
				return new Integer(getNextBookingId());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				setModel((Model)newValue);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__IPROFILE:
				setIprofile((IProfile)newValue);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES:
				setBankprovides((BankProvides)newValue);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__NEXT_BOOKING_ID:
				setNextBookingId(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				setModel((Model)null);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__IPROFILE:
				setIprofile((IProfile)null);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES:
				setBankprovides((BankProvides)null);
				return;
			case ImplementationPackage.BOOKING_CONTROLLER__NEXT_BOOKING_ID:
				setNextBookingId(NEXT_BOOKING_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				return model != null;
			case ImplementationPackage.BOOKING_CONTROLLER__IPROFILE:
				return iprofile != null;
			case ImplementationPackage.BOOKING_CONTROLLER__BANKPROVIDES:
				return bankprovides != null;
			case ImplementationPackage.BOOKING_CONTROLLER__NEXT_BOOKING_ID:
				return nextBookingId != NEXT_BOOKING_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nextBookingId: ");
		result.append(nextBookingId);
		result.append(')');
		return result.toString();
	}

	public class Tuple { 
		public Object x; 
		public Object y; 
		public Tuple(Object x, Object y) { 
			this.x = x; 
			this.y = y; 
		} 
	}

} //BookingControllerImpl
