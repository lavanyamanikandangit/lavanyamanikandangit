package QSP;

public class string {

	static int count(String[] str,String word)
	{
		int count=0;
		for(int i=0;i<str.length;i++) 
		{
		if (str[i]==word)
			count++;
		}
		return count;
	}
public static void main(String[] args) {
	String str[]= {"hi","bye","hi"};

	for(int i=0;i<str.length;i++)
	{
		
		System.out.println(str[i]+" "+count(str,str[i]));
	}
	
}




}
