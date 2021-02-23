package testyantra;

public class tyPyramid1 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
//				if(i+j==3)
//				if(i<j)
//				if(i<=j)
				if(i>=j)
//				if(i+j<=n-1)
//				if(i+j>=n-1)
//				if(i>j)
//				if(i>j || i<j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
			//mirroring
//			System.out.print("|");
//			for(int j=0;j<n;j++)
//			{
//				
//				if(i<=j)
//				if(i+j>=n-1)		
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			
//		}
//		System.out.println();
//		}
	}
}
