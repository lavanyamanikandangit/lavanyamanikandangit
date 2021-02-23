 package SeleniumPracticeQSP;
	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.events.EventFiringWebDriver;
	import com.google.common.io.Files;

	public class TakingScreenShots 
	{
		public static void main(String[] args) throws IOException 
		{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Full image
	//   1. Typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\QSP\\SS\\flipkartimage1.png");
		Files.copy(src, dest);
		
//		 2. Downcasting
//			RemoteWebDriver rwd = (RemoteWebDriver)driver;
//			File src = rwd.getScreenshotAs(OutputType.FILE);
//			File dest=new File("E:\\LAVANYA\\Selenium QSP\\ScreenShot\\flipkartimage12.jpeg");
//			Files.copy(src, dest);
		
//		 3. Eventfiringwebdriver class
//			EventFiringWebDriver ef = new EventFiringWebDriver(driver);
//			File src = ef.getScreenshotAs(OutputType.FILE);
//			File dest=new File("E:\\LAVANYA\\Selenium QSP\\ScreenShot\\flipkartimage13.jpeg");
//			Files.copy(src, dest);
		//particular element
//		WebElement login = driver.findElement(By.xpath("//div[@class='Og_iib col col-2-5 _3SWFXF']"));
//		File src = login.getScreenshotAs(OutputType.FILE);
//		File dest=new File("E:\\QSP\\SS\\flipkartimage1.pngflipkartimage11.jpeg");
//		Files.copy(src, dest);

//		driver.get("https://www.google.com");
//		WebElement login = driver.findElement(By.id("hplogo"));
//		File src = login.getScreenshotAs(OutputType.FILE);
//		File dest=new File("E:\\QSP\\SS\\google122.png");
//		Files.copy(src, dest);
		
		driver.get("file:///C:/Users/lavan/Desktop/dropdown.html");
	
		WebElement login = driver.findElement(By.id("Taj"));
		File src1 = login.getScreenshotAs(OutputType.FILE);
		File dest1=new File("E:\\QSP\\SS\\Taj1.png");
		Files.copy(src1, dest1);
		
	}
	}
