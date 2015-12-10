/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.RoomType#getName <em>Name</em>}</li>
 *   <li>{@link implementation.RoomType#getDescription <em>Description</em>}</li>
 *   <li>{@link implementation.RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link implementation.RoomType#isNonSmoking <em>Non Smoking</em>}</li>
 *   <li>{@link implementation.RoomType#isWifi <em>Wifi</em>}</li>
 *   <li>{@link implementation.RoomType#isMiniBar <em>Mini Bar</em>}</li>
 *   <li>{@link implementation.RoomType#isTv <em>Tv</em>}</li>
 *   <li>{@link implementation.RoomType#isBalcony <em>Balcony</em>}</li>
 *   <li>{@link implementation.RoomType#getMaxNbrOfExtraBeds <em>Max Nbr Of Extra Beds</em>}</li>
 *   <li>{@link implementation.RoomType#getBed <em>Bed</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see implementation.ImplementationPackage#getRoomType_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link implementation.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see implementation.ImplementationPackage#getRoomType_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link implementation.RoomType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see implementation.ImplementationPackage#getRoomType_Price()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link implementation.RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Non Smoking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Smoking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Smoking</em>' attribute.
	 * @see #setNonSmoking(boolean)
	 * @see implementation.ImplementationPackage#getRoomType_NonSmoking()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonSmoking();

	/**
	 * Sets the value of the '{@link implementation.RoomType#isNonSmoking <em>Non Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Smoking</em>' attribute.
	 * @see #isNonSmoking()
	 * @generated
	 */
	void setNonSmoking(boolean value);

	/**
	 * Returns the value of the '<em><b>Wifi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wifi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifi</em>' attribute.
	 * @see #setWifi(boolean)
	 * @see implementation.ImplementationPackage#getRoomType_Wifi()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isWifi();

	/**
	 * Sets the value of the '{@link implementation.RoomType#isWifi <em>Wifi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wifi</em>' attribute.
	 * @see #isWifi()
	 * @generated
	 */
	void setWifi(boolean value);

	/**
	 * Returns the value of the '<em><b>Mini Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mini Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mini Bar</em>' attribute.
	 * @see #setMiniBar(boolean)
	 * @see implementation.ImplementationPackage#getRoomType_MiniBar()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMiniBar();

	/**
	 * Sets the value of the '{@link implementation.RoomType#isMiniBar <em>Mini Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mini Bar</em>' attribute.
	 * @see #isMiniBar()
	 * @generated
	 */
	void setMiniBar(boolean value);

	/**
	 * Returns the value of the '<em><b>Tv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tv</em>' attribute.
	 * @see #setTv(boolean)
	 * @see implementation.ImplementationPackage#getRoomType_Tv()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTv();

	/**
	 * Sets the value of the '{@link implementation.RoomType#isTv <em>Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tv</em>' attribute.
	 * @see #isTv()
	 * @generated
	 */
	void setTv(boolean value);

	/**
	 * Returns the value of the '<em><b>Balcony</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balcony</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balcony</em>' attribute.
	 * @see #setBalcony(boolean)
	 * @see implementation.ImplementationPackage#getRoomType_Balcony()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBalcony();

	/**
	 * Sets the value of the '{@link implementation.RoomType#isBalcony <em>Balcony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balcony</em>' attribute.
	 * @see #isBalcony()
	 * @generated
	 */
	void setBalcony(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Nbr Of Extra Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nbr Of Extra Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nbr Of Extra Beds</em>' attribute.
	 * @see #setMaxNbrOfExtraBeds(int)
	 * @see implementation.ImplementationPackage#getRoomType_MaxNbrOfExtraBeds()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxNbrOfExtraBeds();

	/**
	 * Sets the value of the '{@link implementation.RoomType#getMaxNbrOfExtraBeds <em>Max Nbr Of Extra Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nbr Of Extra Beds</em>' attribute.
	 * @see #getMaxNbrOfExtraBeds()
	 * @generated
	 */
	void setMaxNbrOfExtraBeds(int value);

	/**
	 * Returns the value of the '<em><b>Bed</b></em>' reference list.
	 * The list contents are of type {@link implementation.Bed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bed</em>' reference list.
	 * @see implementation.ImplementationPackage#getRoomType_Bed()
	 * @model type="implementation.Bed" required="true" ordered="false"
	 * @generated
	 */
	EList getBed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getNbrOfGuests();

} // RoomType
