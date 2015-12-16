/**
 */
package implementation.impl;

import implementation.Booking;
import implementation.ImplementationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.BookingImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link implementation.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link implementation.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link implementation.impl.BookingImpl#getBookingNr <em>Booking Nr</em>}</li>
 *   <li>{@link implementation.impl.BookingImpl#isReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingNr() <em>Booking Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNr()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingNr() <em>Booking Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNr()
	 * @generated
	 * @ordered
	 */
	protected int bookingNr = BOOKING_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #isReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReservation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReservation()
	 * @generated
	 * @ordered
	 */
	protected boolean reservation = RESERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingNr() {
		return bookingNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingNr(int newBookingNr) {
		int oldBookingNr = bookingNr;
		bookingNr = newBookingNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING__BOOKING_NR, oldBookingNr, bookingNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(boolean newReservation) {
		boolean oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.BOOKING__COST:
				return new Double(getCost());
			case ImplementationPackage.BOOKING__START_DATE:
				return getStartDate();
			case ImplementationPackage.BOOKING__END_DATE:
				return getEndDate();
			case ImplementationPackage.BOOKING__BOOKING_NR:
				return new Integer(getBookingNr());
			case ImplementationPackage.BOOKING__RESERVATION:
				return isReservation() ? Boolean.TRUE : Boolean.FALSE;
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
			case ImplementationPackage.BOOKING__COST:
				setCost(((Double)newValue).doubleValue());
				return;
			case ImplementationPackage.BOOKING__START_DATE:
				setStartDate((String)newValue);
				return;
			case ImplementationPackage.BOOKING__END_DATE:
				setEndDate((String)newValue);
				return;
			case ImplementationPackage.BOOKING__BOOKING_NR:
				setBookingNr(((Integer)newValue).intValue());
				return;
			case ImplementationPackage.BOOKING__RESERVATION:
				setReservation(((Boolean)newValue).booleanValue());
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
			case ImplementationPackage.BOOKING__COST:
				setCost(COST_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING__BOOKING_NR:
				setBookingNr(BOOKING_NR_EDEFAULT);
				return;
			case ImplementationPackage.BOOKING__RESERVATION:
				setReservation(RESERVATION_EDEFAULT);
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
			case ImplementationPackage.BOOKING__COST:
				return cost != COST_EDEFAULT;
			case ImplementationPackage.BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ImplementationPackage.BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ImplementationPackage.BOOKING__BOOKING_NR:
				return bookingNr != BOOKING_NR_EDEFAULT;
			case ImplementationPackage.BOOKING__RESERVATION:
				return reservation != RESERVATION_EDEFAULT;
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", bookingNr: ");
		result.append(bookingNr);
		result.append(", reservation: ");
		result.append(reservation);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
