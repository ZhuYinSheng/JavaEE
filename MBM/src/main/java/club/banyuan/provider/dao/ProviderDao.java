package club.banyuan.provider.dao;

import club.banyuan.provider.entity.Provider;
import club.banyuan.user.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Provider record);

    int insertSelective(Provider record);

    Provider selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);

    List<Provider> getProviderList();

    List<Provider> getProviderListByNameAndDesc(@Param("name") String name, @Param("desc") String desc);

}