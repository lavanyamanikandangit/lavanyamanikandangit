package pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class sampleJDBCCode 
{
public static void main(String[] args) throws SQLException, IOException
{
//step1:register the database Driver
	Driver driverref=new Driver();
	DriverManager.registerDriver(driverref);
	
//step2:get the connection to database
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","root");
	FileInputStream fis=new FileInputStream("./dataBaseConfig.properties.txt");
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p);
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","root");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", p);
//step3:issue create statement object
	Statement state=con.createStatement();
	
//step4:execute query
	ResultSet result=state.executeQuery("select * from project");
	while(result.next()) {
		System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getInt(6));
	}
	
//step5:close the connection
	con.close();
	
	
}
}
