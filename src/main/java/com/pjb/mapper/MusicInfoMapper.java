package com.pjb.mapper;


import com.pjb.entity.MusicInfo;

public interface MusicInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(MusicInfo record);

    int insertSelective(MusicInfo record);

    MusicInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MusicInfo record);

    int updateByPrimaryKey(MusicInfo record);
}