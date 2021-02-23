package com.comcast.Leadtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.commonutils.BaseClass;
import com.comcast.commonutils.JavaUtils;
import com.comcast.objectrepositorylib.Contacts;
import com.comcast.objectrepositorylib.CreateNewConatct;
import com.comcast.objectrepositorylib.CreateNewLead;
import com.comcast.objectrepositorylib.CreateNewOrganization;
import com.comcast.objectrepositorylib.Home;
import com.comcast.objectrepositorylib.LeadInfo;
import com.comcast.objectrepositorylib.Leads;
import com.comcast.objectrepositorylib.OrganizationInfo;
import com.comcast.objectrepositorylib.Organizations;

public class CreateLeadtc_26 extends BaseClass {

	@Test (priority=3, groups={"SmokeTest"})
	public void createLead() throws Throwable {

		
		/*Test  Data*/
		String Salutation= elib.getExcelData("Contact", "tc_26" , "salutation") ;
		String FirstName = elib.getExcelData("Contact", "tc_26" , "FirstName") ;
		String LastName = elib.getExcelData("Contact",  "tc_26" , "LastName") ;
		String Company = elib.getExcelData("Contact",   "tc_26" , "Company") ;
		String Industry = elib.getExcelData("Contact",  "tc_26" , "Industry");
		String Email = elib.getExcelData("Contact", "tc_26", "Email");
		/*step 2 : navigate to  Leads page */
		Home hp = new Home(driver);
		hp.getLeadsLnk().click();
		/*step 3 : navigate to create Lead Page*/
		Leads leadPage = new Leads(driver);
		leadPage.getCreateLeadImg().click();
		
		/*step 4 : create a Organization*/

		CreateNewLead cnl = new CreateNewLead(driver);
		cnl.Leads(Salutation, FirstName, LastName, Company,Industry,Email);
		
		/*verify */
		LeadInfo leadinfo = new LeadInfo(driver);
		String actMsg = leadinfo.getSuccessFullMsg().getText();
		Assert.assertTrue(actMsg.contains(FirstName));
		
		
		/*step 5 : navigate to Leads Page*/
		wLib.waitForElemnetToBeClickable(driver , hp.getLeadsLnk());
		hp.getLeadsLnk().click();
		driver.close();
	}
}
