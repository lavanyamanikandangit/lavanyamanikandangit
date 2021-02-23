package SeleniumPracticeQSP;

	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	

	public class FirstTest {
		public static String Browser;
		static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//setBrowser();
//		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
//		PropertiesFile.writePropertiesFile();
		
	}
	 public static void setBrowser()
	 {
		Browser="Chrome";
	 }
	 public static void setBrowserConfig()
	 {
		 if(Browser.contains("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 if(Browser.contains("Firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			 driver=new FirefoxDriver();
		 }
	 }
	 public static void runTest() throws InterruptedException
	 {
		 driver.get("https://www.selenium.dev/");
		 Thread.sleep(3000);
		 driver.quit();
	 }
	}


