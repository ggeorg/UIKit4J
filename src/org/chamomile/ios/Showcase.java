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

		view.setBackgroundColor(UIColor.withRGB(.5, .5, .5));
		System.out.println(view.getBackgroundColor());

		System.out.println("hidden:" + view.isHidden());
		view.setHidden(false);
		
		System.out.println("alpha:" + view.getValue("alpha"));
		System.out.println("alpha:" + view.getAlpha());
		view.setAlpha(1);
		
		view.setClearsContextBeforeDrawing(true);
		System.out.println(view.isClearsContextBeforeDrawing());
		
		button.setTintColor(UIColor.cyanColor());
		button.setClipsToBounds(true);

		System.out.println("frame:" + view.getValue("frame"));
		view.setValue(view.getValue("frame"), "frame");
		
		System.out.println(button.getSuperview());
		System.out.println("buttonType: " + button.getButtonType());
	}
}
