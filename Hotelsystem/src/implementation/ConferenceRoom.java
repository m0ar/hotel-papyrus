/**
 */
package implementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.ConferenceRoom#getType <em>Type</em>}</li>
 *   <li>{@link implementation.ConferenceRoom#getSize <em>Size</em>}</li>
 *   <li>{@link implementation.ConferenceRoom#getCostPerHour <em>Cost Per Hour</em>}</li>
 *   <li>{@link implementation.ConferenceRoom#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getConferenceRoom()
 * @model
 * @generated
 */
public interface ConferenceRoom extends EObject {
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
	 * @see implementation.ImplementationPackage#getConferenceRoom_Type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link implementation.ConferenceRoom#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see implementation.ImplementationPackage#getConferenceRoom_Size()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link implementation.ConferenceRoom#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Hour</em>' attribute.
	 * @see #setCostPerHour(int)
	 * @see implementation.ImplementationPackage#getConferenceRoom_CostPerHour()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCostPerHour();

	/**
	 * Sets the value of the '{@link implementation.ConferenceRoom#getCostPerHour <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Hour</em>' attribute.
	 * @see #getCostPerHour()
	 * @generated
	 */
	void setCostPerHour(int value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' attribute.
	 * @see #setEquipment(String)
	 * @see implementation.ImplementationPackage#getConferenceRoom_Equipment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEquipment();

	/**
	 * Sets the value of the '{@link implementation.ConferenceRoom#getEquipment <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' attribute.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(String value);

} // ConferenceRoom
