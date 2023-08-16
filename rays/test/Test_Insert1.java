package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_Insert1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root","root");
		Statement stmt = conn .createStatement();
		int i = stmt.executeUpdate("insert into marksheet values(25,'Sharma',121,70,70,70)");
		i=stmt.executeUpdate("insert into marksheet values(26,'Sharma',121,70,70,70)");
		i = stmt.executeUpdate("insert into marksheet values(26,'Sharma',121,70,70,70)");
		i = stmt.executeUpdate("insert into marksheet values(27,'Sharma',121,70,70,70)");
		System.out.println(" data inserted = " + i);
		
	}
		}
