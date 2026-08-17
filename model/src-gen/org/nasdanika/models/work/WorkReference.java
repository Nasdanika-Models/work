/**
 */
package org.nasdanika.models.work;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to work defined in another (published, federated) model:
 * the product management model reference pattern. Allows a team's backlog
 * to cite, depend on, or roll up work owned by another team without
 * copying it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.WorkReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getWorkReference()
 * @model
 * @generated
 */
public interface WorkReference extends AbstractWork {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Work)
	 * @see org.nasdanika.models.work.WorkPackage#getWorkReference_Target()
	 * @model
	 * @generated
	 */
	Work getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.WorkReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Work value);

} // WorkReference
