package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
public static void main(String[] args) throws Throwable {
	//open the file in read mode
	FileInputStream fis=new FileInputStream("./data/input data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("data").getRow(0).createCell(2).setCellValue(" success");
	
	//open the file in write mode
	FileOutputStream fos=new FileOutputStream("./data/input data.xlsx");
	//save the file
	wb.write(fos);
	System.out.println("wrritten and saved");
}
}
