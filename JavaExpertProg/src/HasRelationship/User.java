package HasRelationship;


class Google//driven class
{
	String name,email,password;
	public Google() {}
	public Google(String name,String email,String password)
	{
		this.name=name;
		this.email=email;
		this.password=password;
	}
	{
	System.out.println("Account is created");
	}
	void use()
	{
		System.out.println(name+" is using google");
	}
	public boolean login(String u,String p)
	{
		if(u==email && p==password)
		{
			System.out.println("Login sucessful");
			return true;
		}
		else
		{
			System.out.println("Invalid credentials");
			return false;
		}
	}
		
}

 class User //driver class
 {
public static void main(String[] args) 
{
	Google Acc=new Google("abc","a@gmail.com","qwer");
			if(Acc.login("a@gmail.com", "qwer"))
			{
				Acc.use();
			}
}
}

