package TestCases;

//Before and after suite is used execute all the test cases
//exending the other classes
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void setUp() {
		System.out.println("Initialising everything!!!");
	}
	@AfterSuite
	public void tearDown() {
		System.err.println("Quitting Everything");
	}
}
