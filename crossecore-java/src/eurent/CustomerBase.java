package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CustomerBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Customer
{
	public int getDiscount()
	{
		/*
						if not self.premium then
							if self.rental.car.carGroup->select(c|c.category='high')->size()>5
							then 15
							else 0 
							endif
						else 30 
						endif*/
		return ! this.getPremium() ? this.getRental().getCar().collect(temp1 -> temp1.getCarGroup()).select(c -> c.getCategory() == "high").size() > 5 ? 15 : 0 : 30;
	}
	
	private java.util.Date _birthday = null;
	public java.util.Date getBirthday()
	{
		return _birthday;
	}
	public void setBirthday(java.util.Date value){
		
		java.util.Date oldValue = _birthday;
		_birthday = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CUSTOMER_BIRTHDAY, oldValue, value));
		
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
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CUSTOMER_ID, oldValue, value));
		
	}
	
	private java.lang.Boolean _premium = null;
	public java.lang.Boolean getPremium()
	{
		return _premium;
	}
	public void setPremium(java.lang.Boolean value){
		
		java.lang.Boolean oldValue = _premium;
		_premium = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CUSTOMER_PREMIUM, oldValue, value));
		
	}
	
	private java.lang.String _name = "";
	public java.lang.String getName()
	{
		return _name;
	}
	public void setName(java.lang.String value){
		
		java.lang.String oldValue = _name;
		_name = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CUSTOMER_NAME, oldValue, value));
		
	}
	
	private java.util.Date _licenseExpDate = null;
	public java.util.Date getLicenseExpDate()
	{
		return _licenseExpDate;
	}
	public void setLicenseExpDate(java.util.Date value){
		
		java.util.Date oldValue = _licenseExpDate;
		_licenseExpDate = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.CUSTOMER_LICENSEEXPDATE, oldValue, value));
		
	}
	
	private Rental _rental;
	public Rental getRental()
	{
		
			return _rental;
		
		
	}
	public void setRental(Rental value){
		Rental oldvalue = _rental;
		_rental = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EurentPackageImpl.CUSTOMER_RENTAL , oldvalue, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.CUSTOMER;
	}
	
	
	public NotificationChain basicSetRental(Rental newobj, NotificationChain msgs) {
		Rental oldobj = _rental;
		_rental = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EurentPackageImpl.CUSTOMER_RENTAL, oldobj, newobj);
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
			case EurentPackageImpl.CUSTOMER_ID:
				return getId();
			case EurentPackageImpl.CUSTOMER_NAME:
				return getName();
			case EurentPackageImpl.CUSTOMER_PREMIUM:
				return getPremium();
			case EurentPackageImpl.CUSTOMER_DISCOUNT:
				return getDiscount();
			case EurentPackageImpl.CUSTOMER_LICENSEEXPDATE:
				return getLicenseExpDate();
			case EurentPackageImpl.CUSTOMER_BIRTHDAY:
				return getBirthday();
			case EurentPackageImpl.CUSTOMER_RENTAL:
				return getRental();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.CUSTOMER_ID:
				setId((java.lang.String) newValue);
				return;
			case EurentPackageImpl.CUSTOMER_NAME:
				setName((java.lang.String) newValue);
				return;
			case EurentPackageImpl.CUSTOMER_PREMIUM:
				setPremium((java.lang.Boolean) newValue);
				return;
			case EurentPackageImpl.CUSTOMER_LICENSEEXPDATE:
				setLicenseExpDate((java.util.Date) newValue);
				return;
			case EurentPackageImpl.CUSTOMER_BIRTHDAY:
				setBirthday((java.util.Date) newValue);
				return;
			case EurentPackageImpl.CUSTOMER_RENTAL:
				setRental((Rental) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
