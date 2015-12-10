/**
 */
package implementation.impl;

import implementation.Bed;
import implementation.ImplementationPackage;
import implementation.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#isNonSmoking <em>Non Smoking</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#isWifi <em>Wifi</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#isMiniBar <em>Mini Bar</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#isTv <em>Tv</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#isBalcony <em>Balcony</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#getMaxNbrOfExtraBeds <em>Max Nbr Of Extra Beds</em>}</li>
 *   <li>{@link implementation.impl.RoomTypeImpl#getBed <em>Bed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNonSmoking() <em>Non Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonSmoking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NON_SMOKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonSmoking() <em>Non Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonSmoking()
	 * @generated
	 * @ordered
	 */
	protected boolean nonSmoking = NON_SMOKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isWifi() <em>Wifi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWifi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WIFI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWifi() <em>Wifi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWifi()
	 * @generated
	 * @ordered
	 */
	protected boolean wifi = WIFI_EDEFAULT;

	/**
	 * The default value of the '{@link #isMiniBar() <em>Mini Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMiniBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINI_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMiniBar() <em>Mini Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMiniBar()
	 * @generated
	 * @ordered
	 */
	protected boolean miniBar = MINI_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTv() <em>Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTv()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTv() <em>Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTv()
	 * @generated
	 * @ordered
	 */
	protected boolean tv = TV_EDEFAULT;

	/**
	 * The default value of the '{@link #isBalcony() <em>Balcony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalcony()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BALCONY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBalcony() <em>Balcony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalcony()
	 * @generated
	 * @ordered
	 */
	protected boolean balcony = BALCONY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNbrOfExtraBeds() <em>Max Nbr Of Extra Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrOfExtraBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NBR_OF_EXTRA_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNbrOfExtraBeds() <em>Max Nbr Of Extra Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrOfExtraBeds()
	 * @generated
	 * @ordered
	 */
	protected int maxNbrOfExtraBeds = MAX_NBR_OF_EXTRA_BEDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBed() <em>Bed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBed()
	 * @generated
	 * @ordered
	 */
	protected EList bed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected RoomTypeImpl() {
		super();
		bed = new BasicEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonSmoking() {
		return nonSmoking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonSmoking(boolean newNonSmoking) {
		boolean oldNonSmoking = nonSmoking;
		nonSmoking = newNonSmoking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__NON_SMOKING, oldNonSmoking, nonSmoking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWifi() {
		return wifi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWifi(boolean newWifi) {
		boolean oldWifi = wifi;
		wifi = newWifi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__WIFI, oldWifi, wifi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMiniBar() {
		return miniBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiniBar(boolean newMiniBar) {
		boolean oldMiniBar = miniBar;
		miniBar = newMiniBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__MINI_BAR, oldMiniBar, miniBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTv() {
		return tv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTv(boolean newTv) {
		boolean oldTv = tv;
		tv = newTv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__TV, oldTv, tv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBalcony() {
		return balcony;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalcony(boolean newBalcony) {
		boolean oldBalcony = balcony;
		balcony = newBalcony;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__BALCONY, oldBalcony, balcony));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbrOfExtraBeds() {
		return maxNbrOfExtraBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbrOfExtraBeds(int newMaxNbrOfExtraBeds) {
		int oldMaxNbrOfExtraBeds = maxNbrOfExtraBeds;
		maxNbrOfExtraBeds = newMaxNbrOfExtraBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS, oldMaxNbrOfExtraBeds, maxNbrOfExtraBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBed() {
		if (bed == null) {
			bed = new EObjectResolvingEList(Bed.class, this, ImplementationPackage.ROOM_TYPE__BED);
		}
		return bed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getNbrOfGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.ROOM_TYPE__NAME:
				return getName();
			case ImplementationPackage.ROOM_TYPE__DESCRIPTION:
				return getDescription();
			case ImplementationPackage.ROOM_TYPE__PRICE:
				return new Double(getPrice());
			case ImplementationPackage.ROOM_TYPE__NON_SMOKING:
				return isNonSmoking() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_TYPE__WIFI:
				return isWifi() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_TYPE__MINI_BAR:
				return isMiniBar() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_TYPE__TV:
				return isTv() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_TYPE__BALCONY:
				return isBalcony() ? Boolean.TRUE : Boolean.FALSE;
			case ImplementationPackage.ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS:
				return new Integer(getMaxNbrOfExtraBeds());
			case ImplementationPackage.ROOM_TYPE__BED:
				return getBed();
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
			case ImplementationPackage.ROOM_TYPE__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.ROOM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ImplementationPackage.ROOM_TYPE__PRICE:
				setPrice(((Double)newValue).doubleValue());
				return;
			case ImplementationPackage.ROOM_TYPE__NON_SMOKING:
				setNonSmoking(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_TYPE__WIFI:
				setWifi(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_TYPE__MINI_BAR:
				setMiniBar(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_TYPE__TV:
				setTv(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_TYPE__BALCONY:
				setBalcony(((Boolean)newValue).booleanValue());
				return;
			case ImplementationPackage.ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS:
				setMaxNbrOfExtraBeds(((Integer)newValue).intValue());
				return;
			case ImplementationPackage.ROOM_TYPE__BED:
				getBed().clear();
				getBed().addAll((Collection)newValue);
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
			case ImplementationPackage.ROOM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__NON_SMOKING:
				setNonSmoking(NON_SMOKING_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__WIFI:
				setWifi(WIFI_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__MINI_BAR:
				setMiniBar(MINI_BAR_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__TV:
				setTv(TV_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__BALCONY:
				setBalcony(BALCONY_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS:
				setMaxNbrOfExtraBeds(MAX_NBR_OF_EXTRA_BEDS_EDEFAULT);
				return;
			case ImplementationPackage.ROOM_TYPE__BED:
				getBed().clear();
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
			case ImplementationPackage.ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.ROOM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ImplementationPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__NON_SMOKING:
				return nonSmoking != NON_SMOKING_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__WIFI:
				return wifi != WIFI_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__MINI_BAR:
				return miniBar != MINI_BAR_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__TV:
				return tv != TV_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__BALCONY:
				return balcony != BALCONY_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__MAX_NBR_OF_EXTRA_BEDS:
				return maxNbrOfExtraBeds != MAX_NBR_OF_EXTRA_BEDS_EDEFAULT;
			case ImplementationPackage.ROOM_TYPE__BED:
				return bed != null && !bed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String toString() {
		String result = "\t---------------- Room type ----------------\n";
		result += "\tName: " + name + "\n";
		result += "\tDescription: " + description + "\n";
		result += "\tPrice per day: " + price + "\n";
		result += "\tNone smoking: " + nonSmoking + "\n";
		result += "\tHas wifi: " + wifi + "\n";
		result += "\tHas mini bar: " + miniBar + "\n";
		result += "\tHas tv: " + tv + "\n";
		result += "\tHas balcony: " + balcony + "\n";
		result += "\tNumber of extra beds: " + maxNbrOfExtraBeds + "\n";
		return result + "\n";
	}
	
	public int foogetNbrOfGuests() {
		int count = 0;
		for(int i = 0; i < bed.size(); i++)
			count += ((BedImpl)bed.get(i)).getNbrOfSpots();
		return count + maxNbrOfExtraBeds;
	}

} //RoomTypeImpl
