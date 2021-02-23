package com.comcast.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.commonutils.WebDriverUTils;

public class CreateNewLead extends WebDriverUTils{
	
		WebDriver driver;
		public CreateNewLead(WebDriver driver) { 
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(name = "salutationtype")
		private WebElement salutationTypeLst;
		
		@FindBy(name = "firstname")
		private WebElement firstNameEdt;
		
		@FindBy(name = "lastname")
		private WebElement lastNameEdt;
		
		@FindBy(name = "company")
		private WebElement companyNameEdt;
		
		@FindBy(name = "industry")
		private WebElement industriesLst;
		
		@FindBy(name="email")private WebElement emailEdt;
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;
		
		public WebElement getemailEdt() {
			return emailEdt;
		}
		
		public WebElement getSalutationTypeLst() {
			return salutationTypeLst;
		}
		public WebElement getfirstNameEdt() {
			return firstNameEdt;
		}
		public WebElement getlastNameEdt() {
			return lastNameEdt;
		}
		public WebElement getcompanyNameEdt() {
			return companyNameEdt;
		}

		public WebElement getIndustriesLst() {
			return industriesLst;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		

			
		
		/**
		 * used create Lead with below parameter
		 * @param email 
		 * @param Salutation type Name
		 * @param firstname
		 * @param lastname
		 * @param companyname
		 * @param indsutry
		 
		 */
			
		

		public void Leads(String salutation, String firstName, String lastName, String company, String industry, String email) {
			select(salutationTypeLst, salutation);
			firstNameEdt.sendKeys(firstName);
			lastNameEdt.sendKeys(lastName);
			companyNameEdt.sendKeys(company);
			select(industriesLst,industry);
			emailEdt.sendKeys(email);
			saveBtn.click();
		}
		
	}


