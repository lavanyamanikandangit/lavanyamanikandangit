package com.comcast.commonutilities;

import java.util.Date;
import java.util.Random;
/**
 * this class contains Java specific libraries which includes get random data and system date
 * @author lavan
 *
 */
public class JavaUtilities {
/**
 * used to get random data from 1 to 10000
 * @return
 */
	public static int getRandomData() {
		Random random=new Random();
		int randomData=random.nextInt(10000);
		return randomData;
		
	}
	/**
	 * used to get system date
	 * @return
	 */
	public String getsystemDate() {
		Date date=new Date();
		return date.toString();
	}
	
	
}
