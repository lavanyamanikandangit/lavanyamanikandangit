package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
public void runChrome2()
{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
//			Reporter.log("2",true);
}
}
