package SeleniumPracticeQSP;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class CopyPaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		WebElement ac = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		Thread.sleep(2000);
		ac.sendKeys("opensourcecms");
//		Thread.sleep(2000);
		ac.sendKeys(Keys.CONTROL,"a");
//		Thread.sleep(2000);
		ac.sendKeys(Keys.CONTROL,"c");
//		Thread.sleep(2000);
		WebElement acc = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Thread.sleep(2000);
		acc.sendKeys(Keys.CONTROL,"v");
		WebElement ac2 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		ac2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ac3 = driver.findElement(By.linkText("Logout"));
		ac3.click();
		
		
		
	}
	}


