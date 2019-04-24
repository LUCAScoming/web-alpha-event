package com.pjb.mapper;


import com.pjb.entity.RepairInfo;

public interface RepairInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(RepairInfo record);

    int insertSelective(RepairInfo record);

    RepairInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RepairInfo record);

    int updateByPrimaryKey(RepairInfo record);
}