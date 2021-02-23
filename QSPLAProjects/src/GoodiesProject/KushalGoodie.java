package GoodiesProject;

import java.io.*;
import java.util.*;

class Item {
	String name;
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() { 
		return name + ": " + price;
	}
}

public class KushalGoodie  
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:/goodiesE1.txt");       
		Scanner sc=new Scanner(fis);
		
		int number_of_employees = Integer.parseInt(sc.nextLine().split(": ")[1]);
		
		System.out.println("Number of the employees:"+number_of_employees);
		ArrayList<Item> goodies_items = new ArrayList<Item>();

		while(sc.hasNextLine())  
		{
			
			String current[] = sc.nextLine().split(": ");
			goodies_items.add(new Item(current[0], Integer.parseInt(current[1])));
//			System.out.println(goodies_items);
		}
		sc.close();

		Collections.sort(goodies_items, new Comparator<Item>()
		{
			public int compare(Item a, Item b)
			{ 
				int c=a.price - b.price;
				System.out.println(a+","+b);
				return c;
			} 
		});

		int min_diff = goodies_items.get(goodies_items.size()-1).price;
//		System.out.println(min_diff);
		int min_index = 0;
		for(int i=0;i<goodies_items.size()-number_of_employees+1;i++) {
			int diff = goodies_items.get(number_of_employees+i-1).price-goodies_items.get(i).price;
//System.out.println(diff);
			if(diff<=min_diff) {
				min_diff = diff;
				min_index = i;
//				System.out.println(min_index);
			}
		}



		FileWriter fw = new FileWriter("D://output.txt");
		fw.write("The goodies selected for distribution are:\n\n");
		for(int i=min_index;i<min_index + number_of_employees; i++) {
			fw.write(goodies_items.get(i).toString() + "\n");
		}

		fw.write("\nAnd the difference between the chosen goodie with highest price and the lowest price is " + min_diff);
		fw.close();
	}
}