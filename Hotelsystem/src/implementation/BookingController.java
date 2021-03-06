/**
 */
package implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.BookingController#getModel <em>Model</em>}</li>
 *   <li>{@link implementation.BookingController#getIprofile <em>Iprofile</em>}</li>
 *   <li>{@link implementation.BookingController#getBankprovides <em>Bankprovides</em>}</li>
 *   <li>{@link implementation.BookingController#getNextBookingId <em>Next Booking Id</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getBookingController()
 * @model
 * @generated
 */
public interface BookingController extends IBooking {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see implementation.ImplementationPackage#getBookingController_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link implementation.BookingController#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Iprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iprofile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iprofile</em>' reference.
	 * @see #setIprofile(IProfile)
	 * @see implementation.ImplementationPackage#getBookingController_Iprofile()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IProfile getIprofile();

	/**
	 * Sets the value of the '{@link implementation.BookingController#getIprofile <em>Iprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iprofile</em>' reference.
	 * @see #getIprofile()
	 * @generated
	 */
	void setIprofile(IProfile value);

	/**
	 * Returns the value of the '<em><b>Bankprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bankprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bankprovides</em>' reference.
	 * @see #setBankprovides(BankProvides)
	 * @see implementation.ImplementationPackage#getBookingController_Bankprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BankProvides getBankprovides();

	/**
	 * Sets the value of the '{@link implementation.BookingController#getBankprovides <em>Bankprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankprovides</em>' reference.
	 * @see #getBankprovides()
	 * @generated
	 */
	void setBankprovides(BankProvides value);

	/**
	 * Returns the value of the '<em><b>Next Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Booking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Booking Id</em>' attribute.
	 * @see #setNextBookingId(int)
	 * @see implementation.ImplementationPackage#getBookingController_NextBookingId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNextBookingId();

	/**
	 * Sets the value of the '{@link implementation.BookingController#getNextBookingId <em>Next Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Booking Id</em>' attribute.
	 * @see #getNextBookingId()
	 * @generated
	 */
	void setNextBookingId(int value);

} // BookingController
