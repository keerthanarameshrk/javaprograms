package com.skills.modal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginModal {

	public String getLogin(String e, String pwd) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/payilagam", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user where email='"
					+ e + "' and password='" + pwd + "'");
			if (rs.next()) {
				String fullName = rs.getString("fname") + " "
						+ rs.getString("lname");
				return fullName;
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return null;

	}
}
