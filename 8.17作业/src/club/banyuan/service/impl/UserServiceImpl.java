package club.banyuan.service.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.UserDaoImpl;
import club.banyuan.dao.util.DataSourceUtil;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws SQLException {
        Connection conn = DataSourceUtil.openConnection();
        UserDao userDao = new UserDaoImpl(conn);
        User newUser = userDao.addUser(user);
        DataSourceUtil.closeConnection(conn);
        return newUser;
    }
}
