/**
 */
package eurent;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Rental#getId <em>Id</em>}</li>
 *   <li>{@link eurent.Rental#getPrice <em>Price</em>}</li>
 *   <li>{@link eurent.Rental#getState <em>State</em>}</li>
 *   <li>{@link eurent.Rental#getStartingDate <em>Starting Date</em>}</li>
 *   <li>{@link eurent.Rental#getEndingDate <em>Ending Date</em>}</li>
 *   <li>{@link eurent.Rental#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getRental()
 * @model
 * @generated
 */
public interface Rental extends EObject {
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
	 * @see eurent.EurentPackage#getRental_Id()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eurent.Rental#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see eurent.EurentPackage#getRental_Price()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!price'"
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link eurent.Rental#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see eurent.EurentPackage#getRental_State()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!state'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link eurent.Rental#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Starting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Date</em>' attribute.
	 * @see #setStartingDate(Date)
	 * @see eurent.EurentPackage#getRental_StartingDate()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!startingDate'"
	 * @generated
	 */
	Date getStartingDate();

	/**
	 * Sets the value of the '{@link eurent.Rental#getStartingDate <em>Starting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Date</em>' attribute.
	 * @see #getStartingDate()
	 * @generated
	 */
	void setStartingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ending Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Date</em>' attribute.
	 * @see #setEndingDate(Date)
	 * @see eurent.EurentPackage#getRental_EndingDate()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!endingDate'"
	 * @generated
	 */
	Date getEndingDate();

	/**
	 * Sets the value of the '{@link eurent.Rental#getEndingDate <em>Ending Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Date</em>' attribute.
	 * @see #getEndingDate()
	 * @generated
	 */
	void setEndingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' reference list.
	 * The list contents are of type {@link eurent.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' reference list.
	 * @see eurent.EurentPackage#getRental_Car()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Rental!car'"
	 * @generated
	 */
	EList<Car> getCar();

} // Rental
