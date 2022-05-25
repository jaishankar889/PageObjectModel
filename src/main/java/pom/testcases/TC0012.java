package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.PromptAlertPage;
import wrappers.ProjectWrappers;

public class TC0012 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC0012";
		testCaseDescription="To check prompt Alert";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	
public void PromptAlerts() {
	
		
		new PromptAlertPage()
		.switchToFrame()
		.clickOnTryIt()
		.enterData("Raj")
		.getText()
		.accept()
		.verifyAcceptText("Hello Raj! How are you today?")
		.refreshAlert()
		.switchToFrame1()
		.clickOnTry()
		.dismiss()
		.verifyDismissText("User cancelled the prompt.");		
	}

}