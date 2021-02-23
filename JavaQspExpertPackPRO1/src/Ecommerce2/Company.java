package Ecommerce2;


	import java.util.*;

	public class Company 
	{
		//arraylist from collection and creating generic class 
		public static  List<Emp> l=new ArrayList<Emp>();
		//Initializing the variables
		static 
		{
			l.add(new Emp("Qspiders", "qsp", 24999.59, "qsp@123") );
			l.add(new Emp("Jspiders", "jsp", 22999.59, "jsp@123") );
			l.add(new Emp("Pyspiders", "pysp", 26999.59, "pysp@123"));
		}
		//printing the  employee details
		public static void Work(Emp e)
		{
			System.out.println("-----------------");
			System.out.println("The employee working is");
			System.out.println(e);
			System.out.println("--------------------");
		}
		
		public static void main(String[] args) 
		{
			System.out.println("Enter the username and password");
			//geting un,pw from user
			Scanner s=new Scanner(System.in);
			
			String u=s.nextLine();
			String p=s.nextLine();
			
			Emp e=new Emp();//object creation
			
			e.user=u;
			e.setPswd(p);
		
			boolean LOG=false;
			for(Emp e1 : l)
			{
				//checking the input received from user and from array list
				if (e1.equals(e) )
				{
					e = e1;
					LOG=true;//fetching the particular user data
					break;
				}
			}
			
			if(LOG)
			{
				System.out.println("Login sucessfull");
				Work(e);//calling work method 
			}
			else
				System.out.println("Invalid credentials");
			
		}
	}

	class Emp
	{
		//declaring the variable
		String Name, user;
		double salary;
		private String pswd;
		//zero parameter constructor
		public Emp() {}
		//Parameterized constructor to pass the variables 
		public Emp(String name, String user, double salary, String pswd) {
			super();
			Name = name;
			this.user = user;
			this.salary = salary;
			this.pswd = pswd;
		}
		
		//getters and setters method for all the variable
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getPswd() {
			return pswd;
		}
		public void setPswd(String pswd) {
			this.pswd = pswd;
		}
		
		// overriding the toString method to obtain the informataion
		@Override
		public String toString() {
			return "Emp [Name=" + Name + ", user=" + user + ", salary=" + salary + ", pswd=" + pswd + "]";
		}
		//overriding the equals method to compare the username and password
		@Override
		public boolean equals(Object obj)
		{
			Emp e=(Emp) obj;//downcasting
			// checking all the matching data's from arraylist 
			if( this.user.equals(e.user)  && this.pswd.equals(e.pswd))
				return true;
			
			return false;
		}
	}

