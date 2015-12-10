/**
 */
package implementation.impl;

import implementation.BookingController;
import implementation.ConferenceRoom;
import implementation.ImplementationPackage;
import implementation.Model;

import implementation.RoomType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.BookingControllerImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingControllerImpl extends MinimalEObjectImpl.Container implements BookingController {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BOOKING_CONTROLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.BOOKING_CONTROLLER__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.BOOKING_CONTROLLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reserveRoomtype(String startDate, String endDate, RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectExtras(String extrasList) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePayment(String cardDetails, int amount, int age) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(int reservationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingData(int nbrOfGuests, int nbrOfRooms, String startDate, String endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void confirmBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList findAvailableRoomTypes(int nbrOfGuests, String startDate, String endDate, int nbrOfRooms) {
		Log.log("-------------------- Find available room types --------------------");
		
		EList availableRooms = getAvaiableRooms(startDate, endDate);
		EList<Tuple<RoomTypeImpl, Integer>> summary = summarizeRooms(availableRooms);
		
		Log.log("Room type summaries:");
		for(Tuple<RoomTypeImpl, Integer> o : summary)
			Log.log(o.x + "\tNumber of available: " + o.y + "\n\n");
		
		return summary;
	}

	private EList<Tuple<RoomTypeImpl, Integer>> summarizeRooms(EList rooms) {
		EList<Tuple<RoomTypeImpl, Integer>> summarize = new BasicEList<Tuple<RoomTypeImpl, Integer>>();

		for(RoomImpl room : (EList<RoomImpl>)model.getRoom()) {
			if(!tryIncRoomType(summarize, (RoomTypeImpl)room.getRoomtype()))
				summarize.add(new Tuple<RoomTypeImpl, Integer>((RoomTypeImpl)room.getRoomtype(), 1));
		}

		return summarize;
	}
	
	private boolean tryIncRoomType(EList<Tuple<RoomTypeImpl, Integer>> list, RoomTypeImpl roomType) {
		for(Tuple<RoomTypeImpl, Integer> t : list) {
			if(t.x.equals(roomType)) {
				t.y = t.y + 1;
				return true;
			}
		}
		return false;
	}
	
	public EList getAvaiableRooms(String startDate, String endDate) {
		Date sd = parseDate(startDate);
		Date ed = parseDate(endDate);
		
		Log.log("Requested start date: " + sd);
		Log.log("Requested end date: " + ed);
		
		EList unavailableRooms = getUnavailableRooms(sd, ed);
		
		Log.log("Number of unavailable rooms:" + unavailableRooms.size());
		
		EList roomClone = new BasicEList(model.getRoom());
		roomClone.removeAll(unavailableRooms);
		
		Log.log("Available rooms: " + roomClone.size());
		
		return roomClone;
	}

	private EList getUnavailableRooms(Date sd, Date ed) {
		EList unavailableRooms = new BasicEList();

		for(RoomBookingImpl booking : (EList<RoomBookingImpl>)model.getRoombooking()) {
			Date bookingSd = parseDate(booking.startDate);
			Date bookingEd = parseDate(booking.endDate);

			// sd	bookingSd	  ed		=== overlap
			boolean overlapBookingSd = sd.before(bookingSd) && ed.after(bookingSd);
			
			// sd	bookingEd	  ed		=== overlap
			boolean overlapBookingEd = sd.before(bookingEd) && ed.after(bookingEd);

			if(overlapBookingEd || overlapBookingSd) {
				for(RoomImpl room : (EList<RoomImpl>)booking.getRoom())
					unavailableRooms.add(room);
			}
		}

		return unavailableRooms;
	}
	
	private Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void requestConferenceRoom(ConferenceRoom conferenceRoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList findAvailableConferenceRooms(String startTime, String endTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterResidentialsCredentials(String names, int SSNs) {
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
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				setModel((Model)newValue);
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
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				setModel((Model)null);
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
			case ImplementationPackage.BOOKING_CONTROLLER__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

	public class Tuple<X, Y> { 
		public X x; 
		public Y y; 
		public Tuple(X x, Y y) { 
		this.x = x; 
		this.y = y; 
		} 
	} 

} //BookingControllerImpl
