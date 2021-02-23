package Goodies;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	public static List<product> products=new ArrayList<product>();
//	static User u1=null;	
	
	static 
	{
		products.add(new product("Fitbit Plus", 7980));
		products.add(new product("IPods", 22349));
		products.add(new product("MI Band", 999));
		products.add(new product("Cult Pass", 2799));
		products.add(new product("Macbook Pro", 229900));
		products.add(new product("Digital Camera", 11101));
		products.add(new product("Alexa", 9999));
		products.add(new product("Sandwich Toaster", 2195));
		products.add(new product("Microwave Oven", 9800));
		products.add(new product("Scale", 4999));
	
	}
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:/goodiesE1.txt");
		
		String  E1="abcd";

		for(product p: products)
		{
			System.out.println(p);
		}
		System.out.println("Number of the Employees:");
		

		/*
		 * Scanner s=new Scanner(System.in); int M=s.nextInt();
		 */
		FileWriter fw=new FileWriter(f);
		fw.write("Fitbit Plus: 798 0\n"
				+ "Microwave Oven: 9800\n"
				+ "Alexa: 9999\n"
				+ "Digital Camera: 11101\n"
				+ "");
		fw.flush();
		fw.close();
		
		
		
		FileReader fr=new FileReader(f);
		int unicod=0;
		while((unicod=fr.read())!=-1);
			System.out.println((char)unicod+",");
			
//		System.out.println("Enter your option:");
//		Scanner s1=new Scanner(System.in);
//		String pName=s1.nextLine();
//		System.out.println("Here the goodies that are selected for distribution are:");
//for(int i=1;i<=M;i++) {
//	
//		for(product p: products)
//		{
//			
//			if(p.name.equalsIgnoreCase(pName) )
//			{
//				
//				System.out.println(p);
//				
//			}
//		}
//}
	}
	
}
