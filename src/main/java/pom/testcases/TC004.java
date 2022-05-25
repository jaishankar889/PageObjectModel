package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify IRCTC user registration";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	
	}
	
	@Test
	
	public void IrctcRegistration() {
		
		new CovidAlertPage()
		.clickonOK()
		.clickOnRegister()
		.enterUserName("Jaishankar132")
		.enterUserPwd("Secret123")
		.enterConfirmPwd("Secret123")
		.clickLanguage()
		.clickPreferredLanguage1()
		.clickSecurityQuestion()
		.clickSecurityQuestion1()
		.enterSecurityAnswer("Jerry")
		.clickContinue()
		.enterFirstName("Jai")
		.enterSecondName("Shankar")
		.enterLastName("Raman")
		.selectOccupation()
		.selectOccupation1()
		
		.enterDOB("12-10-1991")
		.clickOnDateOfBirth()
		.clickOnMarritalStatus()
		.selectCountry("India")
		.selectGender()
		.enterEmailId("sankar123@gmail.com")
		.enterPhoneNumber("9842198421")
		.selectCountry("India")
		.clickOnContinueAgain()
		.enterFlatNum("B11")
		.enterStreet("Bharathiyar Street")
		.enterLocality("Edayarpalayam")
		.enterPincode("641025")
		.enterState("Tamil Nadu")
		.selectCity("Coimbatore")
		.selectPostOffice("Velandipalayam S.O")
		.enterPhoneNo("9842198123")
		.selectAddress("N")
		.enterOfficeFlatNum("C123")
		.enterOfficeStreet("Saravanampatty")
		.enterOfficeLocality("Coimbatore")
		.enterOfficePincode("641035")
		.enterOfficeState("Tamil Nadu")
		.selectOfficeCity("Coimbatore")
		.selectOfficePostOffice("Keeranatham B.O")
		.enterOfficePhoneNumber("9889881234")
		;
		
	}
		
		

}
