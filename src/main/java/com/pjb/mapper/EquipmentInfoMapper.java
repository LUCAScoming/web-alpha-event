package com.pjb.mapper;


import com.pjb.entity.EquipmentInfo;

public interface EquipmentInfoMapper {
    int deleteByPrimaryKey(String equipmentId);

    int insert(EquipmentInfo record);

    int insertSelective(EquipmentInfo record);

    EquipmentInfo selectByPrimaryKey(String equipmentId);

    int updateByPrimaryKeySelective(EquipmentInfo record);

    int updateByPrimaryKey(EquipmentInfo record);
}