package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSURL;
import org.chamomile.ios.foundation.NSURLRequest;
import org.chamomile.ios.uikit.UIScrollView;
import org.chamomile.ios.uikit.UIView;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A WKWebView object displays interactive web content, such as for an in-app
 * browser. You can use the WKWebView class to embed web content in your app. To
 * do so, create a WKWebView object, set it as the view, and send it a request
 * to load web content.
 * 
 * @author ggeorg
 */
public interface WKWebView extends UIView {
	final class WKWebViewFactory {
		static native WKWebView webView() /*-[
		//@formatter:off
			return [[WKWebView alloc] init];
		//@formatter:on
		]-*/;

		static native WKWebView webViewWithConfiguration(WKWebViewConfiguration configuration) /*-[
		//@formatter:off
			return [[WKWebView alloc] initWithFrame:CGRectMake(0, 0, 0, 0) configuration:(WKWebViewConfiguration*)configuration];
		//@formatter:on
		]-*/;

		static native boolean handlesURLScheme(String urlSchema) /*-[
		//@formatter:off
			return YES;//[WKWebView handlesURLScheme:urlSchema];
		//@formatter:on
		]-*/;

		static native void evaluateJavaScript(WKWebView webView, String javaScriptString) /*-[
		//@formatter:off
			[(WKWebView*)webView evaluateJavaScript:javaScriptString completionHandler:^(id result, NSError *error) {
		        if (error == nil) {
		            if (result != nil) {
		                //resultString = [NSString stringWithFormat:@"%@", result];
	                    NSLog(@"============%@", result);
		            }
		        } else {
		            NSLog(@"evaluateJavaScript error : %@", error.localizedDescription);
		        }
		    }];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Determining Whether WebKit can Load Content
	// ---------------------------------------------------------------------

	@ObjectiveCName("handlesURLScheme:")
	static boolean handlesURLScheme(String urlSchema) {
		return WKWebViewFactory.handlesURLScheme(urlSchema);
	}

	// ---------------------------------------------------------------------
	// Initializing a Web View
	// ---------------------------------------------------------------------

	// TODO configuration

	static WKWebView webView() {
		return WKWebViewFactory.webView();
	}

	static WKWebView webViewWithConfiguration(WKWebViewConfiguration configuration) {
		return WKWebViewFactory.webViewWithConfiguration(configuration);
	}

	// TODO initWithCoder:

	// ---------------------------------------------------------------------
	// Inspecting the View Information
	// ---------------------------------------------------------------------

	@ObjectiveCName("scrollView")
	UIScrollView getScrollView();

//	@ObjectiveCName("setScrollView:")
//	void setScrollView(UIScrollView scrollView);

	@ObjectiveCName("title")
	String getTitle();

	@ObjectiveCName("URL")
	NSURL getURL();

	@ObjectiveCName("customUserAgent")
	String getCustomUserAgent();

	@ObjectiveCName("setCustomUserAgent:")
	void setCustomUserAgent(String customUserAgent);

	// TODO serverTrust

	// ---------------------------------------------------------------------
	// Setting Delegates
	// ---------------------------------------------------------------------

	@ObjectiveCName("navigationDelegate")
	WKNavigationDelegate getNavigationDelegate();

	@ObjectiveCName("setNavigationDelegate:")
	void setNavigationDelegate(WKNavigationDelegate navigationDelegate);

	@ObjectiveCName("UIDelegate")
	WKUIDelegate getUIDelegate();

	@ObjectiveCName("setUIDelegate:")
	void setUIDelegate(WKUIDelegate UIDelegate);

	// ---------------------------------------------------------------------
	// Setting Delegates
	// ---------------------------------------------------------------------

	@ObjectiveCName("estimatedProgress")
	double getEstimatedProgress();

	@ObjectiveCName("hasOnlySecureContent")
	boolean hasOnlySecureContent();

	@ObjectiveCName("loadHTMLString:baseURL:")
	WKNavigation loadHTMLString(String string, NSURL baseURL);

	@ObjectiveCName("isLoading")
	boolean isLoading();

	@ObjectiveCName("reload")
	WKNavigation reload();

	// TODO reload:

	@ObjectiveCName("reloadFromOrigin")
	WKNavigation reloadFromOrigin();

	// TODO reloadFromOrigin:

	@ObjectiveCName("stopLoading")
	void stopLoading();

	// TODO stopLoading:

	// TODO loadData:MIMEType:characterEncodingName:baseURL:

	// TODO loadFileURL:allowingReadAccessToURL:

	// ---------------------------------------------------------------------
	// Scaling Content
	// ---------------------------------------------------------------------

//	@ObjectiveCName("allowsMagnification")
//	boolean allowsMagnification();

//	@ObjectiveCName("setAllowsMagnification:")
//	void setAllowsMagnification(boolean allowsMagnification);

//	@ObjectiveCName("magnification")
//	double getMagnification(); // TODO CGFloat

//	@ObjectiveCName("setMagnification:")
//	void setMagnification(double magnification); // TODO CGFloat

	// @ObjectiveCName("setMagnification:centeredAtPoint:")
	// void setMagnification(double magnification, CGPoint point);

	// ---------------------------------------------------------------------
	// Navigating
	// ---------------------------------------------------------------------

	@ObjectiveCName("allowsBackForwardNavigationGestures")
	boolean allowsBackForwardNavigationGestures();

	@ObjectiveCName("setAllowsBackForwardNavigationGestures:")
	void setAllowsBackForwardNavigationGestures(boolean allowsBackForwardNavigationGestures);

	@ObjectiveCName("backForwardList")
	WKBackForwardList getBackForwardList();

	@ObjectiveCName("canGoBack")
	boolean canGoBack();

	@ObjectiveCName("canGoForward")
	boolean canGoForward();

	@ObjectiveCName("allowsLinkPreview")
	boolean allowsLinkPreview();

	@ObjectiveCName("setAllowsLinkPreview:")
	void setAllowsLinkPreview(boolean setAllowsLinkPreview);

	@ObjectiveCName("goBack")
	WKNavigation goBack();

	// TODO goBack:

	@ObjectiveCName("goForward")
	WKNavigation goForward();

	// TODO goForward:

	// TODO goToBackForwardListItem:

	@ObjectiveCName("loadRequest:")
	WKNavigation loadRequest(NSURLRequest request);

	// ---------------------------------------------------------------------
	// Executing JavaScript
	// ---------------------------------------------------------------------

	default void evaluateJavaScript(String javaScriptString) {
		WKWebViewFactory.evaluateJavaScript(this, javaScriptString);
	}

	// ---------------------------------------------------------------------
	// Taking Snapshots
	// ---------------------------------------------------------------------

	// TODO

}
