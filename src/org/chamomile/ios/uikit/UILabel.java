package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSAttributedString;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * A view that displays one or more lines of read-only text, often used in
 * conjunction with controls to describe their intended purpose.
 * 
 * @author ggeorg
 */
public interface UILabel extends UIView, NSTextAlignmentLeft, NSLineBreakMode {
	final class UIViewFactory {

	}

	// ---------------------------------------------------------------------
	// Accessing the Text Attributes
	// ---------------------------------------------------------------------

	@ObjectiveCName("text")
	String getText();

	@ObjectiveCName("setText:")
	void setText(String title);

	@ObjectiveCName("attributedText")
	NSAttributedString getAttributedText();

	@ObjectiveCName("setAttributedText:")
	void setAttributedText(NSAttributedString attributedText);

	@ObjectiveCName("font")
	UIFont getFont();

	@ObjectiveCName("setFont:")
	void setFont(UIFont font);

	@ObjectiveCName("textColor")
	UIColor getTextColor();

	@ObjectiveCName("setTextColor:")
	void setTextColor(UIColor textColor);

	@ObjectiveCName("textAlignment")
	/* NSTextAlignment */int getTextAlignment();

	@ObjectiveCName("setTextAlignment:")
	void setTextAlignment(/* NSTextAlignment */int textAlignment);

	@ObjectiveCName("lineBreakMode")
	/* NSLineBreakMode */int getLineBreakMode();

	@ObjectiveCName("setLineBreakMode:")
	void setLineBreakMode(/* NSLineBreakMode */int textAlignment);

	@ObjectiveCName("isEnabled")
	boolean isEnabled();

	@ObjectiveCName("setEnabled:")
	void setEnabled(boolean enabled);

	// ---------------------------------------------------------------------
	// Sizing the Label’s Text
	// ---------------------------------------------------------------------

	@ObjectiveCName("adjustsFontSizeToFitWidth")
	boolean adjustsFontSizeToFitWidth();

	@ObjectiveCName("setAdjustsFontSizeToFitWidth:")
	void setAdjustsFontSizeToFitWidth(boolean adjustsFontSizeToFitWidth);

	@ObjectiveCName("allowsDefaultTighteningForTruncation")
	boolean allowsDefaultTighteningForTruncation();

	@ObjectiveCName("setAllowsDefaultTighteningForTruncation:")
	void setAllowsDefaultTighteningForTruncation(boolean allowsDefaultTighteningForTruncation);
	
	// TODO baselineAdjustment
}
