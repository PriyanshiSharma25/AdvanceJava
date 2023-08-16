package in.co.rays.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userModel {
	
	public Integer nextPk() throws Exception{
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement ps = conn.prepareStatement("select max(id) from user");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			pk = rs.getInt(1);
		}
		return pk + 1;
		
	}
	
	public void add(userBean bean) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	PreparedStatement ps =	conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)")	;
	ps.setInt(1, nextPk());
	ps.setString(2, bean.getFirst_name());
	ps.setString(3, bean.getLast_name());
	ps.setString(4, bean.getLogin_id());
	ps.setString(5, bean.getPassword());
	ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
	ps.setString(7, bean.getAddress());
	
	int i = ps.executeUpdate();
	System.out.println("Data inserted =" + i);
	
	}
	public void update (userBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement ps = conn.prepareStatement("update user set first_name = ?, last_name = ?, login_id = ?, password = ?, dob =?, address = ?,where id = ? ");
		ps.setString(1, bean.getFirst_name());
		ps.setString(2, bean.getLast_name());
		ps.setString(3, bean.getLogin_id());
		ps.setString(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());
		
		int i = ps.executeUpdate();
		System.out.println("Data updated = " + i);
	}

	public userBean findByPk(int id) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
        PreparedStatement ps = conn.prepareStatement("Select * from User where id =?");
		return null;
		
	}
		
	}
