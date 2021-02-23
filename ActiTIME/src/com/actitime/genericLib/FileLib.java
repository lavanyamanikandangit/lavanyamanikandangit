package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is generic class is used to handle files
 * @author lavan
 *
 */
public class FileLib {
	/**
	 * This generic reusuable method is used to read from property file
	 * @param path
	 * @param key
	 * @return prop value
	 * @throws Throwable
	 */
	public String getPropertyValue(String path,String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String PropValue = prop.getProperty(key, "IncorrectKey");
		return PropValue;
	}
	/**
	 * This generic reusuable method is used to read from excel file
	 * @param excelPath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return cell value
	 * @throws Throwable
	 */
	public String getCellData(String excelPath,String sheet,int row,int cell) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String Cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();//'to string' is used(its changes anything into string val) instead of using getstringcellvalue
		return Cellvalue;
	}
	/**
	 * This generic reusuable method is used to get the filled Rows count
	 * @param excelPath
	 * @param sheet
	 * @return rc
	 * @throws Throwable
	 */
	//generic to fetch all the datas from excel sheet in particular col
	public int getRowCount(String excelPath,String sheet) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(sheet).getLastRowNum();
		return rc;
	}
//	generic to fetch all the datas from excel sheet in particular row
	/*	public int getCellCount(String excelPath,String sheet) throws Throwable 
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			int cc = wb.getSheet(sheet).getLastRowNum();
			return cc;
		}*/
	/**
	 * This generic reusuable method is used to write the data from excel file
	 * @param path
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
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
