package QSP;

public class PalindromeRecursion 
{
	static int palindrome(int i)
	{ 
	   int r,sum=0,temp=i;    
	   while(i>0)
	   {    
	   r=i%10;    
	   sum=(sum*10)+r;    
	   i=i/10;    
	   }    
	  if(temp==sum) 
	  	{   
		  System.out.println("Given number is a "+" '"+"palindrome"+"' ");    
	  	}else  
	  		{  
	  	  System.out.println("Given number is"+" '"+"not a palindrome"+"' ");
	  		}
	  return sum;  
	}  
public static void main(String[] args) 
	{
	int n=12552621;
	System.out.println("The given number is :"+n);
	palindrome(n);
	}
}
