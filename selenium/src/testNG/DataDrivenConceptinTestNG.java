package testNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenConceptinTestNG {//using as data repository
	
	@DataProvider//(name="db1")
	public Object[][] databank1()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="admin1";
		obj[0][1]="manager1";
		
		obj[1][0]="admin2";
		obj[1][1]="manager2";
		
		obj[2][0]="admin3";
		obj[2][1]="manager3";
		return obj;
	}
	
	@DataProvider(name="db2")
	public Object[][] databank2()
	{
		Object[][] obj=new Object[3][3];
		obj[0][0]="admin1";
		obj[0][1]="manager1";
		obj[0][2]="city1";
		
		obj[1][0]="admin2";
		obj[1][1]="manager2";
		obj[1][2]="city2";
		
		obj[2][0]="admin3";
		obj[2][1]="manager3";
		obj[2][2]="city3";
		return obj;
	}
	@Test(dataProvider="databank1")
	public void getCredentials(String un,String pw)//Parameterizing the data and it is  used to catch the data
	{
		Reporter.log(un,true);
		Reporter.log(pw,true);
		
	}
	@Test(dataProvider="db2",priority=1)
	public void getCredentials(String un,String pw,String city)//Parameterizing the data and it is  used to catch the data
	{
		Reporter.log(un,true);
		Reporter.log(pw,true);
		Reporter.log(city,true);
	}
}
