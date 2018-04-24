package eurent;

import org.eclipse.emf.ecore.*;

public interface EurentPackage extends org.eclipse.emf.ecore.EPackage {
		
	EClass getCar();
	EReference getCar_CarGroup();
	EReference getCar_RentalAgreement();
	
	EAttribute getCar_RegNum();
	EClass getCarGroup();
	EReference getCarGroup_Car();
	
	EAttribute getCarGroup_Category();
	EClass getCustomer();
	EReference getCustomer_Rental();
	
	EAttribute getCustomer_Id();
	EAttribute getCustomer_Name();
	EAttribute getCustomer_Premium();
	EAttribute getCustomer_Discount();
	EAttribute getCustomer_LicenseExpDate();
	EAttribute getCustomer_Birthday();
	EClass getBranch();
	
	EAttribute getBranch_Address();
	EClass getRental();
	EReference getRental_Car();
	
	EAttribute getRental_Id();
	EAttribute getRental_Price();
	EAttribute getRental_State();
	EAttribute getRental_StartingDate();
	EAttribute getRental_EndingDate();
	EClass getRentalAgreement();
	
	EClass getQuote();
	
	EAttribute getQuote_Value();
	EClass getBlackListed();
	
	EAttribute getBlackListed_BlackListedDate();
	EEnum getMyEnum();
		
 
}

