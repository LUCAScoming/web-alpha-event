package com.pjb.base;

import com.pjb.config.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Mapper
@Component
public interface BaseMapper<T extends BaseEntity> extends MyMapper<T> {
    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
