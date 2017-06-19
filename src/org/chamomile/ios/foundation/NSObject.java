package org.chamomile.ios.foundation;

import com.google.j2objc.annotations.ObjectiveCName;

/*-[
#import <Foundation/Foundation.h>
 ]-*/

public interface NSObject {

	@ObjectiveCName("valueForKey:")
	default Object getValue(String key) {
		return null;
	}

	@ObjectiveCName("setValue:forKey:")
	default void setValue(Object value, String key) {}
}
