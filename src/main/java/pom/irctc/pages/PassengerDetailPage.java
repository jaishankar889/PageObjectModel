package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetailPage extends GenericWrappers{
	
public PassengerDetailPage selectTitle(String data) {
	
	selectVisibileTextByXpath("//select[@name='title']", data);
	return this;
}

public PassengerDetailPage enterFirstName(String data) {
	
	enterByXpath("//input[@name='firstName']", data);
	return this;
}

public PassengerDetailPage enterLastName(String data) {
	
	enterByXpath("//input[@name='lastName']", data);
	return this;
}

public PassengerDetailPage selectCountry(String data) {

	selectVisibileTextByXpath("//select[@name='country']", data);
	return this;

}

public PassengerDetailPage selectState(String data) {

	selectVisibileTextByXpath("//select[@name='state']", data);
	return this;

}

public PassengerDetailPage selectGST(String data) {

	selectVisibileTextByXpath("//select[@name='gst']", data);
	return this;

}

public PassengerDetailPage clickOnContinue() {
	
	clickByXpath("//button[contains(text(),'Continue')]");
	return this;
}

public PassengerDetailPage verifyHotelName(String data) {
	
	verifyTextByXpath("//h5", data);
	return this;
	
}

	
public PassengerDetailPage verifyHotelPrice(String data) {
	
	verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']//strong", data);
	return this;
	
}

public PassengerDetailPage clickOnAgree() {
	
	clickByXpath("//span[@class='checkmark']");
	return this;
}

public PassengerDetailPage clickOnPayment() {
	
	clickByXpath("//button[contains(text(),'Make Payment')]");
	return this;
}

public PassengerDetailPage verifyOTP(String data) {
	
	verifyTextByXpath("//input[@name='otp']", data);
	return this;
}


public PassengerDetailPage selectGSTYes(String data) {

	selectVisibileTextByXpath("//select[@name='gst']", data);
	return this;

}

public PassengerDetailPage enterCompany(String data) {
	
	enterByXpath("//input[@name='companyName']", data);
	return this;
}

public PassengerDetailPage enterCompanyAddress(String data) {
	
	enterByXpath("//input[@name='companyAddress']", data);
	return this;
}

public PassengerDetailPage verifyGSTText(String data) {
	
	verifyTextByXpath("//input[@name='gstNumber']", data);
	return this;
}


public PassengerDetailPage waitForPageLoading(long time) {
	waitProperty(time);
	return this;
}
}
	

