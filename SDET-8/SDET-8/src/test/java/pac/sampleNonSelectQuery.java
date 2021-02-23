package pac;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class sampleNonSelectQuery {
	public static void main(String[] args) throws SQLException, IOException
	{
	//step1:register the database Driver
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
	//step2:get the connection to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","root");
		
	//step3:issue create statement object
		Statement state=con.createStatement();
		
	//step4:execute query
		int result=state.executeUpdate("insert into project values('TY_PROJ_991','Avi','04/11/2020','automation'));
				//			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getInt(6));
		}catch(Exception e) {
		}finally {
			if(result==1) {
			System.out.println("project created");
		
		}else {
			System.err.println("project not created");
		}
		}
	//step5:close the connection
		con.close();
		
		
	}
}
