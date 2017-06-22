package org.chamomile.ios.uikit;

import com.google.j2objc.annotations.ObjectiveCName;

/**
 * Provides the infrastructure for managing the views of your UIKit app.
 * 
 * @author ggeorg
 */
public interface UIViewController extends UIResponder {
	final class UIViewControllerFactory {
		
	}

	// ---------------------------------------------------------------------
	// Managing the View
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("view")
	UIView getView();
	
	@ObjectiveCName("setView:")
	void setView(UIView view);
	
	@ObjectiveCName("loadView")
	void loadView();
	
	@ObjectiveCName("viewDidLoad")
	void viewDidLoad();
	
	@ObjectiveCName("loadViewIfNeeded")
	void loadViewIfNeeded();
	
	@ObjectiveCName("viewIfLoaded")
	UIView getViewIfLoaded();
	
	@ObjectiveCName("title")
	String getTitle();
	
	@ObjectiveCName("setTitle:")
	void setTitle(String title);
	
	// TODO preferredContentSize
	
	// ---------------------------------------------------------------------
	
	@ObjectiveCName("didReceiveMemoryWarning")
	void didReceiveMemoryWarning();
}
