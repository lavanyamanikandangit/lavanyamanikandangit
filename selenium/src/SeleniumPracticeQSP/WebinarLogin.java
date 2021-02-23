package SeleniumPracticeQSP;



	 

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebinarLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://global.gotowebinar.com/join");
		driver.findElement(By.id("publicId")).sendKeys("673241651");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("lavanmanikandan20@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();

		
		
				
	}
	}

