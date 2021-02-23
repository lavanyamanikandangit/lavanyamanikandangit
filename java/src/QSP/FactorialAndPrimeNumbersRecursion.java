package QSP;

public class FactorialAndPrimeNumbersRecursion {
/*	
	public static int fact(int i) {
		if(i<=1)
			return 1;
		else
			return (i * fact(--i));
	}
	public static int factorial(int i) {
		int fact=1;
		while(i>1)
			fact=fact*i--;
		return fact;
	}
	
	
public static void main(String[] args) {
	int n=6;
	//System.out.println("Factorial of "+n+" is: "+fact(n));
	System.out.println("factorial of "+n +" is :"+factorial(n));
}
*/
	// prime 
	static String prime(int i,int j) 
	{
		if(i<=2)
			return "Neither prime or nor composite";
		if(i%j==0)
			return "not a prime";
		if(j*j>=i)
			return "prime";
		return prime(i,++j);
	}
	static void range (int i)
	{
		if(i<=5) 
		{
			System.out.println(i+" is "+prime(i,2));
			range (++i);
		}
	}
public static void main(String[] args) 
		{
			range(0);
		}
}
