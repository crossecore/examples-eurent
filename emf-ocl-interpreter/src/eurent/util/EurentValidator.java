/**
 */
package eurent.util;

import eurent.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eurent.EurentPackage
 * @generated
 */
public class EurentValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EurentValidator INSTANCE = new EurentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eurent";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EurentValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EurentPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EurentPackage.CAR:
				return validateCar((Car)value, diagnostics, context);
			case EurentPackage.CAR_GROUP:
				return validateCarGroup((CarGroup)value, diagnostics, context);
			case EurentPackage.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case EurentPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case EurentPackage.RENTAL:
				return validateRental((Rental)value, diagnostics, context);
			case EurentPackage.BLACK_LISTED:
				return validateBlackListed((BlackListed)value, diagnostics, context);
			case EurentPackage.RENTAL_AGREEMENT:
				return validateRentalAgreement((RentalAgreement)value, diagnostics, context);
			case EurentPackage.QUOTE:
				return validateQuote((Quote)value, diagnostics, context);
			case EurentPackage.MY_ENUM:
				return validateMyEnum((MyEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCar(Car car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(car, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarGroup(CarGroup carGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRental(Rental rental, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rental, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlackListed(BlackListed blackListed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(blackListed, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(blackListed, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlackListed_NoRentalsBlacklisted(blackListed, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoRentalsBlacklisted constraint of '<em>Black Listed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BLACK_LISTED__NO_RENTALS_BLACKLISTED__EEXPRESSION = "self.rental->forAll(r|r.startingDate<self.blackListedDate)";

	/**
	 * Validates the NoRentalsBlacklisted constraint of '<em>Black Listed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlackListed_NoRentalsBlacklisted(BlackListed blackListed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EurentPackage.Literals.BLACK_LISTED,
				 blackListed,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoRentalsBlacklisted",
				 BLACK_LISTED__NO_RENTALS_BLACKLISTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRentalAgreement(RentalAgreement rentalAgreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rentalAgreement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuote(Quote quote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quote, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(quote, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuote_QuoteOverZero(quote, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the QuoteOverZero constraint of '<em>Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUOTE__QUOTE_OVER_ZERO__EEXPRESSION = "self.value>0";

	/**
	 * Validates the QuoteOverZero constraint of '<em>Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuote_QuoteOverZero(Quote quote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EurentPackage.Literals.QUOTE,
				 quote,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "QuoteOverZero",
				 QUOTE__QUOTE_OVER_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyEnum(MyEnum myEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EurentValidator
