/**
 */
package eurent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Car#getRegNum <em>Reg Num</em>}</li>
 *   <li>{@link eurent.Car#getCarGroup <em>Car Group</em>}</li>
 *   <li>{@link eurent.Car#getRentalAgreement <em>Rental Agreement</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Reg Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Num</em>' attribute.
	 * @see #setRegNum(String)
	 * @see eurent.EurentPackage#getCar_RegNum()
	 * @model
	 * @generated
	 */
	String getRegNum();

	/**
	 * Sets the value of the '{@link eurent.Car#getRegNum <em>Reg Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Num</em>' attribute.
	 * @see #getRegNum()
	 * @generated
	 */
	void setRegNum(String value);

	/**
	 * Returns the value of the '<em><b>Car Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Group</em>' reference.
	 * @see #setCarGroup(CarGroup)
	 * @see eurent.EurentPackage#getCar_CarGroup()
	 * @model required="true"
	 * @generated
	 */
	CarGroup getCarGroup();

	/**
	 * Sets the value of the '{@link eurent.Car#getCarGroup <em>Car Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Group</em>' reference.
	 * @see #getCarGroup()
	 * @generated
	 */
	void setCarGroup(CarGroup value);

	/**
	 * Returns the value of the '<em><b>Rental Agreement</b></em>' reference list.
	 * The list contents are of type {@link eurent.RentalAgreement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rental Agreement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental Agreement</em>' reference list.
	 * @see eurent.EurentPackage#getCar_RentalAgreement()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<RentalAgreement> getRentalAgreement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Car::allInstances()-&gt;forAll(c1|c1&lt;&gt;self implies c1.rentalAgreement-&gt;size()&lt;=self.rentalAgreement-&gt;size())'"
	 * @generated
	 */
	Boolean mostPopular();

} // Car
