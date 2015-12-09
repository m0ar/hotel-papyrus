/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.RoomBooking#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link implementation.RoomBooking#getPension <em>Pension</em>}</li>
 *   <li>{@link implementation.RoomBooking#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.RoomBooking#getGuest <em>Guest</em>}</li>
 *   <li>{@link implementation.RoomBooking#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getRoomBooking()
 * @model
 * @generated
 */
public interface RoomBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit</em>' attribute.
	 * @see #setDeposit(double)
	 * @see implementation.ImplementationPackage#getRoomBooking_Deposit()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getDeposit();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#getDeposit <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit</em>' attribute.
	 * @see #getDeposit()
	 * @generated
	 */
	void setDeposit(double value);

	/**
	 * Returns the value of the '<em><b>Pension</b></em>' attribute.
	 * The literals are from the enumeration {@link implementation.PensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pension</em>' attribute.
	 * @see implementation.PensionType
	 * @see #setPension(PensionType)
	 * @see implementation.ImplementationPackage#getRoomBooking_Pension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PensionType getPension();

	/**
	 * Sets the value of the '{@link implementation.RoomBooking#getPension <em>Pension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pension</em>' attribute.
	 * @see implementation.PensionType
	 * @see #getPension()
	 * @generated
	 */
	void setPension(PensionType value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Roomtype()
	 * @model type="implementation.RoomType" required="true" ordered="false"
	 * @generated
	 */
	EList getRoomtype();

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference list.
	 * The list contents are of type {@link implementation.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Guest()
	 * @model type="implementation.Guest" required="true" ordered="false"
	 * @generated
	 */
	EList getGuest();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link implementation.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomBooking_Room()
	 * @model type="implementation.Room" required="true" ordered="false"
	 * @generated
	 */
	EList getRoom();

} // RoomBooking
