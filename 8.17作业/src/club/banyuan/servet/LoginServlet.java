package club.banyuan.servet;

import club.banyuan.dao.UserDaoImpl;
import club.banyuan.dao.util.DataSourceUtil;
import club.banyuan.entity.User;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String loginName = request.getParameter("loginName");
    String password = request.getParameter("password");
//    user.setLoginName(loginName);
//    user.setPassword(password);

    try {
      Connection connection = DataSourceUtil.openConnection();
      UserDaoImpl userDao = new UserDaoImpl(connection);
      User user = userDao.getUserByUserNameAndPwd(loginName, password);
      if (user.getLoginName() != null) {
        response.sendRedirect("success.html");
      }
    } catch (Exception throwables) {
      response.sendRedirect("login.html");
    }

  }
}