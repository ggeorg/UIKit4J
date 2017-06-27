package org.chamomile.ios;

import static org.chamomile.ios.foundation.NSURL.URLWithString;
import static org.chamomile.ios.foundation.NSURLRequest.requestWithURL;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;
import static org.chamomile.ios.webkit.WKNavigationActionPolicy.WKNavigationActionPolicyAllow;

import java.util.function.Consumer;

import org.chamomile.ios.foundation.NSError;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UISlider;
import org.chamomile.ios.uikit.UISwitch;
import org.chamomile.ios.uikit.UIView;
import org.chamomile.ios.uikit.UIViewController;
import org.chamomile.ios.uikit.UIViewControllerStub;
import org.chamomile.ios.uikit.UIViewStub;
import org.chamomile.ios.webkit.NSURLAuthenticationChallenge;
import org.chamomile.ios.webkit.WKNavigation;
import org.chamomile.ios.webkit.WKNavigationAction;
import org.chamomile.ios.webkit.WKNavigationDelegate;
import org.chamomile.ios.webkit.WKWebView;
import org.chamomile.ios.webkit.WKWebViewStub;

public final class WKWebViewDemo extends UIViewControllerStub
		implements UIViewController, WKNavigationDelegate {

	@Override
	public void viewDidLoad() {
		super.viewDidLoad();

		//WKWebView webView = new MyWebView();
		WKWebView webView = new WKWebViewStub();
		
		getView().addSubview(webView);
		webView.setFrame(getView().getFrame());
		webView.setNavigationDelegate(this);

		webView.setAutoresizingMask(UIViewAutoresizingFlexibleHeight | UIViewAutoresizingFlexibleWidth);

		webView.loadRequest(requestWithURL(URLWithString("http://www.google.com")));
		
		UIView view = UIView.createWithFrame(20, 20, 100, 100);
		view.setBackgroundColor(UIColor.cyanColor());
		getView().addSubview(view);
		
		view = new UIViewStub(0, 0, 150, 100);
		view.setBackgroundColor(UIColor.redColor());
		//view.setFrame(0, 0, 100, 100);
		getView().addSubview(view);
	}

	@Override
	public void didCommitNavigation(WKWebView webView, WKNavigation navigation) {
		System.out.println(">>> didCommitNavigation");
	}

	@Override
	public void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation) {
		System.out.println(">>> didStartProvisionalNavigation");
	}

	@Override
	public void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation) {
		System.out.println(">>> didReceiveServerRedirectForProvisionalNavigation");
	}

	@Override
	public void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge navigation,
			Object completionHandler) {
		// TODO Auto-generated method stub

	}

	@Override
	public void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error) {
		System.out.println(">>> didFailNavigation");
	}

	@Override
	public void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error) {
		System.out.println(">>> didFailProvisionalNavigation");
	}

	@Override
	public void didFinishNavigation(WKWebView webView, WKNavigation navigation) {
		System.out.println(">>> didFinishNavigation");
	}

	@Override
	public void webViewWebContentProcessDidTerminate(WKWebView webView) {
		System.out.println(">>> webViewWebContentProcessDidTerminate");
	}

	@Override
	public void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction,
			Consumer<Integer> decisionHandler) {
		System.out.println(">>> decidePolicyForNavigationAction");
		decisionHandler.accept(WKNavigationActionPolicyAllow);
	}
	
//@formatter:off
//	@Override
//	public void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse,
//			Consumer<Integer> decisionHandler) {
//		decisionHandler.accept(WKNavigationResponsePolicyAllow);
//	}
//@formatter:on
}
