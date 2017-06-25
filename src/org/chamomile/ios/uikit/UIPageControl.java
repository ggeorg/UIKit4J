package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A control used to select a single value from a continuous range of values.
 * 
 * @author ggeorg
 */
public interface UIPageControl extends UIControl {
	final class UIPageControlFactory {
		static native UIPageControl create() /*-[
		//@formatter:off
			return [[UIPageControl alloc] init];
		//@formatter:on
		]-*/;

		static native UIPageControl createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIPageControl alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}
	
	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UIPageControl create() {
		return UIPageControlFactory.create();
	}

	static UIPageControl createWithFrame(CGRect frame) {
		return UIPageControlFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIPageControl createWithFrame(double x, double y, double width, double height) {
		return UIPageControlFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:
}
