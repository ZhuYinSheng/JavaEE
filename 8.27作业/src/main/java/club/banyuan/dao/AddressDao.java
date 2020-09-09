package club.banyuan.dao;

import club.banyuan.entity.Address;
import club.banyuan.entity.User;

public interface AddressDao {

  public Address getAddressByUserId (User user);

  public int saveAddress (Address address);

}
