import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sql_Connector {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        String dbUrl="jdbc:mysql://localhost:3306/inx";       
		String userName="root";
		String password="";
		
		String query="SELECT * From Employee";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//Create a connection to db
		Connection con=DriverManager.getConnection(dbUrl, userName, password);
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()){
			String myName=rs.getString(1);
			String myAge=rs.getString(2);
			String firstName=rs.getString(3);
			String city=rs.getString(4);
			System.out.println(myName + " " + myAge + " " +firstName + " " +city);
		}
		con.close();
	}

}
