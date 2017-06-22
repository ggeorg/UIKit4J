package org.chamomile.ios.uikit;

/**
 * Constants describing the state of a control.
 * 
 * @author ggeorg
 */
public interface UIControlState {
	//@formatter:off
    int UIControlStateNormal       = 0;
    int UIControlStateHighlighted  = 1 << 0;                  // used when UIControl isHighlighted is set
    int UIControlStateDisabled     = 1 << 1;
    int UIControlStateSelected     = 1 << 2;                  // flag usable by app (see below)
    // TODO int UIControlStateFocused NS_ENUM_AVAILABLE_IOS(9_0) = 1 << 3; // Applicable only when the screen supports focus
    int UIControlStateApplication  = 0x00FF0000;              // additional flags available for application use
    int UIControlStateReserved     = 0xFF000000;               // flags reserved for internal framework use
	//@formatter:off
}
