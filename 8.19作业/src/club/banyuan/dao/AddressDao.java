package club.banyuan.dao;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;
import java.util.List;

public interface AddressDao {

  Address getAddressByUserId(User user);
  Address addAddress(Address address);
  List<Address> getAddressByUserId(int userId) throws Exception;
}
