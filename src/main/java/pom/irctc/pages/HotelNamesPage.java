package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelNamesPage extends GenericWrappers{
	
public HotelNamesPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public SpecificHotelPage clickOnHotel() {
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]");
		return new SpecificHotelPage();
	}

}
