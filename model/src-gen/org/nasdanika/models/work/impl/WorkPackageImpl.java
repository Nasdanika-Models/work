/**
 */
package org.nasdanika.models.work.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.Dependency;
import org.nasdanika.models.work.DependencyType;
import org.nasdanika.models.work.TemporalConstraint;
import org.nasdanika.models.work.Work;
import org.nasdanika.models.work.WorkDomain;
import org.nasdanika.models.work.WorkFactory;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.WorkReference;
import org.nasdanika.models.work.WorkType;
import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPackageImpl extends EPackageImpl implements WorkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalConstraintEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.work.WorkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkPackageImpl() {
		super(eNS_URI, WorkFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WorkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkPackage init() {
		if (isInited) return (WorkPackage)EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WorkPackageImpl theWorkPackage = registeredWorkPackage instanceof WorkPackageImpl ? (WorkPackageImpl)registeredWorkPackage : new WorkPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GovernancePackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWorkPackage.createPackageContents();

		// Initialize created meta-data
		theWorkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkPackage.eNS_URI, theWorkPackage);
		return theWorkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkType() {
		return workTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkType_SuperType() {
		return (EReference)workTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkType_Level() {
		return (EAttribute)workTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyType() {
		return dependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyType_InverseName() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkable() {
		return workableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkable_Work() {
		return (EReference)workableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractWork() {
		return abstractWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractWork_Dependencies() {
		return (EReference)abstractWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWork() {
		return workEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWork_Type() {
		return (EReference)workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Estimate() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Actual() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Due() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Priority() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_PercentComplete() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWork_Impacts() {
		return (EReference)workEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkReference() {
		return workReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkReference_Target() {
		return (EReference)workReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Type() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Target() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Constraint() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Lag() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkDomain() {
		return workDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDomain_WorkTypes() {
		return (EReference)workDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkDomain_DependencyTypes() {
		return (EReference)workDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTemporalConstraint() {
		return temporalConstraintEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkFactory getWorkFactory() {
		return (WorkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workTypeEClass = createEClass(WORK_TYPE);
		createEReference(workTypeEClass, WORK_TYPE__SUPER_TYPE);
		createEAttribute(workTypeEClass, WORK_TYPE__LEVEL);

		dependencyTypeEClass = createEClass(DEPENDENCY_TYPE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__INVERSE_NAME);

		workableEClass = createEClass(WORKABLE);
		createEReference(workableEClass, WORKABLE__WORK);

		abstractWorkEClass = createEClass(ABSTRACT_WORK);
		createEReference(abstractWorkEClass, ABSTRACT_WORK__DEPENDENCIES);

		workEClass = createEClass(WORK);
		createEReference(workEClass, WORK__TYPE);
		createEAttribute(workEClass, WORK__ESTIMATE);
		createEAttribute(workEClass, WORK__ACTUAL);
		createEAttribute(workEClass, WORK__DUE);
		createEAttribute(workEClass, WORK__PRIORITY);
		createEAttribute(workEClass, WORK__PERCENT_COMPLETE);
		createEReference(workEClass, WORK__IMPACTS);

		workReferenceEClass = createEClass(WORK_REFERENCE);
		createEReference(workReferenceEClass, WORK_REFERENCE__TARGET);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__TYPE);
		createEReference(dependencyEClass, DEPENDENCY__TARGET);
		createEAttribute(dependencyEClass, DEPENDENCY__CONSTRAINT);
		createEAttribute(dependencyEClass, DEPENDENCY__LAG);

		workDomainEClass = createEClass(WORK_DOMAIN);
		createEReference(workDomainEClass, WORK_DOMAIN__WORK_TYPES);
		createEReference(workDomainEClass, WORK_DOMAIN__DEPENDENCY_TYPES);

		// Create enums
		temporalConstraintEEnum = createEEnum(TEMPORAL_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GovernancePackage theGovernancePackage = (GovernancePackage)EPackage.Registry.INSTANCE.getEPackage(GovernancePackage.eNS_URI);
		LifecyclePackage theLifecyclePackage = (LifecyclePackage)EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workTypeEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		dependencyTypeEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		workableEClass.getESuperTypes().add(theGovernancePackage.getGovernedElement());
		abstractWorkEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		workEClass.getESuperTypes().add(this.getAbstractWork());
		workEClass.getESuperTypes().add(this.getWorkable());
		workEClass.getESuperTypes().add(theNxcorePackage.getPeriod());
		workEClass.getESuperTypes().add(theLifecyclePackage.getStaged());
		workReferenceEClass.getESuperTypes().add(this.getAbstractWork());
		dependencyEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		workDomainEClass.getESuperTypes().add(this.getWorkable());

		// Initialize classes, features, and operations; add parameters
		initEClass(workTypeEClass, WorkType.class, "WorkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkType_SuperType(), this.getWorkType(), null, "superType", null, 0, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkType_Level(), theEcorePackage.getEIntegerObject(), "level", null, 0, 1, WorkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyTypeEClass, DependencyType.class, "DependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyType_InverseName(), theEcorePackage.getEString(), "inverseName", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workableEClass, Workable.class, "Workable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkable_Work(), this.getAbstractWork(), null, "work", null, 0, -1, Workable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractWorkEClass, AbstractWork.class, "AbstractWork", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractWork_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, AbstractWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEClass, Work.class, "Work", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWork_Type(), this.getWorkType(), null, "type", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_Estimate(), theEcorePackage.getEString(), "estimate", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_Actual(), theEcorePackage.getEString(), "actual", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_Due(), theEcorePackage.getEDate(), "due", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_Priority(), theEcorePackage.getEIntegerObject(), "priority", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_PercentComplete(), theEcorePackage.getEIntegerObject(), "percentComplete", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWork_Impacts(), theEcorePackage.getEObject(), null, "impacts", null, 0, -1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workReferenceEClass, WorkReference.class, "WorkReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkReference_Target(), this.getWork(), null, "target", null, 0, 1, WorkReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Type(), this.getDependencyType(), null, "type", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Target(), this.getAbstractWork(), null, "target", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Constraint(), this.getTemporalConstraint(), "constraint", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Lag(), theEcorePackage.getEString(), "lag", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workDomainEClass, WorkDomain.class, "WorkDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkDomain_WorkTypes(), this.getWorkType(), null, "workTypes", null, 0, -1, WorkDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDomain_DependencyTypes(), this.getDependencyType(), null, "dependencyTypes", null, 0, -1, WorkDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(temporalConstraintEEnum, TemporalConstraint.class, "TemporalConstraint");
		addEEnumLiteral(temporalConstraintEEnum, TemporalConstraint.NONE);
		addEEnumLiteral(temporalConstraintEEnum, TemporalConstraint.FINISH_TO_START);
		addEEnumLiteral(temporalConstraintEEnum, TemporalConstraint.START_TO_START);
		addEEnumLiteral(temporalConstraintEEnum, TemporalConstraint.FINISH_TO_FINISH);
		addEEnumLiteral(temporalConstraintEEnum, TemporalConstraint.START_TO_FINISH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (workTypeEClass,
		   source,
		   new String[] {
			   "documentation", " Base (ModelElement, Property) is imported from the model below in the\ntower rather than redefined; collapses into nxcore on base extraction."
		   });
		addAnnotation
		  (getWorkType_Level(),
		   source,
		   new String[] {
			   "documentation", " Hierarchy level hint, as in Jira: 1 epic, 0 standard, -1 sub-task."
		   });
		addAnnotation
		  (dependencyTypeEClass,
		   source,
		   new String[] {
			   "documentation", "A kind of dependency between work: blocks, duplicates, relates, requires.\nMirrors Jira link types; the temporal constraint on Dependency carries the\nscheduling semantics these types lack."
		   });
		addAnnotation
		  (getDependencyType_InverseName(),
		   source,
		   new String[] {
			   "documentation", " Label from the dependent side, e.g. \"is blocked by\"."
		   });
		addAnnotation
		  (workableEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Workable ----"
		   });
		addAnnotation
		  (abstractWorkEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Work ----"
		   });
		addAnnotation
		  (workEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of work. Leaf work is a work item; work containing work is an epic,\nsummary task, or work package. State comes from the lifecycle aspect,\nassignment from the role aspect, risk and controls from the governance\naspect."
		   });
		addAnnotation
		  (getWork_Estimate(),
		   source,
		   new String[] {
			   "documentation", " Estimate in the unit the organization uses: points, hours, days."
		   });
		addAnnotation
		  (getWork_Actual(),
		   source,
		   new String[] {
			   "documentation", " Actual effort spent, same unit as estimate."
		   });
		addAnnotation
		  (getWork_Priority(),
		   source,
		   new String[] {
			   "documentation", " Smaller is more important; absent means unprioritized."
		   });
		addAnnotation
		  (getWork_PercentComplete(),
		   source,
		   new String[] {
			   "documentation", " 0..100; derived roll-up for non-leaf work is a tooling concern."
		   });
		addAnnotation
		  (getWork_Impacts(),
		   source,
		   new String[] {
			   "documentation", "Elements affected by this work, beyond the element containing it:\nJira components / affected versions crosswalk. Containment says what\nthe work is done ON (one home); impacts says what it touches (many,\ncross-model, no ownership of the target required). Typed as EObject\nbecause impacted elements live in other micro-models without a shared\nbase yet; narrow to Ncore ModelElement on base convergence. Promote to\na contained Impact class with ImpactType if kinds become necessary."
		   });
		addAnnotation
		  (workReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "A reference to work defined in another (published, federated) model:\nthe product management model reference pattern. Allows a team\'s backlog\nto cite, depend on, or roll up work owned by another team without\ncopying it."
		   });
		addAnnotation
		  (temporalConstraintEEnum,
		   source,
		   new String[] {
			   "documentation", " ---- Dependencies ----"
		   });
		addAnnotation
		  (temporalConstraintEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Predecessor must finish before this starts: the default in scheduling tools."
		   });
		addAnnotation
		  (dependencyEClass,
		   source,
		   new String[] {
			   "documentation", "A directed dependency from the containing work to a predecessor:\nissue-tracker semantics via type, scheduling semantics via constraint\nand lag. Target may be a WorkReference, so dependencies cross model\nboundaries."
		   });
		addAnnotation
		  (getDependency_Target(),
		   source,
		   new String[] {
			   "documentation", " The work this work depends on (predecessor / blocker)."
		   });
		addAnnotation
		  (getDependency_Lag(),
		   source,
		   new String[] {
			   "documentation", " Lead or lag, e.g. \"2d\", \"-1w\"."
		   });
		addAnnotation
		  (workDomainEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Root ----"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //WorkPackageImpl
