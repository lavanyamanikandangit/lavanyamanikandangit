package SeleniumPracticeQSP;

	import java.io.File;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class LaunchBrowser {
		public static void main(String[] args) throws Throwable 
		{
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

			driver.get("https://www.google.com");
//			String url=driver.getCurrentUrl();
//		System.out.println("URL of the website "+url);
		//		String pgsrc=driver.getPageSource();
//		System.out.println( pgsrc);	//to verify the url is correct or not
	String actualtitle = driver.getTitle();
		String expectedltitle="Google";
		if(actualtitle.equals(expectedltitle)) 
		{
			System.out.println("Test is pass");
		}else 
		{
			System.out.println("Test is fail");
		}
		System.out.println("Actual title of the website id  :"+actualtitle);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		Dimension d = new Dimension(200,500);
//		driver.manage().window().setSize(d);
//		Thread.sleep(3000);
//		Point p = new Point(200,800);
////		Point p=new Point(1000,300);
//		driver.manage().window().setPosition(p);
//
//		Thread.sleep(3000);
//		driver.close();
		
		
		}

	}



