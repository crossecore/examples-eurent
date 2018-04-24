package eurent;
public interface Car 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Car> allInstances = new Ocllib.Set<Car>(Car.class);
	
	java.lang.String getRegNum();
	void setRegNum(java.lang.String value);
	
	CarGroup getCarGroup();
	void setCarGroup(CarGroup value);
	Ocllib.Set<RentalAgreement> getRentalAgreement();
	java.lang.Boolean mostPopular();
	
}
