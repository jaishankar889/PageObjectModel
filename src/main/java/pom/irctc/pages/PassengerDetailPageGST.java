package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetailPageGST extends GenericWrappers{
	
	public PassengerDetailPageGST selectTitle(String data) {
		
		selectVisibileTextByXpath("//select[@name='title']", data);
		return this;
	}
	
	public PassengerDetailPageGST enterFirstName(String data) {
		
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}
	
	public PassengerDetailPageGST enterLastName(String data) {
		
		enterByXpath("//input[@name='lastName']", data);
		return this;
	}
	
	public PassengerDetailPageGST selectCountry(String data) {
	
		selectVisibileTextByXpath("//select[@name='country']", data);
		return this;
	
	}
	
	public PassengerDetailPageGST selectState(String data) {
	
		selectVisibileTextByXpath("//select[@name='state']", data);
		return this;
	
	}
	
	public PassengerDetailPageGST selectGST(String data) {
	
		selectVisibileTextByXpath("//select[@name='gst']", data);
		return this;
	
	}
	
	public PassengerDetailPageGST clickOnContinue() {
		
		clickByXpath("//button[contains(text(),'Continue')]");
		return this;
	}
	
	public PassengerDetailPageGST verifyHotelName(String data) {
		
		verifyTextByXpath("//h5", data);
		return this;
		
	}

	public PassengerDetailPageGST verifyHotelPrice(String data) {
		
		verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']//strong", data);
		return this;
		
	}
	
	public PassengerDetailPageGST clickOnAgree() {
		
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public PassengerDetailPageGST clickOnPayment() {
		
		clickByXpath("//button[contains(text(),'Make Payment')]");
		return this;
	}

	public PassengerDetailPageGST verifyOTP(String data) {
		
		verifyTextByXpath("//input[@name='otp']", data);
		return this;
	}
	
	
	public PassengerDetailPageGST selectGSTYes(String data) {
	
		selectVisibileTextByXpath("//select[@name='gst']", data);
		return this;
	
	}
	
	public PassengerDetailPageGST enterCompany(String data) {
		
		enterByXpath("//input[@name='companyName']", data);
		return this;
	}
	
	public PassengerDetailPageGST enterCompanyAddress(String data) {
		
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
	}
	
	public PassengerDetailPageGST verifyGSTText(String data) {
		
		verifyTextByXpath("//input[@name='gstNumber']", data);
		return this;
	}
	
}