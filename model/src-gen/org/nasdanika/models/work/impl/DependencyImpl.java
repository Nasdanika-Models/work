/**
 */
package org.nasdanika.models.work.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.Dependency;
import org.nasdanika.models.work.DependencyType;
import org.nasdanika.models.work.TemporalConstraint;
import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.work.impl.DependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.DependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.DependencyImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.nasdanika.models.work.impl.DependencyImpl#getLag <em>Lag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends ModelElementImpl implements Dependency {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalConstraint CONSTRAINT_EDEFAULT = TemporalConstraint.NONE;

	/**
	 * The default value of the '{@link #getLag() <em>Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLag()
	 * @generated
	 * @ordered
	 */
	protected static final String LAG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyType getType() {
		return (DependencyType)eDynamicGet(WorkPackage.DEPENDENCY__TYPE, WorkPackage.Literals.DEPENDENCY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType basicGetType() {
		return (DependencyType)eDynamicGet(WorkPackage.DEPENDENCY__TYPE, WorkPackage.Literals.DEPENDENCY__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DependencyType newType) {
		eDynamicSet(WorkPackage.DEPENDENCY__TYPE, WorkPackage.Literals.DEPENDENCY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractWork getTarget() {
		return (AbstractWork)eDynamicGet(WorkPackage.DEPENDENCY__TARGET, WorkPackage.Literals.DEPENDENCY__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWork basicGetTarget() {
		return (AbstractWork)eDynamicGet(WorkPackage.DEPENDENCY__TARGET, WorkPackage.Literals.DEPENDENCY__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AbstractWork newTarget) {
		eDynamicSet(WorkPackage.DEPENDENCY__TARGET, WorkPackage.Literals.DEPENDENCY__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalConstraint getConstraint() {
		return (TemporalConstraint)eDynamicGet(WorkPackage.DEPENDENCY__CONSTRAINT, WorkPackage.Literals.DEPENDENCY__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraint(TemporalConstraint newConstraint) {
		eDynamicSet(WorkPackage.DEPENDENCY__CONSTRAINT, WorkPackage.Literals.DEPENDENCY__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLag() {
		return (String)eDynamicGet(WorkPackage.DEPENDENCY__LAG, WorkPackage.Literals.DEPENDENCY__LAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLag(String newLag) {
		eDynamicSet(WorkPackage.DEPENDENCY__LAG, WorkPackage.Literals.DEPENDENCY__LAG, newLag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkPackage.DEPENDENCY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WorkPackage.DEPENDENCY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case WorkPackage.DEPENDENCY__CONSTRAINT:
				return getConstraint();
			case WorkPackage.DEPENDENCY__LAG:
				return getLag();
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
			case WorkPackage.DEPENDENCY__TYPE:
				setType((DependencyType)newValue);
				return;
			case WorkPackage.DEPENDENCY__TARGET:
				setTarget((AbstractWork)newValue);
				return;
			case WorkPackage.DEPENDENCY__CONSTRAINT:
				setConstraint((TemporalConstraint)newValue);
				return;
			case WorkPackage.DEPENDENCY__LAG:
				setLag((String)newValue);
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
			case WorkPackage.DEPENDENCY__TYPE:
				setType((DependencyType)null);
				return;
			case WorkPackage.DEPENDENCY__TARGET:
				setTarget((AbstractWork)null);
				return;
			case WorkPackage.DEPENDENCY__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case WorkPackage.DEPENDENCY__LAG:
				setLag(LAG_EDEFAULT);
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
			case WorkPackage.DEPENDENCY__TYPE:
				return basicGetType() != null;
			case WorkPackage.DEPENDENCY__TARGET:
				return basicGetTarget() != null;
			case WorkPackage.DEPENDENCY__CONSTRAINT:
				return getConstraint() != CONSTRAINT_EDEFAULT;
			case WorkPackage.DEPENDENCY__LAG:
				return LAG_EDEFAULT == null ? getLag() != null : !LAG_EDEFAULT.equals(getLag());
		}
		return super.eIsSet(featureID);
	}

} //DependencyImpl
