package org.chamomile.ios.core.graphics;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A structure that contains a point in a two-dimensional coordinate system.
 * 
 * @author ggeorg
 */
public final class CGPoint {
	public final float x;
	public final float y;

	@ObjectiveCName("x:y:")
	public CGPoint(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "CGPoint [x=" + x + ", y=" + y + "]";
	}
}
