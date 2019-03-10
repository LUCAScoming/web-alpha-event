package com.pjb.controller;

//import org.apache.shiro.authz.annotation.RequiresPermissions;

import com.pjb.entity.UserInfo;
import com.pjb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(description = "用户接口")
@Controller
@RequestMapping("/alpha")
public class UserInfoController {
    @Autowired
    private UserService userService;

    /**
     * 用户查询.
     *
     * @return
     */
    @ApiOperation(value = "用户查询", notes = "", produces = "application/json")
    @GetMapping("/userList")
    @ResponseBody
//    @RequiresPermissions("userInfo:view")//权限管理;
    public List<UserInfo> getUser() {
        return userService.getUserInfo();
    }

    /**
     * 用户删除;
     *
     * @return
     */
    @ApiOperation(value = "用户删除", notes = "", produces = "application/json")
    @GetMapping("/userDel")
//    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel() {
        return "userInfoDel";
    }

    /**
     * 用户添加;
     *
     * @return
     */
    @ApiOperation(value = "用户添加", notes = "", produces = "application/json")
    @GetMapping("/userAdd")
//    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd() {
        return "userInfoAdd";
    }
}
