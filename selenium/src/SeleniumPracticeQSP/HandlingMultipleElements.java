package SeleniumPracticeQSP;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandlingMultipleElements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com");
//				driver.get("file:///E:/LAVANYA/HandlingmultipleElements.html");
				Thread.sleep(2000);
				
		//count the no.of links
		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		System.out.println(allinks.size());
		//print text of all the links
		for(int i=0;i<allinks.size();i++) 
		{
//			WebElement oneLink = allinks.get(i);
//			String text=oneLink.getText();
//			System.out.println(text);
			Thread.sleep(2000);
			System.out.println(allinks.get(i).getText());
		}
		//click on the last link
		Thread.sleep(2000);
		System.out.println(allinks.get(allinks.size()-1));//.click();
		
		Thread.sleep(2000);
//		driver.quit();
	}
	}

