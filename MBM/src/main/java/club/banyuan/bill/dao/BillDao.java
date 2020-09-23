package club.banyuan.bill.dao;

import club.banyuan.bill.entity.Bill;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    List<Bill> getBillList();

    List<Bill> getBillListByProAndIsPay(@Param("produce") String product, @Param("isPay") int isPay);
}