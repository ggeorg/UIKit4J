package org.chamomile.ios.core.graphics;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An affine transformation matrix for use in drawing 2D graphics.
 * 
 * @author ggeorg
 */
public final class CGAffineTransform {
	public final double a, b, c, d;
	public final double tx, ty;

	@ObjectiveCName("a:b:c:d:tx:ty:")
	public CGAffineTransform(double a, double b, double c, double d, double tx, double ty) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tx = tx;
		this.ty = ty;
	}

	@Override
	public String toString() {
		return "CGAffineTransform [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", tx=" + tx + ", ty=" + ty + "]";
	}

	// ---------------------------------------------------------------------

	/**
	 * Returns an affine transformation matrix constructed from a rotation value
	 * you provide.
	 * 
	 * @param angle
	 *            The angle, in radians, by which this matrix rotates the
	 *            coordinate system axes (In iOS, a positive value specifies
	 *            counterclockwise rotation and a negative value specifies
	 *            clockwise rotation).
	 * @return a new affine transformation matrix.
	 */
	public static native CGAffineTransform makeRotation(double angle) /*-[
	//@formatter:off
		CGAffineTransform transform = CGAffineTransformMakeRotation((CGFloat)angle);
		double a  = (double)transform.a;
		double b  = (double)transform.b;
		double c  = (double)transform.c;
		double d  = (double)transform.d;
		double tx = (double)transform.tx;
		double ty = (double)transform.ty;
		return [[OrgChamomileIosCoreGraphicsCGAffineTransform alloc] a:a b:b c:c d:d tx:tx ty:ty];
	//@formatter:on
	]-*/;

	/**
	 * Returns an affine transformation matrix constructed from translation
	 * values you provide.
	 * 
	 * @param tx
	 *            The value by which to move the x-axis of the coordinate
	 *            system.
	 * @param ty
	 *            The value by which to move the y-axis of the coordinate
	 *            system.
	 * @return a new affine transformation matrix.
	 */
	public static native CGAffineTransform makeTranslation(double tx, double ty) /*-[
	//@formatter:off
		CGAffineTransform transform = CGAffineTransformMakeTranslation((CGFloat)tx, (CGFloat)ty);
		double a   = (double)transform.a;
		double b   = (double)transform.b;
		double c   = (double)transform.c;
		double d   = (double)transform.d;
		double _tx = (double)transform.tx;
		double _ty = (double)transform.ty;
		return [[OrgChamomileIosCoreGraphicsCGAffineTransform alloc] a:a b:b c:c d:d tx:_tx ty:_ty];
	//@formatter:on
	]-*/;

	/**
	 * Returns an affine transformation matrix constructed from scaling values
	 * you provide.
	 * 
	 * @param sx
	 *            The factor by which to scale the x-axis of the coordinate
	 *            system.
	 * @param sy
	 *            The factor by which to scale the y-axis of the coordinate
	 *            system.
	 * @return a new affine transformation matrix.
	 */
	public static native CGAffineTransform makeScale(double sx, double sy) /*-[
	//@formatter:off
		CGAffineTransform transform = CGAffineTransformMakeScale((CGFloat)sx, (CGFloat)sy);
		double a  = (double)transform.a;
		double b  = (double)transform.b;
		double c  = (double)transform.c;
		double d  = (double)transform.d;
		double tx = (double)transform.tx;
		double ty = (double)transform.ty;
		return [[OrgChamomileIosCoreGraphicsCGAffineTransform alloc] a:a b:b c:c d:d tx:tx ty:ty];
	//@formatter:on
	]-*/;

}
