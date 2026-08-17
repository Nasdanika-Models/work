/**
 */
package org.nasdanika.models.work.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.work.DependencyType;
import org.nasdanika.models.work.WorkDomain;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.WorkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.impl.WorkDomainImpl#getWorkTypes <em>Work Types</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkDomainImpl#getDependencyTypes <em>Dependency Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDomainImpl extends WorkableImpl implements WorkDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.WORK_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkType> getWorkTypes() {
		return (EList<WorkType>)eDynamicGet(WorkPackage.WORK_DOMAIN__WORK_TYPES, WorkPackage.Literals.WORK_DOMAIN__WORK_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DependencyType> getDependencyTypes() {
		return (EList<DependencyType>)eDynamicGet(WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES, WorkPackage.Literals.WORK_DOMAIN__DEPENDENCY_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkPackage.WORK_DOMAIN__WORK_TYPES:
				return ((InternalEList<?>)getWorkTypes()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES:
				return ((InternalEList<?>)getDependencyTypes()).basicRemove(otherEnd, msgs);
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
			case WorkPackage.WORK_DOMAIN__WORK_TYPES:
				return getWorkTypes();
			case WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES:
				return getDependencyTypes();
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
			case WorkPackage.WORK_DOMAIN__WORK_TYPES:
				getWorkTypes().clear();
				getWorkTypes().addAll((Collection<? extends WorkType>)newValue);
				return;
			case WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES:
				getDependencyTypes().clear();
				getDependencyTypes().addAll((Collection<? extends DependencyType>)newValue);
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
			case WorkPackage.WORK_DOMAIN__WORK_TYPES:
				getWorkTypes().clear();
				return;
			case WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES:
				getDependencyTypes().clear();
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
			case WorkPackage.WORK_DOMAIN__WORK_TYPES:
				return !getWorkTypes().isEmpty();
			case WorkPackage.WORK_DOMAIN__DEPENDENCY_TYPES:
				return !getDependencyTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkDomainImpl
