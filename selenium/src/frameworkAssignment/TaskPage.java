package frameworkAssignment;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(frameworkAssignment.MyListeners.class)
public class TaskPage extends BaseTest 
{
	
	
	@Test
	public void taskPage() throws Throwable 
	{
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();

		LoginPage lp=new LoginPage(driver);
		lp.login(flib.getPropertyValue(PROP_PATH, "username"),flib.getPropertyValue(PROP_PATH,"password"));
		wlib.waitForPageTitle(flib.getPropertyValue(PROP_PATH, "homepage"));
		wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "homepage"),"Homepage");
		Thread.sleep(3000);
		wlib.clicktask();
		Thread.sleep(3000);
		wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "taskpage"),"Taskpage");
		Thread.sleep(3000);
		wlib.clickaddnewdd();		
		Thread.sleep(3000);
		wlib.clicknewcustmer();
		Thread.sleep(3000);
		wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "popuptext"),"popuppage");
		wlib.clickcreatecustbtn();
		Thread.sleep(3000);
		wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "taskpage"),"Customerpage");
		
//		
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		
//		driver.quit();
	}	
		
		
		
	

}
