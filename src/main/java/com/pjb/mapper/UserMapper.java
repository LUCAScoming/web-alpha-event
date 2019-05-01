package com.pjb.mapper;

import com.pjb.config.MyMapper;
import com.pjb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/
@Component
@Mapper
public interface UserMapper extends MyMapper<User> {

}
