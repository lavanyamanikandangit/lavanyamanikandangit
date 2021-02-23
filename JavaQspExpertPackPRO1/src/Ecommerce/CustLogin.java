package Ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class CustLogin {
	
	    int id;
	    String name;
	    static String prod_name;
		static	long prod_price;
		static	long final_price;
		static char prod_avail;
		
	    public CustLogin(String name, int id)
	    {
	        this.name=name;
	        this.id=id;
	    }

	   
	    public String toString()
	    {
	        return name+"\t"+id;
	    }
public static void main(String[] args) 
{
	    	Scanner sc=new Scanner(System.in);
	    	
	    	System.out.print("Enter User Name: ");
	    	String userName =sc.next();

	    	System.out.print("Enter Password: ");
	    	String password=sc.next();
	    	view_prod();
	    	TotalBill();
	    	System.out.print("Enter Customer Name: ");
	    	String name =sc.next();

	    	System.out.print("Enter Customer Email ID: ");
	    	String email=sc.next();

	    	System.out.print("Enter Customer phone Number: ");
	    	long ph_no=sc.nextLong();
	    	
	    	System.out.println("Total bill Amount is: Rs."+final_price);
	    	System.exit(0);
	    
}
static void view_prod()
{
	    System.out.print("MobilePhones"+"\t");
	    String[] ref= {"Vivo","Redmi","Samsung","Blackberry","Nokia"};
	    for(String a:ref) 
			System.out.print(a+", ");
		    System.out.println("\n");
			Mobile();
			
		System.out.print("Laptops"+"\t");
		String[] ref2= {"Lenevo","Samsung","HP","Sony","Apple"};
	    for(String a:ref2) 
			System.out.print(a+", ");
		    System.out.println("\n");
    	   	Laptops();
    	
    	System.out.print("TV"+"\t");
    	String[] ref3= {"Mi","Samsung","Panasonic","LG","Philips"};
	    for(String a:ref3) 
			System.out.print(a+", ");
		    System.out.println("\n");
    	   	TV();
    	
    	System.out.print("AC"+"\t");
    	String[] ref4= {"Voltas","Samsung","Haier","LG","Hitachi"};
	    for(String a:ref4) 
			System.out.print(a+", ");
		    System.out.println("\n");
    	   	AC();
    	
    	System.out.print("Refrigerators"+"\t");
    	String[] ref5= {"Whirlpool","Samsung","Godrej","LG","Korej"};
	    for(String a:ref5) 
			System.out.print(a+", ");
		    System.out.println("\n");
    	   	 Refrigerators();
	   return;
}
	    static void Laptops() 
	    {
	    	Scanner sc=new Scanner(System.in);
	        Object [] a = new Object[5];
	        int prodCount=0;

	        a[prodCount++]=new CustLogin("Lenevo",15001);
	        a[1]=new CustLogin("Samsung",29999);
	        a[2]=new CustLogin("HP",11999);
	        a[3]=new CustLogin("Sony",22999);
	        a[4]=new CustLogin("Apple",33999);
	        for( int i =0;i<a.length;i++)
	        {
		        System.out.println(a[i]);
		    }
	        LaptopsBrands();
	        System.out.println("--------------------");
	    }
	    static void TV() 
	    {
	    	Scanner sc=new Scanner(System.in);
	        Object [] a = new Object[5];
	        int prodCount=0;

	        a[prodCount++]=new CustLogin("Mi",15001);
	        a[1]=new CustLogin("Samsung",29999);
	        a[2]=new CustLogin("Panasonic",11999);
	        a[3]=new CustLogin("LG",22999);
	        a[4]=new CustLogin("Philips",33999);
	        for( int i =0;i<a.length;i++)
	        {
		        System.out.println(a[i]);
		     }
	        TVBrands();
	        System.out.println("--------------------");
	    }
	    static void AC() 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	
	        Object [] a = new Object[5];
	        int prodCount=0;

	        a[prodCount++]=new CustLogin("Voltas",15001);
	        a[1]=new CustLogin("Samsung",29999);
	        a[2]=new CustLogin("Haier",11999);
	        a[3]=new CustLogin("LG",22999);
	        a[4]=new CustLogin("Hitachi",33999);
	        for( int i =0;i<a.length;i++)
	        {
		        System.out.println(a[i]);
	        }

	        ACBrands();
	        System.out.println("--------------------");
	    }
	    static void Refrigerators()
	    {
	    	Scanner sc=new Scanner(System.in);
	        Object [] a = new Object[5];
	        int prodCount=0;

	        a[prodCount++]=new CustLogin("Whirlpool",15001);
	        a[1]=new CustLogin("Samsung",29999);
	        a[2]=new CustLogin("Godrej",11999);
	        a[3]=new CustLogin("LG",22999);
	        a[4]=new CustLogin("Korej",33999);
	        for( int i =0;i<a.length;i++)
	        {
		        System.out.println(a[i]);
		    }
	       RefrigeratorsBrands();
	       
	        System.out.println("--------------------");
	    }
	    static void Mobile() 
	    {
	    	Scanner sc=new Scanner(System.in);
	        Object [] a = new Object[5];
	        int prodCount=0;

	        a[prodCount++]=new CustLogin("Vivo",15001);
	        a[1]=new CustLogin("Redmi",29999);
	        a[2]=new CustLogin("Samsung",11999);
	        a[3]=new CustLogin("Blackberry",22999);
	        a[4]=new CustLogin("Nokia",33999);
	        for( int i =0;i<a.length;i++)
	        {
		        System.out.println(a[i]);
		    }
	        
	        MobilePhonesBrands() ;
	        System.out.println("--------------------");
	    }
	    void productDetails(String name,long price,char avail) 
	    {
	    	prod_name=name;
	    	prod_price=price;
	    	prod_avail=avail;
	    }

	    static void MobilePhonesBrands()
	    {
	    	
	    	int count=0;
	    	for(int i=0;i<5;i++) {
	    	Scanner sc=new Scanner(System.in);
	    	
	    	CustomerLogin cd=new CustomerLogin();
	    	System.out.print("Choose the Product to Buy: ");

	    	String str=sc.next();
	    	switch (str) 
	    	{
	    	case "Vivo":
	    		cd.productDetails("Vivo",15001,'Y');
	    		cd.reportGen();
	    		break;
	    	case "Redmi":
	    		cd.productDetails("Redmi",29999,'Y');
	    		cd.reportGen();
	    		break;
	    	case "Samsung":
	    		cd.productDetails("Samsung",11999,'Y');
	    		cd.reportGen();
	    		break;
	    	case "Blackberry":
	    		cd.productDetails("Blackberry",22999,'N');
	    		cd.reportGen();
	    		break;
	    	case "Nokia":
	    		cd.productDetails("Nokia",33999,'Y');
	    		cd.reportGen();
	    		break;
	    	default:System.out.println("You chose wrong one!!");
	    	}
	    	count++;
	    	}
	    }
	  
			static void  LaptopsBrands() 
		    {
				int count=0;
		    	for(int i=0;i<5;i++) {
		    	Scanner sc=new Scanner(System.in);
		    	CustomerLogin cd=new CustomerLogin();
		    	
		    	System.out.print("Choose the Product to Buy: ");

		    	String str=sc.next();
		    	switch (str) 
		    	{
		    	case "Lenevo":
		    		cd.productDetails("Lenevo",15001,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Samsung":
		    		cd.productDetails("Samsung",29999,'N');
		    		cd.reportGen();
		    		break;
		    	case "HP":
		    		cd.productDetails("HP",11999,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Sony":
		    		cd.productDetails("Sony",22999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Apple":
		    		cd.productDetails("Apple",33999,'Y');
		    		cd.reportGen();
		    		break;
		    	default:System.out.println("You chose wrong one!!");
		    	}
		    	count++;
		    	}
		    }
	    	static void  ACBrands() 
		    {
	    		int count=0;
		    	for(int i=0;i<5;i++) {
		    	Scanner sc=new Scanner(System.in);
		    	CustomerLogin cd=new CustomerLogin();
		    	
		    	System.out.print("Choose the Product to Buy: ");

		    	String str=sc.next();
		    	switch (str) 
		    	{
		    	case "Voltas":
		    		cd.productDetails("Voltas",15001,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Samsung":
		    		cd.productDetails("Samsung",29999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Haier":
		    		cd.productDetails("Haier",11999,'Y');
		    		cd.reportGen();
		    		break;
		    	case "LG":
		    		cd.productDetails("LG",22999,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Hitachi":
		    		cd.productDetails("Hitachi",33999,'Y');
		    		cd.reportGen();
		    		break;
		    	default:System.out.println("You chose wrong one!!");
		    	}
		    	count++;
		    	}
		    }
	    	static void  TVBrands() 
		    {
	    		int count=0;
		    	for(int i=0;i<5;i++) {
	    		Scanner sc=new Scanner(System.in);
		    	CustomerLogin cd=new CustomerLogin();
		    	
		    	System.out.print("Choose the Product to Buy: ");

		    	String str=sc.next();
		    	switch (str) 
		    	{
		    	case "Mi":
		    		cd.productDetails("Mi",15001,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Samsung":
		    		cd.productDetails("Samsung",29999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Panasonic":
		    		cd.productDetails("Panasonic",11999,'Y');
		    		cd.reportGen();
		    		break;
		    	case "LG":
		    		cd.productDetails("LG",22999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Philips":
		    		cd.productDetails("Philips",33999,'Y');
		    		cd.reportGen();
		    		break;
		    	default:System.out.println("You chose wrong one!!");
		    	}
		    	count++;
		    	}
		    }
	    	static void  RefrigeratorsBrands() 
		    {
	    		int count=0;
		    	for(int i=0;i<5;i++) {
		    	Scanner sc=new Scanner(System.in);
		    	CustomerLogin cd=new CustomerLogin();
		    	
		    	System.out.print("Choose the Product to Buy: ");

		    	String str=sc.next();
		    	switch (str) 
		    	{
		    	case "Whirlpool":
		    		cd.productDetails("Whirlpool",15001,'Y');
		    		cd.reportGen();
		    		break;
		    	case "Samsung":
		    		cd.productDetails("Samsung",29999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Godrej":
		    		cd.productDetails("Godrej",11999,'Y');
		    		cd.reportGen();
		    		break;
		    	case "LG":
		    		cd.productDetails("LG",22999,'N');
		    		cd.reportGen();
		    		break;
		    	case "Korej":
		    		cd.productDetails("Korej",33999,'Y');
		    		cd.reportGen();
		    		break;
		    	default:System.out.println("You chose wrong one!!");
		    	}
		    	count++;
		    	}
		    }
	    	
	    	
	    	
	    	 static void TotalBill() 
	 	    {
	 	    	Scanner sc=new Scanner(System.in);
	 	    	 try {
	 	    		
	 	        Object [] a = new Object[5];
	 	       
	 	        int prodCount=0;
	 	        a[prodCount++]=new CustLogin("Vivo",15001);
	 	        a[1]=new CustLogin("Samsung",29999);
	 	        a[2]=new CustLogin("Philips",11999);
	 	        a[3]=new CustLogin("LG",22999);
	 	        a[4]=new CustLogin("Philips",33999);
	 	        a[5]=new CustLogin("Haier",33999);
	 	      
	 	        for( int i =0;i<a.length;i++)
	 	        {
	 		        System.out.println(a[i]);
	 		     }}catch(Exception e) {
	 		    	 System.out.println("You can't add more than 5 Products");
	 		     }
}
}

