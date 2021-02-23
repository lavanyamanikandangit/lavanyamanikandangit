package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
public void runChrome1()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
//			Reporter.log("1",true);
}
}
