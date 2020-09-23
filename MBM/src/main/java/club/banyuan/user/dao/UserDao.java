package club.banyuan.user.dao;

import club.banyuan.user.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserList();

    List<User> getUserListByName(@Param("name") String name);

    User userLogin(@Param("name") String name, @Param("password") String password);

}