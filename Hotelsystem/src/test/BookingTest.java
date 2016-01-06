	/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;

import implementation.impl.BookingControllerImpl;

import org.junit.*;
import java.util.*;

/**
 * @author Sebastian
 *
 */
public class BookingTest {
	BookingControllerImpl bc;
	Date today;
	Date tomorrow;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bc = new BookingControllerImpl();
		
		//For dates
		Calendar calendar = Calendar.getInstance();
		//todays date
		today = calendar.getTime();
		//make end date tomorrows date
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		tomorrow = calendar.getTime();
		
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#selectExtras(java.lang.String, int)}.
	 */
	@Test
	public void testSelectExtras() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#makePayment(java.lang.String, double, int, int)}.
	 */
	@Test
	public void testMakePayment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#createBooking(int)}.
	 */
	@Test
	public void testCreateBooking() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataZeroGuest() {
		assertFalse(bc.validateBookingData(0,1,"2015-12-28","2015-12-29"));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataNegativeGuest() {
		assertFalse(bc.validateBookingData(-1,1,"2015-12-28","2015-12-29"));
	}
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataOneGuest() {
		assertTrue(bc.validateBookingData(1,1,"2016-12-28","2016-12-29"));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataZeroRoom() {
		assertFalse(bc.validateBookingData(2,0,"2015-12-28","2015-12-29"));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataNegativeRoom() {
		assertFalse(bc.validateBookingData(2,-1,"2015-12-28","2015-12-29"));
	}
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataOneRoom() {
		assertTrue(bc.validateBookingData(2,1,"2016-12-28","2016-12-29"));
	}
	
	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#validateBookingData(int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateBookingDataSixRooms() {
		assertFalse(bc.validateBookingData(2,6,"2015-12-28","2015-12-29"));
	}
	
	

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#removeReservation(int)}.
	 */
	@Test
	public void testRemoveReservation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#findAvailableRoomTypes(int, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testFindAvailableRoomTypes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#reserveRoomtype(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)}.
	 */
	@Test
	public void testReserveRoomtype() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link implementation.impl.BookingControllerImpl#addGuest(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testAddGuest() {
		fail("Not yet implemented");
	}

}
