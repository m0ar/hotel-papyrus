/**
 */
package implementation.impl;

import implementation.Bill;
import implementation.IAdministration;
import implementation.IBooking;
import implementation.IProfile;
import implementation.ImplementationPackage;
import implementation.Main;
import implementation.RoomStatus;
import implementation.RoomType;
import implementation.impl.BookingControllerImpl.Tuple;

import java.text.DecimalFormat;
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
 *   <li>{@link implementation.impl.MainImpl#getIprofile <em>Iprofile</em>}</li>
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
	 * The cached value of the '{@link #getIprofile() <em>Iprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIprofile()
	 * @generated
	 * @ordered
	 */
	protected IProfile iprofile;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProfile getIprofile() {
		if (iprofile != null && iprofile.eIsProxy()) {
			InternalEObject oldIprofile = (InternalEObject)iprofile;
			iprofile = (IProfile)eResolveProxy(oldIprofile);
			if (iprofile != oldIprofile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.MAIN__IPROFILE, oldIprofile, iprofile));
			}
		}
		return iprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProfile basicGetIprofile() {
		return iprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIprofile(IProfile newIprofile) {
		IProfile oldIprofile = iprofile;
		iprofile = newIprofile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MAIN__IPROFILE, oldIprofile, iprofile));
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
		System.out.println("Enter start date (YYYY-MM-DD):");
		String originalStartDate = in.nextLine();
		System.out.println("Enter end date (YYYY-MM-DD):");
		String originalEndDate = in.nextLine();
		System.out.println("Enter nuber of guests:");
		int nbrOfGuests = parseInt(in.nextLine());
		System.out.println("Enter number of rooms:");
		int nbrOfRooms = parseInt(in.nextLine());
		
		Date startDate = parseDate(originalStartDate);
		Date endDate = parseDate(originalEndDate);
		
		if(!ibooking.validateBookingData(nbrOfGuests, nbrOfRooms, originalStartDate, originalEndDate)) {
			System.out.println("Invalid parameters");
			return;
		}
		
		if(nbrOfRooms > 5)
			System.out.println("If you want to book more than 5 rooms, please contact an employee.");
		else if(startDate.after(endDate))
			System.out.println("The start date must be before the end date.");
		else {
			if(nbrOfGuests >= 1 && nbrOfRooms >= 1 && startDate != null && endDate != null) {
				EList availableRoomTypes = ibooking.findAvailableRoomTypes(nbrOfGuests, originalStartDate, originalEndDate, nbrOfRooms);
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
							selectedRoomTypes[i] = (RoomTypeImpl)((Tuple)availableRoomTypes.get(parsed - 1)).x;
							System.out.println((i + 1) + "/" + nbrOfRooms + " room types selected.");
						}
					}
					
					if(!failure) {
						int maxNbrOfGuests = calculateMaxNbrOfGuests(selectedRoomTypes);
						
						if(nbrOfGuests > maxNbrOfGuests)
							System.out.println("The rooms you have chosen cannot have more than " + maxNbrOfGuests + " guests.");
						else {
							int reservationId = ibooking.reserveRoomtype(originalStartDate, originalEndDate, getEListFromArray(selectedRoomTypes));
							
							if(reservationId == -1) {
								System.out.println("The rooms are now longer available. Please try again.");
								return;
							}
							
							System.out.println("The rooms you have selected has temporarily been reserved.");
							
							//TODO: EXTRAS
							/*System.out.println("Select extras:");
							
							for(int i = 0; i < selectedRoomTypes.length; i++) {
								System.out.println("Select extras for room type " + selectedRoomTypes[i].name + " by entering the name of the extras separated by commas.");
								System.out.println("The room has the following available extras: " + getExtras(selectedRoomTypes[i]));
							}*/
							
							System.out.println("What is your full name?");
							String name = in.nextLine();
							System.out.println("What is your social security number?");
							String social = in.nextLine();
							System.out.println("What is your address?");
							String address = in.nextLine();
							System.out.println("What is your phone number?");
							String phone = in.nextLine();
							
							CustomerImpl customer = (CustomerImpl)iprofile.getCustomerDetails(social);
							customer.setAddress(address);
							customer.setName(name);
							customer.setPhoneNbr(phone);
							
							EList guestNames = new BasicEList();
							EList guestSocials = new BasicEList();
							
							if(nbrOfGuests > 1) {
								int otherGuests = nbrOfGuests - 1;
								System.out.println("------ Enter the name of the other guests: ------");
								for(int i = 0; i < otherGuests; i++) {
									System.out.println("Enter name of guest " + (i+1) + ":");
									String guestName = in.nextLine();
									System.out.println("Enter social of guest " + (i+1) + ":");
									String guestSocial = in.nextLine();
									ibooking.enterResidentialsCredentials(guestName, guestSocial, reservationId);
									
									guestNames.add(guestName);
									guestSocials.add(guestSocial);
								}
							}
							
							System.out.println("---------- Summary of your booking: ----------");
							System.out.println("\tStart date: " + startDate);
							System.out.println("\tEnd date: " + endDate);
							System.out.println("\tNumber of rooms: " + nbrOfRooms);
							System.out.println("\tNumber of guests: " + nbrOfGuests);
							System.out.println("\tSelected room types:");
							for(int i = 0; i < selectedRoomTypes.length; i++)
								System.out.println(selectedRoomTypes[i].toString());
							//TODO print extras
							System.out.println("\tYour name: " + name);
							System.out.println("\tYour social: " + social);
							System.out.println("\tYour address: " + address);
							System.out.println("\tYour phone: " + phone);
							if(guestNames.size() > 0) {
								System.out.println("\tGuests:");
								for(int i = 0; i < guestNames.size(); i++)
									System.out.println("\t" + guestNames.get(i) + " - " + guestSocials.get(i));
							}
							
							System.out.println("Do you want to confirm the booking?");
							String confirmation = in.nextLine();
							if(confirmation.toLowerCase().equals("yes")) {
								System.out.println("Do you want to pay now or later?");
								String payment = in.nextLine();
								if(payment.toLowerCase().equals("now")) {
									System.out.println("Please enter your card details:");
									String paymentInfo = in.nextLine();
									System.out.println("What is your age?");
									String age = in.nextLine();
									
									if(parseInt(age) >= 18) {
										if(ibooking.makePayment(paymentInfo, (int)getTotalCost(selectedRoomTypes), parseInt(age))) {
											ibooking.createBooking(reservationId);
											System.out.println("Your booking was completed!");
										} else
											System.out.println("Payment failed.");
									}
								} else {
									ibooking.createBooking(reservationId);
									System.out.println("Your booking was completed!");
								}
							} else {
								System.out.println("Aborting booking..");
								ibooking.removeReservation(reservationId);
							}
						}
					}
				} else
					System.out.println("Couldn't find any available rooms.");
			} else
				System.out.println("Invalid parameters.");
		}
	}
	
	private EList getEListFromArray(Object[] array) {
		EList list = new BasicEList();
		for(int i = 0; i < array.length; i++)
			list.add(array[i]);
		return list;
	}
	
	private double getTotalCost(RoomTypeImpl[] roomTypes) {
		double totalCost = 0;
		for(int i = 0; i < roomTypes.length; i++)
			totalCost += roomTypes[i].getPrice();
		return totalCost;
	}
	
	private int calculateMaxNbrOfGuests(RoomTypeImpl[] roomTypes) {
		int count = 0;
		for(int i = 0; i < roomTypes.length; i++){
			count += roomTypes[i].getNbrOfGuests();
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
					checkIn(in);
				}else if(operation.equalsIgnoreCase("check out")){
					checkOut(in);
				}else if(operation.equalsIgnoreCase("update tab")){
					
				}else if(operation.equalsIgnoreCase("edit customer")){
					
				}else if(operation.equalsIgnoreCase("remove customer")){
					
				}else if(operation.equalsIgnoreCase("create room")){
					RoomType r = new RoomTypeImpl();
					Boolean b = false;
					System.out.println("Enter roomID");
					int i = in.nextInt();
					
					System.out.println("Is it an existing room type?");
					in.nextLine();
					String j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						System.out.println("What room type is it? (Single room / Double Room / Suit");
						j = in.nextLine();
						//r = model.getRoomType(name);
					}
					
					System.out.println("Enter room type name");
					String name = in.nextLine();
					r.setName(name);
					
					System.out.println("Add a description of the room.");
					String d = in.nextLine();
					r.setDescription(d);
					
					System.out.println("Does it have a balcony? (y/n)");
					j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						b = true;
					}else{
						b = false;
					}
					r.setBalcony(b);

					System.out.println("Enter the maximum number of extra beds in the room");
					int n = in.nextInt();
					r.setMaxNbrOfExtraBeds(n);
					
					System.out.println("Does the room have a minibar? (y/n)");
					in.nextLine();
					j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						b = true;
					}else{
						b = false;
					}
					r.setMiniBar(b);
					
					System.out.println("Is it nonsmoking? (y/n)");
					j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						b = true;
					}else{
						b = false;
					}
					r.setNonSmoking(b);
					
					System.out.println("Does the room have a TV? (y/n)");
					j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						b = true;
					}else{
						b = false;
					}
					r.setTv(b);
					
					System.out.println("Does the room have a WiFi? (y/n)");
					j = in.nextLine();
					if(j.equalsIgnoreCase("y")){
						b = true;
					}else{
						b = false;
					}
					r.setWifi(b);
					
					getIadministration().createRoom(i, r);
					
				}else if(operation.equalsIgnoreCase("remove room")){
					
				}else if(operation.equalsIgnoreCase("edit room")){
					
				}else{
					System.out.println("Didn't understand input. Please try again.");										
				}
			}
		}
	}
	
	private void checkOut(Scanner in){
		while(true){
			System.out.println("Enter booking number");
			int bookingNr = in.nextInt();
			in.nextLine();
			Bill finalBill = iadministration.checkOut(bookingNr);
			if(finalBill == null){
				System.out.println("Could not find booking, please try again");				
			}else{
				DecimalFormat df = new DecimalFormat("#.##");
				while(true){
					System.out.println("The total cost is " + df.format(finalBill.getCost()));
					System.out.println("Please enter credit card details");
					String creditCard = in.nextLine();
					/*if(bankprovides.makePayment(finalBill.getCost(), creditCard)){
						System.out.println("Check out was successfull");
						return;
					}else{
						System.out.println("Payment faild, please try again");
					}*/
				}
			}
		}
	}
	
	private void checkIn(Scanner in) {
		System.out.println("Enter booking number");
		int bookingNr = in.nextInt();
		in.nextLine();
		iadministration.checkIn(bookingNr);
		/* loopa genom alla bokade rum och sätt nycklar, admin anger nyckelID */
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init() {
		ModelImpl model = new ModelImpl();
		initModel(model);
		
		iprofile = new ProfileHandlerImpl();
		((ProfileHandlerImpl)iprofile).setModel(model);
		
		//bankprovides = new BankImpl();

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
			case ImplementationPackage.MAIN__IPROFILE:
				if (resolve) return getIprofile();
				return basicGetIprofile();
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
			case ImplementationPackage.MAIN__IPROFILE:
				setIprofile((IProfile)newValue);
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
			case ImplementationPackage.MAIN__IPROFILE:
				setIprofile((IProfile)null);
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
			case ImplementationPackage.MAIN__IPROFILE:
				return iprofile != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
