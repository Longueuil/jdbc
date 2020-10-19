import java.sql.*;
public class view {
	
	public static void main(String [] args) {
		
		try {
			// GEt a connection to db
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1025Gardenville");
			
			// Create a statement
			Statement myStatement = myConn.createStatement();
			
			//Execute Sql query
			ResultSet rSet = myStatement.executeQuery("select * from employees");
			
			//Process the result set
			while(rSet.next()) {
				System.out.println("First name " + rSet.getString("fname") + " Last name "+rSet.getString("sname")
				+ "Email " + rSet.getString("email"));
			}
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	
}
