package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath("//a[@id='enquiry-tab']");
		return this;
	}
	
	public CharterPage enterName(String data) {
		
		enterByXpath("//input[@name='name']", data);
		return this;
	}
	
	public CharterPage enterOrganisation(String data) {
		
		enterByXpath("//input[@name='organization']", data);
		return this;
	}
	
	public CharterPage enterAddress(String data) {
		
		enterByXpath("//input[@name='address']", data);
		return this;
	}
	
	public CharterPage enterMobile(String data) {
		
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}
	
	public CharterPage enterEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public CharterPage selectRequest(String data) {
		
		selectVisibileTextByXpath("//select[@name='requestFor']", data);
		return this;
	}
	
	public CharterPage enterOriginStation(String data) {
		
		enterByXpath("//input[@name='originStation']", data);
		return this;
	}
	
	public CharterPage enterDestStation(String data) {
		
		enterByXpath("//input[@name='destnStation']", data);
		return this;
	}
	
	public CharterPage clickOnDeparturedate() {
		
		clickByXpath("//input[@name='checkInDate']");
		clickByXpath("//span[contains(text(),'27')]");
		return this;
	}
	
	public CharterPage clickOnDArrivalDate() {
		
		clickByXpath("//input[@name='checkOutDate']");
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[1]/span");
		return this;
	}
	
	public CharterPage enterDuration(String data) {
		
		enterByXpath("//input[@name='durationPeriod']", data);
		return this;
	}
	
	public CharterPage enterNumberOfCoaches(String data) {
		
		enterByXpath("//input[@name='coachDetails']", data);
		return this;
	}
	
	public CharterPage enterPassengerCount(String data) {
		
		enterByXpath("//input[@name='numPassenger']", data);
		return this;
	}
	
	public CharterPage enterPurpose(String data) {
		
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return this;
	}
	
	public CharterPage enterAdditonalServies(String data) {
		
		enterByXpath("//textarea[@name='services']", data);
		return this;
	}
	
	public CharterPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public CharterPage pageDown() {
		
		PAGEDOWNByXpath("//html/body");
		return this;
	}
	
	public CharterPage waitForPageLoading(long time) {
		waitProperty(time);
		return this;
	}
}