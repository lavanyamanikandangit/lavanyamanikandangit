package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {

	
	@Test(priority=1)
	public void transfer1()
	{
Assert.fail();
		Reporter.log("transfered successfully 1", true);
	}
	@Test(priority=2)
	public void transfer2()
	{
		Assert.fail();
		Reporter.log("transfered successfully 2 ",true);
	}
	@Test(priority=3,dependsOnMethods="transfer1")
	public void delete()
	{
		Reporter.log("deleted successfuly 1 ",true);
	}
	@Test(priority=4,dependsOnMethods={"transfer1","transfer2"},alwaysRun=true)
	public void delete2()
	{
		Reporter.log("deleted successfuly 2 ",true);
	}
}
