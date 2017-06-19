package org.chamomile.ios.uikit;

/**
 * These constants specify text alignment.
 * 
 * @author ggeorg
 */
public interface NSTextAlignmentLeft {
//@formatter:off
    int NSTextAlignmentLeft      = 0;    // Visually left aligned
//#if TARGET_OS_IPHONE
    int NSTextAlignmentCenter    = 1;    // Visually centered
    int NSTextAlignmentRight     = 2;    // Visually right aligned
//#else /* !TARGET_OS_IPHONE */
//    int NSTextAlignmentRight     = 1;    // Visually right aligned
//    int NSTextAlignmentCenter    = 2;    // Visually centered
//#endif
    int NSTextAlignmentJustified = 3;    // Fully-justified. The last line in a paragraph is natural-aligned.
    int NSTextAlignmentNatural   = 4;    // Indicates the default alignment for script
//@formatter:on
}
