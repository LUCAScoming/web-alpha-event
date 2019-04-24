package com.pjb.mapper;


import com.pjb.entity.OwnerInfo;

public interface OwnerInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(OwnerInfo record);

    int insertSelective(OwnerInfo record);

    OwnerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OwnerInfo record);

    int updateByPrimaryKey(OwnerInfo record);
}