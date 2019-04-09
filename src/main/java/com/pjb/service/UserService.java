package com.pjb.service;

import com.pjb.entity.User;
import com.pjb.entity.UserInfo;
import com.pjb.mapper.UserInfoMapper;
import com.pjb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
    @Autowired
    private UserMapper userMapper;
    public List<UserInfo> getUserInfo(){
        return userInfoMapper.selectAll();
    }
    public User getUser(String username,String password){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",username)
                .andEqualTo("password")
                .andEqualTo("dr",0);
        return userMapper.selectOneByExample(example);
    }

    
}
