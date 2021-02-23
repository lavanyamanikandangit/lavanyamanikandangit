package TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;
//forcefully we skipping the testcases if the element is 
//not present no need to test the test case
public class TestSkip {
	@Test
public void isSkip() {
		
		throw new SkipException("skipping the test as the condition not met");
	
}
}
