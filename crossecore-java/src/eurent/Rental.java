package eurent;
public interface Rental 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Rental> allInstances = new Ocllib.Set<Rental>(Rental.class);
	
	java.lang.String getId();
	void setId(java.lang.String value);
	java.math.BigDecimal getPrice();
	void setPrice(java.math.BigDecimal value);
	java.lang.String getState();
	void setState(java.lang.String value);
	java.util.Date getStartingDate();
	void setStartingDate(java.util.Date value);
	java.util.Date getEndingDate();
	void setEndingDate(java.util.Date value);
	Ocllib.Set<Car> getCar();
	
}
