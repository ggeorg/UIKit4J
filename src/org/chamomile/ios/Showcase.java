package org.chamomile.ios;

import static org.chamomile.ios.foundation.NSURL.URLWithString;
import static org.chamomile.ios.foundation.NSURLRequest.requestWithURL;

import org.chamomile.ios.uikit.UIViewControllerStub;
import org.chamomile.ios.webkit.WKWebView;

public final class Showcase extends UIViewControllerStub {

	@Override
	public void viewDidLoad() {
		super.viewDidLoad();

		WKWebView webView = WKWebView.webView();
		//getView().addSubview(webView);
		setView(webView);

		webView.loadRequest(requestWithURL(URLWithString("http://www.google.com")));
	}
}
