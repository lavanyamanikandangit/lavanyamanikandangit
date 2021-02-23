 package SeleniumPracticeQSP;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import sun.net.ftp.FtpDirEntry.Type;

public class WebElementMethods {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://a-demo.orangehrmlive.com/");
	
	//operational method
//	WebElement un = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//	un.sendKeys("admin");
//	Thread.sleep(2000);
//	un.clear();
//un.click();
//un.submit();
	
	
	//Datacapture method
//	System.out.println(un.getTagName());
//	System.out.println(un.getAttribute("id"));
	
	WebElement log = driver.findElement(By.xpath("//div[@id='divLoginButton']"));
	System.out.println(log.getText());
	System.out.println(log.getCssValue("font-size"));
	System.out.println(log.getLocation());
	System.out.println(log.getSize());
	System.out.println(log.getRect().getHeight());
	System.out.println(log.getRect().getWidth());
	WebElement ts = driver.findElement(By.xpath("//div[@id='divLogo']"));
//	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\QSP\\SS\\flipkartimage101.png");
	Files.copy(src, dest);
	
	
	//inspector method
//	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
////	WebElement cb = driver.findElement(By.xpath("//input[@value='Check All']"));
//	WebElement cb = driver.findElement(By.xpath("//div[@class='checkbox']"));
//	cb.click();
	
	
	//verification method
//	if(cb.isDisplayed()) {
//		System.out.println("Checkbox is displayed");
//		if(cb.isEnabled()) {
//			System.out.println("Checkbox is enabled");
//			if(cb.isSelected()) {
//				System.out.println("Checkbox is selected,dont touch");
//			}
//			else {
//				System.out.println("select the checkbox");
//				cb.click();
//			}
//		}else {
//				System.out.println("Checkbox is disabled,enable now");
//				
//		}
//	}else {
//		System.out.println("checkbox not displayed");
//		
//			}
		}
	
	
//	driver.quit();
}

