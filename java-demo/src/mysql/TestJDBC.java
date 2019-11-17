package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		/*Class.forName("org.gjt.mm.mysql.Driver"); 
		//com.mysql.jdbc.Driver
		String URL = "jdbc:mysql://localhost:3306/mysqltest";
		Connection con = DriverManager.getConnection(URL, "root", "12358");
		Statement sata = con.createStatement();
		ResultSet rs = sata.executeQuery("select * from orders"); 
		while(rs.next()){
			System.out.println(rs.getString("order_date"));
		}
		rs.close();
		sata.close();
		con.close();*/
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
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
		con.close();
		
	} 

}
