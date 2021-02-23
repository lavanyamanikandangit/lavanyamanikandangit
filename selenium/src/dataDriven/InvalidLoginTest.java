package dataDriven;

import org.openqa.selenium.By;

public class InvalidLoginTest extends BaseTest {
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();

		FileLib flib=new FileLib();
		int rc=flib.getRowCount("./data/input data.xlsx", "Invalid");
		for(int i=1;i<=rc;i++) {
	    String un = flib.getCellData("./data/input data.xlsx", "Invalid", i, 0);
//		System.out.println(un);
		
	    String pw = flib.getCellData("./data/input data.xlsx","Invalid", i, 1);
//		String un = flib.getCellData("./data/input data.xlsx", "TestData", 1, 0);//hardcoded
//		String pw = flib.getCellData("./data/input data.xlsx", "TestData", 1,1);//hardcoded
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
//		
//		bt.CloseBrowser();
	}
	}

}
