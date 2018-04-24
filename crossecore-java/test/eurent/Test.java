package eurent;


import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Before;


public class Test {
	private Quote quote;
	private Car car;
	private Customer customer;
	private EurentValidator validator;
	
	@Before
	public void setUp() throws Exception {
		
		quote = EurentFactoryImpl.eINSTANCE.createQuote();
		car = EurentFactoryImpl.eINSTANCE.createCar();
		customer = EurentFactoryImpl.eINSTANCE.createCustomer();
		validator = EurentValidator.INSTANCE;
	}

	@org.junit.Test
	public void testInvariant() {
		
		quote.setValue(BigInteger.valueOf(0));
		Assert.assertFalse(validator.validateQuote_QuoteOverZero(quote, null, null));
		
		quote.setValue(BigInteger.valueOf(1));
		Assert.assertTrue(validator.validateQuote_QuoteOverZero(quote, null, null));
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
