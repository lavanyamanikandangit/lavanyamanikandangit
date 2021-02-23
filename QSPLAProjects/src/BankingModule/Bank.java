package BankingModule;
import java.util.*;

public class Bank 
{
	static String name,mailId,address,dateOfOpen,option,BankName = "HDFC",accNo;
	static long ph_no;
	static double minmum_balance=500, balance;
	int year=2020;
	static int CustCount = 100;
	private String password;
	private static String statement;
public Bank() {
		//auto generating account number
        this.accNo=BankName+year+ ++CustCount;
        System.out.println(accNo);
	}
	{
        System.out.println("Account is created\n");
    }

		
	public  Bank(String name,long ph_no, String mailId,String address,String dateOfOpen,String password) {
		this();
		this.name=name;
		this.mailId=mailId;
		this.address=address;
		this.ph_no=ph_no;
		this.dateOfOpen=dateOfOpen;
		this.balance=minmum_balance+balance;
	    this.password=password;
	    statement="Opening balance : "+balance;
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
	
	public static void accountDetails() 
	{
	 System.out.println("The account details are:");
       	System.out.println("Customer Name      :"+name);
		System.out.println("AccountNumber      :"+ accNo);
		System.out.println("Phone Number       :"+ph_no);
		System.out.println("Email id           :"+mailId);
		System.out.println("Address            :"+address);
		System.out.println("Date of Opening    :"+ dateOfOpen);
		System.out.println("Account  Balance:Rs."+ balance);
	
	}
	
	public static void Deposit(double amount) 
	{
		//updating the balance
        balance= balance+amount;

        //storing the statement
        statement = statement +"\n"+"deposit : "+amount+ "\tbalance :"+balance;

        System.out.println("Amount deposited successfully");
        System.out.println("Your latest balance is :"+balance+"\n");
	}
	public static void Withdrawal(double amount) { 
	Scanner wd=new Scanner(System.in);
	
		  ///check for funds
        if( amount <= balance )
        {
            //check for minmum balance
            if( minmum_balance <= (balance-amount) )
            {
            	System.out.println("Enter your PIN:");
				int PIN = wd.nextInt();
					if(PIN==1000) 
					{
						//update by subtracting the balance
						balance = balance - amount; 
						statement = statement +"\n"+"withdrwal : "+amount+ "\tbalance :"+balance;
						System.out.println("Your latest balance is :"+balance+"\n");
					}else 
						System.out.println("check your PIN");
            }
            else
                System.out.println("Insufficient funds");
        }
        else
            System.out.println("Insufficient funds");
	}
	

	public static void Transfer(double amount, int B_acn) 
	{
		Scanner wd=new Scanner(System.in);
        //check for funds
        if( amount <= balance )
        {
            //check for minimum balance
            if( minmum_balance <= (balance-amount) )
            {
            	System.out.println("Enter your PIN:");
				int PIN = wd.nextInt();
					if(PIN==0001) 
					{
						//update by subtracting the balance
						balance = balance - amount; 
						System.out.println("Amount transferred succesfully");

						//amount is moved from our account to beneficiary
						statement = statement +"\n"+"tranferred to :"+B_acn+" : "+amount+ "\tbalance :"+balance;
						System.out.println("Your latest balance is :"+balance+"\n");
					}else 
						System.out.println("check your PIN");
            }
            else
                System.out.println("Insufficient funds");
        }
        else
            System.out.println("Insufficient funds");
    
}
		
	        
public static void main(String[] args) 
{
	System.out.println("Welcome to Our Bank");
	Scanner s=new Scanner(System.in);
	int incorrect=0;

    //create objects for accounts
	Bank acc1=new Bank("Lavanya",923456423,"asdasd@gmail.com","Chennai","01-10-2020","123456");
//	Bank acc2=new Bank("Ezhilan",789654321,"ezhil@gmail.com","Madurai","15-10-2020","qwerty");
	 System.out.println("Please login into your account\n");


	 while(incorrect<3)
     {
         System.out.println("Username :");   String u=s.nextLine();
         System.out.println("Password :");   String p=s.nextLine();

         if(acc1.login(u, p))
         	{
	        	System.out.print("-----------------------------------------------------\n"+
        						"Enter the options: View Account Details, Deposit,  Withdrawal;  Transfer; Statement ,Exit: \n");
//	        	String option = s.next();
	        	while(true) 
	        	{
	        		 System.out.println("\nPlease enter your option\n");
	                 String option=s.next();
	        	
	        		switch (option) 
	        			{
	        				case "view"			:accountDetails();
						        				 break;
							case "deposit"		:System.out.println("Enter the amount to be deposited\n");
												 int amount=s.nextInt();
												 acc1.Deposit(amount);
												 break;
					
							case "withdrawal"   : System.out.println("Enter the amount to Withdraw\n");
												 amount=s.nextInt();
												 acc1.Withdrawal(amount);
												 break;
					
								
							case "transfer"		:System.out.println("Enter the benficiary account number");
					        						int ac=s.nextInt();
											        if( CustCount>ac)
											        {
											            //check for valid account no
											            System.out.println("Enter the amount");
											            amount=s.nextInt();
											            acc1.Transfer(amount, ac);
											        }
											        else
											            System.out.println("Account number not valid");
											        
											     break;
							case "statement"	:System.out.println(acc1.statement); break;
							case "exit"			:System.out.println("Thank You for banking with us");
												 System. exit(0);break;
							default:System.out.println("Incorrect option");
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




	




	

