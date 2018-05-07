/**
 */
package eurent.impl;

import eurent.BlackListed;
import eurent.EurentPackage;
import eurent.EurentTables;
import eurent.Rental;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

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
	public boolean NoRentalsBlacklisted(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv NoRentalsBlacklisted:
		 *   let
		 *     severity : Integer[1] = 'BlackListed::NoRentalsBlacklisted'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = self.rental->forAll(r | r.startingDate < self.blackListedDate)
		 *       in
		 *         'BlackListed::NoRentalsBlacklisted'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EurentTables.STR_BlackListed_c_c_NoRentalsBlacklisted);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EurentTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Rental> rental = this.getRental();
				final /*@NonInvalid*/ OrderedSetValue BOXED_rental = idResolver.createOrderedSetOfAll(EurentTables.ORD_CLSSid_Rental, rental);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_r = BOXED_rental.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR_r.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Rental r = (Rental)ITERATOR_r.next();
					/**
					 * r.startingDate < self.blackListedDate
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_lt;
					try {
						final /*@NonInvalid*/ Date startingDate = r.getStartingDate();
						final /*@NonInvalid*/ Date blackListedDate = this.getBlackListedDate();
						final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, startingDate, blackListedDate).booleanValue();
						CAUGHT_lt = lt;
					}
					catch (Exception e) {
						CAUGHT_lt = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_lt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_lt instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_lt;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, EurentTables.STR_BlackListed_c_c_NoRentalsBlacklisted, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EurentTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EurentPackage.BLACK_LISTED___NO_RENTALS_BLACKLISTED__DIAGNOSTICCHAIN_MAP:
				return NoRentalsBlacklisted((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (blackListedDate: ");
		result.append(blackListedDate);
		result.append(')');
		return result.toString();
	}

} //BlackListedImpl
