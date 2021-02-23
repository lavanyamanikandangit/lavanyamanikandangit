package SeleniumPracticeQSP;


	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Assgn2210 {
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
			WebElement ac = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//			Thread.sleep(2000);
//			ac.sendKeys("opensourcecms");
//			Thread.sleep(2000);
			//----------------------------------------------------------
//			Actions act=new Actions(driver);
//			act.doubleClick(ac).perform();
//			Actions a=new Actions(driver);
//			a.contextClick().perform();
//			Thread.sleep(2000);
			
//			Robot r=new Robot();
//			r.keyPress(KeyEvent.VK_D);
//			r.keyRelease(KeyEvent.VK_D);
			
//			Robot r=new Robot();
//			r.keyPress(KeyEvent.VK_T);
//			r.keyRelease(KeyEvent.VK_T);
			
//			Robot r=new Robot();
//			r.keyPress(KeyEvent.VK_U);
//			r.keyRelease(KeyEvent.VK_U);
			
		//----------------------------------------------------------------	
	//	
			
//			ac.sendKeys(Keys.CONTROL,"a");
//			ac.click();
			Thread.sleep(2000);
//			ac.sendKeys(Keys.CONTROL,"x");     //clear the text box content ,cursor visible
//			ac.sendKeys(Keys.DELETE);          //clear the text box content ,cursor visible
//			ac.sendKeys(Keys.BACK_SPACE);      //clear the text box content ,cursor visible
//			ac.sendKeys(Keys.CLEAR);	    	//clear the text box content ,cursor visible
			
			//--------------------------------------------------
			
//			Actions act=new Actions(driver);
//			act.doubleClick(ac).perform();
//			Robot r=new Robot();
//		    r.keyPress(KeyEvent.VK_BACK_SPACE);
//			r.keyRelease(KeyEvent.VK_BACK_SPACE);
//			
//			Robot r=new Robot();
//		    r.keyPress(KeyEvent.VK_DELETE);
//			r.keyRelease(KeyEvent.VK_DELETE);
			
		///-------------------------------------------
		
			
			Thread.sleep(5000);
//			driver.quit();
			
			
			
			
			
			
			
//			Thread.sleep(2000);
//			WebElement acc = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//			Thread.sleep(2000);
//			acc.sendKeys(Keys.CONTROL,"v");
//			WebElement ac2 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//			ac2.sendKeys(Keys.ENTER);
//			Thread.sleep(3000);
//			WebElement ac3 = driver.findElement(By.linkText("Logout"));
//			ac3.click();
//			
			
			
		}
	}


