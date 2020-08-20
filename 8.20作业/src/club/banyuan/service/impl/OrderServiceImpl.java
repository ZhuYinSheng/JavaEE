package club.banyuan.service.impl;

import club.banyuan.dao.OrderDao;
import club.banyuan.dao.OrderDetailDao;
import club.banyuan.dao.impl.OrderDaoImpl;
import club.banyuan.dao.impl.OrderDetailDaoImpl;
import club.banyuan.dao.util.DataSourceUtil;
import club.banyuan.pojo.Order;
import club.banyuan.pojo.OrderDetail;
import club.banyuan.service.OrderService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Order order, List<OrderDetail> orderDetailList) throws SQLException {
//        先调用OrderDao,生成订单，获取订单id
//                赋值给订单详情OrderDetail
//                调用OrderDetailDao，向订单详情表中，插入订单详情
        Connection conn = DataSourceUtil.openConnection();
        OrderDao orderDao = new OrderDaoImpl(conn);
        OrderDetailDao orderDetailDao = new OrderDetailDaoImpl(conn);

        return null;
    }
}
