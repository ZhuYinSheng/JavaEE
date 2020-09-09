package club.banyuan.dao;

import club.banyuan.entity.Order;
import java.sql.SQLException;
import java.util.List;

public interface OrderDao {

  Order addOrder(Order order) throws SQLException;
  List<Order> getOrderByUserId(Order order) throws SQLException;
}
