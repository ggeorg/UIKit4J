package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * An object that displays a single image or a sequence of animated images in
 * your interface.
 * 
 * @author ggeorg
 */
public interface UIImageView extends UIView {
	final class UIImageViewFactory {
		static native UIImageView create() /*-[
		//@formatter:off
			return [[UIImageView alloc] init];
		//@formatter:on
		]-*/;

		static native UIImageView createWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UIImageView alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the UIImageView Object
	// ---------------------------------------------------------------------

	static UIImageView create() {
		return UIImageViewFactory.create();
	}

	static UIImageView createWithFrame(CGRect frame) {
		return UIImageViewFactory.createWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UIImageView createWithFrame(double x, double y, double width, double height) {
		return UIImageViewFactory.createWithFrame(x, y, width, height);
	}

}
