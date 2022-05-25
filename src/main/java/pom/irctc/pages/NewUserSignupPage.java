package pom.irctc.pages;

import wrappers.GenericWrappers;

public class NewUserSignupPage extends GenericWrappers{

	public NewUserSignupPage enterUserId(String data) {
		enterByXpath("//input[@id='userId']", data);
        return this;
		
	}
	public NewUserSignupPage enterPassword(String data) {
		enterByXpath("//input[@id='password']", data);
        return this;
		
	}
	
	public NewUserSignupPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='cnfPassword']", data);
        return this;
		
	}
	
	public NewUserSignupPage clickSecurityQuestion() {
		clickByXpath("//select[@id='secQstn']");
		return this;
	}	
	
	public NewUserSignupPage clickSecurityQuestion1() {
		clickByXpath("(//select[@id='secQstn']//option)[2]");
		return this;
	}	
	
	public NewUserSignupPage enterSecurityAnswer(String data) {
		enterByXpath("//input[@name='secAnswer']", data);
        return this;
	}	
	
	public NewUserSignupPage enterDateOfBirth(String data) {
		enterByXpath("//input[@id='dateOfBirth']", data);
        return this;
	}	
	public NewUserSignupPage clickOnDateOfBirth() {
		
		clickByXpath("//a[contains(text(),'18')]");
		return this;
	}
	
	public NewUserSignupPage clickGender() {
		clickByXpath("//input[@id='gender0']");
		return this;
	}	
	
	public NewUserSignupPage clickMarritalStatus() {
		clickByXpath("//input[@id='maritalStatus1']");
		return this;
	}	
	
	public NewUserSignupPage enterEmail(String data) {
		enterByXpath("//input[@id='email']", data);
        return this;
	}
	
	public NewUserSignupPage clickOccupation() {
		clickByXpath("//select[@id='occupation']");
		return this;
	}
	
	public NewUserSignupPage selectOccupation1(String data) {
		selectVisibileTextByXpath("//select[@id='occupation']", data);
		return this;
	}
	
	public NewUserSignupPage enterFirstName(String data) {
		enterByXpath("//input[@id='fname']", data);
        return this;
		
	}
	
	public NewUserSignupPage enterMiddleName(String data) {
		enterByXpath("//input[@id='mname']", data);
        return this;
		
	}
	public NewUserSignupPage enterLastName(String data) {
		enterByXpath("//input[@id='lname']", data);
        return this;
		
	}
    public NewUserSignupPage selectNationality(String data) {
		
		selectVisibileTextByXpath("//select[@id='natinality']", data);
		return this;
	}

    public NewUserSignupPage enterFlatno(String data) {
		
		enterByXpath("//input[@id='flatNo']", data);
		return this;
	}

public NewUserSignupPage enterStreet(String data) {
		
		enterByXpath("//input[@id='street']", data);
		return this;
	}
	
	public NewUserSignupPage enterLocality(String data) {
		
		enterByXpath("//input[@id='area']", data);
		return this;
	}
	
	public NewUserSignupPage selectCountry(String data) {
		
		selectVisibileTextByXpath("//select[@id='country']", data);
		return this;
	}
	
	public NewUserSignupPage enterMobile(String data) {
		
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public NewUserSignupPage enterPinCode(String data) {
		
		enterByXpath("//input[@id='pincode']", data);
		return this;
	}
	
	public NewUserSignupPage selectCity(String data) {
		
		selectVisibileTextByXpath("//select[@id='city']", data);
		return this;
	}
	
	public NewUserSignupPage selectState(String data) {
		
		selectVisibileTextByXpath("//select[@id='state']", data);
		return this;
	}
	
	public NewUserSignupPage selectPostOffice(String data) {
		
		selectVisibileTextByXpath("//select[@id='postOffice']", data);
		return this;
	}
	
	public NewUserSignupPage clickOnAddress1() {
		
		clickByXpath("//*[@id='sameAddresses1']");
		return this;
	}
	
	public NewUserSignupPage enterOfficeFlatno(String data) {
		
		enterByXpath("//input[@id='flatNoOffice']", data);
		return this;
	}
	
	public NewUserSignupPage enterOfficeStreet(String data) {
		
		enterByXpath("//input[@id='streetOffice']", data);
		return this;
	}
	
	public NewUserSignupPage enterOfficeLocality(String data) {
		
		enterByXpath("//input[@id='areaOffice']", data);
		return this;
	}
	
	public NewUserSignupPage selectOfficeCountry(String data) {
		
		selectVisibileTextByXpath("//select[@id='countryOffice']", data);
		return this;
	}
	
	public NewUserSignupPage enterOfficeMobile(String data) {
		
		enterByXpath("//input[@id='mobileOffice']", data);
		return this;
	}
	
	public NewUserSignupPage enterOfficePinCode(String data) {
		
		enterByXpath("//input[@id='pincodeOffice']", data);
		return this;
	}
	
	public NewUserSignupPage selectOfficeCity(String data) {
		
		selectVisibileTextByXpath("//select[@id='cityOffice']", data);
		return this;
	}
	
	public NewUserSignupPage selectOfficeState(String data) {
		
		selectVisibileTextByXpath("//select[@id='stateOffice']", data);
		return this;
	}
	
	public NewUserSignupPage selectOfficePostOffice(String data) {
		
		selectVisibileTextByXpath("//select[@id='postOfficeOffice']", data);
		return this;
	}
	
public NewUserSignupPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}

public NewUserSignupPage waitForPageLoading(long time) {
	
	waitProperty(time);
	return this;
}

public NewUserSignupPage pageDown() {
	
	PAGEDOWNByXpath("//html/body");
	return this;
}

}

