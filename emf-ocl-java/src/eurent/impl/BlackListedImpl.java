/**
 */
package eurent.impl;

import eurent.BlackListed;
import eurent.EurentPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Black Listed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eurent.impl.BlackListedImpl#getBlackListedDate <em>Black Listed Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlackListedImpl extends CustomerImpl implements BlackListed {
	/**
	 * The default value of the '{@link #getBlackListedDate() <em>Black Listed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackListedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BLACK_LISTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlackListedDate() <em>Black Listed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackListedDate()
	 * @generated
	 * @ordered
	 */
	protected Date blackListedDate = BLACK_LISTED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlackListedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EurentPackage.Literals.BLACK_LISTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBlackListedDate() {
		return blackListedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlackListedDate(Date newBlackListedDate) {
		Date oldBlackListedDate = blackListedDate;
		blackListedDate = newBlackListedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.BLACK_LISTED__BLACK_LISTED_DATE, oldBlackListedDate, blackListedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackage.BLACK_LISTED__BLACK_LISTED_DATE:
				return getBlackListedDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackage.BLACK_LISTED__BLACK_LISTED_DATE:
				setBlackListedDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EurentPackage.BLACK_LISTED__BLACK_LISTED_DATE:
				setBlackListedDate(BLACK_LISTED_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EurentPackage.BLACK_LISTED__BLACK_LISTED_DATE:
				return BLACK_LISTED_DATE_EDEFAULT == null ? blackListedDate != null : !BLACK_LISTED_DATE_EDEFAULT.equals(blackListedDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (blackListedDate: ");
		result.append(blackListedDate);
		result.append(')');
		return result.toString();
	}

} //BlackListedImpl
