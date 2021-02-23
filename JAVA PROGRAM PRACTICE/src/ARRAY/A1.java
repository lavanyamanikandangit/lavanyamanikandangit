package ARRAY;

public class A1 {
public static void main(String[] args) {
	String arr1[]= {"ezhilan","lavanya"};
	String arr2[]=new String[arr1.length];
System.out.println("original array");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]);
		arr2[i]=arr1[i];
		
	}
	System.out.print("\ncopied array"+"\n");
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]);
	}
	
	}
}
