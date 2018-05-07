	package eurent;
	import org.eclipse.emf.ecore.util.EObjectValidator;
	import org.eclipse.emf.common.util.DiagnosticChain;
	import org.eclipse.emf.ecore.EClass;
	import java.util.Map;
	
	public class EurentValidator extends EObjectValidator {

		public static final EurentValidator INSTANCE = new EurentValidator();

		public static final String DIAGNOSTIC_SOURCE = "eurent";
		
		

        protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
        {
            switch (classifierID)
            {
				case EurentPackageImpl.CAR:
					return validateCar((Car)value, diagnostics, context);	
				case EurentPackageImpl.CARGROUP:
					return validateCarGroup((CarGroup)value, diagnostics, context);	
				case EurentPackageImpl.CUSTOMER:
					return validateCustomer((Customer)value, diagnostics, context);	
				case EurentPackageImpl.BRANCH:
					return validateBranch((Branch)value, diagnostics, context);	
				case EurentPackageImpl.RENTAL:
					return validateRental((Rental)value, diagnostics, context);	
				case EurentPackageImpl.BLACKLISTED:
					return validateBlackListed((BlackListed)value, diagnostics, context);	
				case EurentPackageImpl.RENTALAGREEMENT:
					return validateRentalAgreement((RentalAgreement)value, diagnostics, context);	
				case EurentPackageImpl.QUOTE:
					return validateQuote((Quote)value, diagnostics, context);	
                

                default:
                    return true;
            }
        }
		
		public boolean validateCar(Car obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCarGroup(CarGroup obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateCustomer(Customer obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBranch(Branch obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateRental(Rental obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateBlackListed(BlackListed obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlackListed_NoRentalsBlacklisted(obj, diagnostics, context);
		return result;
			        }
		
		
		public boolean validateBlackListed_NoRentalsBlacklisted(BlackListed obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		    return obj.NoRentalsBlacklisted(diagnostics, context);
		
		}
		
		public boolean validateRentalAgreement(RentalAgreement obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		return validate_EveryDefaultConstraint(obj, diagnostics, context);
			        }
		
		
		public boolean validateQuote(Quote obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		if (!validate_NoCircularContainment(obj, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obj, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuote_QuoteOverZero(obj, diagnostics, context);
		return result;
			        }
		
		
		public boolean validateQuote_QuoteOverZero(Quote obj, DiagnosticChain diagnostics, Map<Object, Object> context)
		{
		    return obj.QuoteOverZero(diagnostics, context);
		
		}
		
	}
