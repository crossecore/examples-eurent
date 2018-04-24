/**
 */
package eurent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eurent.EurentPackage
 * @generated
 */
public interface EurentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EurentFactory eINSTANCE = eurent.impl.EurentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car</em>'.
	 * @generated
	 */
	Car createCar();

	/**
	 * Returns a new object of class '<em>Car Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car Group</em>'.
	 * @generated
	 */
	CarGroup createCarGroup();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Rental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rental</em>'.
	 * @generated
	 */
	Rental createRental();

	/**
	 * Returns a new object of class '<em>Black Listed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Black Listed</em>'.
	 * @generated
	 */
	BlackListed createBlackListed();

	/**
	 * Returns a new object of class '<em>Rental Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rental Agreement</em>'.
	 * @generated
	 */
	RentalAgreement createRentalAgreement();

	/**
	 * Returns a new object of class '<em>Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quote</em>'.
	 * @generated
	 */
	Quote createQuote();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EurentPackage getEurentPackage();

} //EurentFactory
