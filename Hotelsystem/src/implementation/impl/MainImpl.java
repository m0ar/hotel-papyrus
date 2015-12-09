/**
 */
package implementation.impl;

import implementation.IAdministration;
import implementation.IBooking;
import implementation.ImplementationPackage;
import implementation.Main;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.MainImpl#getIadministration <em>Iadministration</em>}</li>
 *   <li>{@link implementation.impl.MainImpl#getIbooking <em>Ibooking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main {
	/**
	 * The cached value of the '{@link #getIadministration() <em>Iadministration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIadministration()
	 * @generated
	 * @ordered
	 */
	protected IAdministration iadministration;

	/**
	 * The cached value of the '{@link #getIbooking() <em>Ibooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbooking()
	 * @generated
	 * @ordered
	 */
	protected IBooking ibooking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdministration getIadministration() {
		if (iadministration != null && iadministration.eIsProxy()) {
			InternalEObject oldIadministration = (InternalEObject)iadministration;
			iadministration = (IAdministration)eResolveProxy(oldIadministration);
			if (iadministration != oldIadministration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.MAIN__IADMINISTRATION, oldIadministration, iadministration));
			}
		}
		return iadministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdministration basicGetIadministration() {
		return iadministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIadministration(IAdministration newIadministration) {
		IAdministration oldIadministration = iadministration;
		iadministration = newIadministration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MAIN__IADMINISTRATION, oldIadministration, iadministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking getIbooking() {
		if (ibooking != null && ibooking.eIsProxy()) {
			InternalEObject oldIbooking = (InternalEObject)ibooking;
			ibooking = (IBooking)eResolveProxy(oldIbooking);
			if (ibooking != oldIbooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.MAIN__IBOOKING, oldIbooking, ibooking));
			}
		}
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBooking basicGetIbooking() {
		return ibooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIbooking(IBooking newIbooking) {
		IBooking oldIbooking = ibooking;
		ibooking = newIbooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MAIN__IBOOKING, oldIbooking, ibooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init() {
		ModelImpl model = new ModelImpl();
		
				
		
		BookingControllerImpl bc = new BookingControllerImpl();
		bc.setModel(model);
		ibooking = bc;
		AdminControllerImpl ac = new AdminControllerImpl();
		ac.setModel(model);
		iadministration = ac;	
	}
	
	private void initModel(ModelImpl model){
		EList rooms = model.getRoom();
		//EList<RoomTypeImpl> roomTypes = initRoomTypes();
		for(int floor = 100; floor <= 500; floor += 100){
			for(int roomNr = 1; roomNr <= 50; roomNr++){
				
			}
		}
	}
	
/*	private EList initRoomTypes(){
		EList roomTypes = new BasicEList();
		RoomTypeImpl type1 = new RoomTypeImpl();
		type1.setBalcony(newBalcony);
		type1.setDescription(newDescription);
		type1.setMaxNbrOfExtraBeds(newMaxNbrOfExtraBeds);
		type1.setMiniBar(newMiniBar);
		type1.setName(newName);
		type1.setNonSmoking(newNonSmoking);
		type1.setPrice(newPrice);
		type1.setTv(newTv);
		type1.setWifi(newWifi);
		type1.set
		
		RoomTypeImpl type2 = new RoomTypeImpl();
		RoomTypeImpl type3 = new RoomTypeImpl();
		
		roomTypes.add(type1);
		roomTypes.add(type2);
		roomTypes.add(type3);
		return roomTypes;
	}
	
	private EList initRooms(EList roomTypes){
		
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.MAIN__IADMINISTRATION:
				if (resolve) return getIadministration();
				return basicGetIadministration();
			case ImplementationPackage.MAIN__IBOOKING:
				if (resolve) return getIbooking();
				return basicGetIbooking();
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				setIadministration((IAdministration)newValue);
				return;
			case ImplementationPackage.MAIN__IBOOKING:
				setIbooking((IBooking)newValue);
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				setIadministration((IAdministration)null);
				return;
			case ImplementationPackage.MAIN__IBOOKING:
				setIbooking((IBooking)null);
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
			case ImplementationPackage.MAIN__IADMINISTRATION:
				return iadministration != null;
			case ImplementationPackage.MAIN__IBOOKING:
				return ibooking != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
