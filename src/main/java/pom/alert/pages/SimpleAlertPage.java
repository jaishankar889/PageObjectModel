package pom.alert.pages;

import wrappers.GenericWrappers;

public class SimpleAlertPage extends GenericWrappers{
	
	public SimpleAlertPage switchToFrame() {
		
		switchToFrameByXpath("//iframe[@id='iframeResult']");
		return this;
		
	}
	
	public SimpleAlertPage getText() {
		
		getAlertText();
		return this;
	}
	
	public SimpleAlertPage alertAccept() {
		
		acceptAlert();
		return this;
	}

	public SimpleAlertPage mainFrame() {
		
		switchToMainFrame();
		return this;
	}
	
	public SimpleAlertPage clickOnOk() {
		
		clickByXpath("/html/body/button");
		return this;
	}
	
	public HomePageAlerts clickOnHome() {
		
		clickByXpath("//a[@id='tryhome']");
		return new HomePageAlerts();
	}
}
