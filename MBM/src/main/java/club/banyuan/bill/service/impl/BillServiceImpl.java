package club.banyuan.bill.service.impl;

import club.banyuan.bill.dao.BillDao;
import club.banyuan.bill.entity.Bill;
import club.banyuan.bill.service.BillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

  @Autowired
  private BillDao billDao;

  @Override
  public void saveBill(Bill bill) {
    if (bill.getId() == 0) {
      billDao.insert(bill);
    } else {
      billDao.updateByPrimaryKey(bill);
    }
  }

  @Override
  public void deleteBillById(Integer id) {
    billDao.deleteByPrimaryKey(id);
  }

  @Override
  public Bill getBillById(Integer id) {
    return billDao.selectByPrimaryKey(id);
  }

  @Override
  public List<Bill> getBillList() {
    return billDao.getBillList();
  }

  @Override
  public List<Bill> getBillListByProAndIsPay(String product, int isPay) {
    return billDao.getBillListByProAndIsPay(product, isPay);
  }
}
