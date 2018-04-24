package eurent;
public interface CarGroup 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<CarGroup> allInstances = new Ocllib.Set<CarGroup>(CarGroup.class);
	
	java.lang.String getCategory();
	void setCategory(java.lang.String value);
	Ocllib.Set<Car> getCar();
	
}
