package QSP;

public class forLoopStrongNumber {
			public static void main(String [] args) 
		{
		int n;
		for(n=0;n<50;n++) 
		{
			
			int res=0,res1=0;
			for(int temp=n;temp>=0;temp/=10)
			{
				int fact=1;
				for(int i=temp%10;i>1;i--) 
					fact=fact*i;
					
					res=res+fact;
					res1=res1+(temp%10)*(temp%10)*(temp%10);
				
			}
				if(n == res)
					System.out.println("strong Number"+n);
				if(n == res1)
					System.out.println("Armstrong Number"+n);
				
		}
					
		}

	}
		


		



