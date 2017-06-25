package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A view that shows that a task is in progress.
 * 
 * @author ggeorg
 */
public interface UIActivityIndicatorView extends UIView {
	final class UIActivityIndicatorViewFactory {
		static native UIActivityIndicatorView create() /*-[
		//@formatter:off
			return [[UIActivityIndicatorView alloc] init];
		//@formatter:on
		]-*/;

		static native UIActivityIndicatorView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIActivityIndicatorView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIActivityIndicatorView Object
	// ---------------------------------------------------------------------

	static UIActivityIndicatorView create() {
		return UIActivityIndicatorViewFactory.create();
	}

	static UIActivityIndicatorView createWithFrame(CGRect frame) {
		return UIActivityIndicatorViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width,
				frame.size.height);
	}

	static UIActivityIndicatorView createWithFrame(double x, double y, double width, double height) {
		return UIActivityIndicatorViewFactory.createWithFrame(x, y, width, height);
	}
}
