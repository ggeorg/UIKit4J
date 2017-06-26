package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * An object that defines the properties associated with a hardware-based
 * display.
 * 
 * @author ggeorg
 */
public interface UIScreen extends NSObject {
	final class UIScreenFactory {
		static native CGRect getBounds(UIScreen screen) /*-[
		//@formatter:off
			CGRect bounds = [(UIView *)screen bounds];
			double x      = (double)bounds.origin.x;
			double y      = (double)bounds.origin.y;
			double width  = (double)bounds.size.width;
			double height = (double)bounds.size.height;
			return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
		//@formatter:on
		]-*/;

		static native UIScreen getMainScreen()  /*-[
		//@formatter:off
			return [UIScreen mainScreen];
		//@formatter:on
		]-*/;
	}

	@ObjectiveCName("mainScreen")
	static UIScreen getMainScreen() {
		return UIScreenFactory.getMainScreen();
	}

	@ObjectiveCName("java_getBounds")
	default CGRect getBounds() {
		return UIScreenFactory.getBounds(this);
	}
}
