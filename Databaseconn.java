package B;

import java.sql.DriverManager;
import java.sql.*;
public class Databaseconn {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/keer","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString("rollno"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("marks"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}
