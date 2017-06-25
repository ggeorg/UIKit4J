package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A scrollable, multiline text region.
 * 
 * @author ggeorg
 */
public interface UITextView extends UIScrollView {
	final class UITextViewFactory {
		static native UITextView create() /*-[
		//@formatter:off
			return [[UITextView alloc] init];
		//@formatter:on
		]-*/;

		static native UITextView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UITextView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UITextView create() {
		return UITextViewFactory.create();
	}

	static UITextView createWithFrame(CGRect frame) {
		return UITextViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UITextView createWithFrame(double x, double y, double width, double height) {
		return UITextViewFactory.createWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:

}
