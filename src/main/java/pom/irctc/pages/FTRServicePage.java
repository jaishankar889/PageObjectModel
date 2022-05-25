package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{
	
	public NewUserSignupPage clickUserSignup(){
		clickByXpath("//a[contains(text(),'New User? Signup')]");
		return new NewUserSignupPage();
	}


public FTRServicePage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}


}
