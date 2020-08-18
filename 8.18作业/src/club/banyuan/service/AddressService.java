package club.banyuan.service;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;

public interface AddressService {

  Address getAddressByUserId(User user);
  Address addAddress(Address address);
}
