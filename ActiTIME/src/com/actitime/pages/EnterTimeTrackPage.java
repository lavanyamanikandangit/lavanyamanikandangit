package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.BaseTest;

public class EnterTimeTrackPage {

	
	@FindBy(id="container_users")private WebElement usersTab;
	public EnterTimeTrackPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getUsersTab()
	{
		return usersTab;
		
	}
	

	public void clickUsersTab() 
	{
		usersTab.click();
		
	}

	
	
	
	
	
	
}
