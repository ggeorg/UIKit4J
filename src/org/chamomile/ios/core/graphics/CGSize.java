package org.chamomile.ios.core.graphics;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A structure that contains width and height values.
 * 
 * @author ggeorg
 */
public final class CGSize {
	public final double width, height;

	@ObjectiveCName("width:height:")
	public CGSize(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "CGSize [width=" + width + ", height=" + height + "]";
	}
}
