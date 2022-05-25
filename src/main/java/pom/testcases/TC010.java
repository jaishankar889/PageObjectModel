package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.SimpleAlertPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC010";
		testCaseDescription="To check simple Alert";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	public void SimpleAlert() {
		
		new SimpleAlertPage()
		.switchToFrame()
		.clickOnOk()
		.getText()
		.alertAccept()
		.mainFrame()
		.clickOnHome();	
		
	}

}
