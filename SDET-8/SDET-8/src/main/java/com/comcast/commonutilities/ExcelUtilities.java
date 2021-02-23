package com.comcast.commonutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExcelUtilities {

	public String getExcelData(String sheetName, int rowNum,int colNum) throws Throwable {
		FileInputStream fis=new FileInputStream(IConstant.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.
		
		
		return null;
		
	}

	
	
	
}
