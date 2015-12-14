/**
 */
package implementation.impl;

import implementation.Booking;
import implementation.ConferenceRoom;
import implementation.ConferenceRoomBooking;
import implementation.Customer;
import implementation.ImplementationPackage;
import implementation.Key;
import implementation.Model;
import implementation.Room;
import implementation.RoomBooking;
import implementation.RoomType;

import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ModelImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getConferenceroombooking <em>Conferenceroombooking</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getKey <em>Key</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getConferenceroom <em>Conferenceroom</em>}</li>
 *   <li>{@link implementation.impl.ModelImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList room;

	/**
	 * The cached value of the '{@link #getConferenceroombooking() <em>Conferenceroombooking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceroombooking()
	 * @generated
	 * @ordered
	 */
	protected EList conferenceroombooking;

	/**
	 * The cached value of the '{@link #getRoombooking() <em>Roombooking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombooking()
	 * @generated
	 * @ordered
	 */
	protected EList roombooking;

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
	 * The cached value of the '{@link #getConferenceroom() <em>Conferenceroom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceroom()
	 * @generated
	 * @ordered
	 */
	protected EList conferenceroom;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ModelImpl() {
		super();
		conferenceroom = new BasicEList();
		key = new BasicEList();
		roombooking = new BasicEList();
		conferenceroombooking = new BasicEList();
		room = new BasicEList();
		roomtype = new BasicEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomtype() {
		if (roomtype == null) {
			roomtype = new EObjectResolvingEList(RoomType.class, this, ImplementationPackage.MODEL__ROOMTYPE);
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList(Room.class, this, ImplementationPackage.MODEL__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConferenceroombooking() {
		if (conferenceroombooking == null) {
			conferenceroombooking = new EObjectResolvingEList(ConferenceRoomBooking.class, this, ImplementationPackage.MODEL__CONFERENCEROOMBOOKING);
		}
		return conferenceroombooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoombooking() {
		if (roombooking == null) {
			roombooking = new EObjectResolvingEList(RoomBooking.class, this, ImplementationPackage.MODEL__ROOMBOOKING);
		}
		return roombooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKey() {
		if (key == null) {
			key = new EObjectResolvingEList(Key.class, this, ImplementationPackage.MODEL__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConferenceroom() {
		if (conferenceroom == null) {
			conferenceroom = new EObjectResolvingEList(ConferenceRoom.class, this, ImplementationPackage.MODEL__CONFERENCEROOM);
		}
		return conferenceroom;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCustomer() {
		if (customer == null) {
			customer = new EObjectResolvingEList(Customer.class, this, ImplementationPackage.MODEL__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Customer getCustomer(String ssn) {
		for(int i = 0; i < customer.size(); i++){
			Customer c = (Customer)customer.get(i);
			if(c.getSocialSecurityNumber() == ssn){
				return c;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Booking getBooking(int bookingID) {
		for(int i = 0; i < roombooking.size(); i++){
			RoomBooking b = (RoomBooking)roombooking.get(i);
			if(b.getBookingNr() == bookingID){
				return b;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Room getRoom(int roomNr) {
		for(int i = 0; i < room.size(); i++){
			Room r = (Room)room.get(i);
			if(r.getNumber() == roomNr){
				return r;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoomType getRoomType(String name) {
		for(int i = 0; i < roomtype.size(); i++){
			RoomType r = (RoomType)roomtype.get(i);
			if(r.getName() == name){
				return r;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.MODEL__ROOMTYPE:
				return getRoomtype();
			case ImplementationPackage.MODEL__ROOM:
				return getRoom();
			case ImplementationPackage.MODEL__CONFERENCEROOMBOOKING:
				return getConferenceroombooking();
			case ImplementationPackage.MODEL__ROOMBOOKING:
				return getRoombooking();
			case ImplementationPackage.MODEL__KEY:
				return getKey();
			case ImplementationPackage.MODEL__CONFERENCEROOM:
				return getConferenceroom();
			case ImplementationPackage.MODEL__CUSTOMER:
				return getCustomer();
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
			case ImplementationPackage.MODEL__ROOMTYPE:
				getRoomtype().clear();
				getRoomtype().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__CONFERENCEROOMBOOKING:
				getConferenceroombooking().clear();
				getConferenceroombooking().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__ROOMBOOKING:
				getRoombooking().clear();
				getRoombooking().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__KEY:
				getKey().clear();
				getKey().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__CONFERENCEROOM:
				getConferenceroom().clear();
				getConferenceroom().addAll((Collection)newValue);
				return;
			case ImplementationPackage.MODEL__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection)newValue);
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
			case ImplementationPackage.MODEL__ROOMTYPE:
				getRoomtype().clear();
				return;
			case ImplementationPackage.MODEL__ROOM:
				getRoom().clear();
				return;
			case ImplementationPackage.MODEL__CONFERENCEROOMBOOKING:
				getConferenceroombooking().clear();
				return;
			case ImplementationPackage.MODEL__ROOMBOOKING:
				getRoombooking().clear();
				return;
			case ImplementationPackage.MODEL__KEY:
				getKey().clear();
				return;
			case ImplementationPackage.MODEL__CONFERENCEROOM:
				getConferenceroom().clear();
				return;
			case ImplementationPackage.MODEL__CUSTOMER:
				getCustomer().clear();
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
			case ImplementationPackage.MODEL__ROOMTYPE:
				return roomtype != null && !roomtype.isEmpty();
			case ImplementationPackage.MODEL__ROOM:
				return room != null && !room.isEmpty();
			case ImplementationPackage.MODEL__CONFERENCEROOMBOOKING:
				return conferenceroombooking != null && !conferenceroombooking.isEmpty();
			case ImplementationPackage.MODEL__ROOMBOOKING:
				return roombooking != null && !roombooking.isEmpty();
			case ImplementationPackage.MODEL__KEY:
				return key != null && !key.isEmpty();
			case ImplementationPackage.MODEL__CONFERENCEROOM:
				return conferenceroom != null && !conferenceroom.isEmpty();
			case ImplementationPackage.MODEL__CUSTOMER:
				return customer != null && !customer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
