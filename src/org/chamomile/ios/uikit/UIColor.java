package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that stores color data and sometimes opacity (alpha value).
 * 
 * @author ggeorg
 */
public interface UIColor extends NSObject {
	final class UIViewFactory {
		static native UIColor withRGBA(double red, double green, double blue, double alpha) /*-[
		//@formatter:off
			return [[UIColor alloc] initWithRed:red green:green blue:blue alpha:alpha];
		//@formatter:on
		]-*/;

		static native UIColor blackColor() /*-[
		//@formatter:off
			return [UIColor blackColor];
		//@formatter:on
		]-*/;

		static native UIColor brownColor() /*-[
		//@formatter:off
			return [UIColor brownColor];
		//@formatter:on
		]-*/;

		static native UIColor clearColor() /*-[
		//@formatter:off
			return [UIColor clearColor];
		//@formatter:on
		]-*/;

		static native UIColor cyanColor() /*-[
		//@formatter:off
			return [UIColor cyanColor];
		//@formatter:on
		]-*/;

		static native UIColor darkGrayColor() /*-[
		//@formatter:off
			return [UIColor darkGrayColor];
		//@formatter:on
		]-*/;

		static native UIColor grayColor() /*-[
		//@formatter:off
			return [UIColor grayColor];
		//@formatter:on
		]-*/;

		static native UIColor greenColor() /*-[
		//@formatter:off
			return [UIColor greenColor];
		//@formatter:on
		]-*/;

		static native UIColor lightGrayColor() /*-[
		//@formatter:off
			return [UIColor lightGrayColor];
		//@formatter:on
		]-*/;

		static native UIColor magentaColor() /*-[
		//@formatter:off
			return [UIColor magentaColor];
		//@formatter:on
		]-*/;

		static native UIColor orangeColor() /*-[
		//@formatter:off
			return [UIColor orangeColor];
		//@formatter:on
		]-*/;

		static native UIColor purpleColor() /*-[
		//@formatter:off
			return [UIColor purpleColor];
		//@formatter:on
		]-*/;

		static native UIColor redColor() /*-[
		//@formatter:off
			return [UIColor redColor];
		//@formatter:on
		]-*/;

		static native UIColor whiteColor() /*-[
		//@formatter:off
			return [UIColor whiteColor];
		//@formatter:on
		]-*/;

		static native UIColor yellowColor() /*-[
		//@formatter:off
			return [UIColor yellowColor];
		//@formatter:on
		]-*/;
	}

	static UIColor withRGB(double red, double green, double blue) {
		return UIViewFactory.withRGBA(red, green, blue, 1F);
	}

	static UIColor withRGBA(double red, double green, double blue, double alpha) {
		return UIViewFactory.withRGBA(red, green, blue, alpha);
	}

	// ---------------------------------------------------------------------
	// Creating a Color Object with a Predefined Color
	// ---------------------------------------------------------------------

	static UIColor blackColor() {
		return UIViewFactory.blackColor();
	}

	static UIColor brownColor() {
		return UIViewFactory.brownColor();
	}

	static UIColor clearColor() {
		return UIViewFactory.clearColor();
	}

	static UIColor cyanColor() {
		return UIViewFactory.cyanColor();
	}

	static UIColor darkGrayColor() {
		return UIViewFactory.darkGrayColor();
	}

	static UIColor grayColor() {
		return UIViewFactory.grayColor();
	}

	static UIColor greenColor() {
		return UIViewFactory.greenColor();
	}

	static UIColor lightGrayColor() {
		return UIViewFactory.lightGrayColor();
	}

	static UIColor magentaColor() {
		return UIViewFactory.magentaColor();
	}

	static UIColor orangeColor() {
		return UIViewFactory.orangeColor();
	}

	static UIColor purpleColor() {
		return UIViewFactory.purpleColor();
	}

	static UIColor redColor() {
		return UIViewFactory.redColor();
	}

	static UIColor whiteColor() {
		return UIViewFactory.whiteColor();
	}

	static UIColor yellowColor() {
		return UIViewFactory.yellowColor();
	}
}
