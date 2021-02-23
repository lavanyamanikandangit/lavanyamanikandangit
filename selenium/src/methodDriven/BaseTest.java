package methodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyworddriven.FileLib;

public class BaseTest implements IAutoConstants {
public static WebDriver driver;//global declaration for use all tc and within project
	
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
		
	}

	
	
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
