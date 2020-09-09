package club.banyuan.dao.impl;

import club.banyuan.dao.AddressDao;
import club.banyuan.entity.Address;
import club.banyuan.entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddressDaoImpl extends BaseDaoImpl implements AddressDao {

  public AddressDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Address getAddressByUserId(User user) {
    String sql = "select * from user_address where userId = ?;";
    Object[] params = new Object[]{user.getId()};
    ResultSet rs = executeQuery(sql, params);
    Address address = new Address();
    try {
      address = tableToClass(rs);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return address;
  }

  @Override
  public Address addAddress(Address address) {
    String sql = "insert into user_address values (null,?,?,?,?,?);";
    Object[] params = new Object[]{address.getUserId(), address.getAddress(),
        address.getCreateTime(),
        address.getIsDefault(), address.getRemark()};
    int i = executeInsert(sql, params);
    address.setUserId(i);
    closeResource();
    return address;
  }

  @Override
  public Address tableToClass(ResultSet rs) throws Exception {
    Address address = new Address();
    address.setId(rs.getInt(1));
    address.setUserId(rs.getInt(2));
    address.setAddress(rs.getString(3));
    address.setCreateTime(rs.getDate(4));
    address.setIsDefault(rs.getInt(5));
    address.setRemark(rs.getString(6));
    return address;
  }

  @Override
  public List<Address> getAddressByUserId(int userId) throws Exception {
    String sql = "select * from user_address where userId=?";
    ResultSet resultSet = null;
    List<Address> addressList = new ArrayList<>();
    resultSet = executeQuery(sql, new Integer[]{userId});
    addressList.add(tableToClass(resultSet));
    return addressList;
  }
}
