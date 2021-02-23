package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
//capture screenshot when tc failed
public class TestFailures extends BaseTest{
@Test
public void doLogin() {
	Assert.fail("Failing the login test");
System.out.println("capture the screenshot");

}
}
