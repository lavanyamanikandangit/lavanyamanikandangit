package SeleniumPracticeQSP;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("TESTINg");
        element.submit();
        Thread.sleep(3000);
        String str = Keys.chord(Keys.CONTROL, Keys.RETURN);
        	Thread.sleep(3000);
        	WebElement element2 = driver.findElement(By.partialLinkText("Software testing - Wikipedia"));
        	Thread.sleep(3000);
        	element2.sendKeys(str);
        String str2 = driver.getWindowHandle();
            Thread.sleep(3000);
        Set<String> str3 = driver.getWindowHandles();
        	Thread.sleep(3000);
        for(String obj: str3) {
        if(!obj.equals(str2)) {
        	 Thread.sleep(3000);
            driver.switchTo().window(obj);
        }
        }
         
    }
}
