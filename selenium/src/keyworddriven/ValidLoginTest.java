package keyworddriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest {
	
	
public static void main(String[] args) throws Throwable {
	
	BaseTest bt=new BaseTest();
	bt.OpenBrowser();
	FileLib flib=new FileLib();
	String un = flib.getPropertyValue(PROP_PATH,"username");
	String pw = flib.getPropertyValue(PROP_PATH,"password");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys(un);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	bt.CloseBrowser();
	
}
	
	
	
}
