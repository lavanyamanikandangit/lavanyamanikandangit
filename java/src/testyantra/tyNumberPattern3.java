package testyantra;

public class tyNumberPattern3 {
	public static void main(String[] args)
	{

		int n=5;
		int count =0;
			for(int rows=0;rows<n;rows++){
			    
			    for (int col=0;rows>=col;col++){
			    
			        System.out.print(count++ + " ");
			        if(count==10) {
			        	count=0;
			        }
			    	
			    }
			    System.out.println();
			}
			
	}
}
