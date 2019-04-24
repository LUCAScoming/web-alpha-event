package com.pjb.mapper;


import com.pjb.entity.Property;

public interface PropertyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}