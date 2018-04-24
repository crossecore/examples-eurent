package eurent;
public interface EurentFactory extends org.eclipse.emf.ecore.EFactory{
	
	Car createCar();
	CarGroup createCarGroup();
	Customer createCustomer();
	Branch createBranch();
	Rental createRental();
	BlackListed createBlackListed();
	RentalAgreement createRentalAgreement();
	Quote createQuote();
}

