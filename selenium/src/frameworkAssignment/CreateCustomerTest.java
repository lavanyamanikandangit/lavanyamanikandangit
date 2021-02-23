 package frameworkAssignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(frameworkAssignment.MyListeners.class)
public class CreateCustomerTest {

	
	@Test
	public void CreateCustomer() throws Throwable 
	{
//		BaseTest bt=new BaseTest();
//		bt.OpenBrowser();
		Assert.fail();
		Reporter.log("Customer successfully  created",true);
	}
}
