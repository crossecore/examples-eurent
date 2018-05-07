package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class BlackListedBase 
extends CustomerImpl implements BlackListed
{
	private java.util.Date _blackListedDate = null;
	public java.util.Date getBlackListedDate()
	{
		return _blackListedDate;
	}
	public void setBlackListedDate(java.util.Date value){
		
		java.util.Date oldValue = _blackListedDate;
		_blackListedDate = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.BLACKLISTED_BLACKLISTEDDATE, oldValue, value));
		
	}
	

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.BLACKLISTED;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.BLACKLISTED_BLACKLISTEDDATE:
				return getBlackListedDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.BLACKLISTED_BLACKLISTEDDATE:
				setBlackListedDate((java.util.Date) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	public boolean NoRentalsBlacklisted(org.eclipse.emf.common.util.DiagnosticChain diagnostics, java.util.Map<Object, Object> context)
	{
		return this.getRental().forAll(r -> r.getStartingDate().compareTo(this.getBlackListedDate())>0);
	}
	
}
