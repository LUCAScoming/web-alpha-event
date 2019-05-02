package com.pjb.mapper;


import com.pjb.config.MyMapper;
import com.pjb.entity.OwnerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OwnerInfoMapper extends MyMapper<OwnerInfo> {
//    int deleteByPrimaryKey(String id);
//
//    int insert(OwnerInfo record);
//
//    int insertSelective(OwnerInfo record);
//
//    OwnerInfo selectByPrimaryKey(String id);
//
//    int updateByPrimaryKeySelective(OwnerInfo record);
//
//    int updateByPrimaryKey(OwnerInfo record);
}