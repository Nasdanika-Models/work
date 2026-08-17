/**
 */
package org.nasdanika.models.work;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of dependency between work: blocks, duplicates, relates, requires.
 * Mirrors Jira link types; the temporal constraint on Dependency carries the
 * scheduling semantics these types lack.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.DependencyType#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getDependencyType()
 * @model
 * @generated
 */
public interface DependencyType extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Inverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Label from the dependent side, e.g. "is blocked by".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse Name</em>' attribute.
	 * @see #setInverseName(String)
	 * @see org.nasdanika.models.work.WorkPackage#getDependencyType_InverseName()
	 * @model unique="false"
	 * @generated
	 */
	String getInverseName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.DependencyType#getInverseName <em>Inverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Name</em>' attribute.
	 * @see #getInverseName()
	 * @generated
	 */
	void setInverseName(String value);

} // DependencyType
