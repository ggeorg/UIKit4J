package org.chamomile.ios.uikit;

/**
 * Options for automatic view resizing.
 * 
 * @author ggeorg
 */
public interface UIViewAutoresizing {
	//@formatter:off
    int UIViewAutoresizingNone                 = 0;
    int UIViewAutoresizingFlexibleLeftMargin   = 1 << 0;
    int UIViewAutoresizingFlexibleWidth        = 1 << 1;
    int UIViewAutoresizingFlexibleRightMargin  = 1 << 2;
    int UIViewAutoresizingFlexibleTopMargin    = 1 << 3;
    int UIViewAutoresizingFlexibleHeight       = 1 << 4;
    int UIViewAutoresizingFlexibleBottomMargin = 1 << 5;
	//@formatter:on
}
