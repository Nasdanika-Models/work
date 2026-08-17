/**
 */
package org.nasdanika.models.work;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit of work. Leaf work is a work item; work containing work is an epic,
 * summary task, or work package. State comes from the lifecycle aspect,
 * assignment from the role aspect, risk and controls from the governance
 * aspect.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.Work#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getActual <em>Actual</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getDue <em>Due</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.nasdanika.models.work.Work#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.work.WorkPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends AbstractWork, Workable, Period, Staged {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(WorkType)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Type()
	 * @model
	 * @generated
	 */
	WorkType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkType value);

	/**
	 * Returns the value of the '<em><b>Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Estimate in the unit the organization uses: points, hours, days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimate</em>' attribute.
	 * @see #setEstimate(String)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Estimate()
	 * @model unique="false"
	 * @generated
	 */
	String getEstimate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getEstimate <em>Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimate</em>' attribute.
	 * @see #getEstimate()
	 * @generated
	 */
	void setEstimate(String value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Actual effort spent, same unit as estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' attribute.
	 * @see #setActual(String)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Actual()
	 * @model unique="false"
	 * @generated
	 */
	String getActual();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getActual <em>Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' attribute.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(String value);

	/**
	 * Returns the value of the '<em><b>Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due</em>' attribute.
	 * @see #setDue(Date)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Due()
	 * @model unique="false"
	 * @generated
	 */
	Date getDue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getDue <em>Due</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' attribute.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Smaller is more important; absent means unprioritized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Priority()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  0..100; derived roll-up for non-leaf work is a tooling concern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(Integer)
	 * @see org.nasdanika.models.work.WorkPackage#getWork_PercentComplete()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPercentComplete();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.work.Work#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(Integer value);

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements affected by this work, beyond the element containing it:
	 * Jira components / affected versions crosswalk. Containment says what
	 * the work is done ON (one home); impacts says what it touches (many,
	 * cross-model, no ownership of the target required). Typed as EObject
	 * because impacted elements live in other micro-models without a shared
	 * base yet; narrow to Ncore ModelElement on base convergence. Promote to
	 * a contained Impact class with ImpactType if kinds become necessary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacts</em>' reference list.
	 * @see org.nasdanika.models.work.WorkPackage#getWork_Impacts()
	 * @model
	 * @generated
	 */
	EList<EObject> getImpacts();

} // Work
