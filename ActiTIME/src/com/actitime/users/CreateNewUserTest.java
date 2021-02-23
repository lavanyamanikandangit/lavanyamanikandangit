package com.actitime.users;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.UsersListPage;
import com.actitime.timetrack.ValidLoginTest;

@Listeners(com.actitime.genericLib.MyListeners.class)
public class CreateNewUserTest extends BaseTest{

	@Test
	public void createNewUser() throws Throwable
	{
		
	ValidLoginTest vl=new ValidLoginTest();
	vl.loginToApp();
	
	EnterTimeTrackPage et=new EnterTimeTrackPage();
	et.clickUsersTab();
	
	
//	WebDriverCommonLib wlib=new WebDriverCommonLib();
//	wlib.waitForPageTitle(flib.getPropertyValue(PROP_PATH, "userTitle"));
//	wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "userTitle"),"User page");
	
	
	UsersListPage ul=new UsersListPage();
	ul.clicknewUserBtn();
	
	FileLib flib=new FileLib();	
//	wlib.waitForPageTitle(flib.getPropertyValue(PROP_PATH, "popuptext"));
//	wlib.verify(wlib.getPageTitle(),flib.getPropertyValue(PROP_PATH, "popuptext"),"Popup page");
	ul.createUser(flib.getCellData(EXCEL_PATH,"users" , 0,1),
			      flib.getCellData(EXCEL_PATH, "users",1,1),
			      flib.getCellData(EXCEL_PATH, "users",2,1),
			      flib.getCellData(EXCEL_PATH, "users",3,1));
		
		
	}
}
