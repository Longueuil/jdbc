import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
	
		try {
			// GEt a connection to db
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1025Gardenville");
			
			// Create a statement
			Statement myStatement = myConn.createStatement();
			
			//Execute Sql query
			String sql = "update employees " 
						 + " set email='happy@holidays.yes'" 
						 + " where id=4";
			
			myStatement.executeUpdate(sql);
			
			System.out.println("Update complete");
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
