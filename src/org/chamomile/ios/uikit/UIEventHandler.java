package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

public interface UIEventHandler<T extends UIControl> {
	@ObjectiveCName("onEvent:event:")
	public abstract void onEvent(T sender, UIEvent event);
}
