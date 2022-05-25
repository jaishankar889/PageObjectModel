package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC008";
		testCaseDescription="To book a coach";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	
public void GstValidation() {
		
		new CovidAlertPage()
		.clickonOK()
		.mouseHoverOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.switchControlToLastWindow()
		.clickOnHotel()
		.switchControlToLastWindow()
		.clickOnLogin()
		.clickOnGuestLogin()
		.enterEmail("shankar1234@gmail.com")
		.enterMobile("9842198421")
		.clickOnLoginButton()
		.switchControlToLastWindow()
		.enterHotel("chennai")
		.clickOnStartDate()
		.clickOnEndDate()
		.clickOnRoomGuest()
		.selectRoom("1")
		.selectGuest("3")
		.selectChild("0")
		.clickOnDone()
		.clickFindHotel()
		.clickOnHotel()
		.switchControlToLastWindow()
		.getHotelName()
		.getPrice()
		.clickOnContinueToBook()
		.selectTitle("Mr")
		.enterFirstName("Perumal")
		.enterLastName("Chinnappan")
		.selectState("TAMIL NADU")
		.waitForPageLoading(2000)
		.selectGST("Yes")
		.enterCompany("Amazon")
		.enterCompanyAddress("OMR Street")
		.verifyGSTText("gstNumber is required.");
		
		
	}

}
