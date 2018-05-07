package eurent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class QuoteBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Quote
{
	private int _value = 0;
	public int getValue()
	{
		return _value;
	}
	public void setValue(int value){
		
		int oldValue = _value;
		_value = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackageImpl.QUOTE_VALUE, oldValue, value));
		
	}
	

	
	@Override
	protected EClass eStaticClass() {
		return EurentPackageImpl.Literals.QUOTE;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackageImpl.QUOTE_VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackageImpl.QUOTE_VALUE:
				setValue((int) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	public boolean QuoteOverZero(org.eclipse.emf.common.util.DiagnosticChain diagnostics, java.util.Map<Object, Object> context)
	{
		return this.getValue() > 0;
	}
	
}
