package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

public interface UIButton extends UIControl, UIButtonType {
	class UIButtonFactory {
		static native UIButton buttonWithType(int buttonType) /*-[
		//@formatter:off
			return (id<OrgChamomileIosUikitUIButton>) [UIButton buttonWithType:buttonType];
		//@formatter:on
		]-*/;
	}

	static UIButton buttonWithType(int buttonType) {
		return UIButtonFactory.buttonWithType(buttonType);
	};

	@ObjectiveCName("titleLabel")
	Object getTitleLabel(); // TODO UILabel
	

	@ObjectiveCName("titleForState:")
	String getTitle(int state); // TODO UIControlState

	@ObjectiveCName("setTitle:forState:")
	void setTitle(String title, int state); // TODO UIControlState

	// ---------------------------------------------------------------------
	// Getting the Current State
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("buttonType")
	int getButtonType(); // TODO UIButtonType
}
