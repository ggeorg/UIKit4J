package org.chamomile.ios.core.graphics;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A structure that contains a point in a two-dimensional coordinate system.
 * 
 * @author ggeorg
 */
public final class CGPoint {
	public final double x, y;

	@ObjectiveCName("x:y:")
	public CGPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "CGPoint [x=" + x + ", y=" + y + "]";
	}
}
