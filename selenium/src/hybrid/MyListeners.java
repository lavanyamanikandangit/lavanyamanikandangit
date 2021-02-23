package hybrid;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import com.google.common.io.Files;

public class MyListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method STARTED",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method SUCCESS",true);	
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method SKIPPED",true);
	}

	 

	@Override
	public void onStart(ITestContext context) {//on start and on finish are test runners
		
		Reporter.log(context.getName()+"STARTED",true);
	}

	@Override
	public void onFinish(ITestContext context) {
	
		Reporter.log(context.getName()+" ENDED",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		Reporter.log(result.getName()+" method FAILED",true);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		try {
			wlib.takePageScreenshot(result.getName());
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
	
}
