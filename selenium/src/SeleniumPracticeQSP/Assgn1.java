package SeleniumPracticeQSP;


	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Assgn1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement sear = driver.findElement(By.name("q"));
		sear.sendKeys("laptops");
		
		 
		List<WebElement> all = driver.findElements(By.xpath("//li"));
		System.out.println("Total number of selected options: "+ all.size());
		Thread.sleep(2000);
		for(WebElement option:all) 
			{
				System.out.println(option.getText());
			}	
		all.get(0).click();
		Thread.sleep(500);
		driver.findElement((By.xpath("//div[@class='_3uDYxP']/descendant::select[@class='_2YxCDZ']/option[4]"))).click(); 
		Thread.sleep(500);
		//selenium.ElementClickInterceptedException
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Core i3']"))).click();
		driver.findElement(By.xpath("//div[@title='Core i3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Dell']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Operating System')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Windows 10']")).click();
		
			
//		WebDriverWait wait1=new WebDriverWait(driver,30);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[3]/ul[1]"))).click();
//		driver.findElement(By.xpath("//div[@class='col col-5-12 _2o7WAb']/div[1]/div[1]")).click();
//		Thread.sleep(2000);
		WebElement price1 = driver.findElement(By.xpath("//div[text()='Dell Vostro Core i3 10th Gen - (4 GB/1 TB HDD/Windows 10 Home) Vostro 3401 Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
//		WebElement price = driver.findElement(By.xpath("//div[@class='_3wU53n'][1]/../following-sibling::div//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println("Price of the selected Laptop is :"+price1.getText());
		Thread.sleep(2000);
//		List<WebElement> ram = driver.findElements(By.xpath("//ul[@class='vFw0gD']/li[2]"));
//		System.out.println("RAM :"+ram.get(0).getText());
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
	}
	}
	
	
	



