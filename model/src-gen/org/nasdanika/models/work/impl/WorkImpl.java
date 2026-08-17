/**
 */
package org.nasdanika.models.work.impl;

import java.time.Duration;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.GovernedElement;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.AccessControlled;
import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.Lifecycle;
import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Sojourn;
import org.nasdanika.models.lifecycle.Stage;
import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.seal.EncryptedFeature;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.SealedElement;
import org.nasdanika.models.seal.Signature;
import org.nasdanika.models.seal.VariantFeature;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.Work;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.WorkType;
import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getEncryptedFeatures <em>Encrypted Features</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getVariantFeatures <em>Variant Features</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getSojourns <em>Sojourns</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getDue <em>Due</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkImpl#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkImpl extends AbstractWorkImpl implements Work {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEstimate() <em>Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActual() <em>Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDue() <em>Due</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_COMPLETE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(WorkPackage.WORK__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED_ELEMENT__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(WorkPackage.WORK__RISKS, GovernancePackage.Literals.GOVERNED_ELEMENT__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(WorkPackage.WORK__WAIVERS, GovernancePackage.Literals.GOVERNED_ELEMENT__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractWork> getWork() {
		return (EList<AbstractWork>)eDynamicGet(WorkPackage.WORK__WORK, WorkPackage.Literals.WORKABLE__WORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(WorkPackage.WORK__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(WorkPackage.WORK__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(WorkPackage.WORK__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, WorkPackage.WORK__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(WorkPackage.WORK__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(WorkPackage.WORK__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, WorkPackage.WORK__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(WorkPackage.WORK__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccessControlEntry> getAccessControl() {
		return (EList<AccessControlEntry>)eDynamicGet(WorkPackage.WORK__ACCESS_CONTROL, IamPackage.Literals.ACCESS_CONTROLLED__ACCESS_CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EncryptedFeature> getEncryptedFeatures() {
		return (EList<EncryptedFeature>)eDynamicGet(WorkPackage.WORK__ENCRYPTED_FEATURES, SealPackage.Literals.SEALED_ELEMENT__ENCRYPTED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantFeature> getVariantFeatures() {
		return (EList<VariantFeature>)eDynamicGet(WorkPackage.WORK__VARIANT_FEATURES, SealPackage.Literals.SEALED_ELEMENT__VARIANT_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Signature> getSignatures() {
		return (EList<Signature>)eDynamicGet(WorkPackage.WORK__SIGNATURES, SealPackage.Literals.SEALED_ELEMENT__SIGNATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Lifecycle> getLifecycles() {
		return (EList<Lifecycle>)eDynamicGet(WorkPackage.WORK__LIFECYCLES, LifecyclePackage.Literals.STAGED__LIFECYCLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Sojourn> getSojourns() {
		return (EList<Sojourn>)eDynamicGet(WorkPackage.WORK__SOJOURNS, LifecyclePackage.Literals.STAGED__SOJOURNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getCurrent() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkType getType() {
		return (WorkType)eDynamicGet(WorkPackage.WORK__TYPE, WorkPackage.Literals.WORK__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkType basicGetType() {
		return (WorkType)eDynamicGet(WorkPackage.WORK__TYPE, WorkPackage.Literals.WORK__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(WorkType newType) {
		eDynamicSet(WorkPackage.WORK__TYPE, WorkPackage.Literals.WORK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstimate() {
		return (String)eDynamicGet(WorkPackage.WORK__ESTIMATE, WorkPackage.Literals.WORK__ESTIMATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimate(String newEstimate) {
		eDynamicSet(WorkPackage.WORK__ESTIMATE, WorkPackage.Literals.WORK__ESTIMATE, newEstimate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActual() {
		return (String)eDynamicGet(WorkPackage.WORK__ACTUAL, WorkPackage.Literals.WORK__ACTUAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActual(String newActual) {
		eDynamicSet(WorkPackage.WORK__ACTUAL, WorkPackage.Literals.WORK__ACTUAL, newActual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDue() {
		return (Date)eDynamicGet(WorkPackage.WORK__DUE, WorkPackage.Literals.WORK__DUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDue(Date newDue) {
		eDynamicSet(WorkPackage.WORK__DUE, WorkPackage.Literals.WORK__DUE, newDue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return (Integer)eDynamicGet(WorkPackage.WORK__PRIORITY, WorkPackage.Literals.WORK__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		eDynamicSet(WorkPackage.WORK__PRIORITY, WorkPackage.Literals.WORK__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentComplete() {
		return (Integer)eDynamicGet(WorkPackage.WORK__PERCENT_COMPLETE, WorkPackage.Literals.WORK__PERCENT_COMPLETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentComplete(Integer newPercentComplete) {
		eDynamicSet(WorkPackage.WORK__PERCENT_COMPLETE, WorkPackage.Literals.WORK__PERCENT_COMPLETE, newPercentComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getImpacts() {
		return (EList<EObject>)eDynamicGet(WorkPackage.WORK__IMPACTS, WorkPackage.Literals.WORK__IMPACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__WAIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWaivers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__START:
				return basicSetStart(null, msgs);
			case WorkPackage.WORK__END:
				return basicSetEnd(null, msgs);
			case WorkPackage.WORK__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__ENCRYPTED_FEATURES:
				return ((InternalEList<?>)getEncryptedFeatures()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__VARIANT_FEATURES:
				return ((InternalEList<?>)getVariantFeatures()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__SOJOURNS:
				return ((InternalEList<?>)getSojourns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				return getControlApplications();
			case WorkPackage.WORK__RISKS:
				return getRisks();
			case WorkPackage.WORK__WAIVERS:
				return getWaivers();
			case WorkPackage.WORK__WORK:
				return getWork();
			case WorkPackage.WORK__DURATION:
				return getDuration();
			case WorkPackage.WORK__START:
				return getStart();
			case WorkPackage.WORK__END:
				return getEnd();
			case WorkPackage.WORK__ACCESS_CONTROL:
				return getAccessControl();
			case WorkPackage.WORK__ENCRYPTED_FEATURES:
				return getEncryptedFeatures();
			case WorkPackage.WORK__VARIANT_FEATURES:
				return getVariantFeatures();
			case WorkPackage.WORK__SIGNATURES:
				return getSignatures();
			case WorkPackage.WORK__LIFECYCLES:
				return getLifecycles();
			case WorkPackage.WORK__SOJOURNS:
				return getSojourns();
			case WorkPackage.WORK__CURRENT:
				return getCurrent();
			case WorkPackage.WORK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WorkPackage.WORK__ESTIMATE:
				return getEstimate();
			case WorkPackage.WORK__ACTUAL:
				return getActual();
			case WorkPackage.WORK__DUE:
				return getDue();
			case WorkPackage.WORK__PRIORITY:
				return getPriority();
			case WorkPackage.WORK__PERCENT_COMPLETE:
				return getPercentComplete();
			case WorkPackage.WORK__IMPACTS:
				return getImpacts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case WorkPackage.WORK__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case WorkPackage.WORK__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case WorkPackage.WORK__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends AbstractWork>)newValue);
				return;
			case WorkPackage.WORK__DURATION:
				setDuration((Duration)newValue);
				return;
			case WorkPackage.WORK__START:
				setStart((Temporal)newValue);
				return;
			case WorkPackage.WORK__END:
				setEnd((Temporal)newValue);
				return;
			case WorkPackage.WORK__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlEntry>)newValue);
				return;
			case WorkPackage.WORK__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				getEncryptedFeatures().addAll((Collection<? extends EncryptedFeature>)newValue);
				return;
			case WorkPackage.WORK__VARIANT_FEATURES:
				getVariantFeatures().clear();
				getVariantFeatures().addAll((Collection<? extends VariantFeature>)newValue);
				return;
			case WorkPackage.WORK__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case WorkPackage.WORK__LIFECYCLES:
				getLifecycles().clear();
				getLifecycles().addAll((Collection<? extends Lifecycle>)newValue);
				return;
			case WorkPackage.WORK__SOJOURNS:
				getSojourns().clear();
				getSojourns().addAll((Collection<? extends Sojourn>)newValue);
				return;
			case WorkPackage.WORK__TYPE:
				setType((WorkType)newValue);
				return;
			case WorkPackage.WORK__ESTIMATE:
				setEstimate((String)newValue);
				return;
			case WorkPackage.WORK__ACTUAL:
				setActual((String)newValue);
				return;
			case WorkPackage.WORK__DUE:
				setDue((Date)newValue);
				return;
			case WorkPackage.WORK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case WorkPackage.WORK__PERCENT_COMPLETE:
				setPercentComplete((Integer)newValue);
				return;
			case WorkPackage.WORK__IMPACTS:
				getImpacts().clear();
				getImpacts().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case WorkPackage.WORK__RISKS:
				getRisks().clear();
				return;
			case WorkPackage.WORK__WAIVERS:
				getWaivers().clear();
				return;
			case WorkPackage.WORK__WORK:
				getWork().clear();
				return;
			case WorkPackage.WORK__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case WorkPackage.WORK__START:
				setStart((Temporal)null);
				return;
			case WorkPackage.WORK__END:
				setEnd((Temporal)null);
				return;
			case WorkPackage.WORK__ACCESS_CONTROL:
				getAccessControl().clear();
				return;
			case WorkPackage.WORK__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				return;
			case WorkPackage.WORK__VARIANT_FEATURES:
				getVariantFeatures().clear();
				return;
			case WorkPackage.WORK__SIGNATURES:
				getSignatures().clear();
				return;
			case WorkPackage.WORK__LIFECYCLES:
				getLifecycles().clear();
				return;
			case WorkPackage.WORK__SOJOURNS:
				getSojourns().clear();
				return;
			case WorkPackage.WORK__TYPE:
				setType((WorkType)null);
				return;
			case WorkPackage.WORK__ESTIMATE:
				setEstimate(ESTIMATE_EDEFAULT);
				return;
			case WorkPackage.WORK__ACTUAL:
				setActual(ACTUAL_EDEFAULT);
				return;
			case WorkPackage.WORK__DUE:
				setDue(DUE_EDEFAULT);
				return;
			case WorkPackage.WORK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case WorkPackage.WORK__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case WorkPackage.WORK__IMPACTS:
				getImpacts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkPackage.WORK__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case WorkPackage.WORK__RISKS:
				return !getRisks().isEmpty();
			case WorkPackage.WORK__WAIVERS:
				return !getWaivers().isEmpty();
			case WorkPackage.WORK__WORK:
				return !getWork().isEmpty();
			case WorkPackage.WORK__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case WorkPackage.WORK__START:
				return getStart() != null;
			case WorkPackage.WORK__END:
				return getEnd() != null;
			case WorkPackage.WORK__ACCESS_CONTROL:
				return !getAccessControl().isEmpty();
			case WorkPackage.WORK__ENCRYPTED_FEATURES:
				return !getEncryptedFeatures().isEmpty();
			case WorkPackage.WORK__VARIANT_FEATURES:
				return !getVariantFeatures().isEmpty();
			case WorkPackage.WORK__SIGNATURES:
				return !getSignatures().isEmpty();
			case WorkPackage.WORK__LIFECYCLES:
				return !getLifecycles().isEmpty();
			case WorkPackage.WORK__SOJOURNS:
				return !getSojourns().isEmpty();
			case WorkPackage.WORK__CURRENT:
				return !getCurrent().isEmpty();
			case WorkPackage.WORK__TYPE:
				return basicGetType() != null;
			case WorkPackage.WORK__ESTIMATE:
				return ESTIMATE_EDEFAULT == null ? getEstimate() != null : !ESTIMATE_EDEFAULT.equals(getEstimate());
			case WorkPackage.WORK__ACTUAL:
				return ACTUAL_EDEFAULT == null ? getActual() != null : !ACTUAL_EDEFAULT.equals(getActual());
			case WorkPackage.WORK__DUE:
				return DUE_EDEFAULT == null ? getDue() != null : !DUE_EDEFAULT.equals(getDue());
			case WorkPackage.WORK__PRIORITY:
				return PRIORITY_EDEFAULT == null ? getPriority() != null : !PRIORITY_EDEFAULT.equals(getPriority());
			case WorkPackage.WORK__PERCENT_COMPLETE:
				return PERCENT_COMPLETE_EDEFAULT == null ? getPercentComplete() != null : !PERCENT_COMPLETE_EDEFAULT.equals(getPercentComplete());
			case WorkPackage.WORK__IMPACTS:
				return !getImpacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GovernedElement.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED_ELEMENT__CONTROL_APPLICATIONS;
				case WorkPackage.WORK__RISKS: return GovernancePackage.GOVERNED_ELEMENT__RISKS;
				case WorkPackage.WORK__WAIVERS: return GovernancePackage.GOVERNED_ELEMENT__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__WORK: return WorkPackage.WORKABLE__WORK;
				default: return -1;
			}
		}
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__DURATION: return NxcorePackage.PERIOD__DURATION;
				case WorkPackage.WORK__START: return NxcorePackage.PERIOD__START;
				case WorkPackage.WORK__END: return NxcorePackage.PERIOD__END;
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__ACCESS_CONTROL: return IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__ENCRYPTED_FEATURES: return SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;
				case WorkPackage.WORK__VARIANT_FEATURES: return SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;
				case WorkPackage.WORK__SIGNATURES: return SealPackage.SEALED_ELEMENT__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (derivedFeatureID) {
				case WorkPackage.WORK__LIFECYCLES: return LifecyclePackage.STAGED__LIFECYCLES;
				case WorkPackage.WORK__SOJOURNS: return LifecyclePackage.STAGED__SOJOURNS;
				case WorkPackage.WORK__CURRENT: return LifecyclePackage.STAGED__CURRENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GovernedElement.class) {
			switch (baseFeatureID) {
				case GovernancePackage.GOVERNED_ELEMENT__CONTROL_APPLICATIONS: return WorkPackage.WORK__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED_ELEMENT__RISKS: return WorkPackage.WORK__RISKS;
				case GovernancePackage.GOVERNED_ELEMENT__WAIVERS: return WorkPackage.WORK__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (baseFeatureID) {
				case WorkPackage.WORKABLE__WORK: return WorkPackage.WORK__WORK;
				default: return -1;
			}
		}
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NxcorePackage.PERIOD__DURATION: return WorkPackage.WORK__DURATION;
				case NxcorePackage.PERIOD__START: return WorkPackage.WORK__START;
				case NxcorePackage.PERIOD__END: return WorkPackage.WORK__END;
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (baseFeatureID) {
				case IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL: return WorkPackage.WORK__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (baseFeatureID) {
				case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES: return WorkPackage.WORK__ENCRYPTED_FEATURES;
				case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES: return WorkPackage.WORK__VARIANT_FEATURES;
				case SealPackage.SEALED_ELEMENT__SIGNATURES: return WorkPackage.WORK__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (baseFeatureID) {
				case LifecyclePackage.STAGED__LIFECYCLES: return WorkPackage.WORK__LIFECYCLES;
				case LifecyclePackage.STAGED__SOJOURNS: return WorkPackage.WORK__SOJOURNS;
				case LifecyclePackage.STAGED__CURRENT: return WorkPackage.WORK__CURRENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorkImpl
