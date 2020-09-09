package club.banyuan.dao;

import club.banyuan.entity.Manger;
import org.apache.ibatis.annotations.Param;

public interface MangerDao {

    Manger getManger(@Param("userName") String userName, @Param("password") String password);
}
