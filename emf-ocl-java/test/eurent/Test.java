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
	private EurentValidator validator;
	
	
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
		car = EurentFactory.eINSTANCE.createCar();
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
	public void testQuery() {
		
		boolean x = car.mostPopular();
		
		Assert.assertTrue(car.mostPopular());
		
	}

}
