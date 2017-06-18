package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

public interface UIButton extends UIView {
	class UIButtonFactory {
		static native UIButton buttonWithType(int buttonType) /*-[
			return (id<OrgChamomileIosUikitUIButton>) [UIButton buttonWithType:buttonType];
		]-*/;
	}
	
	static UIButton buttonWithType(int buttonType) {
		return UIButtonFactory.buttonWithType(buttonType);
	};

	@ObjectiveCName("setTitle:forState:")
	default void setTitle(String title, int state) {}
}
