package com.pjb.mapper;


import com.pjb.entity.ParkingRecord;

public interface ParkingRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ParkingRecord record);

    int insertSelective(ParkingRecord record);

    ParkingRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ParkingRecord record);

    int updateByPrimaryKey(ParkingRecord record);
}