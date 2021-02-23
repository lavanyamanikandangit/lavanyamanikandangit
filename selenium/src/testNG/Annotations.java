package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations {// this class represent as abstract that is incomplete bcos this class not having @Test annotation
//	make sure there Test class is there
@BeforeSuite
	public void a()
	{
		Reporter.log("Before suite",true);
	}
@BeforeTest
public void b()
{
	Reporter.log("Before Test",true);
}
@AfterTest
public void c()
{
	Reporter.log("After Test",true);
}
@BeforeClass
public void d()
{
	Reporter.log("Before class",true);
}
@AfterClass
public void e()
{
	Reporter.log("After class",true);
}
@BeforeMethod
public void f()
{
	
	Reporter.log("Before method",true);
}
@AfterMethod
public void g()
{
	Reporter.log("After method",true);
}

@AfterSuite
public void h()
{
	Reporter.log("After suite",true);
}

	
}
