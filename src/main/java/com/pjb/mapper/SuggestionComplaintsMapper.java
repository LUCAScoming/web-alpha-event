package com.pjb.mapper;


import com.pjb.entity.SuggestionComplaints;

public interface SuggestionComplaintsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SuggestionComplaints record);

    int insertSelective(SuggestionComplaints record);

    SuggestionComplaints selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SuggestionComplaints record);

    int updateByPrimaryKey(SuggestionComplaints record);
}