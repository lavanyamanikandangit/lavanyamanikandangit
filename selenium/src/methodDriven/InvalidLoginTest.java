package methodDriven;

import org.openqa.selenium.By;

import dataDriven.BaseTest;
import dataDriven.FileLib;

public class InvalidLoginTest extends BaseTest {
	

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();

		FileLib flib=new FileLib();
		
		String EXCEL_PATH="./data/input data.xlsx";
		int rc=flib.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=rc;i++) {
	    String un = flib.getCellData(EXCEL_PATH,"Invalid", i, 0);
	   	String pw = flib.getCellData(EXCEL_PATH,"Invalid", i, 1);
		LoginPage lp=new LoginPage(driver);
		lp.login(un,pw);
		Thread.sleep(5000);
		 
//		bt.CloseBrowser();
	}
	}


}
