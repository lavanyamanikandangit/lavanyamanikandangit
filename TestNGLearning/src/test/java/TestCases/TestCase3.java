package TestCases;
import org.testng.Assert;
//creating test dependencies
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{
	@Test(priority=1,groups={"functional","smoke"})
	 public void doUserReg() {
		 System.out.println("Executing USER Reg Test");
		 Assert.fail("User not registered successfully");//if submit btn missing
	 		
		}
	@Test(priority=2,dependsOnMethods="doUserReg",groups={"functional","smoke"})//multiple method dependencies//login depends on userreg so its skipped 
	public void doLogin() {// its dependent on user reg
		System.out.println("Executing login test");
		}
	
	
	
	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true,groups={"functional","smoke"})//soft dependencies used to execute the test in priority whether it is dependent or not
	public void thirdTest() 
		{
		 System.out.println("Executing 3rd  Test");
		}
	
	@Test(priority=4,groups="bvt" )
	public void fourthTest() {
		 System.out.println("Executing 4th Test");
		 }
	
}
