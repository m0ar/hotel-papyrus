/**
 */
package implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.AdminController#getModel <em>Model</em>}</li>
 *   <li>{@link implementation.AdminController#getBankprovides <em>Bankprovides</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getAdminController()
 * @model
 * @generated
 */
public interface AdminController extends IAdministration {
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
	 * @see implementation.ImplementationPackage#getAdminController_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link implementation.AdminController#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

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
	 * @see implementation.ImplementationPackage#getAdminController_Bankprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BankProvides getBankprovides();

	/**
	 * Sets the value of the '{@link implementation.AdminController#getBankprovides <em>Bankprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankprovides</em>' reference.
	 * @see #getBankprovides()
	 * @generated
	 */
	void setBankprovides(BankProvides value);

} // AdminController
