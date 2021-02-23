package com.comcast.commonutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
* 
* @author Lavanya
*
*/
public class FileUtility {

	
	/**
	 *    used to get data from property file based on key
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IConstant.commonDataFilePath1);
		Properties pObj=new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(key);
		return value;
	}
	
}

