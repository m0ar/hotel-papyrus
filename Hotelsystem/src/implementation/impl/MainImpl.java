/**
 */
package implementation.impl;

import implementation.BankProvides;
import implementation.Bill;
import implementation.IAdministration;
import implementation.IBooking;
import implementation.IProfile;
import implementation.ImplementationPackage;
import implementation.Key;
import implementation.Main;
import implementation.PensionType;
import implementation.Room;
import implementation.RoomBooking;
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
		try{
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
		}catch(Exception e){
			System.out.println("An error occurred with error message:");
			System.out.println(e);
			displayModeMenu(in);
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
		System.out.println("Enter number of guests:");
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

							System.out.println("Which pension type do you want?");
							System.out.println("Select from: " + getPensionTypes());
							
							String selectedPensionType = in.nextLine();
							ibooking.selectExtras(selectedPensionType, reservationId);
							
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
									ibooking.addGuest(guestName, guestSocial, reservationId);
									
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
							
							System.out.println("\tPension type: " + selectedPensionType);
							
							System.out.println("\tYour name: " + name);
							System.out.println("\tYour social: " + social);
							System.out.println("\tYour address: " + address);
							System.out.println("\tYour phone: " + phone);
							if(guestNames.size() > 0) {
								System.out.println("\tGuests:");
								for(int i = 0; i < guestNames.size(); i++)
									System.out.println("\t" + guestNames.get(i) + " - " + guestSocials.get(i));
							}
							System.out.println("Total cost: " + getTotalCost(selectedRoomTypes) + " kr");
							
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
										if(ibooking.makePayment(paymentInfo, (int)getTotalCost(selectedRoomTypes), parseInt(age), reservationId)) {
											ibooking.createBooking(reservationId);
											System.out.println("Your booking was completed!");
											System.out.println("Your booking number is " + reservationId);
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
	
	private PensionType parsePensionType(String pt) {
		for(int i = 0; i < PensionType.VALUES.size(); i++)
			if(PensionType.VALUES.get(i).toString().toLowerCase().equals(pt.toLowerCase()))
				return (PensionType)PensionType.VALUES.get(i);
		return PensionType.NONE_LITERAL;
	}
	
	private String getPensionTypes() {
		String result = "";
		for(int i = 0; i < PensionType.VALUES.size(); i++)
			result += "" + PensionType.VALUES.get(i) + ",";
		if(result.endsWith(","))
			result = result.substring(0, result.length() - 1);
		return result;
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
			}else if (finalBill.getCost() < 0.01){
				while(true){
					System.out.println("Should the deposition for booking " + bookingNr + " be returned? (Yes/No)");
					String strReturnDeposit = in.nextLine();
					if(strReturnDeposit.equalsIgnoreCase("Yes")){
						System.out.println("Enter credit card details.");
						String card = in.nextLine();
						if(iadministration.removeDeposition(bookingNr, card)){
							break;
						}else{
							System.out.println("The deposition was not returned. Please try again.");							
						}
					}else if(strReturnDeposit.equalsIgnoreCase("No")){
						break;
					}else{
						System.out.println("Did not understand input. Pleas try again.");
					}
				}
				System.out.println("Booking " + bookingNr + " was successfully checked out.");
				return;
			}else{
				DecimalFormat df = new DecimalFormat("#.##");
				while(true){
					System.out.println("The total cost is " + df.format(finalBill.getCost()));
					System.out.println("Please enter credit card details");
					String creditCard = in.nextLine();
					if(!iadministration.makePayment(creditCard, finalBill.getCost())){
						System.out.println("Payment faild, please try again");
					}else{
						break;
					}
				}
				if(returnDeposition(in, bookingNr)){
					System.out.println("Booking " + bookingNr + " was successfully checked out.");
					return;
				}else{
					return;
				}
			}
		}
	}
	
	private boolean returnDeposition(Scanner in, int bookingNr){
		while(true){
			System.out.println("Should the deposition for booking " + bookingNr + " be returned? (Yes/No)");
			String strReturnDeposit = in.nextLine();
			if(strReturnDeposit.equalsIgnoreCase("Yes")){
				System.out.println("Enter credit card details.");
				String card = in.nextLine();
				if(iadministration.removeDeposition(bookingNr, card)){
					break;
				}else{
					System.out.println("The deposition was not returned. Please try again.");							
				}
			}else if(strReturnDeposit.equalsIgnoreCase("No")){
				break;
			}else{
				System.out.println("Did not understand input. Pleas try again.");
			}
		}
		return true;
	}
	
	private void checkIn(Scanner in) {
		System.out.println("Enter booking number");
		int bookingNr = in.nextInt();
		in.nextLine();
		RoomBooking roomBooking = null;
		try {
			roomBooking = iadministration.checkIn(bookingNr);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("If you want to create a new booking, go to the booking mode");
			displayModeMenu(in);
		}
		if(roomBooking.isCheckedIn()) {
			System.out.println("The guests have already checked in");
		} else {
			System.out.println("The guests have been given following rooms: ");
			for(int i = 0; i < roomBooking.getRoom().size(); i++) {
				Room room = (Room) roomBooking.getRoom().get(i);
				System.out.println("Room nr " + room.getNumber());
			}
			
			System.out.println("Please enter credit card details");
			String creditCard = in.nextLine();
			double amount = roomBooking.getDeposit();
			if(iadministration.reservePayment(amount, creditCard)) {
				System.out.println("Payment was successful");
				for(int i = 0; i < roomBooking.getRoom().size(); i++) {
					Room room = (Room) roomBooking.getRoom().get(i);
					iadministration.updateRoomStatus(room, RoomStatus.OCCUPIED_LITERAL);
					System.out.println("Enter ID for key 1 for the room " + room.getNumber());
					Key key1 = new KeyImpl();
					key1.setId(in.nextInt());
					in.nextLine();
					System.out.println("Enter ID for key 2 for the room " + room.getNumber());
					Key key2 = new KeyImpl();
					key2.setId(in.nextInt());
					in.nextLine();
					iadministration.assignKeysToRoom(room.getNumber(), key1, key2);
				}
				roomBooking.setCheckedIn(true);
			} else {
				System.out.println("Payment failed!");
				for(int i = 0; i < roomBooking.getRoom().size(); i++) {
					Room room = (Room) roomBooking.getRoom().get(i);
					room.getGuests().clear();
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
		
		iprofile = new ProfileHandlerImpl();
		((ProfileHandlerImpl)iprofile).setModel(model);
		
		BankProvides bankprovides = new BankImpl();

		BookingControllerImpl bc = new BookingControllerImpl();
		bc.setModel(model);
		bc.setBankprovides(bankprovides);
		bc.setNextBookingId((model.getRoombooking()).size());
		ibooking = bc;

		AdminControllerImpl ac = new AdminControllerImpl();
		ac.setModel(model);
		ac.setBankprovides(bankprovides);
		iadministration = ac;
	}
	
	private void initModel(ModelImpl model){
		EList roomTypes = initRoomTypes();
		EList rooms = initRooms(roomTypes);
		model.getRoomtypes().addAll(roomTypes);
		model.getRoom().addAll(rooms);
		EList roomBookings = initRoomBookings(model);
		model.getRoombooking().addAll(roomBookings);
		
	}
	
	private EList initRoomBookings(ModelImpl model){
		EList bookings = new BasicEList();
		
		RoomBooking rb1 = new RoomBookingImpl();
		rb1.setBookingNr(1);
		
		CustomerImpl c = new CustomerImpl();
		c.setAddress("Chalmers");
		c.setName("Carl");
		c.setPhoneNbr("01-233210");
		c.setSocialSecurityNumber("661023-6595");
		GuestImpl g = new GuestImpl();
		g.setName("Calle");
		g.setSocialSecurityNumber("510106-0650");
		
		rb1.setCustomer(c);
		rb1.getGuests().add(g);
		rb1.setDeposit(200);
		rb1.setEndDate("2016-02-03");
		rb1.setStartDate("2016-02-01");
		rb1.setReservation(false);
		rb1.setPension(PensionType.BREAKFAST_LITERAL);
		rb1.getChosenroomtypes().add(model.getRoomType("Double room"));
		rb1.setCost(model.getRoomType("Double room").getPrice());
		
		RoomImpl room = new RoomImpl();
		
		for(int i = 0; i < model.getRoom().size(); i++){
			if(((RoomImpl)model.getRoom().get(i)).getRoomtype().getName().equals("Double room")){
				room = (RoomImpl)model.getRoom().get(i);
				break;
			}
		}
		
		rb1.getRoom().add(room);
		bookings.add(rb1);
		
		
		
		RoomBooking rb2 = new RoomBookingImpl();
		rb2.setBookingNr(2);
		
		c = new CustomerImpl();
		c.setAddress("Göteborg");
		c.setName("Erik");
		c.setPhoneNbr("01-292720");
		c.setSocialSecurityNumber("952023-6595");
		g = new GuestImpl();
		g.setName("Sara");
		g.setSocialSecurityNumber("78956-0650");
		
		rb2.setCustomer(c);
		rb2.getGuests().add(g);
		rb2.setDeposit(200);
		rb2.setEndDate("2016-05-05");
		rb2.setStartDate("2016-07-01");
		rb2.setReservation(false);
		rb2.setPension(PensionType.FULL_PENSION_LITERAL);
		rb2.getChosenroomtypes().add(model.getRoomType("Suite"));
		rb2.setCost(model.getRoomType("Suite").getPrice());
		
		room = new RoomImpl();
		
		for(int i = 0; i < model.getRoom().size(); i++){
			if(((RoomImpl)model.getRoom().get(i)).getRoomtype().getName().equals("Suite")){
				room = (RoomImpl)model.getRoom().get(i);
				break;
			}
		}
		
		rb2.getRoom().add(room);
		bookings.add(rb2);
		
		
		
		RoomBooking rb3 = new RoomBookingImpl();
		rb3.setBookingNr(3);
		
		c = new CustomerImpl();
		c.setAddress("Stockholm");
		c.setName("Lisa");
		c.setPhoneNbr("01-202380");
		c.setSocialSecurityNumber("875023-6595");
		
		rb3.setCustomer(c);
		rb3.setDeposit(200);
		rb3.setEndDate("2016-07-05");
		rb3.setStartDate("2016-07-06");
		rb3.setReservation(false);
		rb3.setPension(PensionType.NONE_LITERAL);
		rb3.getChosenroomtypes().add(model.getRoomType("Single room"));
		rb3.setCost(model.getRoomType("Single room").getPrice());
		
		room = new RoomImpl();
		
		for(int i = 0; i < model.getRoom().size(); i++){
			if(((RoomImpl)model.getRoom().get(i)).getRoomtype().getName().equals("Single room")){
				room = (RoomImpl)model.getRoom().get(i);
				break;
			}
		}
		
		rb3.getRoom().add(room);
		bookings.add(rb3);
		
		
		RoomBooking rb4 = new RoomBookingImpl();
		rb4.setBookingNr(4);
		
		c = new CustomerImpl();
		c.setAddress("Mölndal");
		c.setName("Sven");
		c.setPhoneNbr("08-75178");
		c.setSocialSecurityNumber("578023-6595");
		g = new GuestImpl();
		g.setName("Eva");
		g.setSocialSecurityNumber("68956-0650");
		
		rb4.setCustomer(c);
		rb4.getGuests().add(g);
		rb4.setDeposit(200);
		rb4.setEndDate("2016-03-05");
		rb4.setStartDate("2016-03-10");
		rb4.setReservation(false);
		rb4.setPension(PensionType.FULL_PENSION_LITERAL);
		rb4.getChosenroomtypes().add(model.getRoomType("Single room"));
		rb4.getChosenroomtypes().add(model.getRoomType("Single room"));
		rb4.setCost(model.getRoomType("Single room").getPrice() * 2);
		
		room = new RoomImpl();
		int j = 0;
		for(int i = 0; i < model.getRoom().size(); i++){
			if(((RoomImpl)model.getRoom().get(i)).getRoomtype().getName().equals("Single room")){
				j++;
				room = (RoomImpl)model.getRoom().get(i);
				rb4.getRoom().add(room);
				if(j == 2){
					break;
				}
			}
		}
		
		bookings.add(rb4);
		
		
		return bookings;
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
		type1.getBeds().add(singleBed);
		
		
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
		type1.getBeds().add(doubleBed);		

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
		type3.getBeds().add(doubleBed);
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
