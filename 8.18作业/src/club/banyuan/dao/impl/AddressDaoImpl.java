package club.banyuan.dao.impl;

import club.banyuan.dao.AddressDao;
import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;
import java.sql.Connection;
import java.sql.ResultSet;

public class AddressDaoImpl extends BaseDaoImpl implements AddressDao {

  public AddressDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Address getAddressByUserId(User user) {
    String sql = "select * from user_address where userId = ?, and isDefault = ?;";
//    Object[] params = new Object[]{user.getId(), user.}
    return null;
  }

  @Override
  public Address addAddress(Address address) {
    return null;
  }

  @Override
  public Object tableToClass(ResultSet rs) throws Exception {
    Address address = new Address();
    address.setId(rs.getInt(1));
    address.setUserId(rs.getInt(2));
    address.setAddress(rs.getString(3));
    address.setCreateTime(rs.getDate(4));
    address.setIsDefault(rs.getInt(5));
    address.setRemark(rs.getString(6));
    return address;
  }
}
