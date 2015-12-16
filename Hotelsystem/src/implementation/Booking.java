/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Booking#getCost <em>Cost</em>}</li>
 *   <li>{@link implementation.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link implementation.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link implementation.Booking#getBookingNr <em>Booking Nr</em>}</li>
 *   <li>{@link implementation.Booking#isReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getBooking()
 * @model abstract="true"
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see implementation.ImplementationPackage#getBooking_Cost()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link implementation.Booking#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see implementation.ImplementationPackage#getBooking_StartDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link implementation.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see implementation.ImplementationPackage#getBooking_EndDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link implementation.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Booking Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Nr</em>' attribute.
	 * @see #setBookingNr(int)
	 * @see implementation.ImplementationPackage#getBooking_BookingNr()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBookingNr();

	/**
	 * Sets the value of the '{@link implementation.Booking#getBookingNr <em>Booking Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Nr</em>' attribute.
	 * @see #getBookingNr()
	 * @generated
	 */
	void setBookingNr(int value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' attribute.
	 * @see #setReservation(boolean)
	 * @see implementation.ImplementationPackage#getBooking_Reservation()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReservation();

	/**
	 * Sets the value of the '{@link implementation.Booking#isReservation <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' attribute.
	 * @see #isReservation()
	 * @generated
	 */
	void setReservation(boolean value);

} // Booking
