package QSP;

public class A1 
{
	public static void main(String[] args) 
	{
		int ran=0;
		while(ran<=10) 
		{
			
			long n=ran,fact=1;
		
			while(n>1)
			
				fact=fact*n--;
				System.out.println("factotiral of  is :"+fact);
			
		ran++;
		
		
		}
	}
}

