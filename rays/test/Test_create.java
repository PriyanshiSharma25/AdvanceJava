package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_create {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("create table oye("
				+"id int,"
				+"name varchar(50)");
		
		System.out.println("Table created = ");
		
		
	}

}
