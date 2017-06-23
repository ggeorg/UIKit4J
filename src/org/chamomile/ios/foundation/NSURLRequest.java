package org.chamomile.ios.foundation;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A URL load request that is independent of protocol or URL scheme.
 * 
 * @author ggeorg
 */
public interface NSURLRequest extends NSObject {
	final class NSURLRequestFactory {
		static native NSURLRequest requestWithURL(NSURL URL) /*-[
		//@formatter:off
			return (id<OrgChamomileIosFoundationNSURLRequest>)[NSURLRequest requestWithURL:(NSURL *)URL];
		//@formatter:on
		]-*/;
	}
	
	@ObjectiveCName("requestWithURL:")
	static NSURLRequest requestWithURL(NSURL URL) {
		return NSURLRequestFactory.requestWithURL(URL);
	}
}
