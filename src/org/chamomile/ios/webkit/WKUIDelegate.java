package org.chamomile.ios.webkit;

import java.util.function.Consumer;

import org.chamomile.ios.foundation.NSArray;
import org.chamomile.ios.foundation.NSURL;
import org.chamomile.ios.uikit.UIViewController;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * The WKUIDelegate class provides methods for presenting native user interface
 * elements on behalf of a webpage.
 * 
 * @author ggeorg
 */
public interface WKUIDelegate {

	// ---------------------------------------------------------------------
	// Creating a Web View
	// ---------------------------------------------------------------------

	/**
	 * Called when the web view begins to receive web content.
	 */
	@ObjectiveCName("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
	void createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction,
			WKWindowFeatures windowFeatures);

	// ---------------------------------------------------------------------
	// Displaying UI Panels
	// ---------------------------------------------------------------------

	/**
	 * Displays a JavaScript alert panel.
	 */
	@ObjectiveCName("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
	default void objc_runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame,
			Object completionHandler) {

		// keep a reference
		final Consumer<Void> consumer = new Consumer<Void>() {
			@Override
			public void accept(Void t) {
				_accept(completionHandler);
			}

			private native void _accept(Object completionHandler) /*-[
			//@formatter:off
				((void (^)(void))decisionHandler)(t);
			//@formatter:on
			]-*/;
		};

		runJavaScriptAlertPanel(webView, message, frame, consumer);
	}

	void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame,
			Consumer<Void> completionHandler);

	/**
	 * Displays a JavaScript confirm panel.
	 */
	@ObjectiveCName("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
	default void objc_runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame,
			Object completionHandler) {

		// keep a reference
		final Consumer<Boolean> consumer = new Consumer<Boolean>() {
			@Override
			public void accept(Boolean t) {
				accept(completionHandler, t);
			}

			private native void accept(Object completionHandler, Boolean t) /*-[
			//@formatter:off
				((void (^)(void))decisionHandler)(t);
			//@formatter:on
			]-*/;
		};

		runJavaScriptConfirmPanel(webView, message, frame, consumer);
	}

	void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame,
			Consumer<Boolean> completionHandler);

	/**
	 * Displays a JavaScript text input panel.
	 */
	@ObjectiveCName("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
	default void objc_runJavaScriptTextInputPanel(WKWebView webView, String message, String defaultText,
			WKFrameInfo frame, Object completionHandler) {

		// keep a reference
		final Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				accept(completionHandler, t);
			}

			private native void accept(Object completionHandler, String t) /*-[
			//@formatter:off
				((void (^)(void))decisionHandler)(t);
			//@formatter:on
			]-*/;
		};

		runJavaScriptTextInputPanel(webView, message, defaultText, frame, consumer);
	}

	void runJavaScriptTextInputPanel(WKWebView webView, String message, String defaultText, WKFrameInfo frame,
			Consumer<String> completionHandler);

	// ---------------------------------------------------------------------
	// Closing a Web View
	// ---------------------------------------------------------------------

	/**
	 * Notifies your app that the DOM window closed successfully.
	 */
	@ObjectiveCName("webViewDidClose:")
	void didClose(WKWebView webView);

	// ---------------------------------------------------------------------
	// Displaying the Upload Panel
	// ---------------------------------------------------------------------

	/**
	 * Determines whether the given element should show a preview.
	 */
	@ObjectiveCName("webView:runOpenPanelWithParameters:initiatedByFrame:completionHandler:")
	default void runOpenPanel(WKWebView webView, WKOpenPanelParameters parameters, WKFrameInfo frame,
			Object completionHandler) {

		// keep a reference
		final Consumer<NSArray<NSURL>> consumer = new Consumer<NSArray<NSURL>>() {
			@Override
			public void accept(NSArray<NSURL> t) {
				accept(completionHandler, t);
			}

			private native void accept(Object completionHandler, NSArray<NSURL> t) /*-[
			//@formatter:off
				((void (^)(void))decisionHandler)(t);
			//@formatter:on
			]-*/;
		};

		runJavaScriptTextInputPanel(webView, parameters, frame, consumer);
	}

	void runJavaScriptTextInputPanel(WKWebView webView, WKOpenPanelParameters parameters, WKFrameInfo frame,
			Consumer<NSArray<NSURL>> completionHandler);

	// ---------------------------------------------------------------------
	// Responding to Force Touch Actions
	// ---------------------------------------------------------------------

	/**
	 * Determines whether the given element should show a preview.
	 */
	@ObjectiveCName("webView:shouldPreviewElement:")
	boolean shouldPreviewElement(WKWebView webView, WKPreviewElementInfo elementInfo);

	/**
	 * Called when the user performs a pop action on the preview.
	 */
	@ObjectiveCName("webView:commitPreviewingViewController:")
	boolean commitPreviewingViewController(WKWebView webView, UIViewController previewingViewController);

}
