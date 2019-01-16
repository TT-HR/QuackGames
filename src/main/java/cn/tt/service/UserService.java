package cn.tt.service;

import cn.tt.bean.User;
import cn.tt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper{
    @Autowired
    private UserMapper userMapper;

    public List<User> login(String username, String pwd) {
        return userMapper.login(username,pwd);
    }

    public void reg(User user) {
        userMapper.reg(user);
    }
}
