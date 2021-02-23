package BankingModule;


	//propeer banking module

	import java.util.*;

	public class Banking 
	{
	    static
	    {
	        System.out.println("Welcome to CitiBank");
	    }
	    static int CustCount=100, year=2020;
	    static String BankName="CT";
	    //any variable depicting currency should be a floating point
	    static double minmum_balance=500;
	    
	    //properties
	    String name, accNo,address;
	    double balance;
	    long phone;

	    //critical data must always be hidden
	    private String password;
	    private String statement;

	    public Banking()
	    {
	        //auto generating account number
	        this.accNo=BankName+year+ ++CustCount;
	    }

	    public Banking(String name, String address, double balance, long phone, String password)
	    {
	        this();//creating account number
	        this.name=name;
	        //in a banking module we have to maintain a minimum balance
	        this.balance=minmum_balance+balance;
	        this.address=address;
	        this.phone=phone;
	        this.password=password;
	        statement="Opening balance : "+balance;
	    }

	    {
	        System.out.println("Account is created\n");
	    }

	    public boolean login(String u, String p)
	    {
	        //login using username and password
	        if(u.equals(name) && p.equals(password ))
	        {
	            System.out.println("Login Successfull\n");
	            return true;
	        }
	        else
	        {
	            System.out.println("Invalid credentials\n");
	            return false;
	        }
	    }

	    public void viewAccountDetails()
	    {
	        //print the account details but dont print password
	        System.out.println("The account details are:");
	        System.out.println("Name          : "+name);
	        System.out.println("Account no    : "+accNo);        
	        System.out.println("Phone no      : "+phone);
	        System.out.println("Address       : "+address);        
	        System.out.println("balance       : "+balance+"rs");
	    }

	    public void deposit(double amount)
	    {
	        //updating the balance
	        balance= balance+amount;

	        //storing the statement
	        statement = statement +"\n"+"deposit : "+amount+ "\tbalance :"+balance;

	        System.out.println("Amount deposited successfully");
	        System.out.println("Your latest balance is :"+balance+"\n");
	    }
	    
	    public void withdraw(double amount)
	    {
	        ///check for funds
	        if( amount < balance )
	        {
	            //check for minmum balance
	            if( minmum_balance < (balance-amount) )
	            {
	                //update by subtracting the balance
	                balance = balance - amount; 
	                statement = statement +"\n"+"withdrwal : "+amount+ "\tbalance :"+balance;
	                System.out.println("Your latest balance is :"+balance+"\n");
	            }
	            else
	                System.out.println("Insufficient funds");
	        }
	        else
	            System.out.println("Insufficient funds");
	    }
	    
	    public void tranfer(double amount, int B_acn)
	    {
	            //check for funds
	            if( amount < balance )
	            {
	                //check for minimum balance
	                if( minmum_balance < (balance-amount) )
	                {
	                    //update by subtracting the balance
	                    balance = balance - amount; 
	                    System.out.println("Amount transferred succesfully");

	                    //amount is moved from our account to beneficiary
	                    statement = statement +"\n"+"tranferred to :"+B_acn+" : "+amount+ "\tbalance :"+balance;
	                    System.out.println("Your latest balance is :"+balance+"\n");
	                }
	                else
	                    System.out.println("Insufficient funds");
	            }
	            else
	                System.out.println("Insufficient funds");
	        
	    }
	    
	    public static void main(String[] args) 
	    {
	        Scanner s=new Scanner(System.in);

	        //to moniter invalid attempts
	        int incorrect=0;

	        //create objects for accounts
	        Banking acc1=new Banking("Qspiders","Vadapalani, Chennai",500.50,9876543210l,"qsp@123");
	        
	        Banking acc2=new Banking("Jspiders","Vadapalani, Chennai",50000.50,9876543210l,"qsp@123");
	        Banking acc3=new Banking("Pyspiders","Vadapalani, Chennai",50000.50,9876543210l,"qsp@123");
	        

	        System.out.println("Please login into your account\n");

	        //ask for login credentials
	        while(incorrect<3)
	        {
	            System.out.println("Username :");   String u=s.nextLine();
	            System.out.println("Password :");   String p=s.nextLine();

	            if(acc1.login(u, p))
	            {
	                //if login successfull
	                //perform the banking operation

	                System.out.println("---------------------------\n"+
	                                   "Please choose your operation\n");

	                System.out.println(
	                    "1. View Account details\n"+
	                    "2. Deposit an amount\n"+
	                    "3. Withdraw the amount\n"+
	                    "4. Transfer to another account\n"+
	                    "5. View Bank Statement\n"+
	                    "6. Exit\n");

	                    
	                while(true)
	                {
	                    System.out.println("\nPlease enter your option\n");
	                    String choice=s.next();
	                    switch (choice) 
	                    {
	                        case "view"         : acc1.viewAccountDetails();   break;
	                        
	                        case "deposit"      : System.out.println("Enter the amount to be deposited\n");
	                                                int amount=s.nextInt();
	                                                acc1.deposit(amount);
	                                                break;

	                        case "withdraw"   : System.out.println("Enter the amount to Withdraw\n");
	                                                amount=s.nextInt();
	                                                acc1.withdraw(amount);
	                                                break;

	                        case "transfer"     : System.out.println("Enter the benficiary account");
	                                                int ac=s.nextInt();
	                                                if( CustCount>ac)
	                                                {
	                                                    //check for valid account no
	                                                    System.out.println("Enter the amount");
	                                                    amount=s.nextInt();
	                                                    acc1.tranfer(amount, ac);
	                                                }
	                                                else
	                                                    System.out.println("Account no not valid");
	                                                break;
	                        
	                        case "statement"    : System.out.println(acc1.statement); break;

	                        case "exit"         : System.out.println("thank you for banking with us");
	                                              System.exit(0);
	                                              break;

	                        default : System.out.println("incorrect option");                            
	                    }
	                }
	            }
	            else
	            {
	                //incorrect credentials causes blocking the account
	                incorrect++;
	            }
	            if(incorrect==3)
	                System.out.println("Account blocked for 24 hours");
	        }
	    }
	}


