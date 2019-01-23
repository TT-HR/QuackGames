package cn.tt.mapper;

import cn.tt.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where username=#{username} and pwd=#{pwd}")
    List<User> login(@Param("username") String username,@Param("pwd") String pwd);
    @Insert("insert into user(username,pwd) values(#{username},#{pwd})")
    @Options(useGeneratedKeys = true,keyProperty = "uid",keyColumn = "uid")
    void reg(User user);

}
