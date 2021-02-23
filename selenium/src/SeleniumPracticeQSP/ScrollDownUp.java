package SeleniumPracticeQSP;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Window;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class ScrollDownUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		WebElement selscr = driver.findElement(By.xpath("//h2[text()='Maven Information']"));
		 Point loc = selscr.getLocation();
		 //System.out.println(loc);
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+loc);
//		driver.quit();
		}
	}

