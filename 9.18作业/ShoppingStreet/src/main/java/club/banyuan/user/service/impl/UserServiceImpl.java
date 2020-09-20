package club.banyuan.user.service.impl;

import club.banyuan.user.dao.UserDao;
import club.banyuan.user.entity.User;
import club.banyuan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int updateUser(int id) {
        return 0;
    }

    @Override
    public int selectUser(int id) {
        return 0;
    }

    @Override
    public User login(String name, String pwd) {
        User userLogin = userDao.login(name, pwd);
        return userLogin;
    }
}
