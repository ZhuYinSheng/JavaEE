package club.banyuan.servlet;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    HttpSession session = request.getSession();
    String url = "login.jsp";
    UserService userService = new UserServiceImpl();
    try {
      User user = userService.login(username, password);
      if (user != null) {
        session.setAttribute("user", user);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        return;
      } else {
        request.setAttribute("errorMsg", "用户名或密码错误");
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    request.getRequestDispatcher("login.jsp").forward(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
