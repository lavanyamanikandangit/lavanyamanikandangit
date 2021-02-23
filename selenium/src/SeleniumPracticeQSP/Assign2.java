package SeleniumPracticeQSP;


	
	import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assign2 {
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		WebElement element=driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("qspiders ");
		
	
		Thread.sleep(2000);
		element.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		element.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		element.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		element.click();
		
//		driver.findElement(By.name("q")).submit();
		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
	}
	}


