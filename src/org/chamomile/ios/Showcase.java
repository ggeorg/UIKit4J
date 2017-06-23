package org.chamomile.ios;

import static org.chamomile.ios.foundation.NSURL.URLWithString;
import static org.chamomile.ios.foundation.NSURLRequest.requestWithURL;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;

import org.chamomile.ios.uikit.UIViewControllerStub;
import org.chamomile.ios.webkit.WKWebView;

public final class Showcase extends UIViewControllerStub {

	@Override
	public void viewDidLoad() {
		super.viewDidLoad();

		WKWebView webView = WKWebView.webView();
		getView().addSubview(webView);
		//setView(webView);
		webView.setFrame(getView().getFrame());
		
		webView.setAutoresizingMask(UIViewAutoresizingFlexibleHeight | UIViewAutoresizingFlexibleWidth);

		webView.loadRequest(requestWithURL(URLWithString("http://www.google.com")));
	}
}
