package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.BaseTest;

public class UsersListPage {
	
	@FindBy(xpath="//div[text()='New User']")private WebElement newUserBtn;
	@FindBy(id="createUserPanel_firstNameField")private WebElement firstNameTab;
	@FindBy(id="createUserPanel_middleNameField")private WebElement middleNameTab;
	@FindBy(id="createUserPanel_lastNameField")private WebElement lastNameTab;
	@FindBy(id="createUserPanel_emailField")private WebElement emailTab;
	@FindBy(xpath="//div[text()='Save & Send Invitation']")private WebElement saveBtn;
	
	
	public UsersListPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getNewUserBtn()
	{
		return newUserBtn;
		
	}
	public void clicknewUserBtn()
	{
		newUserBtn.click();
	}
	
	
	
	public WebElement getFirstNameTab() {
		return firstNameTab;
	}
	public WebElement getMiddleNameTab() {
		return middleNameTab;
	}
	public WebElement getLastNameTab() {
		return lastNameTab;
	}
	public WebElement getEmailTab() {
		return emailTab;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createUser(String fn,String mn,String ln,String email)
	{
		firstNameTab.sendKeys(fn);
		middleNameTab.sendKeys(mn);
		lastNameTab.sendKeys(ln);
		emailTab.sendKeys(email);
		saveBtn.click();
	}
}
