package SeleniumPracticeQSP;
   
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunPolymorphism {
public static void main(String[] args) throws Throwable {
	WebDriver driver = null;
	System.out.print("Enter Browser Name:");
	Scanner sc=new Scanner(System.in);
	String browserName=sc.next();
	System.out.println("wait..");
	if(browserName.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");

		Thread.sleep(3000);
//		driver.get("file:///E:/LAVANYA/Selenium%20QSP/HTML/sign%20up%20page.html");
		Thread.sleep(2000);
	
	}else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.Google.com");
//		driver.get("file:///E:/LAVANYA/Selenium%20QSP/HTML/index.html");
		Thread.sleep(2000);
	}else 
	{
		System.out.println("check the name of browser");
	}
	String actualtitle=driver.getTitle();
	String expectedltitle="Google";
	if(actualtitle.equals(expectedltitle)) 
	{
		System.out.println("Test is pass");
	}else 
	{ 
		System.out.println("Test is fail");
	}
	System.out.println("Actual title of the website id"+actualtitle);
	driver.manage().window().maximize();
	
//
//	driver.get("https://www.makemytrip.com/flights/?cmp=disp_dgm_DF&source=70070");
//	// driver.findElement(By.xpath("//.span[text()='Cart']")).click();
//	
//	 driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
//	 Thread.sleep(1000);
//	//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/span[1]")).click();
//	 driver.findElement(By.xpath("//.span[text()='Login or']")).click();
//	 Thread.sleep(1000);
//	
	}
}
 

