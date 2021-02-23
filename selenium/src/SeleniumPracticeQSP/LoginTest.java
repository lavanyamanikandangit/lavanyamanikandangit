package SeleniumPracticeQSP;



 

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LoginTest {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = null;
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			//enter the url
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 //verify login page displayed
			 String loginTitle=driver.getTitle();
			 if(loginTitle.equals("OrangeHRM"))
			 {
				 System.out.println("Login page dispayed,TEST IS PASSED");
			 }else 
			 {
				 System.out.println("Login page is not dispayed,TEST IS FAILED");
			 }
//			 Thread.sleep(2000);
			 
			  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//				Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//				Thread.sleep(2000);
		
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='welcome']")).click();
//				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Thread.sleep(1000);
			
				driver.quit();
				 
			
			
			
			
			
			
			
			
		}
	}

