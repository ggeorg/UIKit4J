package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSArray;

import com.google.j2objc.annotations.ObjectiveCName;

@ObjectiveCName("UIScreen")
public class UIScreenStub implements UIScreen {

	@Override
	public NSArray<UIScreen> getScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UIScreen getMirroredScreen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CGRect getBounds() {
		// TODO Auto-generated method stub
		return UIScreen.super.getBounds();
	}

	@Override
	public double getNativeScale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getScale() {
		// TODO Auto-generated method stub
		return 0;
	}
}
