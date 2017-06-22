package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

public interface UIEvent extends NSObject {

	@ObjectiveCName("timestamp")
	/* NSTimeInterval */double getTimestamp();
}
