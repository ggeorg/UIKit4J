package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSDictionary;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A set of methods that are called by the singleton UIApplication object in
 * response to important events in the lifetime of your app.
 * 
 * @author ggeorg
 */
public interface UIApplicationDelegate {

	// ---------------------------------------------------------------------
	// Responding to App State Changes and System Events
	// ---------------------------------------------------------------------

	/**
	 * Tells the delegate that the launch process is almost done and the app is
	 * almost ready to run.
	 * 
	 * @return 
	 */
	@ObjectiveCName("application:didFinishLaunchingWithOptions:")
	boolean didFinishLaunching(UIApplication application, NSDictionary launchOptions);

}
