package com.actitime.timetrack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DF {

	public static void main(String[] args) {
//		Date d=new Date();
//		System.out.println(d.toString());
		String df = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	System.out.println(df);
	}
	
	
	
}


