/**
 */
package org.nasdanika.models.work;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A directed dependency from the containing work to a predecessor:
 * issue-tracker semantics via type, scheduling semantics via constraint
 * and lag. Target may be a WorkReference, so dependencies cross model
 * boundaries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.Dependency#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Dependency#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Dependency#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Dependency#getLag <em>Lag</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DependencyType)
	 * @see org.nasdanika.models.work.WorkPackage#getDependency_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Dependency#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The work this work depends on (predecessor / blocker).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractWork)
	 * @see org.nasdanika.models.work.WorkPackage#getDependency_Target()
	 * @model
	 * @generated
	 */
	AbstractWork getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Dependency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractWork value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.work.TemporalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see org.nasdanika.models.work.TemporalConstraint
	 * @see #setConstraint(TemporalConstraint)
	 * @see org.nasdanika.models.work.WorkPackage#getDependency_Constraint()
	 * @model unique="false"
	 * @generated
	 */
	TemporalConstraint getConstraint();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Dependency#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see org.nasdanika.models.work.TemporalConstraint
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(TemporalConstraint value);

	/**
	 * Returns the value of the '<em><b>Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Lead or lag, e.g. "2d", "-1w".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lag</em>' attribute.
	 * @see #setLag(String)
	 * @see org.nasdanika.models.work.WorkPackage#getDependency_Lag()
	 * @model unique="false"
	 * @generated
	 */
	String getLag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Dependency#getLag <em>Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lag</em>' attribute.
	 * @see #getLag()
	 * @generated
	 */
	void setLag(String value);

} // Dependency
