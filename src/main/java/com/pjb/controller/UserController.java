package com.pjb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ApiOperation(value = "登录用户信息保存接口", notes = "传入用户名和密码")
    @PostMapping("/login")
    @ResponseBody
    public Map<Object,Object> UserLogin (@RequestParam String username,@RequestParam String password){
        Map<Object,Object> map = new HashMap<>();
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            map.put("statu",0);
            return map;
        }
        return map;
    }

}
