/**
 */
package eurent;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Customer#getId <em>Id</em>}</li>
 *   <li>{@link eurent.Customer#getName <em>Name</em>}</li>
 *   <li>{@link eurent.Customer#getPremium <em>Premium</em>}</li>
 *   <li>{@link eurent.Customer#getDiscount <em>Discount</em>}</li>
 *   <li>{@link eurent.Customer#getLicenseExpDate <em>License Exp Date</em>}</li>
 *   <li>{@link eurent.Customer#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link eurent.Customer#getRental <em>Rental</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see eurent.EurentPackage#getCustomer_Id()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link eurent.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eurent.EurentPackage#getCustomer_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eurent.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premium</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premium</em>' attribute.
	 * @see #setPremium(Boolean)
	 * @see eurent.EurentPackage#getCustomer_Premium()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!premium'"
	 * @generated
	 */
	Boolean getPremium();

	/**
	 * Sets the value of the '{@link eurent.Customer#getPremium <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premium</em>' attribute.
	 * @see #getPremium()
	 * @generated
	 */
	void setPremium(Boolean value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(int)
	 * @see eurent.EurentPackage#getCustomer_Discount()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n *\n * if not self.premium\n * then\n *   if\n *     self.rental.car.carGroup-&gt;select(c | (c.category = \'high\'))\n *     -&gt;size() &gt; 5\n *   then 15\n *   else 0\n *   endif\n * else 30\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; premium = this.getPremium();\nfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(premium);\nif (not == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n}\n/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; symbol_1;\nif (not) {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%eurent.Rental%&gt;&gt; rental = this.getRental();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_rental = idResolver.createOrderedSetOfAll(&lt;%eurent.EurentTables%&gt;.ORD_CLSSid_Rental, rental);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%eurent.EurentTables%&gt;.SEQ_CLSSid_Car);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_rental.iterator();\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect_0;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tcollect_0 = accumulator;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%eurent.Rental%&gt; _1 = (&lt;%eurent.Rental%&gt;)ITERATOR__1.next();\n\t\t/**\n\t\t * car\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%eurent.Car%&gt;&gt; car = _1.getCar();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_car = idResolver.createSetOfAll(&lt;%eurent.EurentTables%&gt;.SET_CLSSid_Car, car);\n\t\t//\n\t\tfor (Object value : BOXED_car.flatten().getElements()) {\n\t\t\taccumulator.add(value);\n\t\t}\n\t}\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%eurent.EurentTables%&gt;.SEQ_CLSSid_CarGroup);\n\t/*@Nullable\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1_0 = collect_0.iterator();\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\twhile (true) {\n\t\tif (!ITERATOR__1_0.hasNext()) {\n\t\t\tcollect = accumulator_0;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%eurent.Car%&gt; _1_0 = (&lt;%eurent.Car%&gt;)ITERATOR__1_0.next();\n\t\t/**\n\t\t * carGroup\n\t\t \052/\n\t\tif (_1_0 == null) {\n\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'eurent\\\'::Car::carGroup\\\'\");\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%eurent.CarGroup%&gt; carGroup = _1_0.getCarGroup();\n\t\t//\n\t\taccumulator_0.add(carGroup);\n\t}\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%eurent.EurentTables%&gt;.SEQ_CLSSid_CarGroup);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_c = collect.iterator();\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; select;\n\twhile (true) {\n\t\tif (!ITERATOR_c.hasNext()) {\n\t\t\tselect = accumulator_1;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%eurent.CarGroup%&gt; c = (&lt;%eurent.CarGroup%&gt;)ITERATOR_c.next();\n\t\t/**\n\t\t * c.category = \'high\'\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; category = c.getCategory();\n\t\tfinal /*@NonInvalid\052/ boolean eq = &lt;%eurent.EurentTables%&gt;.STR_high.equals(category);\n\t\t//\n\t\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\taccumulator_1.add(c);\n\t\t}\n\t}\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\tfinal /*@Thrown\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%eurent.EurentTables%&gt;.INT_5).booleanValue();\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; symbol_0;\n\tif (gt) {\n\t\tsymbol_0 = &lt;%eurent.EurentTables%&gt;.INT_15;\n\t}\n\telse {\n\t\tsymbol_0 = &lt;%eurent.EurentTables%&gt;.INT_0;\n\t}\n\tsymbol_1 = symbol_0;\n}\nelse {\n\tsymbol_1 = &lt;%eurent.EurentTables%&gt;.INT_30;\n}\nfinal int ECORE_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.intValueOf(symbol_1);\nreturn ECORE_symbol_1;'"
	 * @generated
	 */
	int getDiscount();

	/**
	 * Sets the value of the '{@link eurent.Customer#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(int value);

	/**
	 * Returns the value of the '<em><b>License Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Exp Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Exp Date</em>' attribute.
	 * @see #setLicenseExpDate(Date)
	 * @see eurent.EurentPackage#getCustomer_LicenseExpDate()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!licenseExpDate'"
	 * @generated
	 */
	Date getLicenseExpDate();

	/**
	 * Sets the value of the '{@link eurent.Customer#getLicenseExpDate <em>License Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Exp Date</em>' attribute.
	 * @see #getLicenseExpDate()
	 * @generated
	 */
	void setLicenseExpDate(Date value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see eurent.EurentPackage#getCustomer_Birthday()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!birthday'"
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link eurent.Customer#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);

	/**
	 * Returns the value of the '<em><b>Rental</b></em>' reference list.
	 * The list contents are of type {@link eurent.Rental}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rental</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental</em>' reference list.
	 * @see eurent.EurentPackage#getCustomer_Rental()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Customer!rental'"
	 * @generated
	 */
	EList<Rental> getRental();

} // Customer
