package methodDriven;

public class ValidLoginTest extends BaseTest 
{
public static void main(String[] args) throws Throwable 
	{
	
	BaseTest bt=new BaseTest();
	
	FileLib flib=new FileLib();
	String un=flib.getPropertyValue(PROP_PATH, "username");
	String pw=flib.getPropertyValue(PROP_PATH, "password");
	
	bt.OpenBrowser();
	LoginPage lp=new LoginPage(driver);
	lp.login(un,pw);
	Thread.sleep(5000);
	bt.CloseBrowser();

	}
}
