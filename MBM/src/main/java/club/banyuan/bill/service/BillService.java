package club.banyuan.bill.service;

import club.banyuan.bill.entity.Bill;
import java.util.List;

public interface BillService {

  void saveBill(Bill bill);

  void deleteBillById(Integer id);

  Bill getBillById(Integer id);

  List<Bill> getBillList();

  List<Bill> getBillListByProAndIsPay(String product, int isPay);

}
