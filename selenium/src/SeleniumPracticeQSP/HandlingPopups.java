package SeleniumPracticeQSP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public interface HandlingPopups {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
//	confirmation popup
	driver.get("file:///C:/Users/lavan/Desktop/login%20popup.html");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(2000);
	Alert ale = driver.switchTo().alert();
	System.out.println(ale.getText());
	ale.accept();
	ale.dismiss();
	// Alert popup
	
	driver.get("file:///C:/Users/lavan/Desktop/login2.html");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
//	al.dismiss();
	Thread.sleep(2000);
	al.sendKeys("fine");//it is not working 99% in javascript popup,we will use on hidden division popup 
	
	//  Browser notification popup

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		//browser setting class
	
//		co.addArguments("start-maximized");//usually we dont do this
		co.addArguments("--disable-notifications");//disable the all notification in webpage
//		//open the browser by applying the changes
		
		driver=new ChromeDriver(co);
		driver.get("https://www.cleartrip.com/");
//		driver.manage().window().maximize();
		
		
		
//		Hidden Division popup
//	driver.get("https://www.cleartrip.com/");
//	driver.findElement(By.id("DepartDate")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//td[@data-month='0']//a[text()='1']")).click();
//	
//	Thread.sleep(2000);
//driver.quit();
	
	
	
}
}