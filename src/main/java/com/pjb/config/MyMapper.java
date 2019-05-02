package com.pjb.config;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.rowbounds.SelectByConditionRowBoundsMapper;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/3/5
 **/
@RegisterMapper
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
