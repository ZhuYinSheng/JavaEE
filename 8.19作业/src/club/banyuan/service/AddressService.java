package club.banyuan.service;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;
import java.sql.SQLException;
import java.util.List;

public interface AddressService {

  Address getAddressByUser(User user) throws SQLException;
  Address addAddress(Address address) throws SQLException;
  List<Address> getAddressByUserId(int userId) throws Exception;
}
