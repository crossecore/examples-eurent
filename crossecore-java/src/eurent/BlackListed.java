package eurent;
public interface BlackListed 
 extends Customer
{
	
	public static Ocllib.Set<BlackListed> allInstances = new Ocllib.Set<BlackListed>(BlackListed.class);
	
	java.util.Date getBlackListedDate();
	void setBlackListedDate(java.util.Date value);
	
}
