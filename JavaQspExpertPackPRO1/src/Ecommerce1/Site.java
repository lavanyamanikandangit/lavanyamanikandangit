package Ecommerce1;
import java.util.*;

public class Site {
	public static List <product> products=new ArrayList<product>();
	public static List <user> users=new ArrayList<user>();
	 
	static
	{
		products.add(new product(1,"LG mobile",9000,"LG"));
		products.add(new product(2,"Sony TV",69000,"SONY"));
		products.add(new product(3,"IPOD",59000,"Apple"));
		products.add(new product(4,"Dell Laptop",9000,"Dell"));
		products.add(new product(5,"RealMe",9000,"Realme"));
	}
	static
	{
		users.add(new user("D101","Lavanya","lavan@gmail.com","lavan@gmail.com"));
		users.add(new user("D102","Ezhilan","ezhil@gmail.com","ezhil@gmail.com"));
		users.add(new user("T101","Kavitha","kavi@gmail.com","kavi@gmail.com"));
	}
public static boolean login(String un,String pwd )
{
	for(user U : users)
	{
		if (U.username.equals(un) && U.getPassword().equals(pwd))
			System.out.println("login successful");
			return true;
	}
			System.out.println("invalid login credentials");
		
			return false;
}

public static void main (String [] args)
 {
			System.out.println("please login into your account\n");
			
			 System.out.println("Enter your username and password :");
			 Scanner s = new Scanner(System.in);
			 String un= s.nextLine();
			 String pwd=s.nextLine();
				
			login(un,pwd);
			
			
		 	 System.out.println("---------------------------------------------------------");
        	 String option="Y";
        	 while(option.equalsIgnoreCase("Y"))
        	 {
        		 System.out.println("\nPlease choose from the product list\n");
        		 for(product pr: products)
        		 {
        			 System.out.println(pr);
        		 }
		
				System.out.print("\nEnter your option:[ Product Id]:");
				Scanner s1=new Scanner(System.in);
				int pId=s1.nextInt();
				
				System.out.print("\nEnter your quantity:");
				int quantity=s1.nextInt();

			for(product pr: products)
			{
				if(pr.id==pId)
				{
					System.out.println(pr);
					product1.l.put(pr,quantity);
					product.finalprice+=pr.price*quantity;
				}
			}
		
			System.out.println("Your bill amount is :"+product.getFinalPrice());
			System.out.print("\nDo you want to Continue: [Y/N]");
			option=s1.next();
        	 }
	
        	 	System.out.println("Your Total Bill Amount is:Rs. "+product.getFinalPrice());
 }

}		




