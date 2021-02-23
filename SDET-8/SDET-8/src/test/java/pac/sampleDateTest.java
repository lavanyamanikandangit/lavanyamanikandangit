package pac;

import java.util.Date;

public class sampleDateTest {
public static void main(String[] args) {
	Date dateObj=new Date();
	String currentSystemDate=dateObj.toString();
	System.out.println(currentSystemDate);//Thu Dec 17 08:50:00 IST 2020
	String arr[]=currentSystemDate.split(" ");
	String day=arr[0];
	String date=arr[2];
	String month=arr[1];
	String year=arr[5];
}
}
