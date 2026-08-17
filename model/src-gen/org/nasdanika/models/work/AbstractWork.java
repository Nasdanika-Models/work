/**
 */
package org.nasdanika.models.work;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Work ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.AbstractWork#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getAbstractWork()
 * @model abstract="true"
 * @generated
 */
public interface AbstractWork extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.work.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.models.work.WorkPackage#getAbstractWork_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

} // AbstractWork
