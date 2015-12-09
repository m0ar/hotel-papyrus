/**
 */
package implementation.impl;

import implementation.ConferenceRoom;
import implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ConferenceRoomImpl#getType <em>Type</em>}</li>
 *   <li>{@link implementation.impl.ConferenceRoomImpl#getSize <em>Size</em>}</li>
 *   <li>{@link implementation.impl.ConferenceRoomImpl#getCostPerHour <em>Cost Per Hour</em>}</li>
 *   <li>{@link implementation.impl.ConferenceRoomImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceRoomImpl extends MinimalEObjectImpl.Container implements ConferenceRoom {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_PER_HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected int costPerHour = COST_PER_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEquipment() <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIPMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected String equipment = EQUIPMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.CONFERENCE_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CONFERENCE_ROOM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CONFERENCE_ROOM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCostPerHour() {
		return costPerHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerHour(int newCostPerHour) {
		int oldCostPerHour = costPerHour;
		costPerHour = newCostPerHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CONFERENCE_ROOM__COST_PER_HOUR, oldCostPerHour, costPerHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(String newEquipment) {
		String oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.CONFERENCE_ROOM__EQUIPMENT, oldEquipment, equipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.CONFERENCE_ROOM__TYPE:
				return getType();
			case ImplementationPackage.CONFERENCE_ROOM__SIZE:
				return new Integer(getSize());
			case ImplementationPackage.CONFERENCE_ROOM__COST_PER_HOUR:
				return new Integer(getCostPerHour());
			case ImplementationPackage.CONFERENCE_ROOM__EQUIPMENT:
				return getEquipment();
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
			case ImplementationPackage.CONFERENCE_ROOM__TYPE:
				setType((String)newValue);
				return;
			case ImplementationPackage.CONFERENCE_ROOM__SIZE:
				setSize(((Integer)newValue).intValue());
				return;
			case ImplementationPackage.CONFERENCE_ROOM__COST_PER_HOUR:
				setCostPerHour(((Integer)newValue).intValue());
				return;
			case ImplementationPackage.CONFERENCE_ROOM__EQUIPMENT:
				setEquipment((String)newValue);
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
			case ImplementationPackage.CONFERENCE_ROOM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ImplementationPackage.CONFERENCE_ROOM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ImplementationPackage.CONFERENCE_ROOM__COST_PER_HOUR:
				setCostPerHour(COST_PER_HOUR_EDEFAULT);
				return;
			case ImplementationPackage.CONFERENCE_ROOM__EQUIPMENT:
				setEquipment(EQUIPMENT_EDEFAULT);
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
			case ImplementationPackage.CONFERENCE_ROOM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ImplementationPackage.CONFERENCE_ROOM__SIZE:
				return size != SIZE_EDEFAULT;
			case ImplementationPackage.CONFERENCE_ROOM__COST_PER_HOUR:
				return costPerHour != COST_PER_HOUR_EDEFAULT;
			case ImplementationPackage.CONFERENCE_ROOM__EQUIPMENT:
				return EQUIPMENT_EDEFAULT == null ? equipment != null : !EQUIPMENT_EDEFAULT.equals(equipment);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(", costPerHour: ");
		result.append(costPerHour);
		result.append(", equipment: ");
		result.append(equipment);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomImpl
