package club.banyuan.service.impl;

import club.banyuan.dao.AddressDao;
import club.banyuan.dao.impl.AddressDaoImpl;
import club.banyuan.dao.util.DataSourceUtil;
import club.banyuan.entity.Address;
import club.banyuan.entity.User;
import club.banyuan.service.AddressService;
import java.sql.Connection;
import java.sql.SQLException;

public class AddressServiceImpl implements AddressService {

  @Override
  public Address getAddressByUser(User user) throws SQLException {
    Connection conn = DataSourceUtil.openConnection();
    AddressDao addressDao = new AddressDaoImpl(conn);
    return addressDao.getAddressByUserId(user);
  }

  @Override
  public Address addAddress(Address address) throws SQLException {
    Connection conn = DataSourceUtil.openConnection();
    AddressDao addressDao = new AddressDaoImpl(conn);
    return addressDao.addAddress(address);
  }
}
