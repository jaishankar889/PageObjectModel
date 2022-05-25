package pom.alert.pages;

import wrappers.GenericWrappers;

public class PromptAlertPage extends GenericWrappers{
	
	public PromptAlertPage switchToFrame() {
		
		switchToFrameByXpath("//iframe[@id='iframeResult']");
		return this;
		
	}
	
	public PromptAlertPage clickOnTryIt() {
		
		clickByXpath("/html/body/button");
		return this;
	}
	
	public PromptAlertPage enterData(String data) {
		
		alertsByswitchtoAlert(data);
		return this;
	}
	
	public PromptAlertPage getText() {
		
		getAlertText();
		return this;
	}

	public PromptAlertPage accept() {
		
		acceptAlert();
		return this;
		

	}

	public PromptAlertPage verifyAcceptText(String data) {
		verifyTextByXpath("//p[@id='demo']", data);
		return this;
		
	}
	

	public PromptAlertPage refreshAlert() {
		refresh();
		return this;
	}
	
	public PromptAlertPage switchToFrame1() {
		
		switchToFrameByXpath("//iframe[@id='iframeResult']");
		return this;
		
	}
	
	public PromptAlertPage clickOnTry() {
		
		clickByXpath("/html/body/button");
		return this;
	}

	public PromptAlertPage dismiss() {
		
		dismissAlert();
		
		return this;
		
	}

	public PromptAlertPage verifyDismissText(String data) {
		
		verifyTextByXpath("//p[@id='demo']", data);
		return this;
		
	}

	
	public PromptAlertPage switchtoMainFrame() {
		
		switchtoMainFrame();
		return this;
	}
	
	public HomePageAlerts clickOnHome() {
		
		clickByXpath("//a[@id='tryhome']");
		return new HomePageAlerts();
	}

}
