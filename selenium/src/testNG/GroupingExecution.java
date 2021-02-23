package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution 
{
@Test(groups="SmokeGrp")
public void smoke() 
{
Reporter.log("Smoke Test1",true);	
}
@Test(groups="FT Grp")
public void FT()
{
	Reporter.log("Functional Test1",true);
}
@Test(groups="IT Grp")
public void IT()
{
	Reporter.log("Integraional Test1",true);
}
@Test(groups="ST Grp")
public void ST()
{
	Reporter.log("System Test1",true);
}

@Test(groups="SmokeGrp")
public void smoke1() 
{
Reporter.log("Smoke Test2",true);	
}
@Test(groups="FT Grp")
public void FT2()
{
	Reporter.log("Functional Test2",true);
}
@Test(groups="IT Grp")
public void IT1()
{
	Reporter.log("Integration Test2",true);
}
@Test(groups="ST Grp")
public void ST2()
{
	Reporter.log("System Test2",true);
}

@Test(groups="SmokeGrp")
public void smoke2() 
{
Reporter.log("Smoke Test3",true);	
}
@Test(groups="FT Grp")
public void FT3()
{
	Reporter.log("Functional Test3",true);
}
@Test(groups="IT Grp")
public void IT3()
{
	Reporter.log("Integration Test3",true);
}
@Test(groups="ST Grp")
public void ST3()
{
	Reporter.log("System Test3",true);
}
}
