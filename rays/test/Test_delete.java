
package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_delete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("Delete from marksheet where id = 21");
		System.out.println("Data deleted = " + i);
	}

}
