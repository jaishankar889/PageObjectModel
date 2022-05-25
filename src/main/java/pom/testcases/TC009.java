package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.IndianFrroHomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC009";
		testCaseDescription="To signup as new user in IndianFrro";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
	
	@Test
	
	public void FormC() {
		
		new IndianFrroHomePage()
		.clickOnRegister()
		.waitForPageLoading(3000)
		.enterUserId("Jaisha123")
		.enterPassword("Password123")
		.enterConfirmPassword("Password123")
		.selectSecurityQuestion("What is your favorite author?")
		.enterAnswer("RajeshKumar")
		.enterName("Jaishankar")
		.selectGender("Male")
		.enterDateOfBirth("12/10/1991")
		.enterDegination("IT Professional")
		.enterEmail("shankar1234@gmail.com")
		.enterMobile("9842198421")
		.enterPhone("04222402409")
		.selectNationality("INDIA")
		.enterGuestName("Raj")
		.enterCapacity("50")
		.enterAddress("C10 Bharahiyar street")
		.selectGuestState("TAMIL NADU")
		.waitForPageLoading(3000)
		.selectGuestCity("2D")
		.waitForPageLoading(3000)
		.selectAccomodationType("Hotel")
		.selectAccomodationGrade("Five Star")
		.enterGuestMail("shankar123@gmail.com")
		.enterGuestMobile("9842198421")
		.enterGuestPhone("04222402400")
		.enterGuestName1("Shankar")
		.enterGuestAddress1("12 Ranga street")
		.selectGuestState1("TAMIL NADU")
		.waitForPageLoading(4000)
		.selectGuestCity1("13D")
		.waitForPageLoading(4000)
		.enterGuestEmail1("shankar121@gmail.com")
		.enterGuestPhone1("04221231230")
		.enterGuestMobile1("9842199900")
		.clickOnAdd()
		.waitForPageLoading(5000)
		.enterGuestName2("Mani")
		.enterGuestAddress2("34 Rajan street")
		.selectGuestState2("TAMIL NADU")
		.waitForPageLoading(3000)
		.selectGuestCity2("2D")
		.waitForPageLoading(3000)
		.enterGuestEmail2("mani1234@gmail.com")
		.enterGuestPhone2("04222122120")
		.enterGuestMobile2("9003903577")
		.clickOnAdd1()
		.waitForPageLoading(5000)
		.enterGuestName3("Salu")
		.enterGuestAddress3("98 VOC street")
		.selectGuestState3("TAMIL NADU")
		.selectGuestCity3("2D")
		.enterGuestEmail3("salu1234@gmail.com")
		.enterGuestPhone3("04222342341")
		.enterGuestMobile3("9869861234")
		.clickOnAdd2();	
	}

}
