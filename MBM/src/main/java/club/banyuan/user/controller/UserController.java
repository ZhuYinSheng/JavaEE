package club.banyuan.user.controller;

import club.banyuan.common.Constant;
import club.banyuan.common.ServerException;
import club.banyuan.user.entity.User;
import club.banyuan.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/server/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String name, String pwd, HttpSession httpSession) {
        User userLogin = userService.login(name, pwd);
        httpSession.setAttribute(Constant.USER_SESSION, userLogin);
        if (userLogin == null) {
            return "redirect:/login.html";
        } else {
            return "redirect:/user_list.html";
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUserList(@RequestBody(required = false) User user) {
        if (user == null) {
            return userService.getUserList();
        } else {
            return userService.getUserByName(user.getName());
        }
    }

    @RequestMapping("/get")
    @ResponseBody
    public User getUserId(@RequestBody User user) {
        return userService.getUserById(user.getId());
    }

    @RequestMapping("/modify")
    public String modify(String id, String name ,String pwd, String pwdConfirm, String userType) {
        if (!pwd.equals(pwdConfirm)) {
            throw new ServerException("两次输入的密码不正确");
        }
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setName(name);
        user.setPwd(pwd);
        user.setPwdConfirm(pwdConfirm);
        int type = Integer.parseInt(userType);
        user.setUserType(type);
        user.setUserTypeStr(type == 0 ? "普通用户" : "经理");
        userService.saveUser(user);
        return "redirect:/user_list.html";
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }

    @RequestMapping("/getInfo")
    // 让spring将方法返回的对象自动序列化为json
    @ResponseBody
    public Map getAdminInfo(HttpSession session) {
        Object attribute = session.getAttribute(Constant.USER_SESSION);
        Map<String,String> map = new HashMap<>();
        if (attribute != null) {
            User user = (User) attribute;
            map.put("name", user.getName());
        }
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteUser( User user) {
        userService.deleteUser(user.getId());
        return "redirect:/user_list.html";
    }
}
