package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers{
	
public AccomodationPage clickOnSideMenu() {
		
		clickByXpath("//a[@id='sidebarCollapse']");
		return this;
	}
	
	public CharterPage clickOnCharter() {
		
		clickByXpath("//a[contains(text(),'Charter')]");
		return new CharterPage();

	}
	
	public FTRServicePage clickOnBookYourCoach() {
		
		clickByXpath("//a[contains(text(),'Book Your Coach/Train')]");
		return new FTRServicePage();
	}
	
	public HotelPage clickOnHotel() {
		
		clickByXpath("//span[contains(text(),'Hotels')]");
		return new HotelPage();

	}
	
	public AccomodationPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}
	

}