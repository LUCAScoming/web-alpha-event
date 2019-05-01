package com.pjb.config;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/3/5
 **/
@RegisterMapper
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
