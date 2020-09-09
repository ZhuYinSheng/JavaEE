package club.banyuan.dao;

import club.banyuan.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    int addUser(User user);
    User getUser(@Param("userName") String userName, @Param("password") String password);
}
