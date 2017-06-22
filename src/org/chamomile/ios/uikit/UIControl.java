package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * The base class for controls, which are visual elements that convey a specific
 * action or intention in response to user interactions.
 * 
 * @author ggeorg
 */
public interface UIControl extends UIView, UIControlState, UIControlEvents, UIControlContentVerticalAlignment {
	final class UIControlFactory {
		static native void addTarget(UIControl control, UIEventHandler<?> handler, int controlEvents) /*-[
			//@formatter:off
				// XXX: the control does not retain the object in the target parameter.
				[(UIControl *)control addTarget:handler action:@selector(onEvent:event:) forControlEvents:controlEvents];
			//@formatter:on
		]-*/;

		static native void removeTarget(UIControl control, UIEventHandler<?> handler, int controlEvents) /*-[
		//@formatter:off
			[(UIControl *)control removeTarget:handler action:@selector(onEvent:event:) forControlEvents:controlEvents];
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Configuring the Control’s Attributes
	// ---------------------------------------------------------------------

	@ObjectiveCName("state")
	/* UIControlState */int getState();

	@ObjectiveCName("isEnabled")
	boolean isEnabled();

	@ObjectiveCName("setEnabled:")
	void setEnabled(boolean enabled);

	@ObjectiveCName("isSelected")
	boolean isSelected();

	@ObjectiveCName("setSelected:")
	void setSelected(boolean selected);

	@ObjectiveCName("isHighlighted")
	boolean isHighlighted();

	@ObjectiveCName("setHighlighted:")
	void setHighlighted(boolean highlighted);

	@ObjectiveCName("contentVerticalAlignment")
	/* UIControlContentVerticalAlignment */int getContentVerticalAlignment();

	@ObjectiveCName("setContentVerticalAlignment:")
	void setContentVerticalAlignment(/* UIControlContentVerticalAlignment */int contentVerticalAlignment);

	@ObjectiveCName("contentHorizontalAlignment")
	/* UIControlContentHorizontalAlignment */int getContentHorizontalAlignment();

	@ObjectiveCName("setContentHorizontalAlignment:")
	void setContentHorizontalAlignment(/* UIControlContentHorizontalAlignment */int contentHorizontalAlignment);

//	@ObjectiveCName("effectiveContentHorizontalAlignment")
//	/* UIControlContentHorizontalAlignment */int getEffectiveContentHorizontalAlignment();

	// ---------------------------------------------------------------------
	// Accessing the Control’s Targets and Actions
	// ---------------------------------------------------------------------

	@ObjectiveCName("java_addTarget:controlEvent:")
	default void addTarget(UIEventHandler<?> handler, int controlEvents) {
		UIControlFactory.addTarget(this, handler, controlEvents);
	}

	@ObjectiveCName("java_removeTarget:controlEvent:")
	default void removeTarget(UIEventHandler<?> handler, int controlEvents) {
		UIControlFactory.removeTarget(this, handler, controlEvents);
	}

	// TODO actionsForTarget:forControlEvent:

	// TODO allControlEvents

	// TODO allTargets

	// ---------------------------------------------------------------------
	// Triggering Actions
	// ---------------------------------------------------------------------

	// TODO sendAction:to:forEvent:

	// TODO sendActionsForControlEvents:

	// ---------------------------------------------------------------------
	// Tracking Touches and Redrawing Controls
	// ---------------------------------------------------------------------
	
	// TODO beginTrackingWithTouch:withEvent:
	
	// TODO continueTrackingWithTouch:withEvent:
	
	// TODO endTrackingWithTouch:withEvent:
	
	// TODO cancelTrackingWithEvent:
	
	// TODO tracking
	
	// TODO touchInside
}
