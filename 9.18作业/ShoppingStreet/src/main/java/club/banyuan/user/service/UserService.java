package club.banyuan.user.service;

import club.banyuan.user.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(int id);

    int selectUser(int id);

    User login(@Param("name") String name, @Param("pwd") String pwd);
}
