package eurent;


import java.math.BigInteger;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.junit.Assert;
import org.junit.Before;

import eurent.util.EurentValidator;

public class Test {
	private Quote quote;
	private Car car;
	private Customer customer;
	private BlackListed blackListed;
	
	private EurentValidator validator;
	
	private int NUMBER_EXPERIMENTS = 1000;
	private int NUMBER_BLACKLISTED = 1000;
	
	
	@Before
	public void setUp() throws Exception {
		
		ResourceSet rs = new ResourceSetImpl();
//		
		OCL.initialize(rs);
//		OCLDelegateDomain.initialize(rs);
//		
//		//org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap.getAdapter(rs);
//
		EssentialOCLStandaloneSetup.doSetup();
		
		quote = EurentFactory.eINSTANCE.createQuote();
		customer = EurentFactory.eINSTANCE.createCustomer(); 
		car = EurentFactory.eINSTANCE.createCar();
		blackListed = EurentFactory.eINSTANCE.createBlackListed();
		validator = EurentValidator.INSTANCE;
		
		for(int i=0;i<NUMBER_BLACKLISTED;i++) {
			
			blackListed = EurentFactory.eINSTANCE.createBlackListed();
		}
	}

	@org.junit.Test
	public void testInvariant() {
		
		quote.setValue(0);
		Assert.assertFalse(validator.validateQuote_QuoteOverZero(quote, null, null));
		
		quote.setValue(1);
		Assert.assertTrue(validator.validateQuote_QuoteOverZero(quote, null, null));
		
		long stopwatch;

		
		for(int i=0;i<NUMBER_EXPERIMENTS;i++) {
			
			
			stopwatch = System.nanoTime();
			validator.validateBlackListed_NoRentalsBlacklisted(blackListed, null, null);
			stopwatch = System.nanoTime()-stopwatch;
			System.out.println(stopwatch);
		}
	
	}
	
	
	@org.junit.Test
	public void testQuery() {
		
		boolean x = car.mostPopular();
		
		Assert.assertTrue(car.mostPopular());
		
	}

}
