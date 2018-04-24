package eurent;

import org.eclipse.emf.ecore.*;

public class EurentPackageImpl extends org.eclipse.emf.ecore.impl.EPackageImpl implements EurentPackage{
		public static String eNAME = "eurent";
		
		public static String eNS_URI = "eurent";
		
		public static String eNS_PREFIX = "eurent";
		
		public static EurentPackage eINSTANCE = init();
		
		private EurentPackageImpl()
		{
			super(eNS_URI, EurentFactoryImpl.eINSTANCE);
		}
		
		private static boolean isInited = false;
		public static EurentPackage init()
		{
			if (isInited) return (EurentPackage)EPackage.Registry.INSTANCE.getEPackage(EurentPackageImpl.eNS_URI);

			// Obtain or create and register package
			EurentPackageImpl thePackage = (EurentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EurentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EurentPackageImpl());

			isInited = true;

			// Create package meta-data objects
			thePackage.createPackageContents();

			// Initialize created meta-data
			thePackage.initializePackageContents();

			// Register package validator
			EValidator.Registry.INSTANCE.put
				(thePackage, 
				 new EValidator.Descriptor() {
					 public EValidator getEValidator() {
						 return EurentValidator.INSTANCE;
					 }
			 });

			// Mark meta-data to indicate it can't be changed
			thePackage.freeze();

			// Update the registry and return the package
			EPackage.Registry.INSTANCE.put(EurentPackageImpl.eNS_URI, thePackage);
			return thePackage;
        }
        
        private boolean isCreated = false;
	            public void createPackageContents()
	            {
	                if (isCreated) return;
	                isCreated = true;
			CarEClass = createEClass(CAR);
			createEAttribute(CarEClass, CAR_REGNUM);
			createEReference(CarEClass, CAR_CARGROUP);
			createEReference(CarEClass, CAR_RENTALAGREEMENT);
			CarGroupEClass = createEClass(CARGROUP);
			createEAttribute(CarGroupEClass, CARGROUP_CATEGORY);
			createEReference(CarGroupEClass, CARGROUP_CAR);
			CustomerEClass = createEClass(CUSTOMER);
			createEAttribute(CustomerEClass, CUSTOMER_ID);
			createEAttribute(CustomerEClass, CUSTOMER_NAME);
			createEAttribute(CustomerEClass, CUSTOMER_PREMIUM);
			createEAttribute(CustomerEClass, CUSTOMER_DISCOUNT);
			createEAttribute(CustomerEClass, CUSTOMER_LICENSEEXPDATE);
			createEAttribute(CustomerEClass, CUSTOMER_BIRTHDAY);
			createEReference(CustomerEClass, CUSTOMER_RENTAL);
			BranchEClass = createEClass(BRANCH);
			createEAttribute(BranchEClass, BRANCH_ADDRESS);
			RentalEClass = createEClass(RENTAL);
			createEAttribute(RentalEClass, RENTAL_ID);
			createEAttribute(RentalEClass, RENTAL_PRICE);
			createEAttribute(RentalEClass, RENTAL_STATE);
			createEAttribute(RentalEClass, RENTAL_STARTINGDATE);
			createEAttribute(RentalEClass, RENTAL_ENDINGDATE);
			createEReference(RentalEClass, RENTAL_CAR);
			BlackListedEClass = createEClass(BLACKLISTED);
			createEAttribute(BlackListedEClass, BLACKLISTED_BLACKLISTEDDATE);
			RentalAgreementEClass = createEClass(RENTALAGREEMENT);
			QuoteEClass = createEClass(QUOTE);
			createEAttribute(QuoteEClass, QUOTE_VALUE);
			
			MyEnumEEnum = createEEnum(MYENUM);
        }
        
