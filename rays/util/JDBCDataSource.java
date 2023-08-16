package in.co.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {
	
	//JDBC Datasource static object
	private static JDBCDataSource jds = null;
	
	//c3p0 database connection pool
	private ComboPooledDataSource ds = null;
	
	private JDBCDataSource() { //make default constructor
		try {
			ds= new ComboPooledDataSource(); //creating dataSource 
			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/rays");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(50);
		}
			catch(PropertyVetoException e) {
				e.printStackTrace();
				
			}
		}
	//get singleton class instance
	public static JDBCDataSource getInstance() {
		if (jds == null) {
			jds = new JDBCDataSource();
		}
		return jds;
	}
	// gets connection from DCP
	public static Connection getConnection() {
		try {
			
		return getInstance().ds.getConnection();
		
	}catch (SQLException e) {
		return null;
	}
}
	//Close Conection
	public static void closeConnection(
			Connection conn, Statement stmt, ResultSet rs) {
		try {
			if ( rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Close Connection 
	public static void closeConnection(
			Connection conn, Statement stmt) {
		closeConnection(conn, null, null);
		}
	//Close Connection
	public static void closeConnection(Connection conn) {
		closeConnection (conn, null, null) ;
		
	}
	
}