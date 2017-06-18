package org.chamomile.ios;

import org.chamomile.ios.uikit.UIButton;
import org.chamomile.ios.uikit.UIView;

public final class Showcase {

	public static UIButton createButton(int buttonType) {
		final UIButton btn = UIButton.buttonWithType(buttonType);
		btn.setTitle("Click me!!!", 0);
		return btn;
	}
	
	public static void addSubview(UIView view, UIButton button) {
		view.addSubview(button);
		
		System.out.println("frame:"+view.getValue("frame"));
		view.setValue(view.getValue("frame"), "frame");
	}
}
