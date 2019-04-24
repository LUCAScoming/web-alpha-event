package com.pjb.mapper;


import com.pjb.entity.AnnouncementInfo;

public interface AnnouncementInfoMapper  {
    int deleteByPrimaryKey(String id);

    int insert(AnnouncementInfo record);

    int insertSelective(AnnouncementInfo record);

    AnnouncementInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AnnouncementInfo record);

    int updateByPrimaryKey(AnnouncementInfo record);
}