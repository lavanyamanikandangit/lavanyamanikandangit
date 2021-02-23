package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * This generic common class contains repeated actiopns
 * @author lavan
 *
 */
public abstract class BaseTest implements IAutoConstants {
	
	public static WebDriver driver;//single copy ...global declaration for use all tc and within project
	/**
	 * This generic reusuable methods is used to open browser,enter url and verify
	 * @throws Throwable
	 */
	@BeforeClass
	public void OpenBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser=flib.getPropertyValue(PROP_PATH,"browser");
		System.out.println(browser);
		if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
//			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
//		driver.manage().window().maximize();
		
		String appUrl = flib.getPropertyValue(PROP_PATH, "url");
		driver.get(appUrl);
		
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "loginTitle"),"Login Page");
	
	}
	/**
	 * @throws InterruptedException 
	 * 
	 */
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.quit();
	}

}
