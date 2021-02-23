package com.comcast.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.commonutils.WebDriverUTils;

public class convertLeadInfo extends WebDriverUTils {
	public void convertLeadInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Convert Lead']")
	private WebElement convertLeadlnk;

	public WebElement getconvertLeadlnk() {
		return convertLeadlnk;
	}
	

}
