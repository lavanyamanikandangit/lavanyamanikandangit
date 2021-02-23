package hybrid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(hybrid.MyListeners.class)
public class CreateCustomerTest {

	
	@Test
	public void CreateCustomer() 
	{
		Assert.fail();
		Reporter.log("Customer successfully  created",true);
	}
}
