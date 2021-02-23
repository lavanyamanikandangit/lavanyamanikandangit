package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//this is generic so we dont use main method
public class FileLib {

	public String getCellData(String excelPath,String sheet,int row,int cell) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String Cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();//'to string' is used(its changes anything into string val) instead of using getstringcellvalue
		return Cellvalue;
	}
	//generic to fetch all the datas from excel sheet in particular col
	public int getRowCount(String excelPath,String sheet) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(sheet).getLastRowNum();
		return rc;
	}
//	generic to fetch all the datas from excel sheet in particular row
		public int getCellCount(String excelPath,String sheet) throws Throwable 
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			int cc = wb.getSheet(sheet).getLastRowNum();
			return cc;
		}
	//generic to send or write  datas to excel sheet in particular cell
		public void setCellData(String path,String sheetname,int row,int cell,String data) throws Throwable 
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
			//save or write the written data
			FileOutputStream fos=new FileOutputStream(path);
			wb.write(fos);
		}
	
}
