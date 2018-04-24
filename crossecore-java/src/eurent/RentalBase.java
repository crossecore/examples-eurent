package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class RentalBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Rental
{
	private java.util.Date _endingDate = null;
	public java.util.Date getEndingDate()
	{
		return _endingDate;
	}
	public void setEndingDate(java.util.Date value){
		
		java.util.Date oldValue = _endingDate;
		_endingDate = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.RENTAL_ENDINGDATE, oldValue, value));
		
	}
	
	private java.lang.String _state = "";
	public java.lang.String getState()
	{
		return _state;
	}
	public void setState(java.lang.String value){
		
		java.lang.String oldValue = _state;
		_state = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.RENTAL_STATE, oldValue, value));
		
	}
	
	private java.math.BigDecimal _price = null;
	public java.math.BigDecimal getPrice()
	{
		return _price;
	}
	public void setPrice(java.math.BigDecimal value){
		
		java.math.BigDecimal oldValue = _price;
		_price = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.RENTAL_PRICE, oldValue, value));
		
	}
	
	private java.util.Date _startingDate = null;
	public java.util.Date getStartingDate()
	{
		return _startingDate;
	}
	public void setStartingDate(java.util.Date value){
		
		java.util.Date oldValue = _startingDate;
		_startingDate = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.RENTAL_STARTINGDATE, oldValue, value));
		
	}
	
	private java.lang.String _id = "";
	public java.lang.String getId()
	{
		return _id;
	}
	public void setId(java.lang.String value){
		
		java.lang.String oldValue = _id;
		_id = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.RENTAL_ID, oldValue, value));
		
	}
	
	private Ocllib.Set<Car> _car;
	
	public Ocllib.Set<Car> getCar()
	{
		if(_car==null){
			_car = new Ocllib.Set<Car>(Car.class, this, EurentPackageImpl.RENTAL_CAR, EOPPOSITE_FEATURE_BASE - EurentPackageImpl.RENTAL_CAR);
		}
		return _car;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.RENTAL;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.RENTAL_ID:
				return getId();
			case EurentPackageImpl.RENTAL_PRICE:
				return getPrice();
			case EurentPackageImpl.RENTAL_STATE:
				return getState();
			case EurentPackageImpl.RENTAL_STARTINGDATE:
				return getStartingDate();
			case EurentPackageImpl.RENTAL_ENDINGDATE:
				return getEndingDate();
			case EurentPackageImpl.RENTAL_CAR:
				return getCar();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.RENTAL_ID:
				setId((java.lang.String) newValue);
				return;
			case EurentPackageImpl.RENTAL_PRICE:
				setPrice((java.math.BigDecimal) newValue);
				return;
			case EurentPackageImpl.RENTAL_STATE:
				setState((java.lang.String) newValue);
				return;
			case EurentPackageImpl.RENTAL_STARTINGDATE:
				setStartingDate((java.util.Date) newValue);
				return;
			case EurentPackageImpl.RENTAL_ENDINGDATE:
				setEndingDate((java.util.Date) newValue);
				return;
			case EurentPackageImpl.RENTAL_CAR:
				getCar().clear();
				getCar().addAll((java.util.Collection<? extends Car>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
