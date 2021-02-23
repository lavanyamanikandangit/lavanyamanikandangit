package Ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLogin 
{
	static String prod_name;
	static	long prod_price;
	static	long final_price;
	static char prod_avail;
	static long final_price1=0;
	static long final_price2=0;
	static long final_price3=0;
	static long final_price4=0;
	static long final_price5=0;
	


static void view_products()
{
	String[] ref= {"Lenevo-Tablet","Samsung-Tablet","Mi","HP","Apple"};
//	ArrayList ref=new ArrayList();
//	ref.add(0, "Lenevo-Tablet");
//	ref.add(1, "Samsung-Tablet");
//	ref.add(2, "Mi");
//	ref.add(3, "HP");
//	ref.add(4, "Apple");
//	System.out.println("Using for Loop:");
//	   for(int i = 0; i < ref.length; i++) {
//	     System.out.println(ref[i]);
	for(String a:ref) {
		System.out.print(a);
		System.out.print(", ");
	   }
//	System.out.println(ref);
	return;
		
}
	
void productDetails(String name,long price,char avail) 
{
	prod_name=name;
	prod_price=price;
	prod_avail=avail;
}
	
void reportGen() 
{
	try {
				if( prod_avail=='Y') 
				{
				Scanner sc1=new Scanner(System.in);
				System.out.print("Enter the Quantity: ");
				int qty=sc1.nextInt();
//				System.out.println("Product is Available");
				System.out.println("Product Name\tPrice Rs.\tAvailability\tQuantity\tFinalPrice");
				final_price=prod_price*qty;
				System.out.println(prod_name+"\t\t"+prod_price+"\t\t"+prod_avail+"\t\t"+qty+"\t\t"+final_price);
				}else 
				{
				System.out.println("Product is not Available,"+" "+" 'Sorry for the inconvinience'"+"\n");
//	System.exit(prod_avail);
				}
	}
				catch(Exception e) {
					System.out.println("Check once the Quantity!");
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
	CustomerLogin cd=new CustomerLogin();
	
	System.out.print("\nChoose the Product to Buy: ");

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
	System.out.print("Enter Customer Name: ");
	String name =sc.next();

	System.out.print("Enter Customer Email ID: ");
	String email=sc.next();

	System.out.print("Enter Customer phone Number: ");
	long ph_no=sc.nextLong();
	
	System.out.println("Total bill Amount is: Rs."+final_price);
	System.exit(0);
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter User Name: ");
		String userName =sc.next();

		System.out.print("Enter Password: ");
		String password=sc.next();
	
		view_products();
		
		cust_Details();	
}
static void bill(){

		long TotalAmount=(final_price1+final_price2+final_price3+final_price4+final_price5);
    	System.out.println("Total Bill Amount="+TotalAmount);
		
}

void finalBill() {
long TotalAmount=(final_price1+final_price2+final_price3+final_price4+final_price5);
System.out.println("Total Bill Amount="+TotalAmount);
}
}



