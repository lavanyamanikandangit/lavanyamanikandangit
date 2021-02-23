package testNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXml1 {
	@Parameters({"browser","username"})
	@Test
	public void readData(String br,String un)
	{
		Reporter.log(br,true);
		Reporter.log(un,true);
	}
}
