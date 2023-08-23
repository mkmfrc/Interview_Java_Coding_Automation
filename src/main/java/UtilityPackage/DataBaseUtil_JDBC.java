package UtilityPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseUtil_JDBC {

	public static void main(String[] args) throws Throwable {
		
		//Q: How to connect the database in your automation?
		
		// 1. I need the JDBC library/dependencies/jar/API file to be added in the pom.xml
		
		//2. I have to create an Database Utility (for reuse purpose)
		
		//3. Using the java Class i am calling forName()method and passing the parameter as JDBC path 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//4. From DriverManager class i am calling getConnection() method and pass all the necessary credentials
		//Example: hostName, driverName, portNumber, databaseName, userName , password
		//and store into the Connection interface instance 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		
		//5. with the help of Connection instance i can call the createStatement() method
		//and pass the parameter to ignore the case sensitive and read the file
		//and store into the Statement interface instance
		Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//6. with the help of Statement instance I can call the executeQuery() method
		//and i can pass the query as parameter and store into the ResultSet instance
		ResultSet rs = stm.executeQuery("select * from employees");
		
		//7.  I also created an ArrayList object to handle the multiple data from the database
		ArrayList<String> value = new ArrayList<String>();
		
		//8. Now I use a loop to go through all the data in the database 
		//and call next() method to ignore the header.
		while (rs.next()) {
			
		//9. with the help of ArrayList obj i can get the result as per requirement
			value.add(rs.getString("First_Name"));
			
		}
		System.out.println(value);
	}
	
}
