/**
 */
package eurent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Quote#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getQuote()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='QuoteOverZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot QuoteOverZero='self.value&gt;0'"
 * @generated
 */
public interface Quote extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see eurent.EurentPackage#getQuote_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link eurent.Quote#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Quote
