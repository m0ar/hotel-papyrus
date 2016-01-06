	/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;

import implementation.BankProvides;
import implementation.PensionType;
import implementation.RoomBooking;
import implementation.RoomStatus;
import implementation.impl.AdminControllerImpl;
import implementation.impl.BankImpl;
import implementation.impl.BedImpl;
import implementation.impl.BookingControllerImpl;
import implementation.impl.CustomerImpl;
import implementation.impl.GuestImpl;
import implementation.impl.ModelImpl;
import implementation.impl.ProfileHandlerImpl;
import implementation.impl.RoomBookingImpl;
import implementation.impl.RoomImpl;
import implementation.impl.RoomTypeImpl;
import implementation.impl.BookingControllerImpl.Tuple;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.*;
import java.util.*;

/**
 * @author Sebastian
 *
 */
public class BookingTest {
	BookingControllerImpl bc;
	ModelImpl model;
	Date startDate;
	Date endDate;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bc = new BookingControllerImpl();
		init();
		
		//For dates
		Calendar calendar = Calendar.getInstance();
		//startDates date
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		startDate = calendar.getTime();
		//make end date endDates date
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		endDate = calendar.getTime();
		
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#selectExtras(java.lang.String, int)}.
	 */
	@Test
	public void testSelectExtras() {
		int id = getReservationID();
		String pensionType = "HalfPension";
		
		bc.selectExtras(pensionType, id);
		
		RoomBookingImpl reserv = getReservation(id);
		
		assertTrue(reserv.getPension() == PensionType.HALF_PENSION_LITERAL);
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#makePayment(java.lang.String, double, int, int)}.
	 */
	@Test
	public void testMakePayment() {
		int id =  getReservationID();
		
		bc.makePayment("12345687", 1500.0, 18, id);
		
		RoomBookingImpl reserv = getReservation(id);
		
		assertTrue(reserv.isRentPayed());
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#createBooking(int)}.
	 */
	@Test
	public void testCreateBooking() {
		int id = getReservationID();
		
		CustomerImpl c = new CustomerImpl();
		c.setAddress("221b Bakerstreet");
		c.setName("Sherlock Holmes");
		c.setPhoneNbr("01-233210");
		c.setSocialSecurityNumber("661023-6595");
		RoomBookingImpl reserv = getReservation(id);
		bc.createBooking(id, c);
		
		assertTrue(reserv.getBookingNr() == id);
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataZeroGuest() {
		assertFalse(bc.validateBookingData(0,1,startDate,endDate));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataNegativeGuest() {
		assertFalse(bc.validateBookingData(-1,1,startDate,endDate));
	}
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataOneGuest() {
		assertTrue(bc.validateBookingData(1,1,startDate,endDate));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataZeroRoom() {
		assertFalse(bc.validateBookingData(2,0,startDate,endDate));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataNegativeRoom() {
		assertFalse(bc.validateBookingData(2,-1,startDate,endDate));
	}
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataOneRoom() {
		assertTrue(bc.validateBookingData(2,1,startDate,endDate));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataSixRooms() {
		assertFalse(bc.validateBookingData(2,6,startDate,endDate));
	}
	
	

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#removeReservation(int)}.
	 */
	@Test
	public void testRemoveReservation() {
		int id = getReservationID();
		
		if(getReservation(id).isReservation()){
			bc.removeReservation(id);
			assertTrue(getReservation(id) == null);
		}else{
			assertTrue(false);
		}
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#findAvailableRoomTypes(int, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testFindAvailableRoomTypes() {
		EList rooms = bc.findAvailableRoomTypes(2, startDate, endDate, 1);
		assertTrue(rooms != null);
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#reserveRoomtype(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)}.
	 */
	@Test
	public void testReserveRoomtype() {
		EList rooms = bc.findAvailableRoomTypes(2, startDate, endDate, 1);
		
		RoomTypeImpl[] selectedRoomTypes = new RoomTypeImpl[1];
		selectedRoomTypes[0] = (RoomTypeImpl)((Tuple)rooms.get(0)).x;
		int reservationId = bc.reserveRoomtype(startDate,endDate, getEListFromArray(selectedRoomTypes));
		
		assertTrue(reservationId >= 0);
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#addGuest(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testAddGuest() {
		
		int id = getReservationID();
		String ssn = "John Doe";
		String name = "12435253";
		
		bc.addGuest(name, ssn, id);
		
		RoomBookingImpl reserv = getReservation(id);
		
		GuestImpl guest = (GuestImpl)reserv.getGuests().get(0);
		
		assertTrue(guest.getName() == name && guest.getSocialSecurityNumber() == ssn);
	}
	
	/* --- Helper --- */
	
	private int getReservationID() {
		EList rooms = bc.findAvailableRoomTypes(2, startDate, endDate, 1);
		
		RoomTypeImpl[] selectedRoomTypes = new RoomTypeImpl[1];
		selectedRoomTypes[0] = (RoomTypeImpl)((Tuple)rooms.get(0)).x;
		int reservationId = bc.reserveRoomtype(startDate,endDate, getEListFromArray(selectedRoomTypes));
		
		return reservationId;
	}
	
	private EList getEListFromArray(Object[] array) {
		EList list = new BasicEList();
		for(int i = 0; i < array.length; i++)
			list.add(array[i]);
		return list;
	}
	
	private RoomBookingImpl getReservation(int reservationId){
		EList bookings = model.getRoombooking();
		for(int i = 0; i < bookings.size(); i++){
			if(((RoomBookingImpl)bookings.get(i)).isReservation() && ((RoomBookingImpl)bookings.get(i)).getBookingNr() == reservationId){
				return ((RoomBookingImpl)bookings.get(i));
			}
		}
		return null;
	}
	
	/* --- INIT --- */
	public void init() {
		model = new ModelImpl();
		initModel(model);

		BankProvides bankprovides = new BankImpl();

		bc.setModel(model);
		bc.setBankprovides(bankprovides);
		bc.setNextBookingId((model.getRoombooking()).size());
	}
	
	private void initModel(ModelImpl model){
		EList roomTypes = initRoomTypes();
		EList rooms = initRooms(roomTypes);
		model.getRoomtypes().addAll(roomTypes);
		model.getRoom().addAll(rooms);
		EList roomBookings = initRoomBookings(model);
		model.getRoombooking().addAll(roomBookings);	
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
		rb1.setEndDate(new Date(2016,02,03));
		rb1.setStartDate(new Date(2016,02,01));
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
		c.setAddress("G�teborg");
		c.setName("Erik");
		c.setPhoneNbr("01-292720");
		c.setSocialSecurityNumber("952023-6595");
		g = new GuestImpl();
		g.setName("Sara");
		g.setSocialSecurityNumber("78956-0650");
		
		rb2.setCustomer(c);
		rb2.getGuests().add(g);
		rb2.setDeposit(200);
		rb2.setEndDate(new Date(2016,05,05));
		rb2.setStartDate(new Date(2016,07,01));
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
		rb3.setEndDate(new Date(2016,07,05));
		rb3.setStartDate(new Date(2016,07,06));
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
		c.setAddress("M�lndal");
		c.setName("Sven");
		c.setPhoneNbr("08-75178");
		c.setSocialSecurityNumber("578023-6595");
		g = new GuestImpl();
		g.setName("Eva");
		g.setSocialSecurityNumber("68956-0650");
		
		rb4.setCustomer(c);
		rb4.getGuests().add(g);
		rb4.setDeposit(200);
		rb4.setEndDate(new Date(2016,03,05));
		rb4.setStartDate(new Date(2016,03,10));
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

}
