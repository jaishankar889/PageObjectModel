package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianFrroRegisterPage extends GenericWrappers{
	
	public IndianFrroRegisterPage enterUserId(String data) {
		
		enterByXpath("//input[@id='u_id']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterPassword(String data) {
		
		enterByXpath("//input[@id='u_pwd']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterConfirmPassword(String data) {
		
		enterByXpath("//input[@id='u_repwd']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectSecurityQuestion(String data) {
		
		selectVisibileTextByXpath("//select[@id='u_secques']", data);
		return this;
	}

	public IndianFrroRegisterPage enterAnswer(String data) {
		
		enterByXpath("//input[@id='u_secans']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterName(String data) {
		
		enterByXpath("//input[@id='u_name']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGender(String data) {
		
		selectVisibileTextByXpath("//select[@id='u_gender']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterDateOfBirth(String data) {
		
		enterByXpath("//input[@id='u_dob']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterDegination(String data) {
		
		enterByXpath("//input[@id='u_designation']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterEmail(String data) {
		
		enterByXpath("//input[@id='u_emailid']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterMobile(String data) {
		
		enterByXpath("//input[@id='u_mobile']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterPhone(String data) {
		
		enterByXpath("//input[@id='u_phone']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectNationality(String data) {
		
		selectVisibileTextByXpath("//select[@id='u_nationality']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterGuestName(String data) {
		
		enterByXpath("//input[@id='name']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterCapacity(String data) {
		
		enterByXpath("//input[@id='capacity']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterAddress(String data) {
		
		enterByXpath("//textarea[@id='address']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestState(String data) {
		
		selectVisibileTextByXpath("//select[@id='state']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestCity(String data) {
		
		selectValueByXpath("//select[@name='city_distr']", data);
		waitProperty(3000);
		return this;
	}
	
	public IndianFrroRegisterPage selectAccomodationType(String data) {
		
		selectVisibileTextByXpath("//select[@id='acco_type']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectAccomodationGrade(String data) {
		
		selectVisibileTextByXpath("//select[@id='star_rat']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterGuestMail(String data) {
		
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterGuestMobile(String data) {
		
		enterByXpath("//input[@id='mcontact']", data);
		return this;
	}
	
	public IndianFrroRegisterPage enterGuestPhone(String data) {
		
		enterByXpath("//input[@id='contact']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestName1(String data) {
		
		enterByXpath("//input[@name='name_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestAddress1(String data) {
		
		enterByXpath("//input[@name='address_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestState1(String data) {
		
		selectVisibileTextByXpath("//select[@id='state_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestCity1(String data) {
		
		selectValueByXpath("//select[@name='citydistr_o']", data);
		waitProperty(3000);
		return this;
	}

	public IndianFrroRegisterPage enterGuestEmail1(String data) {
		
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestPhone1(String data) {
		
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestMobile1(String data) {
		
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
	}

	public IndianFrroRegisterPage clickOnAdd() {
		
		clickByXpath("//input[@name='add']");
		return this;
	}


	public IndianFrroRegisterPage enterGuestName2(String data) {
		
		enterByXpath("//input[@name='name_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestAddress2(String data) {
		
		enterByXpath("//input[@name='address_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestState2(String data) {
		
		selectVisibileTextByXpath("//select[@id='state_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestCity2(String data) {
		
		selectValueByXpath("//select[@id='citydistr_o']", data);
		waitProperty(3000);
		return this;
	}

	public IndianFrroRegisterPage enterGuestEmail2(String data) {
		
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestPhone2(String data) {
		
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestMobile2(String data) {
		
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
	}

	public IndianFrroRegisterPage clickOnAdd1() {
		
		clickByXpath("//input[@name='add']");
		return this;
	}


	public IndianFrroRegisterPage enterGuestName3(String data) {
		
		enterByXpath("//input[@name='name_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestAddress3(String data) {
		
		enterByXpath("//input[@name='address_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestState3(String data) {
		
		selectVisibileTextByXpath("//select[@id='state_o']", data);
		return this;
	}
	
	public IndianFrroRegisterPage selectGuestCity3(String data) {
		
		selectValueByXpath("//select[@id='citydistr_o']", data);
		waitProperty(3000);
		return this;
	}

	public IndianFrroRegisterPage enterGuestEmail3(String data) {
		
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestPhone3(String data) {
		
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
	}

	public IndianFrroRegisterPage enterGuestMobile3(String data) {
		
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
	}

	public IndianFrroRegisterPage clickOnAdd2() {
		
		clickByXpath("//input[@name='add']");
		return this;
	}

	
	public IndianFrroRegisterPage waitForPageLoading(long time) {
		waitProperty(time);
		return this;
	}
	
}
