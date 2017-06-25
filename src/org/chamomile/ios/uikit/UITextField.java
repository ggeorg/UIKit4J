package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * An object that displays an editable text area in your interface.
 * 
 * @author ggeorg
 */
public interface UITextField extends UIControl {
	final class UITextFieldFactory {
		static native UITextField create() /*-[
		//@formatter:off
			return [[UITextField alloc] init];
		//@formatter:on
		]-*/;

		static native UITextField createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UITextField alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UITextField create() {
		return UITextFieldFactory.create();
	}

	static UITextField createWithFrame(CGRect frame) {
		return UITextFieldFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UITextField createWithFrame(double x, double y, double width, double height) {
		return UITextFieldFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:

}
