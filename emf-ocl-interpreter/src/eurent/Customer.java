/**
 */
package eurent;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Customer#getId <em>Id</em>}</li>
 *   <li>{@link eurent.Customer#getName <em>Name</em>}</li>
 *   <li>{@link eurent.Customer#getPremium <em>Premium</em>}</li>
 *   <li>{@link eurent.Customer#getDiscount <em>Discount</em>}</li>
 *   <li>{@link eurent.Customer#getLicenseExpDate <em>License Exp Date</em>}</li>
 *   <li>{@link eurent.Customer#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link eurent.Customer#getRental <em>Rental</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see eurent.EurentPackage#getCustomer_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eurent.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see eurent.EurentPackage#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eurent.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premium</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premium</em>' attribute.
	 * @see #setPremium(Boolean)
	 * @see eurent.EurentPackage#getCustomer_Premium()
	 * @model
	 * @generated
	 */
	Boolean getPremium();

	/**
	 * Sets the value of the '{@link eurent.Customer#getPremium <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premium</em>' attribute.
	 * @see #getPremium()
	 * @generated
	 */
	void setPremium(Boolean value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(int)
	 * @see eurent.EurentPackage#getCustomer_Discount()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if not self.premium then if self.rental.car.carGroup-&gt;select(c|c.category=\'high\')-&gt;size()&gt;5 then 15 else 0 endif else 30 endif'"
	 * @generated
	 */
	int getDiscount();

	/**
	 * Sets the value of the '{@link eurent.Customer#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(int value);

	/**
	 * Returns the value of the '<em><b>License Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Exp Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Exp Date</em>' attribute.
	 * @see #setLicenseExpDate(Date)
	 * @see eurent.EurentPackage#getCustomer_LicenseExpDate()
	 * @model
	 * @generated
	 */
	Date getLicenseExpDate();

	/**
	 * Sets the value of the '{@link eurent.Customer#getLicenseExpDate <em>License Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Exp Date</em>' attribute.
	 * @see #getLicenseExpDate()
	 * @generated
	 */
	void setLicenseExpDate(Date value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see eurent.EurentPackage#getCustomer_Birthday()
	 * @model
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link eurent.Customer#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);

	/**
	 * Returns the value of the '<em><b>Rental</b></em>' reference list.
	 * The list contents are of type {@link eurent.Rental}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rental</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental</em>' reference list.
	 * @see eurent.EurentPackage#getCustomer_Rental()
	 * @model
	 * @generated
	 */
	EList<Rental> getRental();

} // Customer
