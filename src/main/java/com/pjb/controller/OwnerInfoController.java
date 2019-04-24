package com.pjb.controller;

import com.pjb.entity.OwnerInfo;
import com.pjb.service.OwnerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@RestController
@Api(value = "业主信息相关接口")
@RequestMapping("alpha/owner")
public class OwnerInfoController {

    @Autowired
    private OwnerInfoService ownerInfoService;

    @ApiOperation(value = "新增", notes = "", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OwnerInfo add(@RequestBody OwnerInfo ownerInfo) {

        return ownerInfoService.add(ownerInfo);

    }
}
