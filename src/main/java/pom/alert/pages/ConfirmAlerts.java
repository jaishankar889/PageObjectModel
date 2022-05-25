package pom.alert.pages;

import wrappers.GenericWrappers;

public class ConfirmAlerts extends GenericWrappers{
	
	public ConfirmAlerts switchToFrame() {
		
		switchToFrameByXpath("//iframe[@id='iframeResult']");
		return this;
		
	}
	
	public ConfirmAlerts clickOnTryIt() {
		
		clickByXpath("/html/body/button");
		return this;
	}
	
	public ConfirmAlerts getText() {
		
		getAlertText();
		return this;
	}
	
	public ConfirmAlerts alertAccept() {
		
		acceptAlert();
		return this;
	}
	
	public ConfirmAlerts verifyText(String data) {
		
		verifyTextByXpath("//p[@id='demo']", data);
		return this;
		
	}
	
	public ConfirmAlerts refreshAlert() {
		refresh();
		return this;
	}
	
	public ConfirmAlerts switchToFrame1() {
		
		switchToFrameByXpath("//iframe[@id='iframeResult']");
		return this;
		
	}
	
	public ConfirmAlerts clickOnTry() {
		
		clickByXpath("/html/body/button");
		return this;
	}
	
	public ConfirmAlerts dismiss() {
		
		dismissAlert();
		return this;
	}

	public ConfirmAlerts verifyDismissText(String data) {
		
		verifyTextByXpath("//p[@id='demo']", data);
		return this;
		
	}
	
	public ConfirmAlerts switchtoMainFrame() {
		
		switchtoMainFrame();
		return this;
	}
	
	public HomePageAlerts clickOnHome() {
		
		clickByXpath("//a[@id='tryhome']");
		return new HomePageAlerts();
	}
	
	public ConfirmAlerts clickOnOk() {
		
		clickByXpath("/html/body/button");
		return this;
	}

}
