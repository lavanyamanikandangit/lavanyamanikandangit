package QSP;


	public class UserAccount 
	{

	    private String username;
	    private String password;
	    private String[][] accounts = {{"steve", "java1"},{"anthony", "supernova"}};

	    public UserAccount(String username, String password) 
	    {
	       this.username = username;
	       this.password = password;
	       
	    }

	    public boolean checkPassword()
	    {

	        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
	            return true;
	        else
	            return false;
	    }

//	    public void deactivateAccount()
//	    {
//	        boolean active = false;
//	    }

	}

