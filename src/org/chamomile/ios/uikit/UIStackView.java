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
public interface UIStackView extends UIView {
	final class UIStackViewFactory {
		static native UIStackView create() /*-[
		//@formatter:off
			return [[UIStackView alloc] init];
		//@formatter:on
		]-*/;

		static native UIStackView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIStackView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIStackView Object
	// ---------------------------------------------------------------------

	static UIStackView create() {
		return UIStackViewFactory.create();
	}

	static UIStackView createWithFrame(CGRect frame) {
		return UIStackViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIStackView createWithFrame(double x, double y, double width, double height) {
		return UIStackViewFactory.createWithFrame(x, y, width, height);
	}

}
