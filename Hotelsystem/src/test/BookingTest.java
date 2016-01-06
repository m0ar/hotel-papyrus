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
	Date startDate;
	Date endDate;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bc = new BookingControllerImpl();
		
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
