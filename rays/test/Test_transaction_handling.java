package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_transaction_handling {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root","root");
		conn.setAutoCommit(false);
		Statement stmt = conn .createStatement();
		int i = stmt.executeUpdate("insert into marksheet values(31,'Sharma',121,70,70,70)");
		i=stmt.executeUpdate("insert into marksheet values(31,'Sharma',121,70,70,70)");
		i = stmt.executeUpdate("insert into marksheet values(32,'Sharma',121,70,70,70)");
		i = stmt.executeUpdate("insert into marksheet values(33,'Sharma',121,70,70,70)");
		System.out.println(" data inserted = " + i);
		conn.commit();
		}catch(Exception e){
			System.out.println(e);
			conn.rollback();
		}
	}

}
