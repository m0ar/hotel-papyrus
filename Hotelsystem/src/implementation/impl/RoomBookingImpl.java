/**
 */
package implementation.impl;

import implementation.Guest;
import implementation.ImplementationPackage;
import implementation.PensionType;
import implementation.RoomBooking;
import implementation.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link implementation.impl.RoomBookingImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.impl.RoomBookingImpl#getGuest <em>Guest</em>}</li>
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
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected EList roomtype;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected EList guest;

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
	public EList getRoomtype() {
		if (roomtype == null) {
			roomtype = new EObjectResolvingEList(RoomType.class, this, ImplementationPackage.ROOM_BOOKING__ROOMTYPE);
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList(Guest.class, this, ImplementationPackage.ROOM_BOOKING__GUEST);
		}
		return guest;
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
			case ImplementationPackage.ROOM_BOOKING__ROOMTYPE:
				return getRoomtype();
			case ImplementationPackage.ROOM_BOOKING__GUEST:
				return getGuest();
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
			case ImplementationPackage.ROOM_BOOKING__ROOMTYPE:
				getRoomtype().clear();
				getRoomtype().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM_BOOKING__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection)newValue);
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
			case ImplementationPackage.ROOM_BOOKING__ROOMTYPE:
				getRoomtype().clear();
				return;
			case ImplementationPackage.ROOM_BOOKING__GUEST:
				getGuest().clear();
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
			case ImplementationPackage.ROOM_BOOKING__ROOMTYPE:
				return roomtype != null && !roomtype.isEmpty();
			case ImplementationPackage.ROOM_BOOKING__GUEST:
				return guest != null && !guest.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl
