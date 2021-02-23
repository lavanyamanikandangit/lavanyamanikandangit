package hybrid;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(hybrid.MyListeners.class)
public class ValidLoginTest extends BaseTest 
{
		@Test
		public void loginTest() throws Throwable
		{
			BaseTest bt=new BaseTest();
			bt.OpenBrowser();
			
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			FileLib flib=new FileLib();
			wlib.verify(wlib.getPageTitle(), flib.getPropertyValue(PROP_PATH, "loginpage"),"LoginPage");

			LoginPage lp=new LoginPage(driver);
			lp.login(flib.getPropertyValue(PROP_PATH, "username"),flib.getPropertyValue(PROP_PATH,"password"));
			wlib.waitForPageTitle(flib.getPropertyValue(PROP_PATH, "homepage"));
			wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "homepage"),"Homepage");
		}
}
