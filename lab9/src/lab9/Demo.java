package lab9;
import java.sql.*;

public class Demo {
	static final String DB_URL = "jdbc:mysql://localhost:3306";
	   static final String USER = "root";
	   static final String PASS = "Zombie@2347245";
	   static final String QUERY = "SELECT id, first, last, age FROM Employees";

	   public static void main(String[] args) {
		   try {
				   DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connection Sucessfull");
			      } catch (SQLException e) {
				        System.out.println("Connection Failed");
				        e.printStackTrace();
			      }
		   
	   }
}
