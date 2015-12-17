/**
 */
package implementation.impl;

import implementation.Customer;
import implementation.Guest;
import implementation.ImplementationPackage;
import implementation.PensionType;
import implementation.Room;
import implementation.RoomBooking;
import implementation.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.RoomBookingImpl#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getPension <em>Pension</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getChosenroomtypes <em>Chosenroomtypes</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#isRentPayed <em>Rent Payed</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingImpl extends BookingImpl implements RoomBooking {
	/**
	 * The default value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPOSIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected double deposit = DEPOSIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPension() <em>Pension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPension()
	 * @generated
	 * @ordered
	 */
	protected static final PensionType PENSION_EDEFAULT = PensionType.HALF_PENSION_LITERAL;

	/**
	 * The cached value of the '{@link #getPension() <em>Pension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPension()
	 * @generated
	 * @ordered
	 */
	protected PensionType pension = PENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChosenroomtypes() <em>Chosenroomtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenroomtypes()
	 * @generated
	 * @ordered
	 */
	protected EList chosenroomtypes;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList guests;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList room;

	/**
	 * The default value of the '{@link #isRentPayed() <em>Rent Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRentPayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RENT_PAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRentPayed() <em>Rent Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRentPayed()
	 * @generated
	 * @ordered
	 */
	protected boolean rentPayed = RENT_PAYED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeposit() {
		return deposit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeposit(double newDeposit) {
		double oldDeposit = deposit;
		deposit = newDeposit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_BOOKING__DEPOSIT, oldDeposit, deposit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PensionType getPension() {
		return pension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPension(PensionType newPension) {
		PensionType oldPension = pension;
		pension = newPension == null ? PENSION_EDEFAULT : newPension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_BOOKING__PENSION, oldPension, pension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChosenroomtypes() {
		if (chosenroomtypes == null) {
			chosenroomtypes = new EObjectResolvingEList(RoomType.class, this, ImplementationPackage.ROOM_BOOKING__CHOSENROOMTYPES);
		}
		return chosenroomtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList(Guest.class, this, ImplementationPackage.ROOM_BOOKING__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList(Room.class, this, ImplementationPackage.ROOM_BOOKING__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRentPayed() {
		return rentPayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRentPayed(boolean newRentPayed) {
		boolean oldRentPayed = rentPayed;
		rentPayed = newRentPayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_BOOKING__RENT_PAYED, oldRentPayed, rentPayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ROOM_BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_BOOKING__DEPOSIT:
				return new Double(getDeposit());
			case ImplementationPackage.ROOM_BOOKING__PENSION:
				return getPension();
			case ImplementationPackage.ROOM_BOOKING__CHOSENROOMTYPES:
				return getChosenroomtypes();
			case ImplementationPackage.ROOM_BOOKING__GUESTS:
				return getGuests();
			case ImplementationPackage.ROOM_BOOKING__ROOM:
				return getRoom();
			case ImplementationPackage.ROOM_BOOKING__RENT_PAYED:
				return isRentPayed() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
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
			case ImplementationPackage.ROOM_BOOKING__DEPOSIT:
				setDeposit(((Double)newValue).doubleValue());
				return;
			case ImplementationPackage.ROOM_BOOKING__PENSION:
				setPension((PensionType)newValue);
				return;
			case ImplementationPackage.ROOM_BOOKING__CHOSENROOMTYPES:
				getChosenroomtypes().clear();
				getChosenroomtypes().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM_BOOKING__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM_BOOKING__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM_BOOKING__RENT_PAYED:
				setRentPayed(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
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
			case ImplementationPackage.ROOM_BOOKING__DEPOSIT:
				setDeposit(DEPOSIT_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_BOOKING__PENSION:
				setPension(PENSION_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_BOOKING__CHOSENROOMTYPES:
				getChosenroomtypes().clear();
				return;
			case ImplementationPackage.ROOM_BOOKING__GUESTS:
				getGuests().clear();
				return;
			case ImplementationPackage.ROOM_BOOKING__ROOM:
				getRoom().clear();
				return;
			case ImplementationPackage.ROOM_BOOKING__RENT_PAYED:
				setRentPayed(RENT_PAYED_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_BOOKING__CUSTOMER:
				setCustomer((Customer)null);
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
			case ImplementationPackage.ROOM_BOOKING__DEPOSIT:
				return deposit != DEPOSIT_EDEFAULT;
			case ImplementationPackage.ROOM_BOOKING__PENSION:
				return pension != PENSION_EDEFAULT;
			case ImplementationPackage.ROOM_BOOKING__CHOSENROOMTYPES:
				return chosenroomtypes != null && !chosenroomtypes.isEmpty();
			case ImplementationPackage.ROOM_BOOKING__GUESTS:
				return guests != null && !guests.isEmpty();
			case ImplementationPackage.ROOM_BOOKING__ROOM:
				return room != null && !room.isEmpty();
			case ImplementationPackage.ROOM_BOOKING__RENT_PAYED:
				return rentPayed != RENT_PAYED_EDEFAULT;
			case ImplementationPackage.ROOM_BOOKING__CUSTOMER:
				return customer != null;
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
		result.append(" (deposit: ");
		result.append(deposit);
		result.append(", pension: ");
		result.append(pension);
		result.append(", rentPayed: ");
		result.append(rentPayed);
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl
