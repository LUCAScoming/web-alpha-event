package com.pjb.service;

import com.pjb.base.BaseService;
import com.pjb.entity.House;
import com.pjb.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/5/1
 **/
@Service
public class HouseService extends BaseService<House> {
    @Autowired
    private HouseMapper houseMapper;

    public House selectById(String id){

       return houseMapper.selectByPrimaryKey(id);
    }
}
