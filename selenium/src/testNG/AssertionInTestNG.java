package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
@Test
	public void VerifyTitle() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String loginTitle = driver.getTitle();
	//		Assert class (all the methods are static we no need to create object) to stop the execution or control(it is not happens while using if-else)
		Assert.assertEquals(loginTitle, "actiTIME - Login");//if its true then only it moves next otherwise its stops here itself
	//		when we are checking critical feature,mandatory feature,important feature we want to control to stop
//		driver.findElement(By.id("username")).sendKeys("admin");
		
	//		softAssert class(verify)-non static method so we need to create object
//		not important features,non critical features
//		SoftAssert sa=new SoftAssert();//used to continue the execution eventhough verification is failed
//		sa.assertEquals(loginTitle, "actiTIME-Login");
//		sa.assertAll();//stops the execution
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
//		sa.assertAll();//to continue the exce and verufy the condn without assertall it didnt compare 
//		even failed how its works?--its skipping the softassert steps jump 21to 26 and assertall()and goto 24,25
//		last line of statement of the coding
			
	}
	@Test(priority=1)
	public void run() {
		System.out.println("I am run");
	}
	
	
}
