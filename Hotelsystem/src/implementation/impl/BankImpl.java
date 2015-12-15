/**
 */
package implementation.impl;

import implementation.Bank;
import implementation.ImplementationPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BankImpl extends MinimalEObjectImpl.Container implements Bank {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean makePayment(double amount, String cardDetails) {
		return true;
	}

} //BankImpl
