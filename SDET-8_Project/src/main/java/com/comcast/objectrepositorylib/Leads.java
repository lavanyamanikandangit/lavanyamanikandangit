package com.comcast.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.commonutils.WebDriverUTils;



public class Leads extends WebDriverUTils {


	public Leads(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@alt='Create Lead...']")private WebElement createLeadImg;
		
	@FindBy(name="search_text")private WebElement leadNameEdt;
	
	@FindBy(name="submit")private WebElement searchNow;
	
	@FindBy(name="search_field")private WebElement DDownlst;
	
	@FindBy(name="sales_stage")private WebElement SalesStagelst;
		
	@FindBy(xpath= "//div/table/tbody/tr[3]/td[4]/a")private WebElement sellnkbt;
	
	@FindBy(xpath="//a[text()='Convert Lead']")private WebElement convertLeadlnk;
	
	@FindBy(id="jscal_field_closedate")private WebElement ExpDtEdt;
	
	@FindBy(name="amount")private WebElement AmountEdt;
	
	
	@FindBy(name="Save")private WebElement savebtn;
	
	
	public WebElement getsavebtn() {
		return savebtn;
	}
	public WebElement getExpDtEdt() {
		return ExpDtEdt;
	}
	
	public WebElement getCreateLeadImg() {
		return createLeadImg;
	}
	public WebElement getDDownlst() {
		return DDownlst;
	}	
	public WebElement getSalesStagelst() {
		return SalesStagelst;
	}	
	public WebElement getleadNameEdt() {
		return leadNameEdt;
	}
	public WebElement getAmountEdt() {
		return AmountEdt;
	}
	public WebElement getSearchNow() {
		return searchNow;
	}
	public WebElement getsellnkbt() {
		return sellnkbt;
	}
	public WebElement getconvertLeadlnk() {
		return convertLeadlnk;
	}
	
	
	public void Lead(String leadName, String listName) {
		leadNameEdt.sendKeys(leadName);
		select(DDownlst,listName);
		
		
	}
	
	
	public void Lead2(String expiryDate, String amount, String salasStageList) {
		ExpDtEdt.sendKeys(expiryDate);
		AmountEdt.sendKeys(amount);
		select(SalesStagelst,salasStageList);
		
		
	}

	
	
	
}
	