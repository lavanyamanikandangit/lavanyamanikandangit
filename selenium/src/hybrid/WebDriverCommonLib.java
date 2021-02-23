package hybrid;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest 
{
public void waitForPageTitle(String title)
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains(title));
}
	
	public String getPageTitle()
	{
	String pageTitle = driver.getTitle();
	return pageTitle;
	}
	public void verify(String actual,String expected,String page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed",true);
	}
	public void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void rightClick(WebElement element)
	{
		Actions rc=new Actions(driver);
		rc.contextClick(element).perform();
	}
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String id)
	{
		driver.switchTo().frame(id);
	}
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void selectOption(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectOption(String value,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void takePageScreenshot(String name) throws Throwable
	{
		
		String df = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Users\\lavan\\eclipse-workspace\\selenium\\Screenshots\\"+name+df+".jpg");
//		File dest = new File("./screenshot/"+name+".png");
		Files.copy(src, dest);
				}
}
