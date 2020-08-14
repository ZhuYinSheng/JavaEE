package club.banyuan.service;

import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import club.banyuan.utl.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shopping {

  public static void register() throws SQLException {

    Connection connection = JdbcUtil.getConnection();
    int id = 22;
    String loginName = "aaa";
    String userName = "aaa";
    String password = "123456";
    int sex = 1;
    String identity = "123456789123456789";
    String email = "aaa@163.com";
    String mobile = "12345678910";
    int type = 0;

    String sql = "insert into user (id, name, password, confirmPwd, mail, phone, inviteName, inviteName, inviteId) values (?, ?, ?, ?, ?, ?, ?, ?);";
    PreparedStatement pstm1 = connection.prepareStatement(sql);
    pstm1.setInt(1, id);
    pstm1.setString(2, loginName);
    pstm1.setString(3, userName);
    pstm1.setString(4, password);
    pstm1.setInt(5, sex);
    pstm1.setString(6, identity);
    pstm1.setString(7, email);
    pstm1.setString(8, mobile);
//    pstm1.setInt(9, type);
    pstm1.executeUpdate();

    JdbcUtil.closeConnection(connection, pstm1);

    connection = JdbcUtil.getConnection();
    String sql2 = "select * from user;";
    PreparedStatement pstm2 = connection.prepareStatement(sql2);
    ResultSet rs = pstm2.executeQuery();
    List<User> userList = new ArrayList<>();

  }

  public static void searchProduct(String name) throws SQLException {
    Connection connection = JdbcUtil.getConnection();
    String sql = "select * from product where name like '%华为%' or description like '%华为%'";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet rs = preparedStatement.executeQuery();
    List<Product> products = new ArrayList<>();
    while(rs.next()) {
      Product product = new Product();
      product.setId(rs.getInt(1));
      product.setName(rs.getString(2));
      product.setDescription(rs.getString(3));
      product.setPrice(rs.getDouble(4));
      product.setStock(rs.getInt(5));
      product.setCategoryLevel1Id(rs.getInt(6));
      product.setCategoryLevel2Id(rs.getInt(7));
      product.setCategoryLevel3Id(rs.getInt(8));
      product.setFileName(rs.getString(9));
      product.setIsDelete(rs.getInt(10));
      products.add(product);
    }
    JdbcUtil.closeConnection(connection, preparedStatement, rs);
    for (Product product : products) {
      System.out.println(product);
    }
  }

  public static void searchOrder(String name) throws SQLException {
    Connection connection = JdbcUtil.getConnection();
    String sql = "select * from order where loginName = ?;";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet rs = preparedStatement.executeQuery();
//    preparedStatement.setString(1, "aaa");
    while (rs.next()) {
      Integer id = rs.getInt(1);
      Integer userId = rs.getInt(2);
      String loginName = rs.getString(3);
      String userAddress = rs.getString(4);
      Date createTime = rs.getDate(5);
      Float cost = rs.getFloat(6);
      String serialNUmber = rs.getString(7);
    }
  }


  public static boolean isExist(String loginName) throws SQLException {
    Connection connection = JdbcUtil.getConnection();
    String sql = "select * from user where loginName = ? ";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, loginName);
    ResultSet rs = preparedStatement.executeQuery();
    if (rs.next()) {
      JdbcUtil.closeConnection(connection, preparedStatement, rs);
      return true;
    } else {
      JdbcUtil.closeConnection(connection, preparedStatement, rs);
      return false;
    }
  }

}