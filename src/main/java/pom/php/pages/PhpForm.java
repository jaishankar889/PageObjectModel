package pom.php.pages;

import wrappers.GenericWrappers;

public class PhpForm extends GenericWrappers{
	
	public PhpHomePage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'Create account')]");
		return new PhpHomePage();

	}

}