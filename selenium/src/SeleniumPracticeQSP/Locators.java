package SeleniumPracticeQSP;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Locators {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
//		driver.get("file:///E:/LAVANYA/Selenium%20QSP/HTML/123.html");
//		driver.get("https://demosite.executeautomation.com/Login.html");
	//locators-used to locate the elements on the webpage
	//findElement()-used to get address of first matching(any particular)element
	//on the webpage findelement address by its tagname which is 'a'
//		Thread.sleep(3000);
//		WebElement ele=driver.findElement(By.xpath("//input[@name='UserName']"));
//		ele.sendKeys("click");
//		Thread.sleep(3000);
//		ele.clear();
//		driver.get("https://www.google.com");
//		WebElement eleid=driver.findElement(By.name("q"));
//		perform click action
//		eleid.click();
	//Thread.sleep(3000);
		//driver.findElement(By.className("c2")).click();
	//driver.findElement(By.linkText("Google")).click();
	//	
	driver.get("https://google.com");

		Thread.sleep(1000);
//	driver.findElement(By.partialLinkText("G")).click();
//		driver.get("https://opensource-demo.orangehrmlive.com");
////		Thread.sleep(1000);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		Thread.sleep(1000);
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(1000);
//		driver.findElement(By.name("Submit")).submit();
		
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
		
		//driver.findElement(By.partialLinkText("News")).click();
		// Thread.sleep(1000);
		// driver.navigate().back();
//		driver.findElement(By.partialLinkText("you")).click();
//		 Thread.sleep(1000);
//		 driver.manage().window().maximize();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
//		 
	//driver.findElement(By.name("login")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.get("https://mail.google.com/mail/u/0/?tab=rm#inbox");
//		driver.findElement(By.linkText("Inbox(15)")).click();
//		driver.findElement(By.partialLinkText("Inbox(250)")).click();
//		driver.findElement(By.linkText("Images")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.name("y1")).click();
		//driver.navigate().back();
		
		//cssSelector syntax
		//tagName[Attribute Name='Attribute Value']
		//a[value='v2']
		
//		 a[id='i1']
//		a[name='n1']
										
		
		
		}
	}



