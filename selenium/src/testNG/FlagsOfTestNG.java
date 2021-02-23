package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOfTestNG {

	@Test(priority=1,invocationCount=4)
	public void run()
	{
//Assert.fail();
		Reporter.log("run meth", true);
	}
	@Test(priority=2,enabled=false)
	public void gun()
	{
		Reporter.log("gun meth ",true);
	}
	@Test(priority=3)
	public void sun()
	{
		Reporter.log("sun meth ",true);
	}
}
