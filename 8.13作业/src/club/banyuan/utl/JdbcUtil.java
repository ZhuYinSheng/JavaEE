package club.banyuan.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
  static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
  static String url = "jdbc:mysql://localhost:3306/db3?&useSSL=false&serverTimezone=UTC";
  static String username = "root";
  static String password = "rootroot";

  static {
    try {
      Class.forName(jdbcDriver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url, username, password);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return conn;
  }

  public static void closeConnection(Connection conn, Statement stmt) {
    try {
      if (stmt != null) {
        stmt.close();
      }
      if (conn != null) {
        conn.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    closeConnection(conn, stmt);
  }
}