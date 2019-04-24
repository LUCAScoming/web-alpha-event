package com.pjb.mapper;


import com.pjb.entity.CardtoonInfo;

public interface CardtoonInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CardtoonInfo record);

    int insertSelective(CardtoonInfo record);

    CardtoonInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CardtoonInfo record);

    int updateByPrimaryKey(CardtoonInfo record);
}