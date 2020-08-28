package club.banyuan.dao;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;

public interface AddressDao {

  public Address getAddressByUserId (User user);

  public int saveAddress (Address address);

}
