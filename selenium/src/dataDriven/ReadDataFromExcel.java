package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	
public static void main(String[] args) throws Throwable {
//	WebDriver driver=null;
//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.get("file:///C:/Users/lavan/Desktop/citibank.html");
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Read data from Excel
	FileInputStream fis=new FileInputStream("C:\\Users\\lavan\\eclipse-workspace\\selenium\\data\\input data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("data");
	Row r=sh.getRow(2);
	Cell c=r.getCell(0);
//	Cell c1=r.getCell(1);
	String value=c.getStringCellValue();
//	String value1=c1.getStringCellValue();
	System.out.println(value);
//	System.out.println(value1);
//	driver.findElement(By.id("un")).sendKeys(value);
//	Thread.sleep(2000);
//	
//	driver.findElement(By.id("pw")).sendKeys(value1);
//	Thread.sleep(2000);
//	driver.findElement(By.id("login")).click();
//	Thread.sleep(2000);
//	driver.navigate().to("https://www.google.com/");
//	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	driver.close();
}
}
