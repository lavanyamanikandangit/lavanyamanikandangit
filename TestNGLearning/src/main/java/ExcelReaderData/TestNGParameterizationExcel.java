package ExcelReaderData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
public static ExcelReader excel=null;

	@Test(dataProvider="getData")
public void testData(String username,String password,String is_correct) {
System.out.println(username+"----"+password+"----"+is_correct);
		
	}
	@DataProvider
	public Object[][]getData() {//return type is always object [] [] 2d array
		
		Object[][] data=new Object[3][3];//total no of arguements is equal to no of parameters
		
	
		return data;
	}

}
