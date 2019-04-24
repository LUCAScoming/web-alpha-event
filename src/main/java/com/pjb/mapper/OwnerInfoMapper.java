package com.pjb.mapper;


import com.pjb.base.BaseMapper;
import com.pjb.entity.OwnerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OwnerInfoMapper extends BaseMapper<OwnerInfo> {
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