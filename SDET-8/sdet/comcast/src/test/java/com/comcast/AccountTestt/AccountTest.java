package com.comcast.AccountTestt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AccountTest {

	
	@Test(groups="smoke test")
	public void createAccountTest() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
System.out.println("Browser=="+browser);
System.out.println("url=="+url);	
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://gmail.com");
//		driver.quit();
		System.out.println("execute createaccount test");
	}
	@Test(groups="regression test") 
	public void modifyAccountTest() {
		System.out.println("execute modify account test");
	}
}
