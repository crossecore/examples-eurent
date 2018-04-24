package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CarBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Car
{
	private java.lang.String _regNum = "";
	public java.lang.String getRegNum()
	{
		return _regNum;
	}
	public void setRegNum(java.lang.String value){
		
		java.lang.String oldValue = _regNum;
		_regNum = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CAR_REGNUM, oldValue, value));
		
	}
	
	private CarGroup _carGroup;
	public CarGroup getCarGroup()
	{
		
			return _carGroup;
		
		
	}
	public void setCarGroup(CarGroup value){
		CarGroup oldvalue = _carGroup;
		_carGroup = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EurentPackageImpl.CAR_CARGROUP , oldvalue, value));
		}
	}
	private Ocllib.Set<RentalAgreement> _rentalAgreement;
	
	public Ocllib.Set<RentalAgreement> getRentalAgreement()
	{
		if(_rentalAgreement==null){
			_rentalAgreement = new Ocllib.Set<RentalAgreement>(RentalAgreement.class, this, EurentPackageImpl.CAR_RENTALAGREEMENT, EOPPOSITE_FEATURE_BASE - EurentPackageImpl.CAR_RENTALAGREEMENT);
		}
		return _rentalAgreement;
	
	}
	public java.lang.Boolean mostPopular()
	{
	    /*
	    Car::allInstances()->forAll(c1|c1<>self implies c1.rentalAgreement->size()<=self.rentalAgreement->size())
	    */
	    return Car.allInstances.forAll(c1 -> !(c1 != this) || c1.getRentalAgreement().size() <= this.getRentalAgreement().size());
	}

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.CAR;
	}
	
	
	public NotificationChain basicSetCarGroup(CarGroup newobj, NotificationChain msgs) {
		CarGroup oldobj = _carGroup;
		_carGroup = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EurentPackageImpl.CAR_CARGROUP, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.CAR_REGNUM:
				return getRegNum();
			case EurentPackageImpl.CAR_CARGROUP:
				return getCarGroup();
			case EurentPackageImpl.CAR_RENTALAGREEMENT:
				return getRentalAgreement();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.CAR_REGNUM:
				setRegNum((java.lang.String) newValue);
				return;
			case EurentPackageImpl.CAR_CARGROUP:
				setCarGroup((CarGroup) newValue);
				return;
			case EurentPackageImpl.CAR_RENTALAGREEMENT:
				getRentalAgreement().clear();
				getRentalAgreement().addAll((java.util.Collection<? extends RentalAgreement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
