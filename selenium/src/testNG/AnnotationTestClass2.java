package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationTestClass2 extends Annotations {
//	beforeclass
	//before method
		@Test
		public void gun()
		{
			Reporter.log("I am gun method ann2",true);
		}
		//after method
//		afterclass
}
