package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookAccount extends GenericWrappers {
	
	
	public FacebookAccount waitForPageLaodn(long time) {
		waitProperty(time);
		return this;
	}
	
	public FacebookAccount clickonCreate() {
		
		clickByXpath(prop.getProperty("FacebookAccount.CreateNewAccount.XPath"));
		return this;
	}
	
	public FacebookAccount enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("FacebookAccount.FirstName.XPath"), data);
		return this;
	}

	public FacebookAccount enterSurtName(String data) {
		
		enterByXpath(prop.getProperty("FacebookAccount.LastName.XPath"), data);
		return this;
	}
	
	public FacebookAccount enterEmail(String data) {
		
		enterByXpath(prop.getProperty("FacebookAccount.Email.XPath"), data);
		return this;
	}
	
	public FacebookAccount enterEmail1(String data) {
		enterByXpath(prop.getProperty("FacebookAccount.Email1.XPath"), data);
		return this;
	}
	
	public FacebookAccount enterPassword(String data) {
		
		enterByXpath(prop.getProperty("FacebookAccount.Password.XPath"), data);
		return this;
	}
	
	public FacebookAccount selectDate(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookAccount.Date.XPath"), data);
		return this;
	}
	
	public FacebookAccount selectMonth(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookAccount.Month.XPath"), data);
		return this;
	}
	
	public FacebookAccount selectYear(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookAccount.Year.XPath"), data);
		return this;
	}
	
     public FacebookAccount clickGender() {
		
		clickByXpath(prop.getProperty("FacebookAccount.Gender.Click"));
		return this;
	}

}

