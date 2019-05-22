package com.pjb.service;

import com.pjb.base.BaseService;
import com.pjb.entity.OwnerInfo;
import com.pjb.mapper.OwnerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@Service
public class OwnerInfoService extends BaseService<OwnerInfo> {

    @Autowired
    private OwnerInfoMapper ownerInfoMapper;


    public List<OwnerInfo> listByOrdeBY() {
        return ownerInfoMapper.selectByOrderBy();

    }

    public void sort(List<OwnerInfo> list) {
        Collections.sort(list, new Comparator<OwnerInfo>() {
            @Override
            public int compare(OwnerInfo o1, OwnerInfo o2) {
                return o1.getCreateDt().compareTo(o2.getCreateDt());
            }
        });
    }
}
