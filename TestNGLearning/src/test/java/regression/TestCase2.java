package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

@Test
public void validateTitles() {
	
//multiple reports with hard assertions(means break the code once it gets failed)
	System.out.println("Beginning");
	String expected_title="yahoo.com";//form excel sheet
	String actual_title="gmail.com";//from selenium
	
	//in TestNG we never use to report tc failures
	/*if(expected_title.equals(actual_title)) {
		System.out.println("Testcase  PASS");
	}else {
		System.out.println("Testcase  fail");
	}*/
	//so we have to use Assertion in order to report
	//single failure
//	System.out.println("validating title");
//	Assert.assertEquals(actual_title, expected_title);
	//isElementPresent("xpath")-true,false
//	Assert.assertTrue(false,"element not found");//overloaded method
	//validating image
//	System.out.println("Validating image");
//	Assert.assertEquals(true, false);
	
//	System.out.println("Validate text box presence");
//	Assert.assertEquals(true,false);//
	//forcefully failing when the condition is not met
//	Assert.fail("failing the test as the condition is not met ");
//	System.out.println("Ending");//if we run for failed tc we cannot get this 
	//msg,bcos the prog was terminated when it gets failed
//the rule of assertion is break the code once it is failed,it will go to next tc

	
	
//reporting multiple failures using	soft assertions
	// call a class as softAssert() and create object but it says test also PASSED
	//we want to add at the end softAssert.assertAll();
	SoftAssert softAssert=new SoftAssert();
	
	System.out.println("validating title");
	softAssert.assertEquals(actual_title, expected_title);
	//isElementPresent("xpath")-true,false
//	Assert.assertTrue(false,"element not found");//overloaded method
	//validating image
	System.out.println("Validating image");
	softAssert.assertEquals(true, false,"image not present");
	
	System.out.println("Validate text box presence");
	softAssert.assertEquals(true,false,"text box not present");//
	//forcefully failing when the condition is not met
//	Assert.fail("failing the test as the condition is not met ");
	System.out.println("Ending");
	softAssert.assertAll();//it reports which test is failed//without this it gives Test is PASSED


}


}
