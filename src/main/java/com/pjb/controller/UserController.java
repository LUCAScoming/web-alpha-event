package com.pjb.controller;

import com.pjb.entity.User;
import com.pjb.mapper.UserMapper;
import com.pjb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/

@Api(description = "用户接口")
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
    public Map<Object,Object> UserLogin (@RequestParam String username,@RequestParam String password){
        Map<Object,Object> map = new HashMap<>();
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            map.put("statu",0);
            return map;
        }
        User user = userService.vailUser(username, password);
        if (user == null) {
            map.put("登陆失败", "用户名或密码错误");
            return map;
        }
        if (user.getStatus() == 2) {
            map.put("登陆失败", "用户被锁定，请联系管理员");
        }
        try {
            String token = userService.createToken(user.getId(), username);
            user.setUpdate_dt(new Date());
            userMapper.updateByPrimaryKey(user);
            map.put("登陆成功", "用户登陆成功");
            map.put("token", token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}