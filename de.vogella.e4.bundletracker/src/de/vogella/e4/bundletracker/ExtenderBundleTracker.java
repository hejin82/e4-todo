package de.vogella.e4.bundletracker;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTracker;

public class ExtenderBundleTracker extends BundleTracker {

	public ExtenderBundleTracker(BundleContext context) {
		super(context, Bundle.ACTIVE, null);
	}

	@Override
	public Object addingBundle(Bundle bundle, BundleEvent event) {
		String className = (String) bundle.getHeaders().get(
				"Action-Contribution");
		if (className != null) {
			Class<?> clazz;
			try {
				clazz = bundle.loadClass(className);
				try {
					System.out.println("Got you");

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			
		}
		return bundle;

	}
}