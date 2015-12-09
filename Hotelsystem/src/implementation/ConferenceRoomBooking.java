/**
 */
package implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.ConferenceRoomBooking#getNbrOfPeople <em>Nbr Of People</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getConferenceRoomBooking()
 * @model
 * @generated
 */
public interface ConferenceRoomBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Nbr Of People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Of People</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Of People</em>' attribute.
	 * @see #setNbrOfPeople(int)
	 * @see implementation.ImplementationPackage#getConferenceRoomBooking_NbrOfPeople()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfPeople();

	/**
	 * Sets the value of the '{@link implementation.ConferenceRoomBooking#getNbrOfPeople <em>Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Of People</em>' attribute.
	 * @see #getNbrOfPeople()
	 * @generated
	 */
	void setNbrOfPeople(int value);

} // ConferenceRoomBooking
