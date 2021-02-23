package SeleniumPracticeQSP;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class CalculateEmi {
	
	
	public static void main(String[] args)  throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 Actions actions = new Actions(driver);
	 
	 WebElement ele1 = driver.findElement(By.cssSelector("#loanamountslider>span"));
	 WebElement ele2 = driver.findElement(By.cssSelector("#loaninterestslider>span"));
	 WebElement ele3 = driver.findElement(By.cssSelector("#loantermslider>span"));
	 Thread.sleep(2000);
	 int xOffset=82;
	int yOffset=0;
	actions.dragAndDropBy(ele1, xOffset,yOffset).build().perform();
	Thread.sleep(2000);
	int xOffset1=86;
	int yOffset1=0;
	actions.dragAndDropBy(ele2, xOffset1,yOffset1).build().perform();
	Thread.sleep(2000);
	int xOffset2=-111;
	int yOffset2=0;
	actions.dragAndDropBy(ele3, xOffset2,yOffset2).build().perform();
	Thread.sleep(2000);
	WebElement emi = driver.findElement(By.cssSelector("#emiamount>p>span"));
//	System.out.println("The EMI amount is : Rs."+emi.getText());
	String EmiAmount=emi.getText();
	System.out.println(EmiAmount);
	
	
	}	 
}
