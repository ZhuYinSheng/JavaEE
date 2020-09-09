package club.banyuan.service;

import club.banyuan.entity.Address;
import club.banyuan.entity.User;
import java.sql.SQLException;

public interface AddressService {

  Address getAddressByUser(User user) throws SQLException;
  Address addAddress(Address address) throws SQLException;
}
