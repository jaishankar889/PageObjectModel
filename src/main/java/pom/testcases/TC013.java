package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookAccount;
import wrappers.ProjectWrappers;

public class TC013 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify facebook sign up for the new user registration";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC001";
	
	}
	
	@Test(dataProvider="fetchData")
	public void facebookAccount(String firstname, String lastname, String emailID, String confirmemailID, String password, String birthday, String birthmonth, String birthyear) {
		
		new FacebookAccount()
		.clickonCreate()
		.enterFirstName(firstname)
		.enterSurtName(lastname)
		.enterEmail(emailID)
		.enterEmail1(confirmemailID)
		.enterPassword(password)
		.selectDate(birthday)
		.selectMonth(birthmonth)
		.selectYear(birthyear)
		.clickGender()
		;
	}

}
