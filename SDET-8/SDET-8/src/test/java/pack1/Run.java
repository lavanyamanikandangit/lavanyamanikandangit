package pack1;

class DriverManager{
	
	static Connection c1=null;
	private DriverManager() {}
	
	public static Connection getConnection(String dbname) 
	{	
	if (dbname.contentEquals("testYantra")) {
		c1=new ConnectionTY();
	}else if (dbname.equals("Oracle")) {
		c1= new ConnectionOracle();
	}else if (dbname.equals("db2")) {
		c1= new ConnectionDB2();
	}
		return c1;
	
	}
}
interface Connection{				//API
	public Statement createStatement();
}
interface Statement{
	public void executeQuery();
}

public class Run{
	public static void main(String[] args) {
		Connection c1=DriverManager.getConnection("db2");
		Statement s=c1.createStatement();
	}
}





















