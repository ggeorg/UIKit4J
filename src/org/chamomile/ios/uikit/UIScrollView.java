package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A view that allows the scrolling and zooming of its contained views.
 * 
 * @author ggeorg
 */
public interface UIScrollView extends UIView {
	final class UIScrollViewFactory {
		static native UIScrollView create() /*-[
		//@formatter:off
			return [[UIScrollView alloc] init];
		//@formatter:on
		]-*/;

		static native UIScrollView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIScrollView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}
	
	// ---------------------------------------------------------------------
	// Initializing the UIScrollView Object
	// ---------------------------------------------------------------------

	static UIScrollView create() {
		return UIScrollViewFactory.create();
	}

	static UIScrollView createWithFrame(CGRect frame) {
		return UIScrollViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIScrollView createWithFrame(double x, double y, double width, double height) {
		return UIScrollViewFactory.createWithFrame(x, y, width, height);
	}

}
