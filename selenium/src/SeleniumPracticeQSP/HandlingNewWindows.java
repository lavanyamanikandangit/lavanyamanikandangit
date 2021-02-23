package SeleniumPracticeQSP;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingNewWindows {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=null;
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");	
	
	//can we close parent browser window alone?
//	driver.close();
	//can we close all browser window ?
//	driver.quit();
	
	//capture window handle of the parent browser window
//	String wh = driver.getWindowHandle();
	//	System.out.println(wh);
	
	//can we close all the browser windows without using quit() method?
//	Set<String> allwhs = driver.getWindowHandles();
//	System.out.println(allwhs.size());
//	for(String wh : allwhs) 
//	{
//		
//		driver.switchTo().window(wh);
//		
//		driver.close();
//	}
	//can we go to a particular browser window and performs any action?
//	
//	Set<String> allwhs = driver.getWindowHandles();
//	
//	for(String wh : allwhs) 
//	{
//		String title = driver.switchTo().window(wh).getTitle();
//		if(title.equals("Iqvia")) {
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.close();
//		break;
//	}
//	}
	//can we close child browsers only
	String parentTitle=driver.getTitle();	
	Set<String> allwhs = driver.getWindowHandles();
		
		for(String wh : allwhs) 
		{
			String title = driver.switchTo().window(wh).getTitle();
			if(!title.equals(parentTitle)) 
			{
				driver.close();
				//System.out.println("dont touch");
			}
//			}else {
//				driver.switchTo().window(wh);
//				driver.close();
			
		}
		}
}

