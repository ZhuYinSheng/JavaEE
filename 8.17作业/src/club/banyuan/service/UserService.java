package club.banyuan.service;

import club.banyuan.entity.User;
import java.sql.SQLException;

public interface UserService {
    public User register(User user) throws SQLException;
}
