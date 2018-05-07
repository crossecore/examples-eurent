/**
 */
package eurent.impl;

import eurent.Customer;
import eurent.EurentPackage;
import eurent.Rental;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eurent.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getPremium <em>Premium</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getLicenseExpDate <em>License Exp Date</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link eurent.impl.CustomerImpl#getRental <em>Rental</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPremium() <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremium()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREMIUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremium() <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremium()
	 * @generated
	 * @ordered
	 */
	protected Boolean premium = PREMIUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final int DISCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected int discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseExpDate() <em>License Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseExpDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LICENSE_EXP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseExpDate() <em>License Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseExpDate()
	 * @generated
	 * @ordered
	 */
	protected Date licenseExpDate = LICENSE_EXP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected Date birthday = BIRTHDAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRental() <em>Rental</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRental()
	 * @generated
	 * @ordered
	 */
	protected EList<Rental> rental;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EurentPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPremium() {
		return premium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremium(Boolean newPremium) {
		Boolean oldPremium = premium;
		premium = newPremium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__PREMIUM, oldPremium, premium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(int newDiscount) {
		int oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLicenseExpDate() {
		return licenseExpDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseExpDate(Date newLicenseExpDate) {
		Date oldLicenseExpDate = licenseExpDate;
		licenseExpDate = newLicenseExpDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__LICENSE_EXP_DATE, oldLicenseExpDate, licenseExpDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthday(Date newBirthday) {
		Date oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CUSTOMER__BIRTHDAY, oldBirthday, birthday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rental> getRental() {
		if (rental == null) {
			rental = new EObjectResolvingEList<Rental>(Rental.class, this, EurentPackage.CUSTOMER__RENTAL);
		}
		return rental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackage.CUSTOMER__ID:
				return getId();
			case EurentPackage.CUSTOMER__NAME:
				return getName();
			case EurentPackage.CUSTOMER__PREMIUM:
				return getPremium();
			case EurentPackage.CUSTOMER__DISCOUNT:
				return getDiscount();
			case EurentPackage.CUSTOMER__LICENSE_EXP_DATE:
				return getLicenseExpDate();
			case EurentPackage.CUSTOMER__BIRTHDAY:
				return getBirthday();
			case EurentPackage.CUSTOMER__RENTAL:
				return getRental();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EurentPackage.CUSTOMER__ID:
				setId((String)newValue);
				return;
			case EurentPackage.CUSTOMER__NAME:
				setName((String)newValue);
				return;
			case EurentPackage.CUSTOMER__PREMIUM:
				setPremium((Boolean)newValue);
				return;
			case EurentPackage.CUSTOMER__DISCOUNT:
				setDiscount((Integer)newValue);
				return;
			case EurentPackage.CUSTOMER__LICENSE_EXP_DATE:
				setLicenseExpDate((Date)newValue);
				return;
			case EurentPackage.CUSTOMER__BIRTHDAY:
				setBirthday((Date)newValue);
				return;
			case EurentPackage.CUSTOMER__RENTAL:
				getRental().clear();
				getRental().addAll((Collection<? extends Rental>)newValue);
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
			case EurentPackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__PREMIUM:
				setPremium(PREMIUM_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__LICENSE_EXP_DATE:
				setLicenseExpDate(LICENSE_EXP_DATE_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__BIRTHDAY:
				setBirthday(BIRTHDAY_EDEFAULT);
				return;
			case EurentPackage.CUSTOMER__RENTAL:
				getRental().clear();
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
			case EurentPackage.CUSTOMER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EurentPackage.CUSTOMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EurentPackage.CUSTOMER__PREMIUM:
				return PREMIUM_EDEFAULT == null ? premium != null : !PREMIUM_EDEFAULT.equals(premium);
			case EurentPackage.CUSTOMER__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case EurentPackage.CUSTOMER__LICENSE_EXP_DATE:
				return LICENSE_EXP_DATE_EDEFAULT == null ? licenseExpDate != null : !LICENSE_EXP_DATE_EDEFAULT.equals(licenseExpDate);
			case EurentPackage.CUSTOMER__BIRTHDAY:
				return BIRTHDAY_EDEFAULT == null ? birthday != null : !BIRTHDAY_EDEFAULT.equals(birthday);
			case EurentPackage.CUSTOMER__RENTAL:
				return rental != null && !rental.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", premium: ");
		result.append(premium);
		result.append(", discount: ");
		result.append(discount);
		result.append(", licenseExpDate: ");
		result.append(licenseExpDate);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
