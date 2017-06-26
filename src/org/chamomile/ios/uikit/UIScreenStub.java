package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;

import com.google.j2objc.annotations.ObjectiveCName;

@ObjectiveCName("UIScreen")
public class UIScreenStub extends UIControlStub implements UIScreen {

	@Override
	public CGRect getBounds() {
		// TODO Auto-generated method stub
		return UIScreen.super.getBounds();
	}

}
