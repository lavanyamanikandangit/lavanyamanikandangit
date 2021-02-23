package QSP;

public class FibonnaciSeries 
{
	public static int fibonacci(int n)
	{
		System.out.print("Fibonacci series upto "+n+ " is :");
		int i=1,t1 = 0, t2 = 1;
		while (i <=n)
		{
    	System.out.print(t1 +" + ");
    	int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
        ++i;
		}
    	return t2;
	}
	public static void main(String[] args) 
	{	
		System.out.print(" :"+fibonacci(10));
	}

}
