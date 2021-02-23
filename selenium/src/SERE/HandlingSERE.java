package SERE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//10.11.2020 StaleElementReferenceException
public class HandlingSERE {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	Thread.sleep(2000);

	//	WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
//	driver.navigate().refresh();//page got refresh and we got exception stale element reference exception
//	loginBtn.click();
	
	POMClass p=new POMClass(driver);
	driver.navigate().refresh();
	p.getLoginBtn().click();//used to address returning method(getters method)

	//	p.clickLoginBtn();//action perform getter method
	
	}
}
