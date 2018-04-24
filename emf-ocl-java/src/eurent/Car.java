/**
 */
package eurent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.Car#getRegNum <em>Reg Num</em>}</li>
 *   <li>{@link eurent.Car#getCarGroup <em>Car Group</em>}</li>
 *   <li>{@link eurent.Car#getRentalAgreement <em>Rental Agreement</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Reg Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Num</em>' attribute.
	 * @see #setRegNum(String)
	 * @see eurent.EurentPackage#getCar_RegNum()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Car!regNum'"
	 * @generated
	 */
	String getRegNum();

	/**
	 * Sets the value of the '{@link eurent.Car#getRegNum <em>Reg Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Num</em>' attribute.
	 * @see #getRegNum()
	 * @generated
	 */
	void setRegNum(String value);

	/**
	 * Returns the value of the '<em><b>Car Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Group</em>' reference.
	 * @see #setCarGroup(CarGroup)
	 * @see eurent.EurentPackage#getCar_CarGroup()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Car!carGroup'"
	 * @generated
	 */
	CarGroup getCarGroup();

	/**
	 * Sets the value of the '{@link eurent.Car#getCarGroup <em>Car Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Group</em>' reference.
	 * @see #getCarGroup()
	 * @generated
	 */
	void setCarGroup(CarGroup value);

	/**
	 * Returns the value of the '<em><b>Rental Agreement</b></em>' reference list.
	 * The list contents are of type {@link eurent.RentalAgreement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rental Agreement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental Agreement</em>' reference list.
	 * @see eurent.EurentPackage#getCar_RentalAgreement()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!Car!rentalAgreement'"
	 * @generated
	 */
	EList<RentalAgreement> getRentalAgreement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * allInstances()-&gt;forAll(c1 | c1 &lt;&gt; self implies\n *   c1.rentalAgreement-&gt;size() &lt;=\n *   self.rentalAgreement-&gt;size())\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; allInstances = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%eurent.EurentTables%&gt;.SET_CLSSid_Car, this);\n/*@Thrown\052/ &lt;%java.lang.Object%&gt; accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_c1 = allInstances.iterator();\n/*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; forAll;\nwhile (true) {\n\tif (!ITERATOR_c1.hasNext()) {\n\t\tif (accumulator == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\tforAll = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)accumulator;\n\t\t}\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%eurent.Car%&gt; c1 = (&lt;%eurent.Car%&gt;)ITERATOR_c1.next();\n\t/**\n\t * c1 &lt;&gt; self implies c1.rentalAgreement-&gt;size() &lt;= self.rentalAgreement-&gt;size()\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid\052/ boolean ne = !c1.equals(this);\n\t/*@NonInvalid\052/ boolean implies;\n\tif (ne) {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%eurent.RentalAgreement%&gt;&gt; rentalAgreement = c1.getRentalAgreement();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_rentalAgreement = idResolver.createSetOfAll(&lt;%eurent.EurentTables%&gt;.SET_CLSSid_RentalAgreement, rentalAgreement);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_rentalAgreement);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%eurent.RentalAgreement%&gt;&gt; rentalAgreement_0 = this.getRentalAgreement();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_rentalAgreement_0 = idResolver.createSetOfAll(&lt;%eurent.EurentTables%&gt;.SET_CLSSid_RentalAgreement, rentalAgreement_0);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_rentalAgreement_0);\n\t\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, size_0).booleanValue();\n\t\timplies = le;\n\t}\n\telse {\n\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\t//\n\tif (implies == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\tforAll = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t}\n\telse if (implies == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t}\n\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\taccumulator = new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(&lt;%org.eclipse.ocl.pivot.messages.PivotMessages%&gt;.NonBooleanBody, \"forAll\");\n\t}\n}\nreturn forAll;'"
	 * @generated
	 */
	Boolean mostPopular();

} // Car
