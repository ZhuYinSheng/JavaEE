package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDao;
import club.banyuan.pojo.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao {

  public OrderDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Order addOrder(Order order) throws SQLException {
    String sql = "insert into order(userId,loginName,userAddress,createTime,cost,serialNumber) values(?,?,?,?,?,?);";
    Object[] params = new Object[]{order.getUserId(),order.getLoginName(),order.getUserAddress(),new Date(),order.getCost(),order.getSerialNumber()};
    ResultSet rs = executeQuery(sql, params);
    while (rs.next()) {
      try {
        order = tableToClass(rs);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    closeResource(rs);
    return order;
  }

  @Override
  public List<Order> getOrderByUserId(Order order) throws SQLException {
    List<Order> orders = new ArrayList<>();
    String sql = "select * from `order` where userId = ?";
    Object[] params = new Object[]{order.getUserId()};
    ResultSet rs = this.executeQuery(sql,params);
    while (rs.next()) {
      try {
        orders.add(tableToClass(rs));
      } catch (Exception e) {
        e.printStackTrace();
      }
      closeResource(rs);
    }
    return orders;
  }

  @Override
  public Order tableToClass(ResultSet rs) throws Exception {
    Order order = new Order();
    order.setId(rs.getInt("id"));
    order.setUserId(rs.getInt("userId"));
    order.setCreateTime(rs.getDate("createTime"));
    order.setCost(rs.getDouble("cost"));
    order.setUserAddress(rs.getString("userAddress"));
    order.setSerialNumber(rs.getString("serialNumber"));
    order.setLoginName(rs.getString("loginName"));
    return order;
  }
}
