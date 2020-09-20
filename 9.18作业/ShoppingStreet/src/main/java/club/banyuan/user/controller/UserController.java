package club.banyuan.user.controller;

import club.banyuan.common.Constant;
import club.banyuan.user.entity.User;
import club.banyuan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String login(String name, String pwd, HttpSession httpSessionq) {
        User userLogin = userService.login(name, pwd);
        if (userLogin == null) {
            return "redirect:/login.html";
        } else {
            return "redirect:/user_list.html";
        }
    }

    @RequestMapping("/modify")
    public String modify(String name ,String pwd, String pwdConfirm) {
        User user = new User();
        user.setName(name);
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
    public Map getAdminInfo(String name, HttpSession session) {
        User user = new User();
        user.setName(name);
        Object attribute = session.getAttribute(Constant.ADMIN_SESSION);
        System.out.println(user.getName());
        Map<String,String> map = new HashMap<>();
        map.put("name", user.getName());
        return map;
    }
}
