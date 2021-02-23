package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	public static WebDriver driver;//global declaration for use all tc and within project
	
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	public void CloseBrowser() 
	{
		driver.quit();
	}

}



