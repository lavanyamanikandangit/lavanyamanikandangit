package QSP;

public class StrongNumber {

	public static void main(String[] args)
	{
		int num=15,i,n=num, res=0,fact;
		while(n!=0) 
		{
			fact=1;
			 i=n%10;
			 while(i>=1)
			 fact=fact*i--;
			 res=res+fact;
			 n=n/10;
			 System.out.println(fact);
		}
		
		if(num == res)
			System.out.println(res+" is a Strong Number");
		else
			System.out.println(res+" is Not a Strong Number");
	}
}

