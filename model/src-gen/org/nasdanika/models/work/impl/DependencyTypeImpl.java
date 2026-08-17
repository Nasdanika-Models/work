/**
 */
package org.nasdanika.models.work.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.work.DependencyType;
import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.impl.DependencyTypeImpl#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyTypeImpl extends ModelElementImpl implements DependencyType {
	/**
	 * The default value of the '{@link #getInverseName() <em>Inverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseName()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERSE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.DEPENDENCY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInverseName() {
		return (String)eDynamicGet(WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME, WorkPackage.Literals.DEPENDENCY_TYPE__INVERSE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverseName(String newInverseName) {
		eDynamicSet(WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME, WorkPackage.Literals.DEPENDENCY_TYPE__INVERSE_NAME, newInverseName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME:
				return getInverseName();
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
			case WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME:
				setInverseName((String)newValue);
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
			case WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME:
				setInverseName(INVERSE_NAME_EDEFAULT);
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
			case WorkPackage.DEPENDENCY_TYPE__INVERSE_NAME:
				return INVERSE_NAME_EDEFAULT == null ? getInverseName() != null : !INVERSE_NAME_EDEFAULT.equals(getInverseName());
		}
		return super.eIsSet(featureID);
	}

} //DependencyTypeImpl
