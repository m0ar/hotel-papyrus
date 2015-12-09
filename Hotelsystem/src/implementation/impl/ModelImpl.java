/**
 */
package implementation.impl;

import implementation.ConferenceRoom;
import implementation.ConferenceRoomBooking;
import implementation.ImplementationPackage;
import implementation.Key;
import implementation.Model;
import implementation.Room;
import implementation.RoomBooking;
import implementation.RoomType;

import java.util.Collection;
import java.util.*;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
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

	public EList getAvaiableRooms(String startDate, String endDate) {
		Date sd = new Date(startDate);
		Date ed = new Date(endDate);

		EList unavailableRooms = getUnavailableRooms(sd, ed);
		EList roomClone = new BasicEList(room);
		roomClone.removeAll(unavailableRooms);
		return roomClone;
	}

	private EList getUnavailableRooms(Date sd, Date ed) {
		EList unavailableRooms = new BasicEList();

		for(BookingImpl booking : RoomBooking) {
			Date bookingSd = new Date(booking.startDate);
			Date bookingEd = new Date(booking.endDate);

			// sd	bookingSd	  ed		=== overlap
			boolean overlapBookingSd = sd.before(bookingSd) && ed.after(bookingSd);
			
			// sd	bookingEd	  ed		=== overlap
			boolean overlapBookingEd = sd.before(bookingEd) && ed.after(bookingEd);

			if(overlapBookingEd || overlapBookingSd) {
				for(RoomImpl room : booking.room)
					unavailableRooms.add(room);
			}
		}

		return unavailableRooms;
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
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl