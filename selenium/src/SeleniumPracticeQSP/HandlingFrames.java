package SeleniumPracticeQSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/Desktop/HFun.html");
		
		Thread.sleep(2000);
		WebElement wpfr = driver.findElement(By.id("un"));
		wpfr.sendKeys("Admin");
		Thread.sleep(2000);
		driver.switchTo().frame("frpw");
		
		WebElement fr0 = driver.findElement(By.id("pw"));
		fr0.sendKeys("manager");
		Thread.sleep(2000);
		driver.switchTo().frame("frid");
		
//		WebElement fr1 = driver.findElement(By.name("frcb"));
//		fr1.click();
//		Thread.sleep(2000);
//		driver.switchTo().frame(2);
		
//		driver.switchTo().frame("lo");//classname not possible in frames
		
//		WebElement fr2 = driver.findElement(By.id("login"));
//		fr2.click();
//		
//		driver.get("https://www.google.com/");
//		WebElement Addr = driver.findElement(By.className("frcl"));
//		driver.switchTo().frame(Addr);
		
//		
		driver.findElement(By.id("CB")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
//		driver.findElement(By.id("pw")).sendKeys("12");
//		driver.switchTo().parentFrame();
//		
		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		driver.findElement(By.id("un")).sendKeys("1233");
//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
		
}
}
