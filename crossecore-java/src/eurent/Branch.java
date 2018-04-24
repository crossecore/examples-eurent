package eurent;
public interface Branch 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Branch> allInstances = new Ocllib.Set<Branch>(Branch.class);
	
	java.lang.String getAddress();
	void setAddress(java.lang.String value);
	
}
