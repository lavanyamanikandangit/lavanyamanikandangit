package Ecommerce1;

public class user {

	String userid,username,email;
	 String password;
	
	public user(String userid, String username,String email, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password=email;
		
	}


	public user(String username,String password)
	{
		
		this.username=username;
		this.password=password;
	}

 



public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


public String toString() {
	return "User Id:"+userid+", "+"User Name:"+username+", "+"Email:"+email+", "+"password:"+password;
}
}
