/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Main#getIadministration <em>Iadministration</em>}</li>
 *   <li>{@link implementation.Main#getIbooking <em>Ibooking</em>}</li>
 *   <li>{@link implementation.Main#getBankprovides <em>Bankprovides</em>}</li>
 *   <li>{@link implementation.Main#getIprofile <em>Iprofile</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
	/**
	 * Returns the value of the '<em><b>Iadministration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iadministration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iadministration</em>' reference.
	 * @see #setIadministration(IAdministration)
	 * @see implementation.ImplementationPackage#getMain_Iadministration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IAdministration getIadministration();

	/**
	 * Sets the value of the '{@link implementation.Main#getIadministration <em>Iadministration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iadministration</em>' reference.
	 * @see #getIadministration()
	 * @generated
	 */
	void setIadministration(IAdministration value);

	/**
	 * Returns the value of the '<em><b>Ibooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ibooking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ibooking</em>' reference.
	 * @see #setIbooking(IBooking)
	 * @see implementation.ImplementationPackage#getMain_Ibooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBooking getIbooking();

	/**
	 * Sets the value of the '{@link implementation.Main#getIbooking <em>Ibooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ibooking</em>' reference.
	 * @see #getIbooking()
	 * @generated
	 */
	void setIbooking(IBooking value);

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
	 * @see implementation.ImplementationPackage#getMain_Bankprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BankProvides getBankprovides();

	/**
	 * Sets the value of the '{@link implementation.Main#getBankprovides <em>Bankprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankprovides</em>' reference.
	 * @see #getBankprovides()
	 * @generated
	 */
	void setBankprovides(BankProvides value);

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
	 * @see implementation.ImplementationPackage#getMain_Iprofile()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IProfile getIprofile();

	/**
	 * Sets the value of the '{@link implementation.Main#getIprofile <em>Iprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iprofile</em>' reference.
	 * @see #getIprofile()
	 * @generated
	 */
	void setIprofile(IProfile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Main
