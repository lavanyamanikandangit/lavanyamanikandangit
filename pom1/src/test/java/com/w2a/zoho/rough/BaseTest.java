package com.w2a.zoho.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	
	
	
	private WebDriver driver;
	 public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	 
	 
		public WebDriver getDriver() {
		return dr.get();
	}


	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}

public void openBrowser(String browser) {
	if(browser=="chrome"){
		System.out.println("launching from TC1"+browser);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lavan\\eclipse-workspace\\pom1\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (browser=="firefox"){
		System.out.println("launching from TC1"+browser);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lavan\\eclipse-workspace\\pom1\\src\\test\\resources\\executables\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    

	}
setWebDriver(driver);

getDriver().manage().window().maximize();
getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
getDriver().get("https://demo.actitime.com/login.do");

}
//public void closeBrowser() {
//	getDriver().quit();
}


//}
