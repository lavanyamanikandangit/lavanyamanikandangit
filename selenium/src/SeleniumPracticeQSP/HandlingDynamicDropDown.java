package SeleniumPracticeQSP;




	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HandlingDynamicDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://cleartrip.com/");
//		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("FromTag"));
		 ele.sendKeys("Del");
		 Thread.sleep(5000);
		//enumurator--selecting all constants by using keyboard 
		 ele.sendKeys(Keys.DOWN);
		 Thread.sleep(5000);
		 ele.sendKeys(Keys.DOWN);
		 Thread.sleep(5000);
		 ele.sendKeys(Keys.ENTER);
		 WebElement ele1 = driver.findElement(By.id("ToTag"));
		 ele1.sendKeys("new");
		 ele1.sendKeys(Keys.DOWN);
		 Thread.sleep(5000);
		 ele1.sendKeys(Keys.ENTER);
//		how to handle Dynamic drop down
		
		 List<WebElement> allOps = driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
		 System.out.println(allOps.get(allOps.size()-1));
		 System.out.println("total selected options :"+allOps.size());
		 
		
		for(WebElement option:allOps) {
			System.out.println(option.getText());
		}
	//	
		
	//}
	}
	}
	


