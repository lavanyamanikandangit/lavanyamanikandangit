package Ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class copyOfCustomerLogin 
{
	static String prod_name;
	static	long prod_price;
	static	long final_price;
	static char prod_avail;
	



	
void productDetails(String name,long price,char avail) 
{
	prod_name=name;
	prod_price=price;
	prod_avail=avail;
}
	
void reportGen() 
{
		System.out.println("Product Name:"+prod_name);
		System.out.println("Product Price: Rs."+prod_price);
		System.out.println("Product Availability:"+prod_avail);
		
		
			if( prod_avail=='Y') {
				Scanner sc1=new Scanner(System.in);
				System.out.print("Enter the Quantity: ");
				int qty=sc1.nextInt();
				System.out.println("Product is Available");
				 final_price=prod_price*qty;
				System.out.println("Total Bill Amount:Rs. "+final_price+"\n");

			}else {
				System.out.println("Product is not Available,"+" "+" 'Sorry for the inconvinience'"+"\n");
	System.exit(prod_avail);
			}
		return ;
		
}
		

 //public String toString() 
//	{
//	return prod_name+" "+prod_price+" "+prod_avail;	
//	
//	}
	
static void cust_Details() 
{
	Scanner sc=new Scanner(System.in);
	copyOfCustomerLogin cd=new copyOfCustomerLogin();
	
	System.out.print("Choose the Brand to Buy: ");

	String str=sc.next();
	System.out.println(str);
	switch (str) {
	case "Lenevo":
		cd.productDetails("Lenevo-Tablet",20000,'Y');
		cd.reportGen();
		break;
	case "Samsung":
		cd.productDetails("Samsung-Tablet",10000,'N');
		cd.reportGen();
		break;
	case "Mi":
		cd.productDetails("Mi",10000,'Y');
		cd.reportGen();
		break;
	case "HP":
		cd.productDetails("HP",10000,'N');
		cd.reportGen();
		break;
	case "Apple":
		cd.productDetails("Apple",10000,'N');
		cd.reportGen();
		break;
	default:System.out.println("You chose wrong one!!");
	}
//	System.out.print("Enter Customer Name: ");
//	String name =sc.next();
//
//	System.out.print("Enter Customer Email ID: ");
//	String email=sc.next();
//
//	System.out.print("Enter Customer phone Number: ");
//	long ph_no=sc.nextLong();
	
//	System.out.println("Total bill Amount is: Rs."+final_price);
//	System.exit(0);
}
public static void main(String[] args) 
{
//	Scanner sc=new Scanner(System.in);
//		
//		System.out.print("Enter User Name: ");
//		String userName =sc.next();
//
//		System.out.print("Enter Password: ");
//		String password=sc.next();
	
//		view_products();
		
		cust_Details();	
	
}

}



