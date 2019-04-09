package com.pjb.mapper;

import com.pjb.config.MyMapper;
import com.pjb.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/
@Component
public interface UserMapper extends MyMapper<User> {

}
