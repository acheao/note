package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver"); 
		//com.mysql.jdbc.Driver
		String URL = "jdbc:mysql://192.168.0.124:3306/acheao";
		Connection con = DriverManager.getConnection(URL, "root", "1+2=6");
		Statement sata = con.createStatement();
		PreparedStatement statement = con.prepareStatement("select * from orders t where t.cust_id = ?");
		statement.setInt(1, 10001);
		ResultSet rsq = statement.executeQuery();
		while(rsq.next()){
			System.out.println(rsq.getString("order_date"));
		}
		
		/*ResultSet rs = sata.executeQuery("select * from orders t where t.cust_id = ?"); 
		while(rs.next()){
			System.out.println(rs.getString("order_date"));
		}
		rs.close();
		sata.close();
		con.close();*/
		
		/*Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String passwd = "acheao";
		Connection con = DriverManager.getConnection(url,user,passwd);
		Statement state = con.createStatement();
		String sql = "select * from DEPT";
		ResultSet rs = state.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getString("DNAME"));
		}
		rs.close();
		state.close();
		con.close();*/
		
	} 

}
