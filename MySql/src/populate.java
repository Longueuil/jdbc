import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class populate {

	public static void main(String[] args) {
		try {
			// GEt a connection to db
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1025Gardenville");
			
			// Create a statement
			Statement myStatement = myConn.createStatement();
			
			//Execute Sql query
			String sql = "insert into employees " 
						 + " (fname, sname, email)" 
						 + " values ('Lao','Koong','lokoong@gamil.com')";
			
			myStatement.executeUpdate(sql);
			
			System.out.println("Insert complete");
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	
}