        private boolean isInitialized = false;
        public void initializePackageContents()
        {
	                if (isInitialized) return;
	                isInitialized = true;
            // Initialize package
			setName(eNAME);
			setNsPrefix(eNS_PREFIX);
			setNsURI(eNS_URI);

			
			
			
			
			
			
			BlackListedEClass.getESuperTypes().add(getCustomer());
										
			
			
			
			initEClass(CarEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getCar_RegNum(), 
				ecorePackage.getEString(), 
				"regNum", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getCar_CarGroup(), 
				this.getCarGroup(), 
				null, 
				"carGroup", 
				null, 
				1, 
				1, 
				Car.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getCar_RentalAgreement(), 
				this.getRentalAgreement(), 
				null, 
				"rentalAgreement", 
				null, 
				0, 
				-1, 
				Car.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			initEClass(CarGroupEClass, CarGroup.class, "CarGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getCarGroup_Category(), 
				ecorePackage.getEString(), 
				"category", 
				"", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getCarGroup_Car(), 
				this.getCar(), 
				null, 
				"car", 
				null, 
				0, 
				-1, 
				CarGroup.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			initEClass(CustomerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getCustomer_Id(), 
				ecorePackage.getEString(), 
				"id", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getCustomer_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getCustomer_Premium(), 
				ecorePackage.getEBooleanObject(), 
				"premium", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getCustomer_Discount(), 
				ecorePackage.getEInt(), 
				"discount", 
				"0", 
				1, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getCustomer_LicenseExpDate(), 
				ecorePackage.getEDate(), 
				"licenseExpDate", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getCustomer_Birthday(), 
				ecorePackage.getEDate(), 
				"birthday", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getCustomer_Rental(), 
				this.getRental(), 
				null, 
				"rental", 
				null, 
				0, 
				1, 
				Customer.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(BranchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getBranch_Address(), 
				ecorePackage.getEString(), 
				"address", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			initEClass(RentalEClass, Rental.class, "Rental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getRental_Id(), 
				ecorePackage.getEString(), 
				"id", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getRental_Price(), 
				ecorePackage.getEBigDecimal(), 
				"price", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getRental_State(), 
				ecorePackage.getEString(), 
				"state", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getRental_StartingDate(), 
				ecorePackage.getEDate(), 
				"startingDate", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getRental_EndingDate(), 
				ecorePackage.getEDate(), 
				"endingDate", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getRental_Car(), 
				this.getCar(), 
				null, 
				"car", 
				null, 
				0, 
				-1, 
				Rental.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				!IS_ORDERED);
			
			initEClass(BlackListedEClass, BlackListed.class, "BlackListed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getBlackListed_BlackListedDate(), 
				ecorePackage.getEDate(), 
				"blackListedDate", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			initEClass(RentalAgreementEClass, RentalAgreement.class, "RentalAgreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			initEClass(QuoteEClass, Quote.class, "Quote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getQuote_Value(), 
				ecorePackage.getEBigInteger(), 
				"value", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			// Create resource
			createResource(eNS_URI);
        }
        
		
		private EClass CarEClass = null;
		private EClass CarGroupEClass = null;
		private EClass CustomerEClass = null;
		private EClass BranchEClass = null;
		private EClass RentalEClass = null;
		private EClass BlackListedEClass = null;
		private EClass RentalAgreementEClass = null;
		private EClass QuoteEClass = null;
		
		
		private EEnum MyEnumEEnum = null;
		
		private EDataType MyEnumEDataType = null;
		
		
		public final static int CAR = 0;
		public final static int CAR_FEATURE_COUNT = 3;
		public final static int CAR_OPERATION_COUNT = 1;
		
		public final static int CAR_REGNUM = 0;
		public final static int CAR_CARGROUP = 1;
		public final static int CAR_RENTALAGREEMENT = 2;
		
		public final static int CARGROUP = 1;
		public final static int CARGROUP_FEATURE_COUNT = 2;
		public final static int CARGROUP_OPERATION_COUNT = 0;
		
		public final static int CARGROUP_CATEGORY = 0;
		public final static int CARGROUP_CAR = 1;
		
		public final static int CUSTOMER = 2;
		public final static int CUSTOMER_FEATURE_COUNT = 7;
		public final static int CUSTOMER_OPERATION_COUNT = 0;
		
		public final static int CUSTOMER_ID = 0;
		public final static int CUSTOMER_NAME = 1;
		public final static int CUSTOMER_PREMIUM = 2;
		public final static int CUSTOMER_DISCOUNT = 3;
		public final static int CUSTOMER_LICENSEEXPDATE = 4;
		public final static int CUSTOMER_BIRTHDAY = 5;
		public final static int CUSTOMER_RENTAL = 6;
		
		public final static int BRANCH = 3;
		public final static int BRANCH_FEATURE_COUNT = 1;
		public final static int BRANCH_OPERATION_COUNT = 0;
		
		public final static int BRANCH_ADDRESS = 0;
		
		public final static int RENTAL = 4;
		public final static int RENTAL_FEATURE_COUNT = 6;
		public final static int RENTAL_OPERATION_COUNT = 0;
		
		public final static int RENTAL_ID = 0;
		public final static int RENTAL_PRICE = 1;
		public final static int RENTAL_STATE = 2;
		public final static int RENTAL_STARTINGDATE = 3;
		public final static int RENTAL_ENDINGDATE = 4;
		public final static int RENTAL_CAR = 5;
		
		public final static int RENTALAGREEMENT = 6;
		public final static int RENTALAGREEMENT_FEATURE_COUNT = 0;
		public final static int RENTALAGREEMENT_OPERATION_COUNT = 0;
		
		
		public final static int QUOTE = 7;
		public final static int QUOTE_FEATURE_COUNT = 1;
		public final static int QUOTE_OPERATION_COUNT = 0;
		
		public final static int QUOTE_VALUE = 0;
		
		public final static int BLACKLISTED = 5;
		public final static int BLACKLISTED_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 1;
		public final static int BLACKLISTED_OPERATION_COUNT = CUSTOMER_OPERATION_COUNT + 0;
		
		public final static int BLACKLISTED_ID = 0;
		public final static int BLACKLISTED_NAME = 1;
		public final static int BLACKLISTED_PREMIUM = 2;
		public final static int BLACKLISTED_DISCOUNT = 3;
		public final static int BLACKLISTED_LICENSEEXPDATE = 4;
		public final static int BLACKLISTED_BIRTHDAY = 5;
		public final static int BLACKLISTED_RENTAL = 6;
		public final static int BLACKLISTED_BLACKLISTEDDATE = 7;
		
		public final static int MYENUM = 8;
		
		
		public EClass getCar(){return CarEClass;}
		
		public EAttribute getCar_RegNum(){return (EAttribute)CarEClass.getEStructuralFeatures().get(0);}
		public EReference getCar_CarGroup(){return (EReference)CarEClass.getEStructuralFeatures().get(1);}
		public EReference getCar_RentalAgreement(){return (EReference)CarEClass.getEStructuralFeatures().get(2);}
		public EClass getCarGroup(){return CarGroupEClass;}
		
		public EAttribute getCarGroup_Category(){return (EAttribute)CarGroupEClass.getEStructuralFeatures().get(0);}
		public EReference getCarGroup_Car(){return (EReference)CarGroupEClass.getEStructuralFeatures().get(1);}
		public EClass getCustomer(){return CustomerEClass;}
		
		public EAttribute getCustomer_Id(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(0);}
		public EAttribute getCustomer_Name(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(1);}
		public EAttribute getCustomer_Premium(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(2);}
		public EAttribute getCustomer_Discount(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(3);}
		public EAttribute getCustomer_LicenseExpDate(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(4);}
		public EAttribute getCustomer_Birthday(){return (EAttribute)CustomerEClass.getEStructuralFeatures().get(5);}
		public EReference getCustomer_Rental(){return (EReference)CustomerEClass.getEStructuralFeatures().get(6);}
		public EClass getBranch(){return BranchEClass;}
		
		public EAttribute getBranch_Address(){return (EAttribute)BranchEClass.getEStructuralFeatures().get(0);}
		public EClass getRental(){return RentalEClass;}
		
		public EAttribute getRental_Id(){return (EAttribute)RentalEClass.getEStructuralFeatures().get(0);}
		public EAttribute getRental_Price(){return (EAttribute)RentalEClass.getEStructuralFeatures().get(1);}
		public EAttribute getRental_State(){return (EAttribute)RentalEClass.getEStructuralFeatures().get(2);}
		public EAttribute getRental_StartingDate(){return (EAttribute)RentalEClass.getEStructuralFeatures().get(3);}
		public EAttribute getRental_EndingDate(){return (EAttribute)RentalEClass.getEStructuralFeatures().get(4);}
		public EReference getRental_Car(){return (EReference)RentalEClass.getEStructuralFeatures().get(5);}
		public EClass getRentalAgreement(){return RentalAgreementEClass;}
		
		public EClass getQuote(){return QuoteEClass;}
		
		public EAttribute getQuote_Value(){return (EAttribute)QuoteEClass.getEStructuralFeatures().get(0);}
		public EClass getBlackListed(){return BlackListedEClass;}
		
		public EAttribute getBlackListed_BlackListedDate(){return (EAttribute)BlackListedEClass.getEStructuralFeatures().get(0);}
		public EEnum getMyEnum(){return MyEnumEEnum;}
		
		public static class Literals{
			public final static EClass CAR = EurentPackageImpl.eINSTANCE.getCar();
			
			public final static EReference CAR_CARGROUP = EurentPackageImpl.eINSTANCE.getCar_CarGroup();
			public final static EReference CAR_RENTALAGREEMENT = EurentPackageImpl.eINSTANCE.getCar_RentalAgreement();
			
			public final static EAttribute CAR_REGNUM = EurentPackageImpl.eINSTANCE.getCar_RegNum();
			public final static EClass CARGROUP = EurentPackageImpl.eINSTANCE.getCarGroup();
			
			public final static EReference CARGROUP_CAR = EurentPackageImpl.eINSTANCE.getCarGroup_Car();
			
			public final static EAttribute CARGROUP_CATEGORY = EurentPackageImpl.eINSTANCE.getCarGroup_Category();
			public final static EClass CUSTOMER = EurentPackageImpl.eINSTANCE.getCustomer();
			
			public final static EReference CUSTOMER_RENTAL = EurentPackageImpl.eINSTANCE.getCustomer_Rental();
			
			public final static EAttribute CUSTOMER_ID = EurentPackageImpl.eINSTANCE.getCustomer_Id();
			public final static EAttribute CUSTOMER_NAME = EurentPackageImpl.eINSTANCE.getCustomer_Name();
			public final static EAttribute CUSTOMER_PREMIUM = EurentPackageImpl.eINSTANCE.getCustomer_Premium();
			public final static EAttribute CUSTOMER_DISCOUNT = EurentPackageImpl.eINSTANCE.getCustomer_Discount();
			public final static EAttribute CUSTOMER_LICENSEEXPDATE = EurentPackageImpl.eINSTANCE.getCustomer_LicenseExpDate();
			public final static EAttribute CUSTOMER_BIRTHDAY = EurentPackageImpl.eINSTANCE.getCustomer_Birthday();
			public final static EClass BRANCH = EurentPackageImpl.eINSTANCE.getBranch();
			
			
			public final static EAttribute BRANCH_ADDRESS = EurentPackageImpl.eINSTANCE.getBranch_Address();
			public final static EClass RENTAL = EurentPackageImpl.eINSTANCE.getRental();
			
			public final static EReference RENTAL_CAR = EurentPackageImpl.eINSTANCE.getRental_Car();
			
			public final static EAttribute RENTAL_ID = EurentPackageImpl.eINSTANCE.getRental_Id();
			public final static EAttribute RENTAL_PRICE = EurentPackageImpl.eINSTANCE.getRental_Price();
			public final static EAttribute RENTAL_STATE = EurentPackageImpl.eINSTANCE.getRental_State();
			public final static EAttribute RENTAL_STARTINGDATE = EurentPackageImpl.eINSTANCE.getRental_StartingDate();
			public final static EAttribute RENTAL_ENDINGDATE = EurentPackageImpl.eINSTANCE.getRental_EndingDate();
			public final static EClass RENTALAGREEMENT = EurentPackageImpl.eINSTANCE.getRentalAgreement();
			
			
			public final static EClass QUOTE = EurentPackageImpl.eINSTANCE.getQuote();
			
			
			public final static EAttribute QUOTE_VALUE = EurentPackageImpl.eINSTANCE.getQuote_Value();
			public final static EClass BLACKLISTED = EurentPackageImpl.eINSTANCE.getBlackListed();
			
			
			public final static EAttribute BLACKLISTED_BLACKLISTEDDATE = EurentPackageImpl.eINSTANCE.getBlackListed_BlackListedDate();
			public final static EEnum MYENUM = EurentPackageImpl.eINSTANCE.getMyEnum();
		}
 
}

