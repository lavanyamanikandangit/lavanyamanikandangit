package com.w2a.zoho.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{

	@Test(dataProvider="getData")
	public void doLogin(String username,String password,String browser) {
	
		openBrowser(browser);
	
		getDriver().findElement(By.name("username")).sendKeys(username);
		getDriver().findElement(By.name("pwd")).sendKeys(password);
		getDriver().findElement(By.xpath("//div[text()='Login ']")).click();
//		closeBrowser();
	}
	
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		
		Object[][] data=new Object [2][3];
		data[0][0]="admin";
		data[0][1]="manager";
		data[0][2]="chrome";
		
		data[1][0]="trainee";
		data[1][1]="trainee";
		data[1][2]="firefox";
		
		
		return data;
		
		
		
		
		
	}
}
