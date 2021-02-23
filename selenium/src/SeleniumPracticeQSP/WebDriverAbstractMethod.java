package SeleniumPracticeQSP;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverAbstractMethod {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//enter the url
		driver.get("https://www.Google.com");
		Thread.sleep(3000);
		//		driver.navigate().forward();
//		driver.get("file:///E:/LAVANYA/Selenium%20QSP/HTML/index.html");
		Thread.sleep(3000);
		
//		driver.navigate().to("file:///E:/LAVANYA/Selenium%20QSP/HTML/sign%20up%20page.html");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.get("https://www.Google.com");
		Thread.sleep(3000);

//		driver.navigate().to("https://www.firefox.com");
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		String pgsrc=driver.getPageSource();
		System.out.println(pgsrc);
		
		String actualtitle=driver.getTitle();
		String expectedltitle="Google";
		if(actualtitle.equals(expectedltitle)) 
		{
			System.out.println("Test is pass");
		}else 
		{
			System.out.println("Test is fail");
		}
//		 driver.get("https://www.makemytrip.com/flights/?cmp=disp_dgm_DF&source=70070");
//		 driver.findElement(By.xpath("//.span[text()='Cart']")).click();
//		Thread.sleep(1000);
//		 driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
//		//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/span[1]")).click();
//		 driver.findElement(By.xpath("//.span[text()='Login or']")).click();
		 
		
		
		
		
	}

	}



