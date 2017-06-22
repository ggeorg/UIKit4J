package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * 
 * @author ggeorg
 *
 */
public interface UIControl extends UIView, UIControlEvents {
	final class UIControlFactory {
		static native void addTarget(UIControl control, UIEventHandler<?> handler, int controlEvents) /*-[
			//@formatter:off
				// XXX: the control does not retain the object in the target parameter.
				[(UIControl *)control addTarget:handler action:@selector(onEvent:event:) forControlEvents:controlEvents];
			//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Accessing the Control’s Targets and Actions
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("java_addTarget:controlEvent:")
	public default void addTarget(UIEventHandler<?> handler, int controlEvents) {
		UIControlFactory.addTarget(this, handler, controlEvents);
	}
}
