package cn.tt.controller;

import cn.tt.bean.User;
import cn.tt.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Setter@Getter
    private String json;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,@RequestParam("pwd") String pwd){
        List<User> users=userMapper.login(username,pwd);
        if(users.size()!=0){
            return "index";
        }else{
            return "error";
        }
    }
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String reg(User user){
        userMapper.reg(user);
        return "index";
    }
}
