package Goodies;

import java.io.*;
public class asdfgh 
{
	public static void main(String[] args) throws IOException{
		
		File f=new File("D:/abcde.txt");
		
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("\nAnd the difference between the chosen goodie with highest price and the lowest price is ");
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader(f);
		
		int i=0;
		
		while( (i=fr.read())!=-1)
			System.out.print((char)i);
	}
}
