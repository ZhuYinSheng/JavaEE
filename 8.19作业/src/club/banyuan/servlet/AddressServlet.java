package club.banyuan.servlet;

import club.banyuan.pojo.Address;
import club.banyuan.pojo.User;
import club.banyuan.service.AddressService;
import club.banyuan.service.impl.AddressServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AddressServlet", urlPatterns = "/address.do")
public class AddressServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
//    String[] address = request.getParameterValues("address");
    HttpSession session = request.getSession();
    User user = (User) session.getAttribute("user");
    AddressService addressService = new AddressServiceImpl();
    List<Address> addressList = null;
    try {
      addressList = addressService.getAddressByUserId(user.getId());
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (addressList != null) {
      session.setAttribute("addressList", addressList);
      request.getRequestDispatcher("member_Address.jsp").forward(request, response);
      return;
    }
    request.getRequestDispatcher("index.jsp")
        .forward(request, response);
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
