package SeleniumPracticeQSP;


	 
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class HandlingMouseOverAndKeyBoardsActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// performing mouse over actions
//		WebDriver driver=null;
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		Thread.sleep(2000);
//		
//		Actions ac=new Actions(driver);
//		WebElement add = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		ac.moveToElement(add).perform();
//		
		//performing Double click actions
//		WebDriver driver=null;
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		WebElement ac1 = driver.findElement(By.id("txtUsername"));
//		Thread.sleep(2000);
//		ac.sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		Actions act=new Actions(driver);
//		act.doubleClick(ac1).perform();
		
		
		
		//performing Copy and paste
//		WebDriver driver=null;
//		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//		driver=new FirefoxDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		WebElement ac2 = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		Thread.sleep(2000);
//		ac2.sendKeys("opensourcecms");
//		Thread.sleep(2000);
//		Actions act=new Actions(driver);
//		act.doubleClick(ac2).perform();
//		 
//		Actions a=new Actions(driver);
//		a.contextClick().perform();
//		Thread.sleep(2000);
//		
//		Robot p=new Robot();
//		p.keyPress(KeyEvent.VK_C);
//		p.keyRelease(KeyEvent.VK_C);
//		
//		
//		
//		WebElement acc = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		Actions ad=new Actions(driver);
//		ad.moveToElement(acc).perform();
//		//ad.click();
//		Thread.sleep(2000);
//		
//		Actions a8=new Actions(driver);
//		a8.contextClick().perform();
//		Thread.sleep(2000);
//		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_P);
//		r.keyRelease(KeyEvent.VK_P);
//			
//		Thread.sleep(2000);
//		WebElement ac2 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		Actions add = new Actions(driver);
//		add.moveToElement(ac2).perform();
//		ac2.click();
//		Thread.sleep(4000);
//		WebElement ac3 = driver.findElement(By.linkText("Logout"));
//		ac3.click();
//		
//		/*
//		//Drag and drop Actions
//		WebDriver driver=null;
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		WebElement src = driver.findElement(By.id("box1"));
//		WebElement dest = driver.findElement(By.id("box101"));
//		Actions a=new Actions(driver);
//		a.dragAndDrop(src, dest).perform();
//		Thread.sleep(4000);
////		*/
//		driver.quit();
	}
	}
