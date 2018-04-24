package eurent;
public interface Quote 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Quote> allInstances = new Ocllib.Set<Quote>(Quote.class);
	
	java.math.BigInteger getValue();
	void setValue(java.math.BigInteger value);
	public boolean QuoteOverZero(org.eclipse.emf.common.util.DiagnosticChain diagnostics, java.util.Map<Object, Object> context);
	
}
