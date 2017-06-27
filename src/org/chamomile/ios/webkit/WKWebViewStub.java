package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSURL;
import org.chamomile.ios.foundation.NSURLRequest;
import org.chamomile.ios.uikit.UIScrollView;
import org.chamomile.ios.uikit.UIViewStub;

import com.google.j2objc.annotations.ObjectiveCName;

@ObjectiveCName("WKWebView")
public class WKWebViewStub extends UIViewStub implements WKWebView {
	public WKWebViewStub() {}
	public WKWebViewStub(WKWebViewConfiguration configuration) {}

	@Override
	public UIScrollView getScrollView() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void setScrollView(UIScrollView scrollView) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NSURL getURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCustomUserAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustomUserAgent(String customUserAgent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WKNavigationDelegate getNavigationDelegate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNavigationDelegate(WKNavigationDelegate navigationDelegate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WKUIDelegate getUIDelegate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUIDelegate(WKUIDelegate UIDelegate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getEstimatedProgress() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasOnlySecureContent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WKNavigation loadHTMLString(String string, NSURL baseURL) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoading() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WKNavigation reload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WKNavigation reloadFromOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stopLoading() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public boolean allowsMagnification() {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public void setAllowsMagnification(boolean allowsMagnification) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public double getMagnification() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public void setMagnification(double magnification) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public boolean allowsBackForwardNavigationGestures() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAllowsBackForwardNavigationGestures(boolean allowsBackForwardNavigationGestures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WKBackForwardList getBackForwardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canGoBack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canGoForward() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allowsLinkPreview() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAllowsLinkPreview(boolean setAllowsLinkPreview) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WKNavigation goBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WKNavigation goForward() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WKNavigation loadRequest(NSURLRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
