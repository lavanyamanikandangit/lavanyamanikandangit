package dataDriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest
{
public static void main(String[] args) throws Throwable 
{
	BaseTest bt=new BaseTest();
	bt.OpenBrowser();
//	bt.CloseBrowser();
	FileLib flib=new FileLib();
	String un = flib.getCellData("./data/input data.xlsx", "TestData", 1, 0);
	String pw = flib.getCellData("./data/input data.xlsx", "TestData", 1,1);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	bt.CloseBrowser();
}
	
	
	
}
