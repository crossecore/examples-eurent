package eurent;


import java.awt.font.NumericShaper;
import java.math.BigInteger;
import java.util.function.Function;

import org.junit.Assert;
import org.junit.Before;

import Ocllib.OrderedSet;




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
		
		EurentPackageImpl.init();
		
		Function<Car, Boolean> kk = x->true;
		
		kk.apply(null);//load java.util.Function API
		
		quote = EurentFactoryImpl.eINSTANCE.createQuote();
		customer = EurentFactoryImpl.eINSTANCE.createCustomer(); 
		car = EurentFactoryImpl.eINSTANCE.createCar();
		blackListed = EurentFactoryImpl.eINSTANCE.createBlackListed();
		validator = EurentValidator.INSTANCE;
		
		
		for(int i=0;i<NUMBER_BLACKLISTED;i++) {
			
			blackListed = EurentFactoryImpl.eINSTANCE.createBlackListed();
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
	public void testDerived() {
		
		customer.setPremium(true);
		
		int result =customer.getDiscount(); 
		
		Assert.assertEquals(30, customer.getDiscount());
		
	}
	
	@org.junit.Test
	public void testQuery() {
		
		boolean x = car.mostPopular();
		
		Assert.assertTrue(car.mostPopular());
		
	}

}
