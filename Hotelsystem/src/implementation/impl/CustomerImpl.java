/**
 */
package implementation.impl;

import implementation.Customer;
import implementation.ImplementationPackage;
import implementation.RoomBooking;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.CustomerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link implementation.impl.CustomerImpl#getPhoneNbr <em>Phone Nbr</em>}</li>
 *   <li>{@link implementation.impl.CustomerImpl#isMember <em>Member</em>}</li>
 *   <li>{@link implementation.impl.CustomerImpl#getRoombooking <em>Roombooking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNbr() <em>Phone Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNbr() <em>Phone Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNbr()
	 * @generated
	 * @ordered
	 */
	protected String phoneNbr = PHONE_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMember() <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMember()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMember() <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMember()
	 * @generated
	 * @ordered
	 */
	protected boolean member = MEMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoombooking() <em>Roombooking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombooking()
	 * @generated
	 * @ordered
	 */
	protected EList roombooking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CUSTOMER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNbr() {
		return phoneNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNbr(String newPhoneNbr) {
		String oldPhoneNbr = phoneNbr;
		phoneNbr = newPhoneNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CUSTOMER__PHONE_NBR, oldPhoneNbr, phoneNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(boolean newMember) {
		boolean oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CUSTOMER__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoombooking() {
		if (roombooking == null) {
			roombooking = new EObjectResolvingEList(RoomBooking.class, this, ImplementationPackage.CUSTOMER__ROOMBOOKING);
		}
		return roombooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.CUSTOMER__ADDRESS:
				return getAddress();
			case ImplementationPackage.CUSTOMER__PHONE_NBR:
				return getPhoneNbr();
			case ImplementationPackage.CUSTOMER__MEMBER:
				return isMember() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.CUSTOMER__ROOMBOOKING:
				return getRoombooking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.CUSTOMER__ADDRESS:
				setAddress((String)newValue);
				return;
			case ImplementationPackage.CUSTOMER__PHONE_NBR:
				setPhoneNbr((String)newValue);
				return;
			case ImplementationPackage.CUSTOMER__MEMBER:
				setMember(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.CUSTOMER__ROOMBOOKING:
				getRoombooking().clear();
				getRoombooking().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.CUSTOMER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ImplementationPackage.CUSTOMER__PHONE_NBR:
				setPhoneNbr(PHONE_NBR_EDEFAULT);
				return;
			case ImplementationPackage.CUSTOMER__MEMBER:
				setMember(MEMBER_EDEFAULT);
				return;
			case ImplementationPackage.CUSTOMER__ROOMBOOKING:
				getRoombooking().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.CUSTOMER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ImplementationPackage.CUSTOMER__PHONE_NBR:
				return PHONE_NBR_EDEFAULT == null ? phoneNbr != null : !PHONE_NBR_EDEFAULT.equals(phoneNbr);
			case ImplementationPackage.CUSTOMER__MEMBER:
				return member != MEMBER_EDEFAULT;
			case ImplementationPackage.CUSTOMER__ROOMBOOKING:
				return roombooking != null && !roombooking.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", phoneNbr: ");
		result.append(phoneNbr);
		result.append(", member: ");
		result.append(member);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
