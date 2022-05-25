package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PhpForm;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify php travels new user registration";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/";
	
	}
	
	@Test
public void PhpTravelsRegister() {
		
		new PhpForm()
		.clickOnRegister()
		.enterFirstName("shankar")
		.enterLastName("dada")
		.enterEmail("shankar1234@gmail.com")
		.enterPhoneNumber("9876543210")
		.enterCompanyName("Ugam Solutions")
		.enterAddress("1st Street, Jalaludheen Mosque Road")
		.enterAddress1("Murree")
		.enterCity("Rawalpindi")
		.enterState("Islamabad")
		.enterPostcode("246762")
		.enterMobile("9842198421")
		.enterPassword("Poiu@123")
		.enterConfirmPassword("Poiu@123")
		.clickRegister()
		;
	}
}


