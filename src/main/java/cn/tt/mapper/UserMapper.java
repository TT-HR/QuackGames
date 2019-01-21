package cn.tt.mapper;

import cn.tt.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where username=#{username} and pwd=#{pwd}")
    List<User> login(String username,String pwd);
    @Insert("insert into user(username,pwd) values(#{username},#{pwd})")
    void reg(User user);
    @Select("select * from user where uid=#{uid}")
    List<User> findUser(int uid);
}
