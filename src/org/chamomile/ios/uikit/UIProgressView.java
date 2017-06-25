package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A view that depicts the progress of a task over time.
 * 
 * @author ggeorg
 */
public interface UIProgressView extends UIView {
	final class UIProgressViewFactory {
		static native UIProgressView create() /*-[
		//@formatter:off
			return [[UIProgressView alloc] init];
		//@formatter:on
		]-*/;

		static native UIProgressView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIProgressView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIProgressView Object
	// ---------------------------------------------------------------------

	static UIProgressView create() {
		return UIProgressViewFactory.create();
	}

	static UIProgressView createWithFrame(CGRect frame) {
		return UIProgressViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIProgressView createWithFrame(double x, double y, double width, double height) {
		return UIProgressViewFactory.createWithFrame(x, y, width, height);
	}

}
