package com.actitime.timetrack;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;
import java.util.Properties;

@Listeners(com.actitime.genericLib.MyListeners.class)

public class ValidLoginTest extends BaseTest 
{
		@Test
		public void loginToApp() throws Throwable
		{
			
			
			FileLib flib=new FileLib();
			String un = flib.getPropertyValue(PROP_PATH, "username");
			String pw = flib.getPropertyValue(PROP_PATH, "password");
			
			LoginPage lp=new LoginPage(driver);
			//login to Application
			lp.login(un, pw);
			
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			wlib.waitForPageTitle(flib.getPropertyValue(PROP_PATH, "homeTitle"));//synchronization purpose
			wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "homeTitle"),"Home page");//verification purpose
			
			
		}
}
