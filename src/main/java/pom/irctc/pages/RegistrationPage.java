package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath("//input[@id='userName']", data);
        return this;
		
	}
		public RegistrationPage enterUserPwd(String data) {
			enterByXpath("//input[@id='usrPwd']",data);
			return this;
			
		}
		
		
		public RegistrationPage enterConfirmPwd(String data) {
			enterByXpath("//input[@id='cnfUsrPwd']",data);
			return this;
			
		}
		
		public RegistrationPage clickLanguage() {
			clickByXpath("//span[contains(text(),'Preferred Language')]");
		return this;
	}
		public RegistrationPage clickPreferredLanguage1() {
			clickByXpath("//span[contains(text(),'English')]");
			return this;
		}
		
		public RegistrationPage clickSecurityQuestion() {
			clickByXpath("//span[contains(text(),'Security Question')]");
			return this;
		}	
		
		public RegistrationPage clickSecurityQuestion1() {
			clickByXpath("//span[contains(text(),'What is your pet name?')]");
			return this;
		}	
		public RegistrationPage enterSecurityAnswer(String data) {
			enterByXpath("//input[@formcontrolname='secAns']", data);
			return this;
		}	
		
		public RegistrationPage clickContinue() {
			clickByXpath("//button[@label='Continue']");
			
			return this;
		}
		public RegistrationPage enterFirstName(String data) {
			enterByXpath("//input[@id='firstName']",data);
			return this;
		}
		
		
		public RegistrationPage enterSecondName(String data) {
			enterByXpath("//input[@id='middleName']",data);
			return this;
		}
		
		public RegistrationPage enterLastName(String data) {
			enterByXpath("//input[@id='lastname']",data);
			return this;
		}
		
		public RegistrationPage selectOccupation() {
			
			clickByXpath("//span[contains(text(),'Select Occupation')]");
			return this;
		}

        public RegistrationPage selectOccupation1() {
			
        	clickByXpath("//span[contains(text(),'PRIVATE')]");
			return this;
		}
		
			
		public RegistrationPage enterDOB(String data) {
			enterByXpath("//input[@placeholder='Date Of Birth']",data);
			return this;
			
		}
		public RegistrationPage clickOnDateOfBirth() {
			
			clickByXpath("//a[contains(text(),'12')]");
			return this;
		}

      
		public RegistrationPage waitForPageLoading(long time) {
			
			waitProperty(time);
			return this;
		}
		
   	public RegistrationPage clickOnMarritalStatus() {
   		
   		clickByXpath("(//p-radiobutton[@name='martitalS'])[2]");
   		return this;
   	}
   	
   	public RegistrationPage selectCountry(String data) {
   		
   		selectVisibileTextByXpath("//select[@formcontrolname='resCountry']", data);
   		return this;
   	}
   	
   	
public RegistrationPage selectGender() {
		
		clickByXpath("//div[@aria-label='Male']");
		return this;
	}

   	
   	public RegistrationPage enterEmailId(String data) {
   		
   		enterByXpath("//input[@id='email']", data);
   		return this;
   	}
   	
public RegistrationPage pageDown() {
		
		PAGEDOWNByXpath("//html/body");
		return this;
	}
   	
   	public RegistrationPage enterPhoneNumber(String data) {
   		
   		enterByXpath("//input[@id='mobile']", data);
   		return this;
   	}
   	
   	public RegistrationPage clickOnContinueAgain() {
   		
   		clickByXpath("//button[@label='Continue']");
   		return this;
   	}
   	
   	public RegistrationPage enterFlatNum(String data) {
   		
   		enterByXpath("//input[@id='resAddress1']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterStreet(String data) {
   		
   		enterByXpath("//input[@id='resAddress2']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterLocality(String data) {
   		
   		enterByXpath("//input[@id='resAddress3']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterPincode(String data) {
   		
   		enterByXpath("//input[@name='resPinCode']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterState(String data) {
   		
   		enterByXpath("//input[@id='resState']", data);
   		return this;
   	}
   	
   
   		
   		public RegistrationPage selectCity(String data) {

   			selectVisibileTextByXpath("//select[@formcontrolname='resCity']", data);
   	   		return this;
   	}
   	
   	public RegistrationPage selectPostOffice(String data) {

   		selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", data);
   		return this;
   		
   	}
   	
   	public RegistrationPage enterPhoneNo(String data) {
   		
   		enterByXpath("//input[@id='resPhone']", data);
   		return this;
   	}
   	
   	public RegistrationPage selectAddress(String data) {

   		clickByXpath("//p-radiobutton[@value='N']");
   		return this;
   		
   	}public RegistrationPage enterOfficeFlatNum(String data) {
   		
   		enterByXpath("//input[@id='offAddress1']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterOfficeStreet(String data) {
   		
   		enterByXpath("//input[@id='offAddress2']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterOfficeLocality(String data) {
   		
   		enterByXpath("//input[@id='offAddress3']", data);
   		return this;
   	}
   	
  
   		
  
   	
   	public RegistrationPage enterOfficePincode(String data) {
   		
   		enterByXpath("//input[@id='offPinCode']", data);
   		return this;
   	}
   	
   	public RegistrationPage enterOfficeState(String data) {
   		
   		enterByXpath("//input[@id='offState']", data);
   		return this;
   	}
   	
   	public RegistrationPage selectOfficeCity(String data) {

   		selectVisibileTextByXpath("//select[@formcontrolname='offCity']", data);
   		return this;
   		
   	}
   	
   	public RegistrationPage selectOfficePostOffice(String data) {

   		selectVisibileTextByXpath("//select[@formcontrolname='offPostOff']", data);
   		return this;
   		
   	}
   	
   	public RegistrationPage enterOfficePhoneNumber(String data) {
   		
   		enterByXpath("//input[@id='offPhone']", data);
   		return this;
   	}
   	
public RegistrationPage clickOnAgreement() {
		
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
	}

   	


}
