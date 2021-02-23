package testyantra;

import javax.swing.JOptionPane;

public class StringSum2 {
public static void main(String[] args) {
	String s="123";
	char[]ch=s.toCharArray();
	String s1="007";
	char[]ch1=s1.toCharArray();
//	for(char c1:ch) {
//	
//		System.out.print(c1);
//	}
//	System.out.println();
//	for(char c2:ch1) {
//		System.out.print(c2);
//	}
//	char sum=ch1+ch;
//	System.out.println(sum);
	String a = "10"; String b = "20";

	JOptionPane.showMessageDialog(null,Integer.parseInt(a)+Integer.parseInt(b));
}
}
