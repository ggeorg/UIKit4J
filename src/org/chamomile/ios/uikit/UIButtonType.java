package org.chamomile.ios.uikit;

/**
 * Specifies the style of a button.
 * 
 * @author ggeorg
 */
public interface UIButtonType {
//@formatter:off
    int UIButtonTypeCustom            = 0; // no button type
    int UIButtonTypeSystem            = 1; // NS_ENUM_AVAILABLE_IOS(7_0),  // standard system button

    int UIButtonTypeDetailDisclosure  = 2;
    int UIButtonTypeInfoLight         = 3;
    int UIButtonTypeInfoDark          = 4;
    int UIButtonTypeContactAdd        = 5;
    
    int UIButtonTypeRoundedRect = UIButtonTypeSystem;   // Deprecated, use UIButtonTypeSystem instead
//@formatter:on
}
