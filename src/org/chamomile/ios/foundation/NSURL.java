package org.chamomile.ios.foundation;

/**
 * An object that represents the location of a resource, such as an item on a
 * remote server or the path to a local file.
 * 
 * @author ggeorg
 */
public interface NSURL extends NSObject {
	final class NSURLFactory {
		static native NSURL URLWithString(String URLString) /*-[
			return (id<OrgChamomileIosFoundationNSURL>)[NSURL URLWithString:URLString];
		]-*/;
	}

	static NSURL URLWithString(String URLString) {
		return NSURLFactory.URLWithString(URLString);
	}
}
