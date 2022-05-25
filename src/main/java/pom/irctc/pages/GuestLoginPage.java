package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers{
	
public GuestLoginPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public GuestLoginPage clickOnGuestLogin() {
		
		clickByXpath("//a[@id='profile-tab']");
		return this;
	}
	
	public GuestLoginPage enterEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		return this;
		
	}
	
	public GuestLoginPage enterMobile(String data) {
		
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
		
	}
	
	public HotelPage clickOnLoginButton(){
		
		clickByXpath("(//button[@type='submit'])[2]");
		return new HotelPage();
	}
	
	public GuestLoginPage waitForPageLoading(long time) {
		
		waitProperty(time);
		return this;
	}

}
