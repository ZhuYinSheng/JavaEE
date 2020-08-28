package club.banyuan.dao;

import club.banyuan.pojo.Order;
import club.banyuan.pojo.OrderDetail;
import java.util.List;

public interface OrderDetailDao {

  public List<OrderDetail> getOrderDetailByOrderId(Order order);

  public int saveOrderDetail (OrderDetail orderDetail);

}
