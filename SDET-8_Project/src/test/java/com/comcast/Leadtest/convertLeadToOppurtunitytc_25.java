package com.comcast.Leadtest;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.ListDocumentImpl.ListImpl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.commonutils.BaseClass;
import com.comcast.commonutils.ExcelUtility;
import com.comcast.commonutils.FileUtility;
import com.comcast.commonutils.JavaUtils;
import com.comcast.commonutils.WebDriverUTils;
import com.comcast.objectrepositorylib.Contacts;
import com.comcast.objectrepositorylib.CreateNewConatct;
import com.comcast.objectrepositorylib.CreateNewLead;
import com.comcast.objectrepositorylib.CreateNewOrganization;
import com.comcast.objectrepositorylib.Home;
import com.comcast.objectrepositorylib.LeadInfo;
import com.comcast.objectrepositorylib.Leads;
import com.comcast.objectrepositorylib.Login;
import com.comcast.objectrepositorylib.OrganizationInfo;
import com.comcast.objectrepositorylib.Organizations;


@Listeners(com.comcast.commonutils.ListenerImplemenation.class)
public class convertLeadToOppurtunitytc_25  extends BaseClass{

	
	@Test (priority=2, groups={"RegressionTest"})
	
	public void leadToOppurtunity() throws Throwable {

		/*Test  Data*/
		String leadName = elib.getExcelData("Contact", "tc_25", "FirstName");
		String listName = elib.getExcelData("Contact", "tc_25", "listName");
		
		String Page = elib.getExcelData("Contact", "tc_25", "Page");

		
		/*step 2 : navigate to  Leads page */
		Home hp = new Home(driver);
		hp.getLeadsLnk().click();
		
		/*step 3 : click on searchEdit text box*/
		Leads lP = new Leads(driver);
		lP.getleadNameEdt().click();
				
		/*step 4 : select lead */
		Leads selLead = new Leads(driver);
		selLead.Lead(leadName, listName);
				
		Leads sn = new Leads(driver);
		sn.getSearchNow().click();
		
		Thread.sleep(3000);
		Leads sellnk=new Leads(driver);
		sellnk.getsellnkbt().click();
		
		Leads cl=new Leads(driver);
		cl.getconvertLeadlnk().click();

		Thread.sleep(2000);
		WebElement Org = driver.findElement(By.xpath("//input[@id='select_account']"));
		if(Org.isSelected()) {
			Org.click();
		}

		

		Leads save=new Leads(driver);
		save.getsavebtn().click();
		driver.close();
}
	
}
