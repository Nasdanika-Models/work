/**
 */
package org.nasdanika.models.work;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Root ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.WorkDomain#getWorkTypes <em>Work Types</em>}</li>
 *   <li>{@link org.nasdanika.models.work.WorkDomain#getDependencyTypes <em>Dependency Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getWorkDomain()
 * @model
 * @generated
 */
public interface WorkDomain extends Workable {
	/**
	 * Returns the value of the '<em><b>Work Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.work.WorkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Types</em>' containment reference list.
	 * @see org.nasdanika.models.work.WorkPackage#getWorkDomain_WorkTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkType> getWorkTypes();

	/**
	 * Returns the value of the '<em><b>Dependency Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.work.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Types</em>' containment reference list.
	 * @see org.nasdanika.models.work.WorkPackage#getWorkDomain_DependencyTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyType> getDependencyTypes();

} // WorkDomain
