/**
 */
package implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see implementation.ImplementationPackage#getPaymentOption()
 * @model
 * @generated
 */
public final class PaymentOption extends AbstractEnumerator {
	/**
	 * The '<em><b>Enumeration Literal1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumeration Literal1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_LITERAL1_LITERAL
	 * @model name="EnumerationLiteral1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATION_LITERAL1 = 0;

	/**
	 * The '<em><b>Enumeration Literal1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_LITERAL1
	 * @generated
	 * @ordered
	 */
	public static final PaymentOption ENUMERATION_LITERAL1_LITERAL = new PaymentOption(ENUMERATION_LITERAL1, "EnumerationLiteral1", "EnumerationLiteral1");

	/**
	 * An array of all the '<em><b>Payment Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentOption[] VALUES_ARRAY =
		new PaymentOption[] {
			ENUMERATION_LITERAL1_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentOption get(int value) {
		switch (value) {
			case ENUMERATION_LITERAL1: return ENUMERATION_LITERAL1_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PaymentOption(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PaymentOption
