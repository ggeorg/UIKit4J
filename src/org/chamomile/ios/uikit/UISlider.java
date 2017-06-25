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
public interface UISlider extends UIControl {
	final class UISliderFactory {
		static native UISlider create() /*-[
		//@formatter:off
			return [[UISlider alloc] init];
		//@formatter:on
		]-*/;

		static native UISlider createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UISlider alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}
	
	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UISlider create() {
		return UISliderFactory.create();
	}

	static UISlider createWithFrame(CGRect frame) {
		return UISliderFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UISlider createWithFrame(double x, double y, double width, double height) {
		return UISliderFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:
}
