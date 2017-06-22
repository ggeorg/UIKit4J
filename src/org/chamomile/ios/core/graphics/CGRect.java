package org.chamomile.ios.core.graphics;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A structure that contains the location and dimensions of a rectangle.
 * 
 * @author ggeorg
 */
public final class CGRect {
	public final CGPoint origin;
	public final CGSize size;
	
	@ObjectiveCName("x:y:width:height:")
	public CGRect(double x, double y, double width, double height) {
		this.origin = new CGPoint(x, y);
		this.size = new CGSize(width, height);
	}

	@Override
	public String toString() {
		return "CGRect [origin=" + origin + ", size=" + size + "]";
	}
}
