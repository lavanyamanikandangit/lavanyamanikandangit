package practice;

import java.util.Scanner;

public class reverse {
//	     
//	     public static void main(String[] args) {    
//	         String string = "Welcome to css corp";    
//	         //Stores the reverse of given string    
//	         String reversedStr = "";    
//	             
//	         //Iterate through the string from last and add each character to variable reversedStr    
//	         for(int i = string.length()-1; i >= 0; i--){    
//	             reversedStr = reversedStr + string.charAt(i);    
//	         }    
//	             
//	         System.out.println("Original string: " + string);    
//	         //Displays the reverse of given string    
//	         System.out.println("Reverse of given string: " + reversedStr);    
//	     }    
//	 }    

public static void main(String[] args)
{
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter Stirng");
//    String str=sc.nextLine();
	String str="lavanya sdet ";
    int count=1;
    char[] ch=str.toCharArray();
  if(ch[0]==' ')
  {
	  count=0;
  
  }
    for(int i=0;i<ch.length-1;i++)
    {
    	
    	if (ch[1]==' '&&ch[i]!=' ')
    	{
    		count++;
    	}	
    }
    	System.out.print(count);
//        if(i%2==0)
//        {
//            System.out.print(Character.toUpperCase(str.charAt(i)));
//        }
//        else
//        {
//            System.out.print(Character.toLowerCase(str.charAt(i)));
//        }
    }

//    sc.close();
}

