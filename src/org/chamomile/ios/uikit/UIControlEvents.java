package org.chamomile.ios.uikit;

public interface UIControlEvents {
	//@formatter:off
	int UIControlEventTouchDown                                         = 1 <<  0;      // on all touch downs
    int UIControlEventTouchDownRepeat                                   = 1 <<  1;      // on multiple touchdowns (tap count > 1)
    int UIControlEventTouchDragInside                                   = 1 <<  2;
    int UIControlEventTouchDragOutside                                  = 1 <<  3;
    int UIControlEventTouchDragEnter                                    = 1 <<  4;
    int UIControlEventTouchDragExit                                     = 1 <<  5;
    int UIControlEventTouchUpInside                                     = 1 <<  6;
    int UIControlEventTouchUpOutside                                    = 1 <<  7;
    int UIControlEventTouchCancel                                       = 1 <<  8;

    int UIControlEventValueChanged                                      = 1 << 12;     // sliders, etc.
    //UIControlEventPrimaryActionTriggered NS_ENUM_AVAILABLE_IOS(9_0) = 1 << 13,     // semantic action: for buttons, etc.

    int UIControlEventEditingDidBegin                                   = 1 << 16;     // UITextField
    int UIControlEventEditingChanged                                    = 1 << 17;
    int UIControlEventEditingDidEnd                                     = 1 << 18;
    int UIControlEventEditingDidEndOnExit                               = 1 << 19;     // 'return key' ending editing

    int UIControlEventAllTouchEvents                                    = 0x00000FFF;  // for touch events
    int UIControlEventAllEditingEvents                                  = 0x000F0000;  // for UITextField
    int UIControlEventApplicationReserved                               = 0x0F000000;  // range available for application use
    int UIControlEventSystemReserved                                    = 0xF0000000;  // range reserved for internal framework use
    int UIControlEventAllEvents                                         = 0xFFFFFFFF;
    //@formatter:on
}
