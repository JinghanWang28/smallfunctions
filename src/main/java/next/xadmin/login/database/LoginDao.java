package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import next.xadmin.login.bean.LoginBean;

public class LoginDao {
	private String dbUrl="jdbc:mysql://localhost:3306/userdb";
	private String dbUname="root";//right
	private String dbPassword="//";//your password
	private String dbDriver ="com.mysql.jdbc.Driver";//right
	public static void loadDriver(String dbDriver) {
		
		try {
			Class.forName(dbDriver);
			System.out.println("hello");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		Connection con=null;
		try {
			con= DriverManager.getConnection(dbUrl,dbUname,dbPassword);//right
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(LoginBean loginBean) {
		// TODO Auto-generated method stub
		loadDriver(dbDriver);
		Connection con=getConnection();
		String sql="select * from login where username =? and password=?";
		boolean status =false;
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginBean.getUsername());
			ps.setString(2, loginBean.getPassword());// 2rows
			
		ResultSet rs= ps.executeQuery();
		status=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
			

}
