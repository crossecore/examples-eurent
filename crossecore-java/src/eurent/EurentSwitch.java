package eurent;

import org.eclipse.emf.ecore.*;

public class EurentSwitch<T> extends org.eclipse.emf.ecore.util.Switch<T> {

	protected static EurentPackage modelPackage;
	
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}
	
	public EurentSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = EurentPackageImpl.eINSTANCE;
		}
	}
	
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EurentPackageImpl.CAR: {
				Car car = (Car) theEObject;
				T result = caseCar(car);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.CARGROUP: {
				CarGroup cargroup = (CarGroup) theEObject;
				T result = caseCarGroup(cargroup);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.CUSTOMER: {
				Customer customer = (Customer) theEObject;
				T result = caseCustomer(customer);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.BRANCH: {
				Branch branch = (Branch) theEObject;
				T result = caseBranch(branch);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.RENTAL: {
				Rental rental = (Rental) theEObject;
				T result = caseRental(rental);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.BLACKLISTED: {
				BlackListed blacklisted = (BlackListed) theEObject;
				T result = caseBlackListed(blacklisted);
				
				if (result == null) result = caseCustomer(blacklisted);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.RENTALAGREEMENT: {
				RentalAgreement rentalagreement = (RentalAgreement) theEObject;
				T result = caseRentalAgreement(rentalagreement);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EurentPackageImpl.QUOTE: {
				Quote quote = (Quote) theEObject;
				T result = caseQuote(quote);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}
	
	
	public T caseCar(Car theEObject) {
		return null;
	}
	public T caseCarGroup(CarGroup theEObject) {
		return null;
	}
	public T caseCustomer(Customer theEObject) {
		return null;
	}
	public T caseBranch(Branch theEObject) {
		return null;
	}
	public T caseRental(Rental theEObject) {
		return null;
	}
	public T caseBlackListed(BlackListed theEObject) {
		return null;
	}
	public T caseRentalAgreement(RentalAgreement theEObject) {
		return null;
	}
	public T caseQuote(Quote theEObject) {
		return null;
	}
	
}

