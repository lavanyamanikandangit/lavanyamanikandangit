package SeleniumPracticeQSP;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class FlipkartSynchronization 
	{
		
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("lavanya");
		
																																																																																								


		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
//		driver.quit();
	
	}
	}
	


