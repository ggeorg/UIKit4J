package org.chamomile.ios;

import org.chamomile.ios.uikit.UIButton;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UIView;

public final class Showcase {

	public static UIButton createButton(int buttonType) {
		final UIButton btn = UIButton.buttonWithType(buttonType);
		btn.setTitle("Click me!!!", 0);
		return btn;
	}
	
	public static void addSubview(UIView view, UIButton button) {
		view.addSubview(button);
		
		view.setBackgroundColor(UIColor.withRGB(1F, 1F, .5F));
		
		System.out.println("frame:"+view.getValue("frame"));
		view.setValue(view.getValue("frame"), "frame");
	}
}
