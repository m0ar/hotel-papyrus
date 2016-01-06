/**
 */
package implementation.impl;

import implementation.AdminController;
import implementation.BankProvides;
import implementation.Bill;
import implementation.IBooking;
import implementation.ImplementationPackage;
import implementation.Key;
import implementation.Model;
import implementation.Room;
import implementation.RoomBooking;
import implementation.RoomStatus;
import implementation.RoomType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.AdminControllerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link implementation.impl.AdminControllerImpl#getBankprovides <em>Bankprovides</em>}</li>
 *   <li>{@link implementation.impl.AdminControllerImpl#getIbooking <em>Ibooking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminControllerImpl extends MinimalEObjectImpl.Container implements AdminController {
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
	 * The cached value of the '{@link #getBankprovides() <em>Bankprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankprovides()
	 * @generated
	 * @ordered
	 */
	protected BankProvides bankprovides;
	/**
	 * The cached value of the '{@link #getIbooking() <em>Ibooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbooking()
	 * @generated
	 * @ordered
	 */
	protected IBooking ibooking;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ADMIN_CONTROLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ADMIN_CONTROLLER__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADMIN_CONTROLLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankProvides getBankprovides() {
		if (bankprovides != null && bankprovides.eIsProxy()) {
			InternalEObject oldBankprovides = (InternalEObject)bankprovides;
			bankprovides = (BankProvides)eResolveProxy(oldBankprovides);
			if (bankprovides != oldBankprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES, oldBankprovides, bankprovides));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES, oldBankprovides, bankprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking getIbooking() {
		if (ibooking != null && ibooking.eIsProxy()) {
			InternalEObject oldIbooking = (InternalEObject)ibooking;
			ibooking = (IBooking)eResolveProxy(oldIbooking);
			if (ibooking != oldIbooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ADMIN_CONTROLLER__IBOOKING, oldIbooking, ibooking));
			}
		}
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking basicGetIbooking() {
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIbooking(IBooking newIbooking) {
		IBooking oldIbooking = ibooking;
		ibooking = newIbooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ADMIN_CONTROLLER__IBOOKING, oldIbooking, ibooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoomBooking checkIn(int bookingID) {
		RoomBooking roomBooking = (RoomBooking) model.getRoomBooking(bookingID);
		if (roomBooking == null) {
			throw new NullPointerException("There is no booking with the bookingID " + bookingID);
		}
		EList rooms = getAvailableRooms(roomBooking);
		EList guests = roomBooking.getGuests();
		assignGuestsToRoom(guests, rooms);
		
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean makePayment(String cardDetails, double amount) {
		return bankprovides.makePayment(amount, cardDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBill(int bookingID, Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void updateRoomStatus(Room room, RoomStatus status) {
		room.setStatus(status);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createRoom(int roomID, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getAvailableRooms(RoomBooking roomBooking) {
		return roomBooking.getRoom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean reservePayment(double amount, String cardDetails) {
		return bankprovides.reservePayment(amount, cardDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean removeDeposition(int bookingNr, String cardDetails) {
		RoomBooking roomBooking = (RoomBooking) model.getRoomBooking(bookingNr);
		return bankprovides.removeReservedPayment(roomBooking.getDeposit(), cardDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getRoomTypes() {
		return model.getRoomtypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getTotalCost(int bookingID) {
		RoomBooking roomBooking = (RoomBooking) model.getRoomBooking(bookingID);
		roomBooking.calculateCost();
		return roomBooking.getCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Room getRoom(int roomID) {
		return model.getRoom(roomID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRoom(int roomID, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookConferenceRoom(int roomID, String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void unassignGuestsFromRooms(RoomBooking roomBooking) {
		EList rooms = roomBooking.getRoom();
		for(int i = 0; i < rooms.size(); i++){
			Room r = (Room)rooms.get(i);
			r.getGuests().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void assignKeysToRoom(int roomID, Key key1, Key key2) {
		key1.setAccess(roomID);
		key2.setAccess(roomID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Bill getFinalBill(RoomBooking roomBooking) {
		double cost = 0;
		if(!roomBooking.isRentPayed()){
			cost += roomBooking.getCost();
		}
		EList rooms = roomBooking.getRoom();
		for(int i = 0; i < rooms.size(); i++){
			Room r = (Room)rooms.get(i);
			cost += r.getTotalBill();
		}
		Bill finalBill = new BillImpl();
		finalBill.setCost(cost);
		finalBill.setDescription("final bill of booking " + roomBooking.getBookingNr());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date();
		finalBill.setDate(dateFormat.format(date));
		return finalBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void assignGuestsToRoom(EList guests, EList rooms) {
		int roomIndex = 0;
		for(int i = 0; i < guests.size(); i++) {
			Room room = (Room) rooms.get(roomIndex);
			if (room.getGuests().size() < room.getRoomtype().getNbrOfGuests()) {
				room.getGuests().add(guests.get(i));
			} else {
				roomIndex += 1;
				i -= 1;
			}
			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean addBill(int roomID, Bill bill) {
		Room r = model.getRoom(roomID);
		if(r == null){
			return false;
		}else{
			r.getTab().add(bill);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void deactivateKeysFromRoom(RoomBooking roomBooking) {
		EList rooms = roomBooking.getRoom();
		for(int i = 0; i < rooms.size(); i++){
			Room r = (Room)rooms.get(i);
			r.getKeys().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Bill checkOut(int bookingID) {
		RoomBooking booking = model.getRoomBooking(bookingID);
		if(booking == null){
			return null;
		}
		deactivateKeysFromRoom(booking);
		EList rooms = booking.getRoom();
		for(int i = 0; i < rooms.size(); i++){
			updateRoomStatus((Room)rooms.get(i), RoomStatus.CLEANING_LITERAL);
		}
		unassignGuestsFromRooms(booking);
		return getFinalBill(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeRoom(int roomID) {
		
		Room room = getRoom(roomID);	
			
		if(room == null){
			throw new NullPointerException("Didn't found the room");
		}
		
		if(room.getGuests().size() > 0){
			//Kast nån exception
		}
		
		EList bookings = model.getRoombooking();
		
		for(int i = 0; i < bookings.size(); i++){
			RoomBooking rb = (RoomBookingImpl)bookings.get(i);
			EList bookedRooms = rb.getRoom();
			for(int j = 0; j < bookedRooms.size(); j++){
				if(((RoomImpl)bookedRooms.get(j)).equals(room)){ //Rummet finns i en bokning
					//Ge bokningen ett annat ledigt rum av samma rumstyp
				}
			}
		}
		
		model.getRoom().remove(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ADMIN_CONTROLLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES:
				if (resolve) return getBankprovides();
				return basicGetBankprovides();
			case ImplementationPackage.ADMIN_CONTROLLER__IBOOKING:
				if (resolve) return getIbooking();
				return basicGetIbooking();
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
			case ImplementationPackage.ADMIN_CONTROLLER__MODEL:
				setModel((Model)newValue);
				return;
			case ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES:
				setBankprovides((BankProvides)newValue);
				return;
			case ImplementationPackage.ADMIN_CONTROLLER__IBOOKING:
				setIbooking((IBooking)newValue);
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
			case ImplementationPackage.ADMIN_CONTROLLER__MODEL:
				setModel((Model)null);
				return;
			case ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES:
				setBankprovides((BankProvides)null);
				return;
			case ImplementationPackage.ADMIN_CONTROLLER__IBOOKING:
				setIbooking((IBooking)null);
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
			case ImplementationPackage.ADMIN_CONTROLLER__MODEL:
				return model != null;
			case ImplementationPackage.ADMIN_CONTROLLER__BANKPROVIDES:
				return bankprovides != null;
			case ImplementationPackage.ADMIN_CONTROLLER__IBOOKING:
				return ibooking != null;
		}
		return super.eIsSet(featureID);
	}

} //AdminControllerImpl
