/**
 */
package org.nasdanika.models.work.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.WorkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.impl.WorkTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.WorkTypeImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkTypeImpl extends ModelElementImpl implements WorkType {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.WORK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkType getSuperType() {
		return (WorkType)eDynamicGet(WorkPackage.WORK_TYPE__SUPER_TYPE, WorkPackage.Literals.WORK_TYPE__SUPER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkType basicGetSuperType() {
		return (WorkType)eDynamicGet(WorkPackage.WORK_TYPE__SUPER_TYPE, WorkPackage.Literals.WORK_TYPE__SUPER_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperType(WorkType newSuperType) {
		eDynamicSet(WorkPackage.WORK_TYPE__SUPER_TYPE, WorkPackage.Literals.WORK_TYPE__SUPER_TYPE, newSuperType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLevel() {
		return (Integer)eDynamicGet(WorkPackage.WORK_TYPE__LEVEL, WorkPackage.Literals.WORK_TYPE__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Integer newLevel) {
		eDynamicSet(WorkPackage.WORK_TYPE__LEVEL, WorkPackage.Literals.WORK_TYPE__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkPackage.WORK_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case WorkPackage.WORK_TYPE__LEVEL:
				return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkPackage.WORK_TYPE__SUPER_TYPE:
				setSuperType((WorkType)newValue);
				return;
			case WorkPackage.WORK_TYPE__LEVEL:
				setLevel((Integer)newValue);
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
			case WorkPackage.WORK_TYPE__SUPER_TYPE:
				setSuperType((WorkType)null);
				return;
			case WorkPackage.WORK_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case WorkPackage.WORK_TYPE__SUPER_TYPE:
				return basicGetSuperType() != null;
			case WorkPackage.WORK_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? getLevel() != null : !LEVEL_EDEFAULT.equals(getLevel());
		}
		return super.eIsSet(featureID);
	}

} //WorkTypeImpl
