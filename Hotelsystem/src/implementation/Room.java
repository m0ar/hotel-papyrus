/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link implementation.Room#getStatus <em>Status</em>}</li>
 *   <li>{@link implementation.Room#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link implementation.Room#getBill <em>Bill</em>}</li>
 *   <li>{@link implementation.Room#getRoomissue <em>Roomissue</em>}</li>
 *   <li>{@link implementation.Room#getGuest <em>Guest</em>}</li>
 *   <li>{@link implementation.Room#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see implementation.ImplementationPackage#getRoom_Number()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link implementation.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link implementation.RoomStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see implementation.RoomStatus
	 * @see #setStatus(RoomStatus)
	 * @see implementation.ImplementationPackage#getRoom_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStatus getStatus();

	/**
	 * Sets the value of the '{@link implementation.Room#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see implementation.RoomStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RoomStatus value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see implementation.ImplementationPackage#getRoom_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link implementation.Room#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference list.
	 * The list contents are of type {@link implementation.Bill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Bill()
	 * @model type="implementation.Bill" required="true" ordered="false"
	 * @generated
	 */
	EList getBill();

	/**
	 * Returns the value of the '<em><b>Roomissue</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomIssue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomissue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomissue</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Roomissue()
	 * @model type="implementation.RoomIssue" ordered="false"
	 * @generated
	 */
	EList getRoomissue();

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
	 * @see implementation.ImplementationPackage#getRoom_Guest()
	 * @model type="implementation.Guest" ordered="false"
	 * @generated
	 */
	EList getGuest();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference list.
	 * The list contents are of type {@link implementation.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Key()
	 * @model type="implementation.Key" ordered="false"
	 * @generated
	 */
	EList getKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getTotalBill();

} // Room
