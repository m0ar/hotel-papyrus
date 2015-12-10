/**
 */
package implementation.impl;

import implementation.IAdministration;
import implementation.IBooking;
import implementation.ImplementationPackage;
import implementation.Main;
import implementation.RoomStatus;
import implementation.impl.BookingControllerImpl.Tuple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.MainImpl#getIadministration <em>Iadministration</em>}</li>
 *   <li>{@link implementation.impl.MainImpl#getIbooking <em>Ibooking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main {
	/**
	 * The cached value of the '{@link #getIadministration() <em>Iadministration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIadministration()
	 * @generated
	 * @ordered
	 */
	protected IAdministration iadministration;

	/**
	 * The cached value of the '{@link #getIbooking() <em>Ibooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbooking()
	 * @generated
	 * @ordered
	 */
	protected IBooking ibooking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdministration getIadministration() {
		if (iadministration != null && iadministration.eIsProxy()) {
			InternalEObject oldIadministration = (InternalEObject)iadministration;
			iadministration = (IAdministration)eResolveProxy(oldIadministration);
			if (iadministration != oldIadministration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.MAIN__IADMINISTRATION, oldIadministration, iadministration));
			}
		}
		return iadministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdministration basicGetIadministration() {
		return iadministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIadministration(IAdministration newIadministration) {
		IAdministration oldIadministration = iadministration;
		iadministration = newIadministration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MAIN__IADMINISTRATION, oldIadministration, iadministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking getIbooking() {
		if (ibooking != null && ibooking.eIsProxy()) {
			InternalEObject oldIbooking = (InternalEObject)ibooking;
			ibooking = (IBooking)eResolveProxy(oldIbooking);
			if (ibooking != oldIbooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.MAIN__IBOOKING, oldIbooking, ibooking));
			}
		}
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking basicGetIbooking() {
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIbooking(IBooking newIbooking) {
		IBooking oldIbooking = ibooking;
		ibooking = newIbooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MAIN__IBOOKING, oldIbooking, ibooking));
	}

	public static void main(String[] args) {
		MainImpl main = new MainImpl();
		main.init();
		System.out.println("Welcome to Hotel-Papyrus!!");
		Scanner in = new Scanner(System.in);
		//in.useDelimiter(Pattern.compile("\\n"));
		main.displayModeMenu(in);
	}
	
	private void displayModeMenu(Scanner in){
		while (true) {
			System.out.println("Press 0 to exit program.");
			System.out.println("Press 1 to enter booking mode.");
			System.out.println("Press 2 to enter administration mode.");
			int mode = in.nextInt();
			in.nextLine();
			if(mode == 0){
				in.close();
				System.exit(0);
			}else if(mode == 1){
				enterBookingMode(in);
			}else if(mode == 2){
				enterAdminMode(in);
			}else{
				System.out.println("Didn't understand input. Please try again.");
			}
			
		}
		
		//ibooking.findAvailableRoomTypes(2, "2015-12-12", "2015-12-14", 1);
	}
	
	private void enterBookingMode(Scanner in){
		System.out.println("Booking mode");
		while(true){
			System.out.println("Press 1 to go back.");
			System.out.println("Choose operation (book room, book conference, edit booking, remove booking)");
			if(in.hasNextInt()){
				int i = in.nextInt();
				in.nextLine();
				if(i==0){
					in.close();
					System.exit(0);
				}else if(i==1){
					displayModeMenu(in);
				}else{
					System.out.println("Didn't understand input. Please try again.");					
				}
			}else{
				String operation = in.nextLine();
				if(operation.equalsIgnoreCase("book room")){
					bookRoom(in);
				}else if(operation.equalsIgnoreCase("book conference")){
					
				}else if(operation.equalsIgnoreCase("edit booking")){
					
				}else if(operation.equalsIgnoreCase("remove booking")){
					
				}else{
					System.out.println("Didn't understand input. Please try again.");										
				}
			}
		}
	}
	
	private void bookRoom(Scanner in) {
		System.out.println("Enter parameters number of guests (1 <= number), start date (YYYY-MM-DD), end date (YYYY-MM-DD) and number of rooms (1 <= number <= 5) separated by a comma. Example input: '2,2015-12-13,2015-12-15,1'.");
		String params = in.nextLine();
		String[] split = params.split(",");
		if(split.length == 4) {
			int nbrOfGuests = parseInt(split[0]);
			Date startDate = parseDate(split[1]);
			Date endDate = parseDate(split[2]);
			int nbrOfRooms = parseInt(split[3]);
			
			if(nbrOfRooms > 5)
				System.out.println("If you want to book more than 5 rooms, please contact an employee.");
			else if(startDate.after(endDate))
				System.out.println("The start date must be before the end date.");
			else {
				if(nbrOfGuests >= 1 && nbrOfRooms >= 1 && startDate != null && endDate != null) {
					EList availableRoomTypes = ibooking.findAvailableRoomTypes(nbrOfGuests, split[1], split[2], nbrOfRooms);
					if(availableRoomTypes != null) {
						System.out.println("Found the following available room types:\n");
						
						int count = 0;
						for(int i = 0; i < availableRoomTypes.size(); i++) {
							count++;
							Tuple t = (Tuple)availableRoomTypes.get(i);
							System.out.println(t.x + "\tNumber of available rooms: " + t.y + "   [" + count + "]\n\n");
						}
						
						System.out.println("Please select room types by entering numbers 1 to " + count + " one by one. Enter the number 0 if you want to abort.");
						RoomTypeImpl[] selectedRoomTypes = new RoomTypeImpl[nbrOfRooms];
						boolean failure = false;
						
						for(int i = 0; i < nbrOfRooms; i++) {
							String roomType = in.nextLine();
							int parsed = parseInt(roomType);
							if(parsed > count || parsed < 1) {
								System.out.println("Invalid parameters.");
								failure = true;
								break;
							} else if(parsed == 0) {
								System.out.println("Aborted.");
								failure = true;
								break;
							} else {
								System.out.println("Adding...");
								selectedRoomTypes[i] = (RoomTypeImpl)((Tuple)availableRoomTypes.get(parsed - 1)).x;
								System.out.println((i + 1) + "/" + nbrOfRooms + " room types selected.");
							}
						}
						
						if(!failure) {
							int maxNbrOfGuests = calculateMaxNbrOfGuests(selectedRoomTypes);
							
							if(nbrOfGuests > maxNbrOfGuests)
								System.out.println("The rooms you have chosen cannot have more than " + maxNbrOfGuests + " guests.");
							else {
								System.out.println("Done!");
							}
						}
					} else
						System.out.println("Couldn't find any available rooms.");
				} else
					System.out.println("Invalid parameters.");
			}
		} else
			System.out.println("Invalid parameters.");
	}
	
	private int calculateMaxNbrOfGuests(RoomTypeImpl[] roomTypes) {
		int count = 0;
		for(int i = 0; i < roomTypes.length; i++){
			count += 2;//rt.getMaxNbrOfGuests(); TODO
		}
		return count;
	}
	
	private Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}
	
	private int parseInt(String integerString) {
		try {
			return Integer.parseInt(integerString);
		} catch(NumberFormatException e) {
			return -1;
		}
	}

	private void enterAdminMode(Scanner in){
		System.out.println("Administration mode");
		while(true){
			System.out.println("Press 1 to go back.");
			System.out.println("Choose operation (check in, check out, update tab, edit customer, remove customer, create room, remove room, edit room)");
			if(in.hasNextInt()){
				int i = in.nextInt();
				in.nextLine();
				if(i==0){
					in.close();
					System.exit(0);
				}else if(i==1){
					displayModeMenu(in);
				}else{
					System.out.println("Didn't understand input. Please try again.");					
				}
			}else{
				String operation = in.nextLine();
				if(operation.equalsIgnoreCase("check in")){
					
				}else if(operation.equalsIgnoreCase("check out")){
					
				}else if(operation.equalsIgnoreCase("update tab")){
					
				}else if(operation.equalsIgnoreCase("edit customer")){
					
				}else if(operation.equalsIgnoreCase("remove customer")){
					
				}else if(operation.equalsIgnoreCase("create room")){
					
				}else if(operation.equalsIgnoreCase("remove room")){
					
				}else if(operation.equalsIgnoreCase("edit room")){
					
				}else{
					System.out.println("Didn't understand input. Please try again.");										
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init() {
		ModelImpl model = new ModelImpl();
		initModel(model);

		BookingControllerImpl bc = new BookingControllerImpl();
		bc.setModel(model);
		ibooking = bc;

		AdminControllerImpl ac = new AdminControllerImpl();
		ac.setModel(model);
		iadministration = ac;

	}
	
	private void initModel(ModelImpl model){
		EList roomTypes = initRoomTypes();
		EList rooms = initRooms(roomTypes);
		model.getRoomtype().addAll(roomTypes);
		model.getRoom().addAll(rooms);
		
	}
	
	private EList initRooms(EList roomTypes){
		EList rooms = new BasicEList();
		Random random = new Random();
		for(int floor = 100; floor <= 500; floor += 100){
			for(int roomNr = 1; roomNr <= 50; roomNr++){
				RoomImpl room = new RoomImpl();
				room.setNumber(floor + roomNr);
				int rnd = random.nextInt(roomTypes.size());
				room.setRoomtype((RoomTypeImpl)roomTypes.get(rnd));
				room.setStatus(RoomStatus.AVAILABLE_LITERAL);
				rooms.add(room);
			}
		}
		return rooms;
	}
	
	private EList initRoomTypes(){
		EList roomTypes = new BasicEList();
		RoomTypeImpl type1 = new RoomTypeImpl();
		type1.setBalcony(false);
		type1.setDescription("Standard room with single bed");
		type1.setMaxNbrOfExtraBeds(1);
		type1.setMiniBar(true);
		type1.setName("Single room");
		type1.setNonSmoking(true);
		type1.setPrice(300);
		type1.setTv(true);
		type1.setWifi(true);
		BedImpl singleBed = new BedImpl();
		singleBed.setNbrOfSpots(1);
		singleBed.setType("Single bed");
		type1.getBed().add(singleBed);
		
		
		RoomTypeImpl type2 = new RoomTypeImpl();
		type2.setBalcony(false);
		type2.setDescription("Standard room with double bed");
		type2.setMaxNbrOfExtraBeds(2);
		type2.setMiniBar(true);
		type2.setName("Double room");
		type2.setNonSmoking(true);
		type2.setPrice(600);
		type2.setTv(true);
		type2.setWifi(true);
		BedImpl doubleBed = new BedImpl();
		doubleBed.setNbrOfSpots(2);
		doubleBed.setType("Double bed");
		type1.getBed().add(doubleBed);		

		RoomTypeImpl type3 = new RoomTypeImpl();
		type3.setBalcony(true);
		type3.setDescription("Suite with double bed");
		type3.setMaxNbrOfExtraBeds(3);
		type3.setMiniBar(true);
		type3.setName("Suite");
		type3.setNonSmoking(true);
		type3.setPrice(1500);
		type3.setTv(true);
		type3.setWifi(true);
		type3.getBed().add(doubleBed);
		roomTypes.add(type1);
		roomTypes.add(type2);
		roomTypes.add(type3);
		return roomTypes;
	}
	
//	private EList initRooms(EList roomTypes){
//		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.MAIN__IADMINISTRATION:
				if (resolve) return getIadministration();
				return basicGetIadministration();
			case ImplementationPackage.MAIN__IBOOKING:
				if (resolve) return getIbooking();
				return basicGetIbooking();
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				setIadministration((IAdministration)newValue);
				return;
			case ImplementationPackage.MAIN__IBOOKING:
				setIbooking((IBooking)newValue);
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				setIadministration((IAdministration)null);
				return;
			case ImplementationPackage.MAIN__IBOOKING:
				setIbooking((IBooking)null);
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				return iadministration != null;
			case ImplementationPackage.MAIN__IBOOKING:
				return ibooking != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
