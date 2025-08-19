package assigmentDay27;

import java.sql.*;
public class JdbcUtil {
   private Connection connection;
   private Statement statement;
   private ResultSet resultSet;
   public void connect(String dbUrl, String user, String pass) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection(dbUrl, user, pass);
       statement = connection.createStatement();
   }
   public ResultSet executeQuery(String query) throws SQLException {
       resultSet = statement.executeQuery(query);
       return resultSet;
   }
   public void close() throws SQLException {
       if (resultSet != null) resultSet.close();
       if (statement != null) statement.close();
       if (connection != null) connection.close();
   }
}

