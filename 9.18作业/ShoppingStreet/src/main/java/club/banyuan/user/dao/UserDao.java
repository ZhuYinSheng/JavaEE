package club.banyuan.user.dao;

import club.banyuan.user.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(int id);

    int selectUser(int id);

    List<User> getUserList();

    User login(@Param("name") String name, @Param("pwd") String pwd);
}
