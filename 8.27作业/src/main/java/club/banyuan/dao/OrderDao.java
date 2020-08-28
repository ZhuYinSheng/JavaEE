package club.banyuan.dao;

import club.banyuan.pojo.Order;
import club.banyuan.pojo.User;
import java.util.List;

public interface OrderDao {

  public List<Order> getOrderByLoginName(User user);

  public int saveOrder (Order order);
}
