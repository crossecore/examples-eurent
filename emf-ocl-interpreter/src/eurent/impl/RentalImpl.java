/**
 */
package eurent.impl;

import eurent.Car;
import eurent.EurentPackage;
import eurent.Rental;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eurent.impl.RentalImpl#getId <em>Id</em>}</li>
 *   <li>{@link eurent.impl.RentalImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link eurent.impl.RentalImpl#getState <em>State</em>}</li>
 *   <li>{@link eurent.impl.RentalImpl#getStartingDate <em>Starting Date</em>}</li>
 *   <li>{@link eurent.impl.RentalImpl#getEndingDate <em>Ending Date</em>}</li>
 *   <li>{@link eurent.impl.RentalImpl#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalImpl extends MinimalEObjectImpl.Container implements Rental {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartingDate() <em>Starting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingDate() <em>Starting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingDate()
	 * @generated
	 * @ordered
	 */
	protected Date startingDate = STARTING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingDate() <em>Ending Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingDate() <em>Ending Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingDate()
	 * @generated
	 * @ordered
	 */
	protected Date endingDate = ENDING_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> car;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EurentPackage.Literals.RENTAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.RENTAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(BigDecimal newPrice) {
		BigDecimal oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.RENTAL__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.RENTAL__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartingDate() {
		return startingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingDate(Date newStartingDate) {
		Date oldStartingDate = startingDate;
		startingDate = newStartingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.RENTAL__STARTING_DATE, oldStartingDate, startingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndingDate() {
		return endingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingDate(Date newEndingDate) {
		Date oldEndingDate = endingDate;
		endingDate = newEndingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.RENTAL__ENDING_DATE, oldEndingDate, endingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Car> getCar() {
		if (car == null) {
			car = new EObjectResolvingEList<Car>(Car.class, this, EurentPackage.RENTAL__CAR);
		}
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackage.RENTAL__ID:
				return getId();
			case EurentPackage.RENTAL__PRICE:
				return getPrice();
			case EurentPackage.RENTAL__STATE:
				return getState();
			case EurentPackage.RENTAL__STARTING_DATE:
				return getStartingDate();
			case EurentPackage.RENTAL__ENDING_DATE:
				return getEndingDate();
			case EurentPackage.RENTAL__CAR:
				return getCar();
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
			case EurentPackage.RENTAL__ID:
				setId((String)newValue);
				return;
			case EurentPackage.RENTAL__PRICE:
				setPrice((BigDecimal)newValue);
				return;
			case EurentPackage.RENTAL__STATE:
				setState((String)newValue);
				return;
			case EurentPackage.RENTAL__STARTING_DATE:
				setStartingDate((Date)newValue);
				return;
			case EurentPackage.RENTAL__ENDING_DATE:
				setEndingDate((Date)newValue);
				return;
			case EurentPackage.RENTAL__CAR:
				getCar().clear();
				getCar().addAll((Collection<? extends Car>)newValue);
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
			case EurentPackage.RENTAL__ID:
				setId(ID_EDEFAULT);
				return;
			case EurentPackage.RENTAL__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case EurentPackage.RENTAL__STATE:
				setState(STATE_EDEFAULT);
				return;
			case EurentPackage.RENTAL__STARTING_DATE:
				setStartingDate(STARTING_DATE_EDEFAULT);
				return;
			case EurentPackage.RENTAL__ENDING_DATE:
				setEndingDate(ENDING_DATE_EDEFAULT);
				return;
			case EurentPackage.RENTAL__CAR:
				getCar().clear();
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
			case EurentPackage.RENTAL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EurentPackage.RENTAL__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case EurentPackage.RENTAL__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case EurentPackage.RENTAL__STARTING_DATE:
				return STARTING_DATE_EDEFAULT == null ? startingDate != null : !STARTING_DATE_EDEFAULT.equals(startingDate);
			case EurentPackage.RENTAL__ENDING_DATE:
				return ENDING_DATE_EDEFAULT == null ? endingDate != null : !ENDING_DATE_EDEFAULT.equals(endingDate);
			case EurentPackage.RENTAL__CAR:
				return car != null && !car.isEmpty();
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
		result.append(", price: ");
		result.append(price);
		result.append(", state: ");
		result.append(state);
		result.append(", startingDate: ");
		result.append(startingDate);
		result.append(", endingDate: ");
		result.append(endingDate);
		result.append(')');
		return result.toString();
	}

} //RentalImpl
