/**
 */
package eurent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eurent.EurentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EurentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eurent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eurent";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eurent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EurentPackage eINSTANCE = eurent.impl.EurentPackageImpl.init();

	/**
	 * The meta object id for the '{@link eurent.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.CarImpl
	 * @see eurent.impl.EurentPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 0;

	/**
	 * The feature id for the '<em><b>Reg Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__REG_NUM = 0;

	/**
	 * The feature id for the '<em><b>Car Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__CAR_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Rental Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__RENTAL_AGREEMENT = 2;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Most Popular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR___MOST_POPULAR = 0;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eurent.impl.CarGroupImpl <em>Car Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.CarGroupImpl
	 * @see eurent.impl.EurentPackageImpl#getCarGroup()
	 * @generated
	 */
	int CAR_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_GROUP__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Car</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_GROUP__CAR = 1;

	/**
	 * The number of structural features of the '<em>Car Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Car Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.CustomerImpl
	 * @see eurent.impl.EurentPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PREMIUM = 2;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DISCOUNT = 3;

	/**
	 * The feature id for the '<em><b>License Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LICENSE_EXP_DATE = 4;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BIRTHDAY = 5;

	/**
	 * The feature id for the '<em><b>Rental</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RENTAL = 6;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.BranchImpl
	 * @see eurent.impl.EurentPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.impl.RentalImpl <em>Rental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.RentalImpl
	 * @see eurent.impl.EurentPackageImpl#getRental()
	 * @generated
	 */
	int RENTAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__PRICE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__STATE = 2;

	/**
	 * The feature id for the '<em><b>Starting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__STARTING_DATE = 3;

	/**
	 * The feature id for the '<em><b>Ending Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__ENDING_DATE = 4;

	/**
	 * The feature id for the '<em><b>Car</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__CAR = 5;

	/**
	 * The number of structural features of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.impl.BlackListedImpl <em>Black Listed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.BlackListedImpl
	 * @see eurent.impl.EurentPackageImpl#getBlackListed()
	 * @generated
	 */
	int BLACK_LISTED = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__ID = CUSTOMER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__NAME = CUSTOMER__NAME;

	/**
	 * The feature id for the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__PREMIUM = CUSTOMER__PREMIUM;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__DISCOUNT = CUSTOMER__DISCOUNT;

	/**
	 * The feature id for the '<em><b>License Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__LICENSE_EXP_DATE = CUSTOMER__LICENSE_EXP_DATE;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__BIRTHDAY = CUSTOMER__BIRTHDAY;

	/**
	 * The feature id for the '<em><b>Rental</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__RENTAL = CUSTOMER__RENTAL;

	/**
	 * The feature id for the '<em><b>Black Listed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED__BLACK_LISTED_DATE = CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Black Listed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Black Listed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_LISTED_OPERATION_COUNT = CUSTOMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eurent.impl.RentalAgreementImpl <em>Rental Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.RentalAgreementImpl
	 * @see eurent.impl.EurentPackageImpl#getRentalAgreement()
	 * @generated
	 */
	int RENTAL_AGREEMENT = 6;

	/**
	 * The number of structural features of the '<em>Rental Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGREEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rental Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGREEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.impl.QuoteImpl <em>Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.impl.QuoteImpl
	 * @see eurent.impl.EurentPackageImpl#getQuote()
	 * @generated
	 */
	int QUOTE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eurent.MyEnum <em>My Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eurent.MyEnum
	 * @see eurent.impl.EurentPackageImpl#getMyEnum()
	 * @generated
	 */
	int MY_ENUM = 8;


	/**
	 * Returns the meta object for class '{@link eurent.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see eurent.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Car#getRegNum <em>Reg Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Num</em>'.
	 * @see eurent.Car#getRegNum()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_RegNum();

	/**
	 * Returns the meta object for the reference '{@link eurent.Car#getCarGroup <em>Car Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Car Group</em>'.
	 * @see eurent.Car#getCarGroup()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_CarGroup();

	/**
	 * Returns the meta object for the reference list '{@link eurent.Car#getRentalAgreement <em>Rental Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rental Agreement</em>'.
	 * @see eurent.Car#getRentalAgreement()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_RentalAgreement();

	/**
	 * Returns the meta object for the '{@link eurent.Car#mostPopular() <em>Most Popular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Most Popular</em>' operation.
	 * @see eurent.Car#mostPopular()
	 * @generated
	 */
	EOperation getCar__MostPopular();

	/**
	 * Returns the meta object for class '{@link eurent.CarGroup <em>Car Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Group</em>'.
	 * @see eurent.CarGroup
	 * @generated
	 */
	EClass getCarGroup();

	/**
	 * Returns the meta object for the attribute '{@link eurent.CarGroup#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see eurent.CarGroup#getCategory()
	 * @see #getCarGroup()
	 * @generated
	 */
	EAttribute getCarGroup_Category();

	/**
	 * Returns the meta object for the reference list '{@link eurent.CarGroup#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Car</em>'.
	 * @see eurent.CarGroup#getCar()
	 * @see #getCarGroup()
	 * @generated
	 */
	EReference getCarGroup_Car();

	/**
	 * Returns the meta object for class '{@link eurent.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see eurent.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eurent.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eurent.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getPremium <em>Premium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premium</em>'.
	 * @see eurent.Customer#getPremium()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Premium();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see eurent.Customer#getDiscount()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Discount();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getLicenseExpDate <em>License Exp Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Exp Date</em>'.
	 * @see eurent.Customer#getLicenseExpDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LicenseExpDate();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Customer#getBirthday <em>Birthday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday</em>'.
	 * @see eurent.Customer#getBirthday()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Birthday();

	/**
	 * Returns the meta object for the reference list '{@link eurent.Customer#getRental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rental</em>'.
	 * @see eurent.Customer#getRental()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Rental();

	/**
	 * Returns the meta object for class '{@link eurent.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see eurent.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Branch#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see eurent.Branch#getAddress()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Address();

	/**
	 * Returns the meta object for class '{@link eurent.Rental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental</em>'.
	 * @see eurent.Rental
	 * @generated
	 */
	EClass getRental();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Rental#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eurent.Rental#getId()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_Id();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Rental#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see eurent.Rental#getPrice()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_Price();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Rental#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see eurent.Rental#getState()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_State();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Rental#getStartingDate <em>Starting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Date</em>'.
	 * @see eurent.Rental#getStartingDate()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_StartingDate();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Rental#getEndingDate <em>Ending Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending Date</em>'.
	 * @see eurent.Rental#getEndingDate()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_EndingDate();

	/**
	 * Returns the meta object for the reference list '{@link eurent.Rental#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Car</em>'.
	 * @see eurent.Rental#getCar()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Car();

	/**
	 * Returns the meta object for class '{@link eurent.BlackListed <em>Black Listed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Listed</em>'.
	 * @see eurent.BlackListed
	 * @generated
	 */
	EClass getBlackListed();

	/**
	 * Returns the meta object for the attribute '{@link eurent.BlackListed#getBlackListedDate <em>Black Listed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Black Listed Date</em>'.
	 * @see eurent.BlackListed#getBlackListedDate()
	 * @see #getBlackListed()
	 * @generated
	 */
	EAttribute getBlackListed_BlackListedDate();

	/**
	 * Returns the meta object for class '{@link eurent.RentalAgreement <em>Rental Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Agreement</em>'.
	 * @see eurent.RentalAgreement
	 * @generated
	 */
	EClass getRentalAgreement();

	/**
	 * Returns the meta object for class '{@link eurent.Quote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote</em>'.
	 * @see eurent.Quote
	 * @generated
	 */
	EClass getQuote();

	/**
	 * Returns the meta object for the attribute '{@link eurent.Quote#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eurent.Quote#getValue()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_Value();

	/**
	 * Returns the meta object for enum '{@link eurent.MyEnum <em>My Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>My Enum</em>'.
	 * @see eurent.MyEnum
	 * @generated
	 */
	EEnum getMyEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EurentFactory getEurentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eurent.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.CarImpl
		 * @see eurent.impl.EurentPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Reg Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__REG_NUM = eINSTANCE.getCar_RegNum();

		/**
		 * The meta object literal for the '<em><b>Car Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__CAR_GROUP = eINSTANCE.getCar_CarGroup();

		/**
		 * The meta object literal for the '<em><b>Rental Agreement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__RENTAL_AGREEMENT = eINSTANCE.getCar_RentalAgreement();

		/**
		 * The meta object literal for the '<em><b>Most Popular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR___MOST_POPULAR = eINSTANCE.getCar__MostPopular();

		/**
		 * The meta object literal for the '{@link eurent.impl.CarGroupImpl <em>Car Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.CarGroupImpl
		 * @see eurent.impl.EurentPackageImpl#getCarGroup()
		 * @generated
		 */
		EClass CAR_GROUP = eINSTANCE.getCarGroup();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_GROUP__CATEGORY = eINSTANCE.getCarGroup_Category();

		/**
		 * The meta object literal for the '<em><b>Car</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR_GROUP__CAR = eINSTANCE.getCarGroup_Car();

		/**
		 * The meta object literal for the '{@link eurent.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.CustomerImpl
		 * @see eurent.impl.EurentPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Premium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PREMIUM = eINSTANCE.getCustomer_Premium();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__DISCOUNT = eINSTANCE.getCustomer_Discount();

		/**
		 * The meta object literal for the '<em><b>License Exp Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LICENSE_EXP_DATE = eINSTANCE.getCustomer_LicenseExpDate();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BIRTHDAY = eINSTANCE.getCustomer_Birthday();

		/**
		 * The meta object literal for the '<em><b>Rental</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__RENTAL = eINSTANCE.getCustomer_Rental();

		/**
		 * The meta object literal for the '{@link eurent.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.BranchImpl
		 * @see eurent.impl.EurentPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__ADDRESS = eINSTANCE.getBranch_Address();

		/**
		 * The meta object literal for the '{@link eurent.impl.RentalImpl <em>Rental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.RentalImpl
		 * @see eurent.impl.EurentPackageImpl#getRental()
		 * @generated
		 */
		EClass RENTAL = eINSTANCE.getRental();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__ID = eINSTANCE.getRental_Id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__PRICE = eINSTANCE.getRental_Price();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__STATE = eINSTANCE.getRental_State();

		/**
		 * The meta object literal for the '<em><b>Starting Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__STARTING_DATE = eINSTANCE.getRental_StartingDate();

		/**
		 * The meta object literal for the '<em><b>Ending Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__ENDING_DATE = eINSTANCE.getRental_EndingDate();

		/**
		 * The meta object literal for the '<em><b>Car</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__CAR = eINSTANCE.getRental_Car();

		/**
		 * The meta object literal for the '{@link eurent.impl.BlackListedImpl <em>Black Listed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.BlackListedImpl
		 * @see eurent.impl.EurentPackageImpl#getBlackListed()
		 * @generated
		 */
		EClass BLACK_LISTED = eINSTANCE.getBlackListed();

		/**
		 * The meta object literal for the '<em><b>Black Listed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLACK_LISTED__BLACK_LISTED_DATE = eINSTANCE.getBlackListed_BlackListedDate();

		/**
		 * The meta object literal for the '{@link eurent.impl.RentalAgreementImpl <em>Rental Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.RentalAgreementImpl
		 * @see eurent.impl.EurentPackageImpl#getRentalAgreement()
		 * @generated
		 */
		EClass RENTAL_AGREEMENT = eINSTANCE.getRentalAgreement();

		/**
		 * The meta object literal for the '{@link eurent.impl.QuoteImpl <em>Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.impl.QuoteImpl
		 * @see eurent.impl.EurentPackageImpl#getQuote()
		 * @generated
		 */
		EClass QUOTE = eINSTANCE.getQuote();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALUE = eINSTANCE.getQuote_Value();

		/**
		 * The meta object literal for the '{@link eurent.MyEnum <em>My Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eurent.MyEnum
		 * @see eurent.impl.EurentPackageImpl#getMyEnum()
		 * @generated
		 */
		EEnum MY_ENUM = eINSTANCE.getMyEnum();

	}

} //EurentPackage
