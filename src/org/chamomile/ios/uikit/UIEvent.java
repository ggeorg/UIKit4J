package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * An object that describes a single user interaction with your app.
 * 
 * @author ggeorg
 */
public interface UIEvent extends NSObject {

	@ObjectiveCName("timestamp")
	/* NSTimeInterval */double getTimestamp();
}
