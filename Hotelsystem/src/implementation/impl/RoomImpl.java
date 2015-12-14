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
 *   <li>{@link implementation.impl.RoomImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getRoomissue <em>Roomissue</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link implementation.impl.RoomImpl#getKey <em>Key</em>}</li>
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
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected EList bill;

	/**
	 * The cached value of the '{@link #getRoomissue() <em>Roomissue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomissue()
	 * @generated
	 * @ordered
	 */
	protected EList roomissue;

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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected RoomImpl() {
		super();
		bill = new BasicEList();
		roomissue = new BasicEList();
		guest = new BasicEList();
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
	public EList getBill() {
		if (bill == null) {
			bill = new EObjectResolvingEList(Bill.class, this, ImplementationPackage.ROOM__BILL);
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomissue() {
		if (roomissue == null) {
			roomissue = new EObjectResolvingEList(RoomIssue.class, this, ImplementationPackage.ROOM__ROOMISSUE);
		}
		return roomissue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList(Guest.class, this, ImplementationPackage.ROOM__GUEST);
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKey() {
		if (key == null) {
			key = new EObjectResolvingEList(Key.class, this, ImplementationPackage.ROOM__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getTotalBill() {
		double cost = 0;
		for(int i = 0; i < bill.size(); i++){
			Bill b = (Bill)bill.get(i);
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
			case ImplementationPackage.ROOM__BILL:
				return getBill();
			case ImplementationPackage.ROOM__ROOMISSUE:
				return getRoomissue();
			case ImplementationPackage.ROOM__GUEST:
				return getGuest();
			case ImplementationPackage.ROOM__KEY:
				return getKey();
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
			case ImplementationPackage.ROOM__BILL:
				getBill().clear();
				getBill().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__ROOMISSUE:
				getRoomissue().clear();
				getRoomissue().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection)newValue);
				return;
			case ImplementationPackage.ROOM__KEY:
				getKey().clear();
				getKey().addAll((Collection)newValue);
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
			case ImplementationPackage.ROOM__BILL:
				getBill().clear();
				return;
			case ImplementationPackage.ROOM__ROOMISSUE:
				getRoomissue().clear();
				return;
			case ImplementationPackage.ROOM__GUEST:
				getGuest().clear();
				return;
			case ImplementationPackage.ROOM__KEY:
				getKey().clear();
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
			case ImplementationPackage.ROOM__BILL:
				return bill != null && !bill.isEmpty();
			case ImplementationPackage.ROOM__ROOMISSUE:
				return roomissue != null && !roomissue.isEmpty();
			case ImplementationPackage.ROOM__GUEST:
				return guest != null && !guest.isEmpty();
			case ImplementationPackage.ROOM__KEY:
				return key != null && !key.isEmpty();
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
