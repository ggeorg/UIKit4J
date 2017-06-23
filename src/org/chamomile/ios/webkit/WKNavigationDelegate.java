package org.chamomile.ios.webkit;

import static org.chamomile.ios.webkit.WKNavigationActionPolicy.WKNavigationActionPolicyAllow;
import static org.chamomile.ios.webkit.WKNavigationResponsePolicy.WKNavigationResponsePolicyAllow;

import java.util.function.Consumer;

import org.chamomile.ios.foundation.NSError;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * The methods of the WKNavigationDelegate protocol help you implement custom
 * behaviors that are triggered during a web view's process of accepting,
 * loading, and completing a navigation request.
 * 
 * @author ggeorg
 */
public interface WKNavigationDelegate {

	// ---------------------------------------------------------------------
	// Initiating the Navigation
	// ---------------------------------------------------------------------

	/**
	 * Called when the web view begins to receive web content.
	 */
	@ObjectiveCName("webView:didCommitNavigation:")
	void didCommitNavigation(WKWebView webView, WKNavigation navigation);

	/**
	 * Called when web content begins to load in a web view.
	 */
	@ObjectiveCName("webView:didStartProvisionalNavigation:")
	void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);

	// ---------------------------------------------------------------------
	// Responding to Server Actions
	// ---------------------------------------------------------------------

	/**
	 * Called when a web view receives a server redirect.
	 */
	@ObjectiveCName("webView:didReceiveServerRedirectForProvisionalNavigation:")
	void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);

	// ---------------------------------------------------------------------
	// Authentication Challenges
	// ---------------------------------------------------------------------

	/**
	 * Called when the web view needs to respond to an authentication challenge.
	 */
	@ObjectiveCName("java_webView:didReceiveAuthenticationChallenge:completionHandler:")
	void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge navigation,
			Object completionHandler);

	// ---------------------------------------------------------------------
	// Reacting to Errors
	// ---------------------------------------------------------------------

	/**
	 * Called when an error occurs during navigation.
	 */
	@ObjectiveCName("webView:didFailNavigation:withError:")
	void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);

	/**
	 * Called when an error occurs while the web view is loading content.
	 */
	@ObjectiveCName("webView:didFailProvisionalNavigation:withError:")
	void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);

	// ---------------------------------------------------------------------
	// Tracking Load Progress
	// ---------------------------------------------------------------------

	/**
	 * Called when an error occurs during navigation.
	 */
	@ObjectiveCName("webView:didFinishNavigation:")
	void didFinishNavigation(WKWebView webView, WKNavigation navigation);

	/**
	 * Called when an error occurs during navigation.
	 */
	@ObjectiveCName("webViewWebContentProcessDidTerminate:")
	void webViewWebContentProcessDidTerminate(WKWebView webView);

	// ---------------------------------------------------------------------
	// Permitting Navigation
	// ---------------------------------------------------------------------

	/**
	 * Decides whether to allow or cancel a navigation.
	 */
	@ObjectiveCName("webView:decidePolicyForNavigationAction:decisionHandler:")
	default void objc_decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction,
			Object decisionHandler) {

		// keep a reference
		final Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				accept(decisionHandler, t.intValue());
			}

			private native void accept(Object decisionHandler, int t) /*-[
			//@formatter:off
				((void (^)(WKNavigationActionPolicy))decisionHandler)(t);
			//@formatter:on
			]-*/;
		};

		decidePolicyForNavigationAction(webView, navigationAction, consumer);
	}

	void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction,
			Consumer<Integer> decisionHandler);

	/**
	 * Decides whether to allow or cancel a navigation after its response is
	 * known.
	 */
	//@formatter:off
//	@ObjectiveCName("webView:decidePolicyForNavigationResponse:decisionHandler:")
//	default void objc_decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse,
//			Object decisionHandler) {
//
//		// keep a reference
//		final Consumer<Integer> consumer = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				accept(decisionHandler, t);
//			}
//
//			private native void accept(Object decisionHandler, int t) /*-[
//			//@formatter:off
//				((void (^)(WKNavigationResponsePolicy))decisionHandler)(t);
//			//@formatter:on
//			]-*/;
//		};
//
//		decidePolicyForNavigationResponse(webView, navigationResponse, consumer);
//	}
//
//	void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse,
//			Consumer<Integer> decisionHandler);
	//@formatter:on

}
