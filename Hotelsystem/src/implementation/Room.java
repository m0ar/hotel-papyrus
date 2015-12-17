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
 *   <li>{@link implementation.Room#getTab <em>Tab</em>}</li>
 *   <li>{@link implementation.Room#getRoomissues <em>Roomissues</em>}</li>
 *   <li>{@link implementation.Room#getGuests <em>Guests</em>}</li>
 *   <li>{@link implementation.Room#getKeys <em>Keys</em>}</li>
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
	 * Returns the value of the '<em><b>Tab</b></em>' reference list.
	 * The list contents are of type {@link implementation.Bill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Tab()
	 * @model type="implementation.Bill" required="true" ordered="false"
	 * @generated
	 */
	EList getTab();

	/**
	 * Returns the value of the '<em><b>Roomissues</b></em>' reference list.
	 * The list contents are of type {@link implementation.RoomIssue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomissues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomissues</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Roomissues()
	 * @model type="implementation.RoomIssue" ordered="false"
	 * @generated
	 */
	EList getRoomissues();

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link implementation.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Guests()
	 * @model type="implementation.Guest" ordered="false"
	 * @generated
	 */
	EList getGuests();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link implementation.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoom_Keys()
	 * @model type="implementation.Key" ordered="false"
	 * @generated
	 */
	EList getKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getTotalBill();

} // Room
