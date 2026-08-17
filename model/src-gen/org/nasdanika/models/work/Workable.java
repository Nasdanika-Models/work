/**
 */
package org.nasdanika.models.work;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.governance.Governed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Workable ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.Workable#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getWorkable()
 * @model abstract="true"
 * @generated
 */
public interface Workable extends Governed {
	/**
	 * Returns the value of the '<em><b>Work</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.work.AbstractWork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' containment reference list.
	 * @see org.nasdanika.models.work.WorkPackage#getWorkable_Work()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractWork> getWork();

} // Workable
