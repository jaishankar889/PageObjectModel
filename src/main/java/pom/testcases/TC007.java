package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="To book a coach";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	
	public void OtpValidation() {
		
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
		.enterEmail("sankar1234@gmail.com")
		.enterMobile("9842198421")
		.clickOnLoginButton()
		.switchControlToLastWindow()
		.enterHotel("chennai")
		.waitForPageLoading(2000)
		.clickOnStartDate()
		.clickOnEndDate()
		.clickOnRoomGuest()
		.selectRoom("1")
		.selectGuest("2")
		.selectChild("0")
		.clickOnDone()
		
		.clickFindHotel()
		.switchControlToLastWindow()
		
		.clickOnHotel()
		.getHotelName()
		.getPrice()
		.clickOnContinueToBook()
		.selectTitle("Mr")
		.enterFirstName("Jai")
		.enterLastName("Raman")
		.selectState("TAMIL NADU")
		.selectGST("No")
		.clickOnContinue()
		.verifyHotelName("Hotel S R M Central Park @ Near Chennai Central Railway Station")
		.waitForPageLoading(2000)
		.verifyHotelPrice("2000")
		.clickOnAgree()
		.clickOnPayment()
		.verifyOTP("otp is required");
		
		
	}

}
