/**
 */
package implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage#getRoomStatus()
 * @model
 * @generated
 */
public final class RoomStatus extends AbstractEnumerator {
	/**
	 * The '<em><b>Occupied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Occupied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED_LITERAL
	 * @model name="Occupied"
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPIED = 0;

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Available</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_LITERAL
	 * @model name="Available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE = 1;

	/**
	 * The '<em><b>Cleaning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cleaning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEANING_LITERAL
	 * @model name="Cleaning"
	 * @generated
	 * @ordered
	 */
	public static final int CLEANING = 2;

	/**
	 * The '<em><b>Repair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repair</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPAIR_LITERAL
	 * @model name="Repair"
	 * @generated
	 * @ordered
	 */
	public static final int REPAIR = 3;

	/**
	 * The '<em><b>Occupied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED
	 * @generated
	 * @ordered
	 */
	public static final RoomStatus OCCUPIED_LITERAL = new RoomStatus(OCCUPIED, "Occupied", "Occupied");

	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE
	 * @generated
	 * @ordered
	 */
	public static final RoomStatus AVAILABLE_LITERAL = new RoomStatus(AVAILABLE, "Available", "Available");

	/**
	 * The '<em><b>Cleaning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEANING
	 * @generated
	 * @ordered
	 */
	public static final RoomStatus CLEANING_LITERAL = new RoomStatus(CLEANING, "Cleaning", "Cleaning");

	/**
	 * The '<em><b>Repair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPAIR
	 * @generated
	 * @ordered
	 */
	public static final RoomStatus REPAIR_LITERAL = new RoomStatus(REPAIR, "Repair", "Repair");

	/**
	 * An array of all the '<em><b>Room Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomStatus[] VALUES_ARRAY =
		new RoomStatus[] {
			OCCUPIED_LITERAL,
			AVAILABLE_LITERAL,
			CLEANING_LITERAL,
			REPAIR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Room Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomStatus get(int value) {
		switch (value) {
			case OCCUPIED: return OCCUPIED_LITERAL;
			case AVAILABLE: return AVAILABLE_LITERAL;
			case CLEANING: return CLEANING_LITERAL;
			case REPAIR: return REPAIR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoomStatus(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RoomStatus
