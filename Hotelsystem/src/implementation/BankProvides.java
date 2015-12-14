/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see implementation.ImplementationPackage#getBankProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BankProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountDataType="org.eclipse.uml2.types.Real" amountRequired="true" amountOrdered="false" cardDetailsDataType="org.eclipse.uml2.types.String" cardDetailsRequired="true" cardDetailsOrdered="false" returnDataType="org.eclipse.uml2.types.Boolean" returnRequired="true" returnOrdered="false"
	 * @generated
	 */
	void makePayment(double amount, String cardDetails, boolean return_);

} // BankProvides
