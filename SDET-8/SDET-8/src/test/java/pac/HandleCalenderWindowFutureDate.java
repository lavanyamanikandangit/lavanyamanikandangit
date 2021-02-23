package pac;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HandleCalenderWindowFutureDate {
public static void main(String[] args) {
	
	
	WebDriver driver=null;
	System.setProperty("webdriver.gecko.driver","./target/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com");
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	try {
	driver.findElement(By.xpath("//label[text()='Login with Phone/Email']")).isEnabled();
//	driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
	Actions act=new Actions(driver);
	act.moveByOffset(0, 0).click().perform();
	
	
	}catch(Exception e) {
		System.out.println("handle");
	}
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='From']")));
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru,India");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Bengaluru, India']")));
	driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();		
	
	
	driver.findElement(By.xpath("//span[text()='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("GOI");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Goa, India']")));
	driver.findElement(By.xpath("//p[text()='Goa, India']")).click();		

	
	//select next year date (eg.18 nov 2021)
	/*
	 * Date dateObj=new Date(); String currentSystemDate=dateObj.toString();
	 * System.out.println(currentSystemDate);//Thu Dec 17 08:50:00 IST 2020 String
	 * arr[]=currentSystemDate.split(" "); String day=arr[0]; String date=arr[2];
	 * String month=arr[1]; String year=arr[5];
	 */
	while(true)
	try {
//		driver.findElement(By.xpath("//div[@aria-label='Thu Nov 18 2021']")).click();	
		driver.findElement(By.xpath("//div[contains(@aria-label,'Jun 11 2021')]")).click();
	break;
	}catch(Exception e) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();	
	
	}
	//dynamic xpath
//	String x="//div[@aria-label='"+day+""+month+""+date+""+month+""+year+"']";
//	driver.findElement(By.xpath(x)).click();
	
	
}
}
