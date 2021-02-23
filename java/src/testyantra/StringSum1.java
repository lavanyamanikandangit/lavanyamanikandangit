package testyantra;

public class StringSum1 {
public static void main(String[] args) {
//	String s="123";
//	char[] ch=s.toCharArray();
//	int sum=0;
//	for(int i=0;i<ch.length;i++) {
//		char temp=ch[i];
//		if(Character.isDigit(temp)) {
//			int num=Integer.parseInt(String.valueOf(temp));
//			sum=sum+num;
//		}
//	}
//	System.out.println(sum);
	
	/*
	String s1="123abc@alfn@50+++100";
	
	int sum=0;
	
	for(int i=0;i<s1.length();i++) {
		
		if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
			String str=s1.charAt(i)+"";
			int num=Integer.parseInt(str);
			sum=sum+num;
		}
	}
	System.out.println(sum);
	*/
String s1="123abc@alfn@50+++100";
	
	int sum=0;
	
	for(int i=0;i<s1.length();i++) {
		
		if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
			String str=s1.charAt(i)+"";
			int num=Integer.parseInt(str);
			sum=sum+num;
		}
	}
	System.out.println(sum);
	
	
	/*
	
	String s2="007";
 
int n=Integer.parseInt(s);
int n2=Integer.parseInt(s2);
System.out.println(n+n2);
*/
	
	
//	int sum=0;
//	int n=Integer.parseInt(s);
//	System.out.println(n);
//while(n!=0)
//{
//	int dig=n%10;
//	sum=sum+dig;
//	n=n/10;
//	
//}
//System.out.println(sum);

	/*
	char[] ch=s.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		int j=ch[i]-48;
		sum=sum+j;
	}
	System.out.println(sum);
	*/
}
}