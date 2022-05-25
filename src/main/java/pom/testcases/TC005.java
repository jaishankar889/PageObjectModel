package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC005";
		testCaseDescription="To book a coach";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void BookYourCoach() {
		
		new CovidAlertPage()
		.clickonOK()
		.mouseHoverOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.switchControlToLastWindow()
		.clickOnSideMenu()
		.clickOnBookYourCoach()
		.switchControlToLastWindow()
		.clickUserSignup()
		.switchControlToLastWindow()
		.enterUserId("jai1234")
		.enterPassword("Password@123")
		.enterConfirmPassword("Password@123")
		.clickSecurityQuestion()
		.clickSecurityQuestion1()
		.enterSecurityAnswer("ranju")
		.enterDateOfBirth("18/12/1991")
		.clickOnDateOfBirth()
		.clickGender()
		.clickMarritalStatus()
		.enterEmail("jai1234@gmail.com")
		.clickOccupation()
		.selectOccupation1("Professional")
		.enterFirstName("Jai")
		.enterMiddleName("Shankar")
		.enterLastName("Raman")
		.selectNationality("Indian")
		.enterFlatno("C230")
		.enterStreet("Bharathiyar street")
		.enterLocality("Edayarpalayam")
		.selectCountry("India")
		.enterMobile("9842198421")
		.enterPinCode("641025")
		.waitForPageLoading(2000)
		.pageDown()
		.selectCity("Coimbatore")
		.selectState("TAMIL NADU")
		.selectPostOffice("Velandipalayam S.O")
		.clickOnAddress1()
		.enterOfficeFlatno("B11")
		.enterOfficeStreet("Keernatham Village")
		.enterOfficeLocality("Saravanampatty")
		.selectOfficeCountry("India")
		.enterOfficeMobile("9003190031")
		.enterOfficePinCode("641035")
		.pageDown()
		.selectOfficeCity("Coimbatore")
		.selectOfficeState("TAMIL NADU")
		.selectOfficePostOffice("Keeranatham B.O");
	}

}