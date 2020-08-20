package club.banyuan.dao;

import club.banyuan.pojo.OrderDetail;
import java.util.List;

public interface OrderDetailDao {

  OrderDetail addOrder_detail(OrderDetail orderDetail);
  List<OrderDetail> getOrderDetailByOrderId(int orderId);

}
