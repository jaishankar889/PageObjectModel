package pom.panindia;

import wrappers.GenericWrappers;

public class PanIndia extends GenericWrappers{
	
	public PanIndia selectFullName(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_title']", data);
		return this;
	}
	
	public PanIndia enterFirstName(String data) {
		
		enterByXpath("//input[@id='pan_firstname']", data);
		return this;
	
	}
	
	public PanIndia enterMiddleName(String data) {
		
		enterByXpath("//input[@id='pan_middlename']", data);
		return this;
	
	}
	
	public PanIndia enterLastName(String data) {
		
		enterByXpath("//input[@id='pan_lastname']", data);
		return this;
	
	}
	
	public PanIndia enterFatherFirstName(String data) {
		
		enterByXpath("//input[@id='pan_fatherfirstname']", data);
		return this;
	
	}
	
	public PanIndia enterFatherMiddleName(String data) {
		
		enterByXpath("//input[@id='pan_fathermiddlename']", data);
		return this;
	
	}
	
	public PanIndia enterFatherLastName(String data) {
		
		enterByXpath("//input[@id='pan_fatherlastname']", data);
		return this;
	
	}
	
	public PanIndia enterMobile(String data) {
		
		enterByXpath("//input[@id='pan_mobilenumber']", data);
		return this;
	
	}
	
	public PanIndia enterEmail(String data) {
		
		enterByXpath("//input[@id='pan_email']", data);
		return this;
	
	}
	
	public PanIndia selectIncomeSource(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_sourceofincome']", data);
		return this;
	}
	
	public PanIndia clickOnAddress() {
		
		clickByXpath("//input[@id='office']");
		return this;
	}
	
	public PanIndia enterDateofBirth(String data) {
		
		enterByXpath("//input[@id='pan_dob']", data);
		return this;
	
	}
	
	public PanIndia enterHomeAddress(String data) {
		
		enterByXpath("//input[@id='pan_addressline1']", data);
		return this;
	
	}
	
	public PanIndia enterHomeStreet(String data) {
		
		enterByXpath("//input[@id='pan_addressline2']", data);
		return this;
	
	}
	
	public PanIndia enterHomeCity(String data) {
		
		enterByXpath("//input[@id='pan_cityname']", data);
		return this;
	
	}
	
	public PanIndia selectHomeState(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_state']", data);
		return this;
	}
	
	public PanIndia enterHomePincode(String data) {
		
		enterByXpath("//input[@id='pan_pincode']", data);
		return this;
	
	}
	
	public PanIndia selectHomeCountry(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_country']", data);
		return this;
	}
	
	public PanIndia enterOfficeName(String data) {
		
		enterByXpath("//input[@id='pan_officename']", data);
		return this;
	
	}
	
	public PanIndia enterOfficeAddress(String data) {
		
		enterByXpath("//input[@id='pan_officeaddressline1']", data);
		return this;
	
	}
	
	public PanIndia enterOfficeStreet(String data) {
		
		enterByXpath("//input[@id='pan_officeaddressline2']", data);
		return this;
	
	}
	
	public PanIndia enterOfficeCity(String data) {
		
		enterByXpath("//input[@id='pan_officecityname']", data);
		return this;
	
	}
	
	public PanIndia selectOfficeState(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_officestate']", data);
		return this;
	}
	
	public PanIndia enterOfficePincode(String data) {
		
		enterByXpath("//input[@id='pan_officepincode']", data);
		return this;
	
	}
	
	public PanIndia selectOfficeCountry(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_officecountry']", data);
		return this;
	}

	
	public PanIndia selectIdentityProof(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_identityproof']", data);
		return this;
	}

	
	public PanIndia selectAddressProof(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_addressproof']", data);
		return this;
	}

	
	public PanIndia selectDOBProof(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_DOBproof']", data);
		return this;
	}

	
	public PanIndia selectAadhaarProof(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']", data);
		return this;
	}

	
	public PanIndia selectOfficeAddressProof(String data) {
		
		selectVisibileTextByXpath("//select[@id='pan_officeaddressproof']", data);
		return this;
	}
	
	public PanIndia clickOnAgree() {
		
		clickByXpath("//input[@id='pan_source']");
		return this;
	}

}
