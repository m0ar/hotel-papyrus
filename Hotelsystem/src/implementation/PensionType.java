/**
 */
package implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pension Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage#getPensionType()
 * @model
 * @generated
 */
public final class PensionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Half Pension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Half Pension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_PENSION_LITERAL
	 * @model name="HalfPension"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_PENSION = 0;

	/**
	 * The '<em><b>Full Pension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Pension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_PENSION_LITERAL
	 * @model name="FullPension"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_PENSION = 1;

	/**
	 * The '<em><b>Breakfast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breakfast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKFAST_LITERAL
	 * @model name="Breakfast"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKFAST = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 3;

	/**
	 * The '<em><b>Half Pension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_PENSION
	 * @generated
	 * @ordered
	 */
	public static final PensionType HALF_PENSION_LITERAL = new PensionType(HALF_PENSION, "HalfPension", "HalfPension");

	/**
	 * The '<em><b>Full Pension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_PENSION
	 * @generated
	 * @ordered
	 */
	public static final PensionType FULL_PENSION_LITERAL = new PensionType(FULL_PENSION, "FullPension", "FullPension");

	/**
	 * The '<em><b>Breakfast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKFAST
	 * @generated
	 * @ordered
	 */
	public static final PensionType BREAKFAST_LITERAL = new PensionType(BREAKFAST, "Breakfast", "Breakfast");

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final PensionType NONE_LITERAL = new PensionType(NONE, "None", "None");

	/**
	 * An array of all the '<em><b>Pension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PensionType[] VALUES_ARRAY =
		new PensionType[] {
			HALF_PENSION_LITERAL,
			FULL_PENSION_LITERAL,
			BREAKFAST_LITERAL,
			NONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pension Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PensionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PensionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pension Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PensionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PensionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pension Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PensionType get(int value) {
		switch (value) {
			case HALF_PENSION: return HALF_PENSION_LITERAL;
			case FULL_PENSION: return FULL_PENSION_LITERAL;
			case BREAKFAST: return BREAKFAST_LITERAL;
			case NONE: return NONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PensionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PensionType
