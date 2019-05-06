package com.pjb.controller;

import com.pjb.config.BussinessException;
import com.pjb.config.Constant;
import com.pjb.entity.User;
import com.pjb.mapper.UserMapper;
import com.pjb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/

@Component
@Api(description = "用户相关接口")
@Controller
@RequestMapping("alpha/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录用户信息保存接口", notes = "传入用户名和密码")
    @PostMapping("/login")
    @ResponseBody
    public Map<Object,Object> UserLogin (@RequestParam String username, @RequestParam String password, HttpServletRequest request){
//        String username =userVail.getUsername();
//        String password = userVail.getPassword();
        Map<Object,Object> map = new HashMap<>();
//        校验数据，非法字符报错，无法登录
        if(!vaild(username)){
            throw  new BussinessException(Constant.EX004);
        }
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            map.put("login",0);
            return map;
        }
        User user = userService.vailUser(username, password);
        if (user == null) {
            map.put("登陆", "用户名或密码错误");
            map.put("login",0);
            return map;
        }
        if (user.getStatus() == 2) {
            map.put("登陆", "用户被锁定，请联系管理员");
            map.put("login",0);
        }
        try {
            String token = userService.createToken(user.getId(), username);
            user.setUpdateDt(new Date());
            userMapper.updateByPrimaryKey(user);
            user.setLoginStatus(1);
            user.setPassword(null);
            map.put("login", "用户登陆成功");
            map.put("token", token);
            map.put("userInfo",user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    private boolean vaild(String username) {
        return true;
    }

}
