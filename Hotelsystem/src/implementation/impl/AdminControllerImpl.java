/**
 */
package implementation.impl;

import implementation.AdminController;
import implementation.BankProvides;
import implementation.Bill;
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
	 */
	public RoomBooking checkIn(int bookingID) {
		RoomBooking roomBooking = (RoomBooking) model.getRoomBooking(bookingID); 
		EList rooms = getAvailableRooms(roomBooking);
		EList guests = roomBooking.getGuests();
		assignGuestsToRoom(guests, rooms);
		
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(String cardDetails, double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public EList getAvailableRooms(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public void unassignGuestsFromRooms(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public void getFinalBill(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public void addBill(int bookingID, Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deactivateKeysFromRoom(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Bill checkOut(int bookingID) {
		//deactivateKeysFromRoom(bookingID);
		RoomBooking booking = model.getRoomBooking(bookingID);		
		double cost = 0;
		if(!booking.isRentPayed()){
			cost += booking.getCost();
		}
		EList rooms = booking.getRoom();
		for(int i = 0; i < rooms.size(); i++){
			Room r = (Room)rooms.get(i);
			r.setStatus(RoomStatus.CLEANING_LITERAL);
			r.getGuests().clear();
			cost += r.getTotalBill();
		}
		Bill finalBill = new BillImpl();
		finalBill.setCost(cost);
		finalBill.setDescription("final bill of booking " + bookingID);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd : HH:mm");
		Date date = new Date();
		finalBill.setDate(dateFormat.format(date));
		return finalBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(int roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		}
		return super.eIsSet(featureID);
	}

} //AdminControllerImpl
