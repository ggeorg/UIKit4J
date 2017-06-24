package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import "UIKit4J_common.h"
 ]-*/

/**
 * A control that offers a binary choice, such as On/Off.
 * 
 * @author ggeorg
 */
public interface UISwitch extends UIControl {
	final class UISwitchFactory {
		static native UISwitch initWithFrame(double x, double y, double width, double height) /*-[
		//@formatter:off
			return [[UISwitch alloc] initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing the Switch Object
	// ---------------------------------------------------------------------

	static UISwitch createWithFrame(CGRect frame) {
		return UISwitchFactory.initWithFrame(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height);
	}

	static UISwitch createWithFrame(double x, double y, double width, double height) {
		return UISwitchFactory.initWithFrame(x, y, width, height);
	}

	// TODO initWithCoder:

	// ---------------------------------------------------------------------
	// Setting the Off/On State
	// ---------------------------------------------------------------------

	@ObjectiveCName("isOn")
	boolean isOn();

	@ObjectiveCName("setOn:")
	void setOn(boolean on);

	@ObjectiveCName("setOn:animated:")
	void setOn(boolean on, boolean animated);

	// ---------------------------------------------------------------------
	// Customizing the Appearance of the Switch
	// ---------------------------------------------------------------------

	@ObjectiveCName("onTintColor")
	UIColor getOnTintColor();

	@ObjectiveCName("setOnTintColor:")
	void setOnTintColor(UIColor onTintColor);

	@ObjectiveCName("tintColor")
	UIColor getTintColor();

	@ObjectiveCName("setTintColor:")
	void setTintColor(UIColor tintColor);

	@ObjectiveCName("thumbTintColor")
	UIColor getThumbTintColor();

	@ObjectiveCName("setThumbTintColor:")
	void setThumbTintColor(UIColor tintColor);

	@ObjectiveCName("onImage")
	UIImage getOnImage();

	@ObjectiveCName("setOnImage:")
	void setOnImage(UIImage onImage);

	@ObjectiveCName("offImage")
	UIImage getOffImage();

	@ObjectiveCName("setOffImage:")
	void setOffImage(UIImage onImage);
}
