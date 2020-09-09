package club.banyuan.dao;

import club.banyuan.entity.Address;
import club.banyuan.entity.User;
import java.util.List;

public interface AddressDao {

  Address getAddressByUserId(User user);
  Address addAddress(Address address);
  List<Address> getAddressByUserId(int userId) throws Exception;
}
