/**
 */
package eurent.impl;

import eurent.Car;
import eurent.CarGroup;
import eurent.EurentPackage;
import eurent.RentalAgreement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eurent.impl.CarImpl#getRegNum <em>Reg Num</em>}</li>
 *   <li>{@link eurent.impl.CarImpl#getCarGroup <em>Car Group</em>}</li>
 *   <li>{@link eurent.impl.CarImpl#getRentalAgreement <em>Rental Agreement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends MinimalEObjectImpl.Container implements Car {
	/**
	 * The default value of the '{@link #getRegNum() <em>Reg Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegNum()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegNum() <em>Reg Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegNum()
	 * @generated
	 * @ordered
	 */
	protected String regNum = REG_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarGroup() <em>Car Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarGroup()
	 * @generated
	 * @ordered
	 */
	protected CarGroup carGroup;

	/**
	 * The cached value of the '{@link #getRentalAgreement() <em>Rental Agreement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentalAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalAgreement> rentalAgreement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EurentPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegNum() {
		return regNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegNum(String newRegNum) {
		String oldRegNum = regNum;
		regNum = newRegNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CAR__REG_NUM, oldRegNum, regNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarGroup getCarGroup() {
		if (carGroup != null && carGroup.eIsProxy()) {
			InternalEObject oldCarGroup = (InternalEObject)carGroup;
			carGroup = (CarGroup)eResolveProxy(oldCarGroup);
			if (carGroup != oldCarGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EurentPackage.CAR__CAR_GROUP, oldCarGroup, carGroup));
			}
		}
		return carGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarGroup basicGetCarGroup() {
		return carGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarGroup(CarGroup newCarGroup) {
		CarGroup oldCarGroup = carGroup;
		carGroup = newCarGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurentPackage.CAR__CAR_GROUP, oldCarGroup, carGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RentalAgreement> getRentalAgreement() {
		if (rentalAgreement == null) {
			rentalAgreement = new EObjectResolvingEList<RentalAgreement>(RentalAgreement.class, this, EurentPackage.CAR__RENTAL_AGREEMENT);
		}
		return rentalAgreement;
	}

	/**
	 * The cached invocation delegate for the '{@link #mostPopular() <em>Most Popular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #mostPopular()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MOST_POPULAR__EINVOCATION_DELEGATE = ((EOperation.Internal)EurentPackage.Literals.CAR___MOST_POPULAR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mostPopular() {
		try {
			return (Boolean)MOST_POPULAR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurentPackage.CAR__REG_NUM:
				return getRegNum();
			case EurentPackage.CAR__CAR_GROUP:
				if (resolve) return getCarGroup();
				return basicGetCarGroup();
			case EurentPackage.CAR__RENTAL_AGREEMENT:
				return getRentalAgreement();
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
			case EurentPackage.CAR__REG_NUM:
				setRegNum((String)newValue);
				return;
			case EurentPackage.CAR__CAR_GROUP:
				setCarGroup((CarGroup)newValue);
				return;
			case EurentPackage.CAR__RENTAL_AGREEMENT:
				getRentalAgreement().clear();
				getRentalAgreement().addAll((Collection<? extends RentalAgreement>)newValue);
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
			case EurentPackage.CAR__REG_NUM:
				setRegNum(REG_NUM_EDEFAULT);
				return;
			case EurentPackage.CAR__CAR_GROUP:
				setCarGroup((CarGroup)null);
				return;
			case EurentPackage.CAR__RENTAL_AGREEMENT:
				getRentalAgreement().clear();
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
			case EurentPackage.CAR__REG_NUM:
				return REG_NUM_EDEFAULT == null ? regNum != null : !REG_NUM_EDEFAULT.equals(regNum);
			case EurentPackage.CAR__CAR_GROUP:
				return carGroup != null;
			case EurentPackage.CAR__RENTAL_AGREEMENT:
				return rentalAgreement != null && !rentalAgreement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EurentPackage.CAR___MOST_POPULAR:
				return mostPopular();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (regNum: ");
		result.append(regNum);
		result.append(')');
		return result.toString();
	}

} //CarImpl
