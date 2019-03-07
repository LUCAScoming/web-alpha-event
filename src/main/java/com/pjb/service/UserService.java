package com.pjb.service;

import com.pjb.entity.UserInfo;
import com.pjb.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/3/5
 **/
@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    public List<UserInfo> getUserInfo(){
        return userInfoMapper.selectAll();
    }
}
