import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.work.capability.WorkEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.work {
	
	exports org.nasdanika.models.work;
	exports org.nasdanika.models.work.impl;
	exports org.nasdanika.models.work.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.governance;
	
	provides CapabilityFactory with 
		WorkEPackageResourceSetCapabilityFactory;
	
}