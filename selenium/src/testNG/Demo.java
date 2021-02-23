package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	
	@Test
	public void run()
	{
//		System.out.println("I am only console vala msg");
//		Reporter.log("I am only report vala msg");
		Reporter.log("I am both report+console vala msg", true);
	}
}
