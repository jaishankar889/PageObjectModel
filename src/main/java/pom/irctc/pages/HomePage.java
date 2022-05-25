package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public RegistrationPage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'REGISTER')]");
		return new RegistrationPage();
		
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath("//a[contains(text(),'HOLIDAYS')]");
		return this;
	}
	

	public HomePage clickOnStays() {
		
		clickByXpath("//a//span[contains(text(),'Stays')]");
		return this;
	}
	
	public AccomodationPage clickOnLounge() {
		
		clickByXpath("//span[contains(text(),'Lounge')]");
		return new AccomodationPage();
	}

	public HotelPage clickOnHotels() {
		
		clickByXpath("(//div[@class='Nav-icons IRCTCHotels']//parent::a//@href)[1]");
		return new HotelPage();
	}
}
