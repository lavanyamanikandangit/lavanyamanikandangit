package SeleniumPracticeQSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
//	Thread.sleep(5000);
	driver.quit();
	
}
}
