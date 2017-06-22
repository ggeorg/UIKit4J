package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGAffineTransform;
import org.chamomile.ios.core.graphics.CGPoint;
import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.core.graphics.CGSize;
import org.chamomile.ios.foundation.NSArray;

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
public interface UIView extends UIResponder, UIViewAutoresizing, UIViewContentMode {
	final class UIViewFactory {
		static native UIView viewWithRect(double x, double y, double width, double height) /*-[
		//@formatter:off
			return (id<OrgChamomileIosUikitUIView>) [(UIView *)[OrgChamomileIosUikitUIView alloc] 
				initWithFrame:CGRectMake(x, y, width, height)];
		//@formatter:on
		]-*/;

		static native CGRect getFrame(UIView view) /*-[
		//@formatter:off
			CGRect frame = [(UIView *)view frame];
			double x      = (double)frame.origin.x;
			double y      = (double)frame.origin.y;
			double width  = (double)frame.size.width;
			double height = (double)frame.size.height;
			return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
		//@formatter:on
		]-*/;

		static native void setFrame(UIView view, double x, double y, double width, double height) /*-[
		//@formatter:off
			[(UIView *)view setFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;

		static native CGRect getBounds(UIView view) /*-[
		//@formatter:off
			CGRect bounds = [(UIView *)view bounds];
			double x      = (double)bounds.origin.x;
			double y      = (double)bounds.origin.y;
			double width  = (double)bounds.size.width;
			double height = (double)bounds.size.height;
			return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
		//@formatter:on
		]-*/;

		static native void setBounds(UIView view, double x, double y, double width, double height) /*-[
		//@formatter:off
			[(UIView *)view setBounds:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
		//@formatter:on
		]-*/;

		static native CGPoint getCenter(UIView view) /*-[
		//@formatter:off
			CGPoint center = [(UIView *)view center];
			double x = (double)center.x;
			double y = (double)center.y;
			return [[OrgChamomileIosCoreGraphicsCGPoint alloc] x:x y:y];
		//@formatter:on
		]-*/;

		static native void setCenter(UIView view, double x, double y) /*-[
		//@formatter:off
			[(UIView *)view setCenter:CGPointMake((CGFloat)x, (CGFloat)y)];
		//@formatter:on
		]-*/;

		static native CGAffineTransform getTransform(UIView view) /*-[
		//@formatter:off
			CGAffineTransform transform = [(UIView *)view transform];
			double a  = (double)transform.a;
			double b  = (double)transform.b;
			double c  = (double)transform.c;
			double d  = (double)transform.d;
			double tx = (double)transform.tx;
			double ty = (double)transform.ty;
			return [[OrgChamomileIosCoreGraphicsCGAffineTransform alloc] a:a b:b c:c d:d tx:tx ty:ty];
		//@formatter:on
		]-*/;

		static native void setTransform(UIView view, double a, double b, double c, double d, double tx, double ty) /*-[
		//@formatter:off
			[(UIView *)view setTransform:CGAffineTransformMake((CGFloat)a, (CGFloat)b, (CGFloat)c, (CGFloat)d, (CGFloat)tx, (CGFloat)ty)];
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

	@ObjectiveCName("isOpaque")
	boolean isOpaque();

	@ObjectiveCName("setOpaque:")
	void setOpaque(boolean opaque);

	@ObjectiveCName("tintColor")
	UIColor getTintColor();

	@ObjectiveCName("setTintColor:")
	void setTintColor(UIColor tintColor);

	@ObjectiveCName("tintAdjustmentMode")
	/* UIViewTintAdjustmentMode */int getTintAdjustmentMode();
	
	@ObjectiveCName("setTintAdjustmentMode:")
	void setTintAdjustmentMode(/* UIViewTintAdjustmentMode */int tintAdjustmentMode);

	@ObjectiveCName("clipsToBounds")
	boolean isClipsToBounds();

	@ObjectiveCName("setClipsToBounds:")
	void setClipsToBounds(boolean clipsToBounds);

	@ObjectiveCName("clearsContextBeforeDrawing")
	boolean isClearsContextBeforeDrawing();

	@ObjectiveCName("setClearsContextBeforeDrawing:")
	void setClearsContextBeforeDrawing(boolean clearsContextBeforeDrawing);

	@ObjectiveCName("maskView")
	UIView getMaskView();

	@ObjectiveCName("setMaskView:")
	void setMaskView(UIView maskView);

	// TODO layerClass

	// TODO layer

	// ---------------------------------------------------------------------
	// Configuring the Event-Related Behavior
	// ---------------------------------------------------------------------

