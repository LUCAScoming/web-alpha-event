package com.pjb.mapper;


import com.pjb.entity.OwnerFamily;

public interface OwnerFamilyMapper {
    int deleteByPrimaryKey(String id);

    int insert(OwnerFamily record);

    int insertSelective(OwnerFamily record);

    OwnerFamily selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OwnerFamily record);

    int updateByPrimaryKey(OwnerFamily record);
}