package com.pjb.mapper;

import com.pjb.entity.CostInfo;

public interface CostInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CostInfo record);

    int insertSelective(CostInfo record);

    CostInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CostInfo record);

    int updateByPrimaryKey(CostInfo record);
}