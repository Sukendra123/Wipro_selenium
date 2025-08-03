package Jdbc_day12;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.xdevapi.Statement;
// 1.We need to import a package
// 2 load and register the driver - com.mysql.jdbc.driver
// 3 establish the connection
// 4 create the statements
// 5 execute the query
// 6 process results
// 7 close the connection
public class Jdbc_Demo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3307/jdbc";
		String userName="root";
		String pwd="Tiger@21";
		String query="select * from sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
//		st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		while (rs.next()) {
//			Int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			System.out.println("Name is "+name+" email is :"+email);
		}
		st.close();
		con.close();
	}
}

