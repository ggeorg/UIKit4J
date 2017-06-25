package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A horizontal control made of multiple segments, each segment functioning as a
 * discrete button.
 * 
 * @author ggeorg
 */
public interface UISegmentedControl extends UIControl {
	final class UISegmentedControlFactory {
		static native UISegmentedControl create() /*-[
		//@formatter:off
			return [[UISegmentedControl alloc] init];
		//@formatter:on
		]-*/;

		static native UISegmentedControl createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UISegmentedControl alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UISegmentedControl create() {
		return UISegmentedControlFactory.create();
	}

	static UISegmentedControl createWithFrame(CGRect frame) {
		return UISegmentedControlFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UISegmentedControl createWithFrame(double x, double y, double width, double height) {
		return UISegmentedControlFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:
}
