package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_DB_Connection 
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		
		
		String DB_con_String="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="sunil680806";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			
			Connection con=DriverManager.getConnection(DB_con_String,username,password);
			System.out.println("DB_Connected");
			
			//Create Statement
			Statement stmt1=con.createStatement();
			//Execute query using statement
			ResultSet rs=stmt1.executeQuery("SELECT * FROM world.country WHERE Region='Middle East';");
			
			while(rs.next())
			{
				//Get each record value using its field names
				String Code=rs.getString("Code");
				String cityname=rs.getString("Name");
				String Region=rs.getString("Region");
				
				System.out.println(Code+"  "+cityname+"   "+Region);
				
				
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("DB connection failed");
		}
		
		

	}

}
