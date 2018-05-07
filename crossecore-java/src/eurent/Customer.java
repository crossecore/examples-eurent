package eurent;
public interface Customer 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Customer> allInstances = new Ocllib.Set<Customer>(Customer.class);
	
	java.lang.String getId();
	void setId(java.lang.String value);
	java.lang.String getName();
	void setName(java.lang.String value);
	java.lang.Boolean getPremium();
	void setPremium(java.lang.Boolean value);
	int getDiscount();
	java.util.Date getLicenseExpDate();
	void setLicenseExpDate(java.util.Date value);
	java.util.Date getBirthday();
	void setBirthday(java.util.Date value);
	Ocllib.OrderedSet<Rental> getRental();
	
}
