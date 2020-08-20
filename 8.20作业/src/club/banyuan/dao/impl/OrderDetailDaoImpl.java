package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDetailDao;
import club.banyuan.pojo.OrderDetail;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDaoImpl extends BaseDaoImpl implements OrderDetailDao {

  public OrderDetailDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public OrderDetail addOrder_detail(OrderDetail orderDetail) {
    String sql = "insert into order_detail (id,orderId,productId,quantity,cost) values (null,?,?,?,?);";
    Object[] params = new Object[]{orderDetail.getOrderId(), orderDetail.getProductId(),
        orderDetail.getQuantity(), orderDetail.getCost()};
    int id = executeInsert(sql, params);
    orderDetail.setId(id);
    this.closeResource();
    return orderDetail;
  }

  @Override
  public List<OrderDetail> getOrderDetailByOrderId(int orderId) {
    List<OrderDetail> orderDetailList = new ArrayList<>();
    String sql = "select * from order_detail where orderId = ?";
    Object[] params = new Object[]{orderId};
    ResultSet rs = this.executeQuery(sql, params);
    try {
      while (rs.next()) {
        orderDetailList.add(this.tableToClass(rs));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource(rs);
    }
    return orderDetailList;
  }

  @Override
  public OrderDetail tableToClass(ResultSet rs) throws Exception {
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setId(rs.getInt("id"));
    orderDetail.setOrderId(rs.getInt("orderId"));
    orderDetail.setProductId(rs.getInt("productId"));
    orderDetail.setQuantity(rs.getInt("quantity"));
    orderDetail.setCost((double) rs.getFloat("cost"));
    return orderDetail;
  }
}
