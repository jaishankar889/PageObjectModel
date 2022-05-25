package pom.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.ConfirmAlerts;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC011";
		testCaseDescription="To check confirm Alert";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
public void confirmAlert() {
		
		new ConfirmAlerts()
		.switchToFrame()
		.clickOnTryIt()
		.getText()
		.alertAccept()
		.verifyText("You pressed OK!")
		.refreshAlert()
		.switchToFrame1()
		.clickOnTry()
		.dismiss()
		.verifyDismissText("You pressed Cancel!")
		.switchtoMainFrame()
		.clickOnHome();
		
	}

}