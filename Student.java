package D;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class Student

{

		ArrayList getList()
		{
		ArrayList std=new ArrayList();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from student");
				while(rs.next())
				{
					HashMap h=new HashMap();
					
					/*std.add(rs.getString("stuid"));
					std.add(rs.getString("stuname"));
					std.add(rs.getString("totmarks"));
					std.add(rs.getString("percent"));*/
				
					h.put("stuid", rs.getString("stuid"));
					h.put("stuname",rs.getString("stuname"));
					h.put("totmarks", rs.getInt("totmarks"));
					h.put("percent", rs.getInt("percent"));
					std.add(h);
					
				}
				
			}
				
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return std;
			}
		void register()
		{
			
		}
		
	

}
