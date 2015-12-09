/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Bed#getType <em>Type</em>}</li>
 *   <li>{@link implementation.Bed#getNbrOfSpots <em>Nbr Of Spots</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getBed()
 * @model
 * @generated
 */
public interface Bed extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see implementation.ImplementationPackage#getBed_Type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link implementation.Bed#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Nbr Of Spots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Of Spots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Of Spots</em>' attribute.
	 * @see #setNbrOfSpots(int)
	 * @see implementation.ImplementationPackage#getBed_NbrOfSpots()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfSpots();

	/**
	 * Sets the value of the '{@link implementation.Bed#getNbrOfSpots <em>Nbr Of Spots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Of Spots</em>' attribute.
	 * @see #getNbrOfSpots()
	 * @generated
	 */
	void setNbrOfSpots(int value);

} // Bed
