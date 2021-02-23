package OOP;


abstract class Login1 
{
	public String username;
	public String password;
	public Login1(String username,String password) 
	{
		this.username=username;
		this.password=password;
	}
	
	public String getPassword() 
	{
		System.err.print("<p>");
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	abstract public void changePassword(String input);
	abstract public void printDetails();
}

class user extends Login1
{
	public user(String username,String password)
	{
		super(username,password);
	}
	
	@Override
	public void printDetails() 
	{
		System.out.println("The user Details are:");
		System.out.println("username: "+this.username);
		System.out.println("password: "+this.getPassword());
	}
	@Override
	public void changePassword(String input)
	{
		setPassword(input);
	}
}

public class Login
{
	public static void main(String[] args) 
	{
		Login1 u=new user("Lavanya","qwerty");
		u.printDetails();
		System.out.println("------------------");
		u.changePassword("asdfg");
		u.printDetails();
	}
}
