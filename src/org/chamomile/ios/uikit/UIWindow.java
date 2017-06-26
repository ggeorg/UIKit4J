package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * An object that provides the backdrop for your app’s user interface and
 * provides important event-handling behaviors.
 * 
 * @author ggeorg
 */
public interface UIWindow extends UIView {
	final class UIWindowFactory {
		static native UIWindow create() /*-[
		//@formatter:off
			return [[UIWindow alloc] init];
		//@formatter:on
		]-*/;

		static native UIWindow createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIWindow alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIWindow Object
	// ---------------------------------------------------------------------

	static UIWindow create() {
		return UIWindowFactory.create();
	}

	static UIWindow createWithFrame(CGRect frame) {
		return UIWindowFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIWindow createWithFrame(double x, double y, double width, double height) {
		return UIWindowFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:

	// ---------------------------------------------------------------------
	// Configuring the Window
	// ---------------------------------------------------------------------

	@ObjectiveCName("rootViewController")
	UIViewController getRootViewController();

	@ObjectiveCName("setRootViewController:")
	void setRootViewController(UIViewController viewController);

	@ObjectiveCName("windowLevel")
	/* UIWindowLevel */double getWindowLevel(); // TODO CFloat

	@ObjectiveCName("setWindowLevel:")
	void setWindowLevel(/* UIWindowLevel */double windowLevel); // TODO CFloat

	@ObjectiveCName("screen")
	UIScreen getScreen();

	@ObjectiveCName("setScreen:")
	void setScreen(UIScreen screen);

	// ---------------------------------------------------------------------
	// Making Windows Key
	// ---------------------------------------------------------------------

	@ObjectiveCName("isKeyWindow")
	boolean isKeyWindow();

	@ObjectiveCName("makeKeyAndVisible")
	void makeKeyAndVisible();

	@ObjectiveCName("makeKeyWindow")
	void makeKeyWindow();

	@ObjectiveCName("becomeKeyWindow")
	void becomeKeyWindow();

	@ObjectiveCName("resignKeyWindow")
	void resignKeyWindow();

	// ---------------------------------------------------------------------
	// Converting Coordinates
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Sending Events
	// ---------------------------------------------------------------------
}
