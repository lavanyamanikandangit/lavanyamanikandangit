package SeleniumPracticeQSP;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class HandlingDisabledElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lavan/Desktop/disabledele.html");
		WebElement un = driver.findElement(By.id("i1"));
		Thread.sleep(2000);
		
		
		if(un.isEnabled()) {
			System.out.println("Username is Enabled");
			un.sendKeys("admin");
		}else {
			System.out.println("Username is Disabled");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('i1').value='admin'");
		}
		Thread.sleep(2000);
		WebElement pw = driver.findElement(By.id("i2"));
		if(pw.isEnabled()) {
			System.out.println("password is Enabled");
			pw.sendKeys("manager");
		}else {
			System.out.println("Password is Disabled");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('i2').value='manager'");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	}

