package advanceSeleniumQsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAddCart {


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e) {
			System.out.println("No popup appeared");
		}
		driver.findElement(By.name("q")).sendKeys("lenevo laptops");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Lenovo Ideapad S145 Core i3 7th Gen - (4 GB/1 TB HDD/Windows 10 Home) S145-15IKB Laptop']")).click();
			
		Set<String> ele = driver.getWindowHandles();
		for(String b:ele)
		{
			driver.switchTo().window(b);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.close();
		driver.quit();
	}
	}
	
	
	



