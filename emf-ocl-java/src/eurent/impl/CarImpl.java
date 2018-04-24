/**
 */
package eurent.impl;

import eurent.Car;
import eurent.CarGroup;
import eurent.EurentPackage;
import eurent.EurentTables;
import eurent.RentalAgreement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mostPopular() {
		/**
		 * allInstances()->forAll(c1 | c1 <> self implies
		 *   c1.rentalAgreement->size() <=
		 *   self.rentalAgreement->size())
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, EurentTables.SET_CLSSid_Car, this);
		/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		/*@NonNull*/ Iterator<Object> ITERATOR_c1 = allInstances.iterator();
		/*@NonInvalid*/ Boolean forAll;
		while (true) {
			if (!ITERATOR_c1.hasNext()) {
				if (accumulator == ValueUtil.TRUE_VALUE) {
					forAll = ValueUtil.TRUE_VALUE;
				}
				else {
					throw (InvalidValueException)accumulator;
				}
				break;
			}
			/*@NonInvalid*/ Car c1 = (Car)ITERATOR_c1.next();
			/**
			 * c1 <> self implies c1.rentalAgreement->size() <= self.rentalAgreement->size()
			 */
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ boolean ne = !c1.equals(this);
			/*@NonInvalid*/ boolean implies;
			if (ne) {
				final /*@NonInvalid*/ List<RentalAgreement> rentalAgreement = c1.getRentalAgreement();
				final /*@NonInvalid*/ SetValue BOXED_rentalAgreement = idResolver.createSetOfAll(EurentTables.SET_CLSSid_RentalAgreement, rentalAgreement);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_rentalAgreement);
				final /*@NonInvalid*/ List<RentalAgreement> rentalAgreement_0 = this.getRentalAgreement();
				final /*@NonInvalid*/ SetValue BOXED_rentalAgreement_0 = idResolver.createSetOfAll(EurentTables.SET_CLSSid_RentalAgreement, rentalAgreement_0);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_rentalAgreement_0);
				final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, size_0).booleanValue();
				implies = le;
			}
			else {
				implies = ValueUtil.TRUE_VALUE;
			}
			//
			if (implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
				forAll = ValueUtil.FALSE_VALUE;
				break;														// Stop immediately
			}
			else if (implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
				;															// Carry on
			}
			else {															// Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
			}
		}
		return forAll;
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
