package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGPoint;
import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.core.graphics.CGSize;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that represents a rectangular area on the screen and manages the
 * content in that area.
 * 
 * @author ggeorg
 */
public interface UIView extends UIResponder {
	final class UIViewFactory {
		static native UIView viewWithRect(float x, float y, float width, float height) /*-[
		//@formatter:off
			return (id<OrgChamomileIosUikitUIView>) [(UIView *)[OrgChamomileIosUikitUIView alloc] 
				initWithFrame:CGRectMake(x, y, width, height)];
		//@formatter:on
		]-*/;

		static native CGRect getFrame(UIView view) /*-[
		//@formatter:off
			UIView *_view = (UIView *)view;
			float x = _view.frame.origin.x;
			float y = _view.frame.origin.y;
			float width  = _view.frame.size.width;
			float height = _view.frame.size.height;
			return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
		//@formatter:on
		]-*/;

		static native void setFrame(UIView view, float x, float y, float width, float height) /*-[
		//@formatter:off
			UIView *_view = (UIView *)view;
			_view.frame = CGRectMake(x, y, width, height);
		//@formatter:on
		]-*/;
	}

	// ---------------------------------------------------------------------
	// Initializing a View Object
	// ---------------------------------------------------------------------

	static UIView viewWithRect(CGRect frame) {
		final CGPoint o = frame.origin;
		final CGSize sz = frame.size;
		return UIViewFactory.viewWithRect(o.x, o.y, sz.width, sz.height);
	};

	// ---------------------------------------------------------------------
	// Configuring a View’s Visual Appearance
	// ---------------------------------------------------------------------

	@ObjectiveCName("backgroundColor")
	UIColor getBackgroundColor();

	@ObjectiveCName("setBackgroundColor:")
	void setBackgroundColor(UIColor backgroundColor);
	
	@ObjectiveCName("isHidden")
	boolean isHidden();

	@ObjectiveCName("setHidden:")
	void setHidden(boolean hidden);
	
	@ObjectiveCName("alpha")
	double getAlpha();

	@ObjectiveCName("setAlpha:")
	void setAlpha(double alpha);

	// ---------------------------------------------------------------------

	static CGRect getFrame(UIView view) {
		return UIViewFactory.getFrame(view);
	}

	static void setFrame(UIView view, CGRect frame) {
		final CGPoint o = frame.origin;
		final CGSize sz = frame.size;
		UIViewFactory.setFrame(view, o.x, o.y, sz.width, sz.height);
	}

	@ObjectiveCName("frame")
	default long getFrame() {
		return 0L;
	}

	@ObjectiveCName("addSubview:")
	default void addSubview(UIView subview) {}
}
