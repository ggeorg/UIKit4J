package org.chamomile.ios;

import static org.chamomile.ios.uikit.UIColor.whiteColor;
import static org.chamomile.ios.uikit.UIScreen.getMainScreen;
import static org.chamomile.ios.uikit.UIWindow.createWithFrame;

import org.chamomile.ios.foundation.NSDictionary;
import org.chamomile.ios.uikit.UIApplication;
import org.chamomile.ios.uikit.UIApplicationDelegate;
import org.chamomile.ios.uikit.UIResponderStub;
import org.chamomile.ios.uikit.UISplitViewControllerStub;
import org.chamomile.ios.uikit.UIWindow;

public final class Showcase extends UIResponderStub implements UIApplicationDelegate {
	private UIWindow window;

	//@Override
	public boolean didFinishLaunching_01(UIApplication application, NSDictionary launchOptions) {
		window = createWithFrame(getMainScreen().getBounds());
		window.setRootViewController(new WKWebViewDemo());
		window.setBackgroundColor(whiteColor());
		window.makeKeyAndVisible();
		return true;
	}

	@Override
	public boolean didFinishLaunching(UIApplication application, NSDictionary launchOptions) {
		window = createWithFrame(getMainScreen().getBounds());
		window.setRootViewController(new UISplitViewControllerStub());
		window.setBackgroundColor(whiteColor());
		window.makeKeyAndVisible();
		return true;
	}
}
