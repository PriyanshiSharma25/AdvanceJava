package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test_preparedStatements {
	public static void main(String [] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(34,'oye',134,87,89,70)");
		int i = ps.executeUpdate();
		System.out.println("Data inserted = " + i);
	}
}