	@ObjectiveCName("isUserInteractionEnabled")
	boolean isUserInteractionEnabled();

	@ObjectiveCName("setUserInteractionEnabled:")
	void setUserInteractionEnabled(boolean userInteractionEnabled);

	@ObjectiveCName("isMultipleTouchEnabled")
	boolean isMultipleTouchEnabled();

	@ObjectiveCName("setMultipleTouchEnabled:")
	void setMultipleTouchEnabled(boolean multipleTouchEnabled);

	@ObjectiveCName("isExclusiveTouch")
	boolean isExclusiveTouch();

	@ObjectiveCName("setExclusiveTouch:")
	void setExclusiveTouch(boolean exclusiveTouch);

	// ---------------------------------------------------------------------
	// Configuring the Bounds and Frame Rectangles
	// ---------------------------------------------------------------------

	@ObjectiveCName("java_getFrame")
	default CGRect getFrame() {
		return UIViewFactory.getFrame(this);
	}

	@ObjectiveCName("java_setFrame:")
	default void setFrame(CGRect frame) {
		UIViewFactory.setFrame(this, frame.origin.x, frame.origin.y,
				frame.size.width, frame.size.height);
	}

	@ObjectiveCName("java_getBounds")
	default CGRect getBounds() {
		return UIViewFactory.getBounds(this);
	}

	@ObjectiveCName("java_setBounds:")
	default void setBounds(CGRect frame) {
		UIViewFactory.setBounds(this, frame.origin.x, frame.origin.y,
				frame.size.width, frame.size.height);
	}

	@ObjectiveCName("java_getCenter")
	default CGPoint getCenter() {
		return UIViewFactory.getCenter(this);
	}

	@ObjectiveCName("java_setCenter:")
	default void setCenter(CGPoint center) {
		UIViewFactory.setCenter(this, center.x, center.y);
	}

	@ObjectiveCName("java_getTransform")
	default CGAffineTransform getTransform() {
		return UIViewFactory.getTransform(this);
	}

	@ObjectiveCName("java_setTransform:")
	default void setTransform(CGAffineTransform transform) {
		UIViewFactory.setTransform(this, transform.a, transform.b, transform.c, transform.d,
				transform.tx, transform.ty);
	}

	// ---------------------------------------------------------------------
	// Managing the View Hierarchy
	// ---------------------------------------------------------------------

	@ObjectiveCName("superview")
	UIView getSuperview();

	@ObjectiveCName("subviews")
	NSArray<UIView> getSubviews();

	@ObjectiveCName("window")
	UIWindow getWindow();

	@ObjectiveCName("addSubview:")
	void addSubview(UIView view);

	@ObjectiveCName("bringSubviewToFront:")
	void bringSubviewToFront(UIView view);

	@ObjectiveCName("sendSubviewToBack:")
	void sendSubviewToBack(UIView view);

	@ObjectiveCName("removeFromSuperview")
	void removeFromSuperview();

	@ObjectiveCName("insertSubview:atIndex:")
	void insertSubview(UIView view, int index);

	@ObjectiveCName("insertSubview:aboveSubview:")
	void insertAboveSubview(UIView view, UIView siblingSubview);

	@ObjectiveCName("insertSubview:belowSubview:")
	void insertBelowSubview(UIView view, UIView siblingSubview);

	@ObjectiveCName("exchangeSubviewAtIndex:withSubviewAtIndex:")
	void exchangeSubviews(int index1, int index2);

	@ObjectiveCName("isDescendantOfView:")
	void isDescendantOfView(UIView view);

	// ---------------------------------------------------------------------
	// Configuring the Resizing Behavior
	// ---------------------------------------------------------------------

	@ObjectiveCName("autoresizingMask")
	/* UIViewAutoresizing */int getAutoresizingMask();
	
	@ObjectiveCName("setAutoresizingMask:")
	void setAutoresizingMask(/* UIViewAutoresizing */int autoresizingMask);

	@ObjectiveCName("autoresizesSubviews")
	boolean autoresizesSubviews();

	@ObjectiveCName("setAutoresizesSubviews:")
	void setAutoresizesSubviews(boolean autoresizesSubviews);

	@ObjectiveCName("contentMode")
	/* UIViewContentMode */int getContentMode();
	
	@ObjectiveCName("setContentMode:")
	void setContentMode(/* UIViewContentMode */int contentMode);
	
	// TODO sizeThatFits:
	
	@ObjectiveCName("sizeToFit")
	void sizeToFit();
}
