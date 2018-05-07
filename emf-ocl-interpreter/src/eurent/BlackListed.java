/**
 */
package eurent;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Black Listed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.BlackListed#getBlackListedDate <em>Black Listed Date</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getBlackListed()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoRentalsBlacklisted'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoRentalsBlacklisted='self.rental-&gt;forAll(r|r.startingDate&lt;self.blackListedDate)'"
 * @generated
 */
public interface BlackListed extends Customer {
	/**
	 * Returns the value of the '<em><b>Black Listed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Black Listed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Listed Date</em>' attribute.
	 * @see #setBlackListedDate(Date)
	 * @see eurent.EurentPackage#getBlackListed_BlackListedDate()
	 * @model
	 * @generated
	 */
	Date getBlackListedDate();

	/**
	 * Sets the value of the '{@link eurent.BlackListed#getBlackListedDate <em>Black Listed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Black Listed Date</em>' attribute.
	 * @see #getBlackListedDate()
	 * @generated
	 */
	void setBlackListedDate(Date value);

} // BlackListed
