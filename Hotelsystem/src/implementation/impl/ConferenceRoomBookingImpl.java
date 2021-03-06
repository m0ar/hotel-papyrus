/**
 */
package implementation.impl;

import implementation.ConferenceRoomBooking;
import implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ConferenceRoomBookingImpl#getNbrOfPeople <em>Nbr Of People</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceRoomBookingImpl extends BookingImpl implements ConferenceRoomBooking {
	/**
	 * The default value of the '{@link #getNbrOfPeople() <em>Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfPeople()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_OF_PEOPLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrOfPeople() <em>Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfPeople()
	 * @generated
	 * @ordered
	 */
	protected int nbrOfPeople = NBR_OF_PEOPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.CONFERENCE_ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrOfPeople() {
		return nbrOfPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrOfPeople(int newNbrOfPeople) {
		int oldNbrOfPeople = nbrOfPeople;
		nbrOfPeople = newNbrOfPeople;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE, oldNbrOfPeople, nbrOfPeople));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE:
				return new Integer(getNbrOfPeople());
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
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE:
				setNbrOfPeople(((Integer)newValue).intValue());
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
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE:
				setNbrOfPeople(NBR_OF_PEOPLE_EDEFAULT);
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
			case ImplementationPackage.CONFERENCE_ROOM_BOOKING__NBR_OF_PEOPLE:
				return nbrOfPeople != NBR_OF_PEOPLE_EDEFAULT;
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
		result.append(" (nbrOfPeople: ");
		result.append(nbrOfPeople);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomBookingImpl
