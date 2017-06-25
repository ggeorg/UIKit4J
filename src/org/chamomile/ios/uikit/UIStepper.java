package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A control used to increment or decrement a value.
 * 
 * @author ggeorg
 */
public interface UIStepper extends UIControl {
	final class UIStepperFactory {
		static native UIStepper create() /*-[
		//@formatter:off
			return [[UIStepper alloc] init];
		//@formatter:on
		]-*/;

		static native UIStepper createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIStepper alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}
	
	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UIStepper create() {
		return UIStepperFactory.create();
	}

	static UIStepper createWithFrame(CGRect frame) {
		return UIStepperFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIStepper createWithFrame(double x, double y, double width, double height) {
		return UIStepperFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:
}
