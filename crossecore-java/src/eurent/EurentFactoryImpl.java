package eurent;
import org.eclipse.emf.ecore.*;
public class EurentFactoryImpl extends org.eclipse.emf.ecore.impl.EFactoryImpl implements EurentFactory {
	
	public static EurentFactory eINSTANCE = EurentFactoryImpl.init();
	public static EurentFactory init()
	{
		
		try {
			EurentFactory factory = (EurentFactory)EPackage.Registry.INSTANCE.getEFactory(EurentPackageImpl.eNS_URI);
			if (factory != null) {
				return factory;
			}
		}
		catch (Exception exception) {
			
		}
		return new EurentFactoryImpl();
	}
	
	public Car createCar(){
		CarImpl theCar = new CarImpl();
		
		Car.allInstances.add(theCar);
		
		return theCar;
	}
	public CarGroup createCarGroup(){
		CarGroupImpl theCarGroup = new CarGroupImpl();
		
		CarGroup.allInstances.add(theCarGroup);
		
		return theCarGroup;
	}
	public Customer createCustomer(){
		CustomerImpl theCustomer = new CustomerImpl();
		
		Customer.allInstances.add(theCustomer);
		
		return theCustomer;
	}
	public Branch createBranch(){
		BranchImpl theBranch = new BranchImpl();
		
		Branch.allInstances.add(theBranch);
		
		return theBranch;
	}
	public Rental createRental(){
		RentalImpl theRental = new RentalImpl();
		
		Rental.allInstances.add(theRental);
		
		return theRental;
	}
	public BlackListed createBlackListed(){
		BlackListedImpl theBlackListed = new BlackListedImpl();
		
		Customer.allInstances.add(theBlackListed);
		BlackListed.allInstances.add(theBlackListed);
		
		return theBlackListed;
	}
	public RentalAgreement createRentalAgreement(){
		RentalAgreementImpl theRentalAgreement = new RentalAgreementImpl();
		
		RentalAgreement.allInstances.add(theRentalAgreement);
		
		return theRentalAgreement;
	}
	public Quote createQuote(){
		QuoteImpl theQuote = new QuoteImpl();
		
		Quote.allInstances.add(theQuote);
		
		return theQuote;
	}
	
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EurentPackageImpl.CAR: return createCar();
			case EurentPackageImpl.CARGROUP: return createCarGroup();
			case EurentPackageImpl.CUSTOMER: return createCustomer();
			case EurentPackageImpl.BRANCH: return createBranch();
			case EurentPackageImpl.RENTAL: return createRental();
			case EurentPackageImpl.BLACKLISTED: return createBlackListed();
			case EurentPackageImpl.RENTALAGREEMENT: return createRentalAgreement();
			case EurentPackageImpl.QUOTE: return createQuote();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
}
