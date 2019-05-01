package com.pjb.mapper;

import com.pjb.config.MyMapper;
import com.pjb.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface HouseMapper extends MyMapper<House> {
//    int deleteByPrimaryKey(String id);
//
//    int insert(House record);
//
//    int insertSelective(House record);
//
//    House selectByPrimaryKey(String id);
//
//    int updateByPrimaryKeySelective(House record);
//
//    int updateByPrimaryKey(House record);
}