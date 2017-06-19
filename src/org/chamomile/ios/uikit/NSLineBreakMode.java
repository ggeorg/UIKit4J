package org.chamomile.ios.uikit;

/**
 * Constants that specify what happens when a line is too long for its
 * container.
 * 
 * @author ggeorg
 */
public interface NSLineBreakMode {
//@formatter:off
    int NSLineBreakByWordWrapping     = 0;	// Wrap at word boundaries, default
    int NSLineBreakByCharWrapping     = 1;	// Wrap at character boundaries
    int NSLineBreakByClipping         = 2;	// Simply clip
    int NSLineBreakByTruncatingHead   = 3;	// Truncate at head of line: "...wxyz"
    int NSLineBreakByTruncatingTail   = 4;	// Truncate at tail of line: "abcd..."
    int NSLineBreakByTruncatingMiddle = 5;	// Truncate middle of line:  "ab...yz"
//@formatter:on
}
