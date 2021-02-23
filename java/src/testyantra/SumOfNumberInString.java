package testyantra;

public class SumOfNumberInString {
	public static void main(String[] args) 
    { 
		String str = "126abc4yz50+100"; 
        String temp = "0";
        int sum = 0; 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if (Character.isDigit(ch)) 
                temp =temp+ ch; 
            
            else { 
                sum =sum+ Integer.parseInt(temp); 
                temp = "0";
            }
            
        }
        sum=sum + Integer.parseInt(temp);
        System.out.println(sum);
    } 
    
} 
  

