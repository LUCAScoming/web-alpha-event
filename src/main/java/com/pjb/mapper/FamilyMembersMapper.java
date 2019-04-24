package com.pjb.mapper;


import com.pjb.entity.FamilyMembers;

public interface FamilyMembersMapper {
    int deleteByPrimaryKey(String id);

    int insert(FamilyMembers record);

    int insertSelective(FamilyMembers record);

    FamilyMembers selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FamilyMembers record);

    int updateByPrimaryKeyWithBLOBs(FamilyMembers record);

    int updateByPrimaryKey(FamilyMembers record);
}