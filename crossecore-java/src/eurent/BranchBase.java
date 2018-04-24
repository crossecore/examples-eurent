package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class BranchBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Branch
{
	private java.lang.String _address = "";
	public java.lang.String getAddress()
	{
		return _address;
	}
	public void setAddress(java.lang.String value){
		
		java.lang.String oldValue = _address;
		_address = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.BRANCH_ADDRESS, oldValue, value));
		
	}
	

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.BRANCH;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.BRANCH_ADDRESS:
				return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.BRANCH_ADDRESS:
				setAddress((java.lang.String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
