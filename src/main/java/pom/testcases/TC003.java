package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.PanIndia;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify pan india user registration";
		author="Jaishankar";
		category="Smoke";
		browserName="chrome";
		url="https://panind.com/india/new_pan/";
	
	}
	
	@Test

	public void PanIndia() {
		
		new PanIndia()
		.selectFullName("MR.")
		.enterFirstName("Jai")
		.enterMiddleName("shankar")
		.enterLastName("R")
		.enterFatherFirstName("Raman")
		.enterFatherMiddleName("K")
		.enterFatherLastName("Samy")
		.enterFatherLastName("P")
		.enterMobile("9842198421")
		.enterEmail("sankarujai1234@gmail.com")
		.selectIncomeSource("Business/Profession")
		.clickOnAddress()
		.enterDateofBirth("12121991")
		.enterHomeAddress("B11")
		.enterHomeStreet("BPR Street")
		.enterHomeCity("Coimbatore")
		.selectHomeState("Tamil Nadu")
		.enterHomePincode("641025")
		.selectHomeCountry("INDIA")
		.enterOfficeName("Ugam Solutions")
		.enterOfficeAddress("C72")
		.enterOfficeStreet("35, Keeranatham, Saravanamapatty")
		.enterOfficeCity("Coimbatore")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("641035")
		.selectOfficeCountry("INDIA")
		.selectIdentityProof("Driving License (In Copy)")
		.selectAddressProof("PASSPORT (In Copy)")
		.selectDOBProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Bank statement carrying Office Address")
		.clickOnAgree()
		;
		}
		
}
