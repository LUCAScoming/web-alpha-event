package com.pjb.mapper;

import com.pjb.config.MyMapper;
import com.pjb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author jinbin
 * @date 2017-12-01 20:58
 */
@Component
public interface UserInfoMapper extends MyMapper<UserInfo> {
    //通过username查找用户信息
    UserInfo findByUsername(@Param("username") String username);


}
