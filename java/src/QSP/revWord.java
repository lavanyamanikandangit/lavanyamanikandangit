package QSP;

public class revWord {
//	public static String reverseWord(String str){  
//	    String words[]=str.split("\\s");  
//	    String reverseWord="";  
//	    for(String w:words){  
//	        StringBuilder sb=new StringBuilder(w);  
//	        sb.reverse();  
//	        reverseWord+=sb.toString()+" ";  
//	    }  
//	    return reverseWord.trim();  
//	}  
////	
//public static void main(String[] args) {  
//    System.out.println(revWord.reverseWord("Java Programming Language"));  
////    System.out.println(revWord.reverseWord("I am sonoo jaiswal"));    
//    }  
//public class Reverse   
//{    
    public static void main(String[] args) {    
        String string = "Dream big";    
        String reversedStr = "";    
       for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
//} 
//	public static void main(String[] args) {
//		String str="Java programming language";
//		char[] ch=str.toCharArray();
//		String out="";
//		
//		for(int i=0;i<str.length();i++) {
//			String word="";
//		
//		while(i<ch.length && ch[i]!=' ') {
//			word=word+ch[i];
//		i++;
//		
//	}
//		
//		out=out+word+" ";
//		System.out.print(word.length()+" ");
//		
//	}
//		
//		System.out.println("\n"+out);
//		
//		
//		
//}  
//	  public static void main(String []args) {
//	      String str = "amit vnb";
//	      int count = 0;e
//	      System.out.println("String: "+str);
//	      for (int i = 0; i < str.length(); i++) {
//	         if (Character.isLetter(str.charAt(i)))
//	         count++;
//	      }
//	      System.out.println("Letters: "+count);
//	   }
}
