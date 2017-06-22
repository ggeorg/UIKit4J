package org.chamomile.ios.foundation;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A static ordered collection of objects.
 * 
 * @author ggeorg
 */
public interface NSArray<T> extends NSObject {

	// ---------------------------------------------------------------------
	// Querying an Array
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("count")
	/* NSUInteger */long getCount();
}
