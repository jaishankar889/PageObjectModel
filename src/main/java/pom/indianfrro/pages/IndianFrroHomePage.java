package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianFrroHomePage extends GenericWrappers{
	
	public IndianFrroRegisterPage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'Sign Up (Registration)')]");
		return new IndianFrroRegisterPage();
	}
}
