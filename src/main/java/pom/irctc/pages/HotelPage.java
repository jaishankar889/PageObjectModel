package pom.irctc.pages;

public class HotelPage extends HomePage{
	
public HotelPage switchControlToLastWindow() {
		
		switchToLastWindow();
		return this;
	}

	
	public GuestLoginPage clickOnLogin() {
		
		
		clickByXpath("//a[contains(text(),'Login')]");
		return new GuestLoginPage();
		
	}
	public HotelPage enterHotel(String data) {
		
		enterByXpath("//input[@id='filterText']", data);
		waitProperty(2000);
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[3]");
		return this;

	}
	
	public HotelPage clickOnStartDate() {
		
		clickByXpath("//input[@name='dt12']");
		waitProperty(5000);
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[5]/span");
		return this;

		
	}
	
	public HotelPage clickOnEndDate() {
		
		clickByXpath("//input[@name='dt13']");
		waitProperty(5000);
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[2]/span");
		waitProperty(3000);
		return this;

		
	}
	
	public HotelPage clickOnRoomGuest() {
		
		clickByXpath("//*[@id='user-data-wrapper-id']");
		waitProperty(3000);
		return this;

		
	}
	
	public HotelPage selectRoom(String data) {
		
		selectVisibileTextByXpath("//select[@name='hotelRoom']", data);
		waitProperty(3000);
		return this;

	}
	
	public HotelPage selectGuest(String data) {
		
		selectVisibileTextByXpath("//select[@name='hotelAdult']", data);
		waitProperty(3000);
		return this;

	}
	
	public HotelPage selectChild(String data) {
		
		selectVisibileTextByXpath("//select[@name='hotelChild']", data);
		waitProperty(3000);
		return this;

	}
	
	public HotelPage clickOnDone() {
		
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");
		waitProperty(3000);
		return this;

	
	}
	
	public HotelNamesPage clickFindHotel() {
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button/i");
		return new HotelNamesPage();
	}
		public HotelPage waitForPageLoading(long time) {
			waitProperty(time);
			return this;

	}
	
}