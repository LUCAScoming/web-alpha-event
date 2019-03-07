package com.pjb.controller;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.pjb.entity.UserInfo;
import com.pjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/alpha")
public class UserInfoController {
    @Autowired
    private UserService userService;

    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @ResponseBody
//    @RequiresPermissions("userInfo:view")//权限管理;
   public List<UserInfo> getUser( ){
        return userService.getUserInfo();
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
//    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
//    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }
}
