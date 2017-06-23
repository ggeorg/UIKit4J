package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * Using the WKWebViewConfiguration class, you can determine how soon a webpage
 * is rendered, how media playback is handled, the granularity of items that the
 * user can select, and many other options.
 * <p>
 * WKWebViewConfiguration is only used when a web view is first initialized. You
 * cannot use this class to change the web view's configuration after it has
 * been created.
 * 
 * @author ggeorg
 */
public interface WKWebViewConfiguration extends NSObject {
	final class WKWebViewConfigurationFactory {
		
	}

	// ---------------------------------------------------------------------
	// Configuring the New Web View’s Properties
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("applicationNameForUserAgent")
	String getApplicationNameForUserAgent();
	
	@ObjectiveCName("setApplicationNameForUserAgent:")
	void setApplicationNameForUserAgent(String applicationNameForUserAgent);
}
