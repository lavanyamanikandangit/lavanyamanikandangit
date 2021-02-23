package lavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CalculateEmi {
public static void main(String[] args) {

	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://emicalculator.net/");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 Actions actions = new Actions(driver);
 
 WebElement ele1 = driver.findElement(By.cssSelector("#loanamountslider>span"));
 
 
	}
}
