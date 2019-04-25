package com.pjb.service;

import com.pjb.base.BaseService;
import com.pjb.config.BussinessException;
import com.pjb.config.Constant;
import com.pjb.entity.OwnerInfo;
import com.pjb.mapper.OwnerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Service
public class OwnerInfoService extends BaseService<OwnerInfo> {

    @Autowired
    private OwnerInfoMapper ownerInfoMapper;


}
