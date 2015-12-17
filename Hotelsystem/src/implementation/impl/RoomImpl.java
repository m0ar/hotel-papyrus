/**
 */
package implementation.impl;

import implementation.Bill;
import implementation.Guest;
import implementation.ImplementationPackage;
import implementation.Key;
import implementation.Room;
import implementation.RoomIssue;
import implementation.RoomStatus;
import implementation.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.RoomImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getRoomissues <em>Roomissues</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RoomStatus STATUS_EDEFAULT = RoomStatus.OCCUPIED_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RoomStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * The cached value of the '{@link #getTab() <em>Tab</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTab()
	 * @generated
	 * @ordered
	 */
	protected EList tab;

	/**
	 * The cached value of the '{@link #getRoomissues() <em>Roomissues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomissues()
	 * @generated
	 * @ordered
	 */
	protected EList roomissues;

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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected RoomImpl() {
		super();
		tab = new BasicEList();
		roomissues = new BasicEList();
		guests = new BasicEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RoomStatus newStatus) {
		RoomStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject)roomtype;
			roomtype = (RoomType)eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.ROOM__ROOMTYPE, oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM__ROOMTYPE, oldRoomtype, roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTab() {
		if (tab == null) {
			tab = new EObjectResolvingEList(Bill.class, this, ImplementationPackage.ROOM__TAB);
		}
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomissues() {
		if (roomissues == null) {
			roomissues = new EObjectResolvingEList(RoomIssue.class, this, ImplementationPackage.ROOM__ROOMISSUES);
		}
		return roomissues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList(Guest.class, this, ImplementationPackage.ROOM__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList(Key.class, this, ImplementationPackage.ROOM__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getTotalBill() {
		double cost = 0;
		for(int i = 0; i < tab.size(); i++){
			Bill b = (Bill)tab.get(i);
			cost += b.getCost();
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM__NUMBER:
				return new Integer(getNumber());
			case ImplementationPackage.ROOM__STATUS:
				return getStatus();
			case ImplementationPackage.ROOM__ROOMTYPE:
				if (resolve) return getRoomtype();
				return basicGetRoomtype();
			case ImplementationPackage.ROOM__TAB:
				return getTab();
			case ImplementationPackage.ROOM__ROOMISSUES:
				return getRoomissues();
			case ImplementationPackage.ROOM__GUESTS:
				return getGuests();
			case ImplementationPackage.ROOM__KEYS:
				return getKeys();
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
			case ImplementationPackage.ROOM__NUMBER:
				setNumber(((Integer)newValue).intValue());
				return;
			case ImplementationPackage.ROOM__STATUS:
				setStatus((RoomStatus)newValue);
				return;
			case ImplementationPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)newValue);
				return;
			case ImplementationPackage.ROOM__TAB:
				getTab().clear();
				getTab().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__ROOMISSUES:
				getRoomissues().clear();
				getRoomissues().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection)newValue);
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
			case ImplementationPackage.ROOM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ImplementationPackage.ROOM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ImplementationPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)null);
				return;
			case ImplementationPackage.ROOM__TAB:
				getTab().clear();
				return;
			case ImplementationPackage.ROOM__ROOMISSUES:
				getRoomissues().clear();
				return;
			case ImplementationPackage.ROOM__GUESTS:
				getGuests().clear();
				return;
			case ImplementationPackage.ROOM__KEYS:
				getKeys().clear();
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
			case ImplementationPackage.ROOM__NUMBER:
				return number != NUMBER_EDEFAULT;
			case ImplementationPackage.ROOM__STATUS:
				return status != STATUS_EDEFAULT;
			case ImplementationPackage.ROOM__ROOMTYPE:
				return roomtype != null;
			case ImplementationPackage.ROOM__TAB:
				return tab != null && !tab.isEmpty();
			case ImplementationPackage.ROOM__ROOMISSUES:
				return roomissues != null && !roomissues.isEmpty();
			case ImplementationPackage.ROOM__GUESTS:
				return guests != null && !guests.isEmpty();
			case ImplementationPackage.ROOM__KEYS:
				return keys != null && !keys.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
