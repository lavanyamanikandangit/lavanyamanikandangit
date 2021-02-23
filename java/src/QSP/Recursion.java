package QSP;

public class Recursion 
{
public static void main(String[] args) 
{
		System.out.println("from looping");
		for(int i=0;i<=10;i++) 
			System.out.print(i+",");
			System.out.println("\nfrom recursion");
		print(0);
}
public static void print(int i) 
	{
		if(i<=10) 
			{
				System.out.print(i++ +",");
				print(i);
			}
	}	
}

