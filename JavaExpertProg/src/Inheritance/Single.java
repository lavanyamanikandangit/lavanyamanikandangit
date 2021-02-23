package Inheritance;
 class Google
 {
	 String username,password;
	 public Google() {}
	 public Google(String username,String password)
	 {
		 this.username=username;
		 this.password=password;
	 }
	
 
 public boolean login(String u,String p)
 {
	 if (username==u && password==p)
	 {
		 System.out.println("login successful");
		 return true;
	 }
	 else
	 {
		 System.out.println("invalid credentials");
		 return false;
		 
	 }
 }
 }
 
	
 class Gmail extends Google
 {
	 public Gmail() {}
	 public Gmail(String username,String password)
	 {
		 super("")
	 }
	 
	 	void enjoy() 
	 	{
	 		
		 System.out.println(name+" enjoying");
	 	}
 
public static void main(String[] args) {
	


	
}
}
