package QSP;

import java.util.Scanner;

public class New {
public static void main(String[] args) {
	/*System.out.println("enter your name");
	Scanner s=new Scanner(System.in);
	String str=s.next();
	char[] ch=str.toCharArray();
	for(int index=0;index<ch.length;index++) {
		System.out.print(ch[index]);
	}*/
//	String array
	
	String str="amazon is a ecommerce application";
	String[] strarr=str.split(" ");
	for(int index=0;index<strarr.length;index++) {
		System.out.println(strarr[index]);
	}
	
	
//	System.err.println("your name is:"+s);
//	System.out.print("your name is:"+ch);
}
}
