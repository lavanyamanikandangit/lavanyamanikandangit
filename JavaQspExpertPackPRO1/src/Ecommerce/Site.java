package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Site {
		
		public static List<product> products=new ArrayList<product>();
//		static User u1=null;	

		static 
		{
			products.add(new product("Redmi", "Mobiles", 15999));
			products.add(new product("Realme", "Mobiles", 17999));
			products.add(new product("Dell Inspiron", "Laptop", 45999));
			products.add(new product("Sony Bravia", "TV", 55999));
			products.add(new product("LG","TV",60000));

		}
		
		public static void main(String[] args) 
		{
			User u1 = new User("Abcde");

			System.out.println("Hello "+u1.name);

			String option="Y";
			while(option.equalsIgnoreCase("Y"))
			{
				System.out.println("Please choose from the product list\n"
						+"-----------------------------------");
				for(product p: products)
				{
					System.out.println(p);
				}
				System.out.println("\n Enter your option:[Name]:");

				Scanner s=new Scanner(System.in);

				String pName=s.nextLine();
				System.out.println("Enter your quantity:");
				int quantity=s.nextInt();

				for(product p: products)
				{
					if(p.name.equalsIgnoreCase(pName))
					{
						u1.l.put(p,quantity);
						product.finalPrice+=p.price*quantity;
					}
				}

				
				
				System.out.println("Your bill amount is :"+product.getFinalPrice());
				
				System.out.println("\nDo you want to Continue: [Y/N]");
				
				option=s.next();
			}
			System.out.println("Thank you for Shopping...");
			System.out.println("Your Final Bill is "+product.getFinalPrice());
			System.out.println("Please proceed forward for payment");
			
		}
	}

