package club.banyuan.servlet;

import club.banyuan.entity.Address;
import club.banyuan.service.AddressService;
import club.banyuan.service.impl.AddressServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddressServlet", urlPatterns = "/address.do")
public class AddressServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String[] address = request.getParameterValues("address");
    AddressService addressService = new AddressServiceImpl();
    List<Address> addressList;
//    addressList = addressService.get
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
