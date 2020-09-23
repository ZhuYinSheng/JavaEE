package club.banyuan.bill.controller;

import club.banyuan.bill.entity.Bill;
import club.banyuan.bill.service.BillService;
import java.util.List;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/server/bill")
public class BillController {

  @Autowired
  private BillService billService;

  @RequestMapping("/list")
  public List<Bill> getUserList(@RequestBody(required = false) Bill bill) {
    if (bill == null) {
      return billService.getBillList();
    } else {
      return billService.getBillListByProAndIsPay(bill.getProduct(), bill.getIsPay());
    }
  }

  @RequestMapping("/modify")
  public String modifyUser(String id, String providerId, String money, String product, String isPay) {
    Bill bill = new Bill();
    bill.setId(Integer.parseInt(id));
    bill.setProviderId(Integer.parseInt(providerId));
    bill.setMoney(Double.parseDouble(money));
    bill.setIsPay(Integer.parseInt(isPay));
    bill.setProduct(product);
    billService.saveBill(bill);
    return "redirect:/bill_list.html";
  }

  @RequestMapping("/get")
  public Bill getUserById(@RequestBody Bill bill) {
    return billService.getBillById(bill.getId());
  }

  @RequestMapping("/delete")
  public String deleteUser(@RequestBody Bill bill) {
    billService.deleteBillById(bill.getId());
    return "redirect:/bill_list.html";
  }
}
