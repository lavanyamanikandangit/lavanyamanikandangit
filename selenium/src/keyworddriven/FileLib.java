package keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileLib {

	public String getPropertyValue(String path,String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String PropValue = prop.getProperty(key, "IncorrectKey");
		return PropValue;
		
		
		
		
	}
	
	
}
