package QSP;

public class factorial 
{
public static void main(String[] args) 
{
	int n=1,fact=1;
	while(n<5) 
		fact=fact*++n;
		System.out.println("Factorial of "+ n +" is : "+fact);
}
}
