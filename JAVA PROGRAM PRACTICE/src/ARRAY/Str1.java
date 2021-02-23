package ARRAY;

public class Str1 
{
	
   	public static void main(String args[])
		{  
		String s1="Hi how are you";  
		String  reverse = "";
		String[] words=s1.split("\\s");
		for(String w:words)
		{  
		System.out.println(w);  
		
		int length = w.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = rev( w.charAt(i)) +" ";

	    System.out.println("Reverse of the string: " + reverse+" ");
		}
	}

		
}

