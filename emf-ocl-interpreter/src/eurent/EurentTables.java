/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /emf-ocl-interpreter/model/EU-Rent.ecore
 * using:
 *   /emf-ocl-interpreter/model/EU-Rent.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package eurent;

import eurent.EurentTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * EurentTables provides the dispatch tables for the eurent for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class EurentTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EurentPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_eurent = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("eurent", null, eurent.EurentPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Car = eurent.EurentTables.PACKid_eurent.getClassId("Car", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_CarGroup = eurent.EurentTables.PACKid_eurent.getClassId("CarGroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Customer = eurent.EurentTables.PACKid_eurent.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Quote = eurent.EurentTables.PACKid_eurent.getClassId("Quote", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rental = eurent.EurentTables.PACKid_eurent.getClassId("Rental", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RentalAgreement = eurent.EurentTables.PACKid_eurent.getClassId("RentalAgreement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EDate = eurent.EurentTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = eurent.EurentTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_15 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("15");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_30 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("30");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_5 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ java.lang.String STR_Quote_c_c_QuoteOverZero = "Quote::QuoteOverZero";
	public static final /*@NonInvalid*/ java.lang.String STR_high = "high";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Car = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(eurent.EurentTables.CLSSid_Car);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_CarGroup = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(eurent.EurentTables.CLSSid_CarGroup);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Customer = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(eurent.EurentTables.CLSSid_Customer);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Rental = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(eurent.EurentTables.CLSSid_Rental);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Car = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(eurent.EurentTables.CLSSid_Car);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_RentalAgreement = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(eurent.EurentTables.CLSSid_RentalAgreement);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EurentTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _BlackListed = new EcoreExecutorType(EurentPackage.Literals.BLACK_LISTED, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Branch = new EcoreExecutorType(EurentPackage.Literals.BRANCH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Car = new EcoreExecutorType(EurentPackage.Literals.CAR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CarGroup = new EcoreExecutorType(EurentPackage.Literals.CAR_GROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Customer = new EcoreExecutorType(EurentPackage.Literals.CUSTOMER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MyEnum = new EcoreExecutorEnumeration(EurentPackage.Literals.MY_ENUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Quote = new EcoreExecutorType(EurentPackage.Literals.QUOTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rental = new EcoreExecutorType(EurentPackage.Literals.RENTAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RentalAgreement = new EcoreExecutorType(EurentPackage.Literals.RENTAL_AGREEMENT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_BlackListed,
			_Branch,
			_Car,
			_CarGroup,
			_Customer,
			_MyEnum,
			_Quote,
			_Rental,
			_RentalAgreement
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _BlackListed__BlackListed = new ExecutorFragment(Types._BlackListed, EurentTables.Types._BlackListed);
		private static final /*@NonNull*/ ExecutorFragment _BlackListed__Customer = new ExecutorFragment(Types._BlackListed, EurentTables.Types._Customer);
		private static final /*@NonNull*/ ExecutorFragment _BlackListed__OclAny = new ExecutorFragment(Types._BlackListed, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BlackListed__OclElement = new ExecutorFragment(Types._BlackListed, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, EurentTables.Types._Branch);
		private static final /*@NonNull*/ ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Car__Car = new ExecutorFragment(Types._Car, EurentTables.Types._Car);
		private static final /*@NonNull*/ ExecutorFragment _Car__OclAny = new ExecutorFragment(Types._Car, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Car__OclElement = new ExecutorFragment(Types._Car, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CarGroup__CarGroup = new ExecutorFragment(Types._CarGroup, EurentTables.Types._CarGroup);
		private static final /*@NonNull*/ ExecutorFragment _CarGroup__OclAny = new ExecutorFragment(Types._CarGroup, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CarGroup__OclElement = new ExecutorFragment(Types._CarGroup, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, EurentTables.Types._Customer);
		private static final /*@NonNull*/ ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MyEnum__MyEnum = new ExecutorFragment(Types._MyEnum, EurentTables.Types._MyEnum);
		private static final /*@NonNull*/ ExecutorFragment _MyEnum__OclAny = new ExecutorFragment(Types._MyEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MyEnum__OclElement = new ExecutorFragment(Types._MyEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MyEnum__OclEnumeration = new ExecutorFragment(Types._MyEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MyEnum__OclType = new ExecutorFragment(Types._MyEnum, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Quote__OclAny = new ExecutorFragment(Types._Quote, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Quote__OclElement = new ExecutorFragment(Types._Quote, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Quote__Quote = new ExecutorFragment(Types._Quote, EurentTables.Types._Quote);

		private static final /*@NonNull*/ ExecutorFragment _Rental__OclAny = new ExecutorFragment(Types._Rental, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rental__OclElement = new ExecutorFragment(Types._Rental, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rental__Rental = new ExecutorFragment(Types._Rental, EurentTables.Types._Rental);

		private static final /*@NonNull*/ ExecutorFragment _RentalAgreement__OclAny = new ExecutorFragment(Types._RentalAgreement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RentalAgreement__OclElement = new ExecutorFragment(Types._RentalAgreement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RentalAgreement__RentalAgreement = new ExecutorFragment(Types._RentalAgreement, EurentTables.Types._RentalAgreement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Car__mostPopular = new ExecutorOperation("mostPopular", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Car,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _BlackListed__blackListedDate = new EcoreExecutorProperty(EurentPackage.Literals.BLACK_LISTED__BLACK_LISTED_DATE, Types._BlackListed, 0);

		public static final /*@NonNull*/ ExecutorProperty _Branch__address = new EcoreExecutorProperty(EurentPackage.Literals.BRANCH__ADDRESS, Types._Branch, 0);

		public static final /*@NonNull*/ ExecutorProperty _Car__carGroup = new EcoreExecutorProperty(EurentPackage.Literals.CAR__CAR_GROUP, Types._Car, 0);
		public static final /*@NonNull*/ ExecutorProperty _Car__regNum = new EcoreExecutorProperty(EurentPackage.Literals.CAR__REG_NUM, Types._Car, 1);
		public static final /*@NonNull*/ ExecutorProperty _Car__rentalAgreement = new EcoreExecutorProperty(EurentPackage.Literals.CAR__RENTAL_AGREEMENT, Types._Car, 2);
		public static final /*@NonNull*/ ExecutorProperty _Car__CarGroup__car = new ExecutorPropertyWithImplementation("CarGroup", Types._Car, 3, new EcoreLibraryOppositeProperty(EurentPackage.Literals.CAR_GROUP__CAR));
		public static final /*@NonNull*/ ExecutorProperty _Car__Rental__car = new ExecutorPropertyWithImplementation("Rental", Types._Car, 4, new EcoreLibraryOppositeProperty(EurentPackage.Literals.RENTAL__CAR));

		public static final /*@NonNull*/ ExecutorProperty _CarGroup__car = new EcoreExecutorProperty(EurentPackage.Literals.CAR_GROUP__CAR, Types._CarGroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _CarGroup__category = new EcoreExecutorProperty(EurentPackage.Literals.CAR_GROUP__CATEGORY, Types._CarGroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _CarGroup__Car__carGroup = new ExecutorPropertyWithImplementation("Car", Types._CarGroup, 2, new EcoreLibraryOppositeProperty(EurentPackage.Literals.CAR__CAR_GROUP));

		public static final /*@NonNull*/ ExecutorProperty _Customer__birthday = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__BIRTHDAY, Types._Customer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Customer__discount = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__DISCOUNT, Types._Customer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Customer__id = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__ID, Types._Customer, 2);
		public static final /*@NonNull*/ ExecutorProperty _Customer__licenseExpDate = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__LICENSE_EXP_DATE, Types._Customer, 3);
		public static final /*@NonNull*/ ExecutorProperty _Customer__name = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__NAME, Types._Customer, 4);
		public static final /*@NonNull*/ ExecutorProperty _Customer__premium = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__PREMIUM, Types._Customer, 5);
		public static final /*@NonNull*/ ExecutorProperty _Customer__rental = new EcoreExecutorProperty(EurentPackage.Literals.CUSTOMER__RENTAL, Types._Customer, 6);

		public static final /*@NonNull*/ ExecutorProperty _Quote__value = new EcoreExecutorProperty(EurentPackage.Literals.QUOTE__VALUE, Types._Quote, 0);

		public static final /*@NonNull*/ ExecutorProperty _Rental__car = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__CAR, Types._Rental, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rental__endingDate = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__ENDING_DATE, Types._Rental, 1);
		public static final /*@NonNull*/ ExecutorProperty _Rental__id = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__ID, Types._Rental, 2);
		public static final /*@NonNull*/ ExecutorProperty _Rental__price = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__PRICE, Types._Rental, 3);
		public static final /*@NonNull*/ ExecutorProperty _Rental__startingDate = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__STARTING_DATE, Types._Rental, 4);
		public static final /*@NonNull*/ ExecutorProperty _Rental__state = new EcoreExecutorProperty(EurentPackage.Literals.RENTAL__STATE, Types._Rental, 5);
		public static final /*@NonNull*/ ExecutorProperty _Rental__Customer__rental = new ExecutorPropertyWithImplementation("Customer", Types._Rental, 6, new EcoreLibraryOppositeProperty(EurentPackage.Literals.CUSTOMER__RENTAL));

		public static final /*@NonNull*/ ExecutorProperty _RentalAgreement__Car__rentalAgreement = new ExecutorPropertyWithImplementation("Car", Types._RentalAgreement, 0, new EcoreLibraryOppositeProperty(EurentPackage.Literals.CAR__RENTAL_AGREEMENT));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BlackListed =
		{
			Fragments._BlackListed__OclAny /* 0 */,
			Fragments._BlackListed__OclElement /* 1 */,
			Fragments._BlackListed__Customer /* 2 */,
			Fragments._BlackListed__BlackListed /* 3 */
		};
		private static final int /*@NonNull*/ [] __BlackListed = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Branch =
		{
			Fragments._Branch__OclAny /* 0 */,
			Fragments._Branch__OclElement /* 1 */,
			Fragments._Branch__Branch /* 2 */
		};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Car =
		{
			Fragments._Car__OclAny /* 0 */,
			Fragments._Car__OclElement /* 1 */,
			Fragments._Car__Car /* 2 */
		};
		private static final int /*@NonNull*/ [] __Car = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CarGroup =
		{
			Fragments._CarGroup__OclAny /* 0 */,
			Fragments._CarGroup__OclElement /* 1 */,
			Fragments._CarGroup__CarGroup /* 2 */
		};
		private static final int /*@NonNull*/ [] __CarGroup = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Customer =
		{
			Fragments._Customer__OclAny /* 0 */,
			Fragments._Customer__OclElement /* 1 */,
			Fragments._Customer__Customer /* 2 */
		};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MyEnum =
		{
			Fragments._MyEnum__OclAny /* 0 */,
			Fragments._MyEnum__OclElement /* 1 */,
			Fragments._MyEnum__OclType /* 2 */,
			Fragments._MyEnum__OclEnumeration /* 3 */,
			Fragments._MyEnum__MyEnum /* 4 */
		};
		private static final int /*@NonNull*/ [] __MyEnum = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Quote =
		{
			Fragments._Quote__OclAny /* 0 */,
			Fragments._Quote__OclElement /* 1 */,
			Fragments._Quote__Quote /* 2 */
		};
		private static final int /*@NonNull*/ [] __Quote = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rental =
		{
			Fragments._Rental__OclAny /* 0 */,
			Fragments._Rental__OclElement /* 1 */,
			Fragments._Rental__Rental /* 2 */
		};
		private static final int /*@NonNull*/ [] __Rental = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RentalAgreement =
		{
			Fragments._RentalAgreement__OclAny /* 0 */,
			Fragments._RentalAgreement__OclElement /* 1 */,
			Fragments._RentalAgreement__RentalAgreement /* 2 */
		};
		private static final int /*@NonNull*/ [] __RentalAgreement = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BlackListed.initFragments(_BlackListed, __BlackListed);
			Types._Branch.initFragments(_Branch, __Branch);
			Types._Car.initFragments(_Car, __Car);
			Types._CarGroup.initFragments(_CarGroup, __CarGroup);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._MyEnum.initFragments(_MyEnum, __MyEnum);
			Types._Quote.initFragments(_Quote, __Quote);
			Types._Rental.initFragments(_Rental, __Rental);
			Types._RentalAgreement.initFragments(_RentalAgreement, __RentalAgreement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlackListed__BlackListed = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlackListed__Customer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlackListed__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BlackListed__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Car__Car = {
			EurentTables.Operations._Car__mostPopular /* mostPopular() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Car__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Car__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CarGroup__CarGroup = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CarGroup__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CarGroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MyEnum__MyEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MyEnum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MyEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MyEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MyEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quote__Quote = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quote__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quote__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rental__Rental = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rental__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rental__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RentalAgreement__RentalAgreement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RentalAgreement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RentalAgreement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BlackListed__BlackListed.initOperations(_BlackListed__BlackListed);
			Fragments._BlackListed__Customer.initOperations(_BlackListed__Customer);
			Fragments._BlackListed__OclAny.initOperations(_BlackListed__OclAny);
			Fragments._BlackListed__OclElement.initOperations(_BlackListed__OclElement);

			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._Car__Car.initOperations(_Car__Car);
			Fragments._Car__OclAny.initOperations(_Car__OclAny);
			Fragments._Car__OclElement.initOperations(_Car__OclElement);

			Fragments._CarGroup__CarGroup.initOperations(_CarGroup__CarGroup);
			Fragments._CarGroup__OclAny.initOperations(_CarGroup__OclAny);
			Fragments._CarGroup__OclElement.initOperations(_CarGroup__OclElement);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);

			Fragments._MyEnum__MyEnum.initOperations(_MyEnum__MyEnum);
			Fragments._MyEnum__OclAny.initOperations(_MyEnum__OclAny);
			Fragments._MyEnum__OclElement.initOperations(_MyEnum__OclElement);
			Fragments._MyEnum__OclEnumeration.initOperations(_MyEnum__OclEnumeration);
			Fragments._MyEnum__OclType.initOperations(_MyEnum__OclType);

			Fragments._Quote__OclAny.initOperations(_Quote__OclAny);
			Fragments._Quote__OclElement.initOperations(_Quote__OclElement);
			Fragments._Quote__Quote.initOperations(_Quote__Quote);

			Fragments._Rental__OclAny.initOperations(_Rental__OclAny);
			Fragments._Rental__OclElement.initOperations(_Rental__OclElement);
			Fragments._Rental__Rental.initOperations(_Rental__Rental);

			Fragments._RentalAgreement__OclAny.initOperations(_RentalAgreement__OclAny);
			Fragments._RentalAgreement__OclElement.initOperations(_RentalAgreement__OclElement);
			Fragments._RentalAgreement__RentalAgreement.initOperations(_RentalAgreement__RentalAgreement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BlackListed = {
			EurentTables.Properties._Customer__birthday,
			EurentTables.Properties._BlackListed__blackListedDate,
			EurentTables.Properties._Customer__discount,
			EurentTables.Properties._Customer__id,
			EurentTables.Properties._Customer__licenseExpDate,
			EurentTables.Properties._Customer__name,
			EurentTables.Properties._Customer__premium,
			EurentTables.Properties._Customer__rental
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Branch = {
			EurentTables.Properties._Branch__address
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Car = {
			EurentTables.Properties._Car__carGroup,
			EurentTables.Properties._Car__regNum,
			EurentTables.Properties._Car__rentalAgreement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CarGroup = {
			EurentTables.Properties._CarGroup__car,
			EurentTables.Properties._CarGroup__category
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Customer = {
			EurentTables.Properties._Customer__birthday,
			EurentTables.Properties._Customer__discount,
			EurentTables.Properties._Customer__id,
			EurentTables.Properties._Customer__licenseExpDate,
			EurentTables.Properties._Customer__name,
			EurentTables.Properties._Customer__premium,
			EurentTables.Properties._Customer__rental
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MyEnum = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Quote = {
			EurentTables.Properties._Quote__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rental = {
			EurentTables.Properties._Rental__car,
			EurentTables.Properties._Rental__endingDate,
			EurentTables.Properties._Rental__id,
			EurentTables.Properties._Rental__price,
			EurentTables.Properties._Rental__startingDate,
			EurentTables.Properties._Rental__state
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RentalAgreement = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BlackListed__BlackListed.initProperties(_BlackListed);
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._Car__Car.initProperties(_Car);
			Fragments._CarGroup__CarGroup.initProperties(_CarGroup);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._MyEnum__MyEnum.initProperties(_MyEnum);
			Fragments._Quote__Quote.initProperties(_Quote);
			Fragments._Rental__Rental.initProperties(_Rental);
			Fragments._RentalAgreement__RentalAgreement.initProperties(_RentalAgreement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MyEnum__eins = new EcoreExecutorEnumerationLiteral(EurentPackage.Literals.MY_ENUM.getEEnumLiteral("eins"), Types._MyEnum, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MyEnum = {
			_MyEnum__eins
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._MyEnum.initLiterals(_MyEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EurentTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
