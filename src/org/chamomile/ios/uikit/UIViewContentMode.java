package org.chamomile.ios.uikit;

/**
 * Options to specify how a view adjusts its content when its size changes.
 * 
 * @author ggeorg
 */
public interface UIViewContentMode {
//@formatter:off
    int UIViewContentModeScaleToFill        =  0;
    int UIViewContentModeScaleAspectFit     =  1; // contents scaled to fit with fixed aspect. remainder is transparent
    int UIViewContentModeScaleAspectFill    =  2; // contents scaled to fill with fixed aspect. some portion of content may be clipped.
    int UIViewContentModeRedraw             =  3; // redraw on bounds change (calls -setNeedsDisplay)
    int UIViewContentModeCenter             =  4; // contents remain same size. positioned adjusted.
    int UIViewContentModeTop                =  5;
    int UIViewContentModeBottom             =  6;
    int UIViewContentModeLeft               =  7;
    int UIViewContentModeRight              =  8;
    int UIViewContentModeTopLeft            =  9;
    int UIViewContentModeTopRight           = 10;
    int UIViewContentModeBottomLeft         = 11;
    int UIViewContentModeBottomRight        = 12;
//@formatter:on
}
