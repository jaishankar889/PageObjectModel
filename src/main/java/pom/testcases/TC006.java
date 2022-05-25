package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC006";
		testCaseDescription="To book a coach";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	
	public void SaloonMandatoryCheck() {
		
		new CovidAlertPage()
		.clickonOK()
		.mouseHoverOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.switchControlToLastWindow()
		.clickOnSideMenu()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterName("Jaishankar")
		.enterOrganisation("Amazon")
		.enterAddress("C11 Bharathiyar street")
		.enterMobile("9842198421")
		.enterEmail("sankar123@gmail.com")
		.selectRequest("Saloon Charter")
		.enterOriginStation("Coimbatore")
		.enterDestStation("Chennai")
		.clickOnDeparturedate()
		.clickOnDArrivalDate()
		.enterDuration("10")
		.enterNumberOfCoaches("5")
		.enterPassengerCount("100")
		.enterPurpose("Industrial Seminar")
		.enterAdditonalServies("Food and Guide");
	}

}
