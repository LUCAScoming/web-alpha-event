package com.pjb.mapper;


import com.pjb.config.MyMapper;
import com.pjb.entity.OwnerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OwnerInfoMapper extends MyMapper<OwnerInfo> {
    @Select("SELECT * FROM `owner_info` ORDER BY create_dt DESC")
    List<OwnerInfo> selectByOrderBy();
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