package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

public interface UIView {

	@ObjectiveCName("addSubview:")
	default void addSubview(UIView subview) {}
}
