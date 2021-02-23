package SeleniumPracticeQSP;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class FaceBook {
		public static void main(String[] args) throws InterruptedException {
	//open the chrome browser and facebook login page
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236042%7Ce%7Cfacebook%20%27%7C&placement=&creative=318504236042&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-360705453827%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIu_ykic647AIVA6mWCh2kbweZEAAYASAAEgINNPD_BwE");
		Thread.sleep(2000);
	//selecting a day
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("20");
		Thread.sleep(1000);
	//selecting month
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		
		s1.selectByIndex(9);
		
		Thread.sleep(1000);
	//selecting year
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		Thread.sleep(1000);
		s2.selectByValue("1990");
		Thread.sleep(3000);
	//close the browser
//		driver.quit();
				
		
	}
	}


