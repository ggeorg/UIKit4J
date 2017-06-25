package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A streamlined interface for laying out a collection of views in either a
 * column or a row.
 * 
 * @author ggeorg
 */
public interface UIDatePicker extends UIControl {
	final class UIDatePickerFactory {
		static native UIDatePicker create() /*-[
		//@formatter:off
			return [[UIDatePicker alloc] init];
		//@formatter:on
		]-*/;

		static native UIDatePicker createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIDatePicker alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIDatePicker Object
	// ---------------------------------------------------------------------

	static UIDatePicker create() {
		return UIDatePickerFactory.create();
	}

	static UIDatePicker createWithFrame(CGRect frame) {
		return UIDatePickerFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIDatePicker createWithFrame(double x, double y, double width, double height) {
		return UIDatePickerFactory.createWithFrame(x, y, width, height);
	}

}
