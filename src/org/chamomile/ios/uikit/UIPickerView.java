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
public interface UIPickerView extends UIView {
	final class UIPickerViewFactory {
		static native UIPickerView create() /*-[
		//@formatter:off
			return [[UIPickerView alloc] init];
		//@formatter:on
		]-*/;

		static native UIPickerView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIPickerView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIPickerView Object
	// ---------------------------------------------------------------------

	static UIPickerView create() {
		return UIPickerViewFactory.create();
	}

	static UIPickerView createWithFrame(CGRect frame) {
		return UIPickerViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIPickerView createWithFrame(double x, double y, double width, double height) {
		return UIPickerViewFactory.createWithFrame(x, y, width, height);
	}

}
