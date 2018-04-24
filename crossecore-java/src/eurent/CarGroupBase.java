package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CarGroupBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements CarGroup
{
	private java.lang.String _category = "";
	public java.lang.String getCategory()
	{
		return _category;
	}
	public void setCategory(java.lang.String value){
		
		java.lang.String oldValue = _category;
		_category = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CARGROUP_CATEGORY, oldValue, value));
		
	}
	
	private Ocllib.Set<Car> _car;
	
	public Ocllib.Set<Car> getCar()
	{
		if(_car==null){
			_car = new Ocllib.Set<Car>(Car.class, this, EurentPackageImpl.CARGROUP_CAR, EOPPOSITE_FEATURE_BASE - EurentPackageImpl.CARGROUP_CAR);
		}
		return _car;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.CARGROUP;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.CARGROUP_CATEGORY:
				return getCategory();
			case EurentPackageImpl.CARGROUP_CAR:
				return getCar();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.CARGROUP_CATEGORY:
				setCategory((java.lang.String) newValue);
				return;
			case EurentPackageImpl.CARGROUP_CAR:
				getCar().clear();
				getCar().addAll((java.util.Collection<? extends Car>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
