package pom.php.pages;

import wrappers.GenericWrappers;


public class PhpHomePage extends GenericWrappers{
	
	public PhpHomePage enterFirstName(String data) {
		
		enterByXpath("//input[@id='inputFirstName']", data);
		return this;
	}
	
public PhpHomePage enterLastName(String data) {
		
		enterByXpath("//input[@id='inputLastName']", data);
		return this;
	}

public PhpHomePage enterEmail(String data) {
	
	enterByXpath("//input[@id='inputEmail']", data);
	return this;
}

public PhpHomePage enterPhoneNumber(String data) {
	
	enterByXpath("//input[@id='inputPhone']", data);
	return this;
}
	
	public PhpHomePage enterCompanyName(String data) {
		
		enterByXpath("//input[@id='inputCompanyName']", data);
		return this;
	}

 public PhpHomePage enterAddress(String data) {
		
		enterByXpath("//input[@id='inputAddress1']", data);
		return this;
	}
 
 public PhpHomePage enterAddress1(String data) {
		
		enterByXpath("//input[@id='inputAddress2']", data);
		return this;
	}
	
 public PhpHomePage enterCity(String data) {
		
		enterByXpath("//input[@id='inputCity']", data);
		return this;
	}
 
 public PhpHomePage enterState(String data) {
		
		enterByXpath("//input[@id='stateinput']", data);
		return this;
	}
 
 public PhpHomePage enterPostcode(String data) {
		
		enterByXpath("//input[@id='inputPostcode']", data);
		return this;
	}
 
 public PhpHomePage enterMobile(String data) {
		
		enterByXpath("//input[@id='customfield2']", data);
		return this;
	}
 
 public PhpHomePage enterPassword(String data) {
		
		enterByXpath("//input[@id='inputNewPassword1']", data);
		return this;
	}
 
 public PhpHomePage enterConfirmPassword(String data) {
		
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return this;
	}
 
 public PhpHomePage clickRegister() {
		
		clickByXpath("//input[@class='btn btn-large btn-primary btn-recaptcha']");
		return this;

	}
	
	
}