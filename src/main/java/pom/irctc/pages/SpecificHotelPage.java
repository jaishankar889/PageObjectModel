package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SpecificHotelPage extends GenericWrappers{
	
public SpecificHotelPage getHotelName() {
		
		getTextByXpath("//h5");
		return this;
		
	}
	
	public SpecificHotelPage getPrice() {
		
		getTextByXpath("//div[@class='standard-price mt-2']//strong");
		return this;
	}
	
	public PassengerDetailPage clickOnContinueToBook() {
		
		clickByXpath("//b[contains(text(),'Continue to Book')]");
		return new PassengerDetailPage();
	}
	
	public SpecificHotelPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}
}
