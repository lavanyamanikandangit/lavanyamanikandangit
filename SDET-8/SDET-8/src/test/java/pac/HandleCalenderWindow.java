package pac;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HandleCalenderWindow {
public static void main(String[] args) {
	WebDriver driver=null;
	System.setProperty("webdriver.gecko.driver","./target/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,20);
	driver.get("https://www.makemytrip.com");
	
	driver.findElement(By.xpath("//span[text()='Flights']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='From']")));
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru,India");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Bengaluru, India']")));
	driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();		
	
	
	driver.findElement(By.xpath("//span[text()='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("GOI");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Goa, India']")));
	driver.findElement(By.xpath("//p[text()='Goa, India']")).click();		

	Date dateObj=new Date();
	String currentSystemDate=dateObj.toString();
	System.out.println(currentSystemDate);//Thu Dec 17 08:50:00 IST 2020
	String arr[]=currentSystemDate.split(" ");
	String day=arr[0];
	String date=arr[2];
	String month=arr[1];
	String year=arr[5];
	
	
	
	//dynamic xpath
	String x="//div[@aria-label='"+day+""+month+""+date+""+month+""+year+"']";
	driver.findElement(By.xpath(x)).click();
	
	
}
}
