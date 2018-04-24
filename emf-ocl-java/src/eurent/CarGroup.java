/**
 */
package eurent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eurent.CarGroup#getCategory <em>Category</em>}</li>
 *   <li>{@link eurent.CarGroup#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @see eurent.EurentPackage#getCarGroup()
 * @model
 * @generated
 */
public interface CarGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see eurent.EurentPackage#getCarGroup_Category()
	 * @model default=""
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!CarGroup!category'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link eurent.CarGroup#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' reference list.
	 * The list contents are of type {@link eurent.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' reference list.
	 * @see eurent.EurentPackage#getCarGroup_Car()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented eurent!CarGroup!car'"
	 * @generated
	 */
	EList<Car> getCar();

} // CarGroup
