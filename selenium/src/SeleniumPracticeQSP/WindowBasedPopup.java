package SeleniumPracticeQSP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBasedPopup {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	WebDriver driver=null;
//	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//	driver=new FirefoxDriver();
//	driver.get("https://www.selenium.dev/downloads/");
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
	
////handling window based popup thru Robot class
//	driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
//	Robot r =new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//	r.keyPress(KeyEvent.VK_ENTER); 
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	Runtime.getRuntime().exec("E:\\QSP\\Selenium QSP\\VB autoIt\\Opening selenium-java-3.141.59.exe");
	
	
	
	//Handling  windowbased popup thru AutoIt
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//producing window popup//print option
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_P);
	Thread.sleep(2000);
//	handling window based popup
//	integrating popup AutoIt code with my selenium code
	Runtime.getRuntime().exec("E:\\QSP\\Selenium QSP\\VB autoIt\\Print.exe");
}
}
