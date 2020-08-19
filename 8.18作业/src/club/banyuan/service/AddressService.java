package club.banyuan.service;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;
import java.sql.SQLException;

public interface AddressService {

  Address getAddressByUser(User user) throws SQLException;
  Address addAddress(Address address) throws SQLException;
}
