/**
 */
package org.nasdanika.models.work;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Base (ModelElement, Property) is imported from the model below in the
 * tower rather than redefined; collapses into nxcore on base extraction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.WorkType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.WorkType#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getWorkType()
 * @model
 * @generated
 */
public interface WorkType extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(WorkType)
	 * @see org.nasdanika.models.work.WorkPackage#getWorkType_SuperType()
	 * @model
	 * @generated
	 */
	WorkType getSuperType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.WorkType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(WorkType value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Hierarchy level hint, as in Jira: 1 epic, 0 standard, -1 sub-task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.nasdanika.models.work.WorkPackage#getWorkType_Level()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.WorkType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

} // WorkType
