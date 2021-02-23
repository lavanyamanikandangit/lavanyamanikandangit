package keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws Throwable {
	//open the file in read mode
	FileInputStream fis=new FileInputStream("./data/config.properties");
	//create an object of properties class
	Properties prop=new Properties();
	//keep the file ready for reading
	prop.load(fis);
	//give the key and get its value
//	but key is not present then get default value
//	String value = prop.getProperty("username");//keyword,key is case sensitive
	String value = prop.getProperty("browser","incorrect key");//if we are not mention the any value or keyname its give feedback like incorrect key
	//print it
	System.out.println(value);
	
	
	
}
}
