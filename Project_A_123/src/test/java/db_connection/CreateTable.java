package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception 
	{
		
		
				String CREATE_TABLE_SQL="CREATE TABLE MQ.trainers ("
                + "UID INT NOT NULL,"
                + "NAME VARCHAR(60) NOT NULL,"
                + "DOB DATE NOT NULL,"
                + "EMAIL VARCHAR(45) NOT NULL,"
                + "MOBILE INT NOT NULL,"
                + "PRIMARY KEY (UID))";
				
				
				String INSERT_DATA="INSERT INTO `mq`.`trainers` (`UID`, `NAME`, `DOB`, `EMAIL`, `MOBILE`) VALUES ('100', 'sai', '1985-12-12', 'sai.kishan@gmail.com', '96526');";
				
				
				String jdbcUrl = "jdbc:mysql://localhost:3306/mq";
			    String username = "root";
			    String password = "sunil680806";
			    
			    
		    	Connection conn = null;
		    	Statement stmt = null;

			   
		    	conn = DriverManager.getConnection(jdbcUrl, username, password);
		    	stmt = conn.createStatement();

		    	/*stmt.executeUpdate(CREATE_TABLE_SQL);
		    	System.out.println("Table Created");
		    	*/
		    	
		    	stmt.executeUpdate(INSERT_DATA);
		    	System.out.println("Data insertion successfull");
		    	
	

	}

}
