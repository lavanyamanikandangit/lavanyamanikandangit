package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//NO MAIN METHOD IN TestNG,so with the help of annotation(predefined annotaiotn)
//which is gives the order or sequence of the flow

public class TestCase1 {  
	@BeforeTest
	//creating DB connection
	public void createDBConnection() {
		System.out.println("Creating DB connection");
	}
	@AfterTest
	public void closeDbConne() {
		System.out.println("Close DB connection");
	}
	
	
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closingBrowser() {
		System.out.println("Closing Browser");
	}
	@Test(priority=1)
	 public void doUserReg() {
		 System.out.println("Executing USER Reg Test");
	 		
		}
	@Test(priority=2)
public void doLogin() {
	System.out.println("Executing login test");
	}
 
}
