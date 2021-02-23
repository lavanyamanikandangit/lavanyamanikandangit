package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
//beforeclass
public class AnnotationTestClass extends Annotations{
//before method
	@Test
	public void run()
	{
		Reporter.log("I am run method",true);
	}
	//after method
	//before method
	@Test
	public void sun()
	{
		Reporter.log("I am sun method",true);
	}
	//after method
}
//afterclass