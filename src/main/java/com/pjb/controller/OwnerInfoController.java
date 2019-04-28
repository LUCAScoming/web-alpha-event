package com.pjb.controller;

import com.pjb.base.BaseController;
import com.pjb.entity.OwnerInfo;
import com.pjb.service.OwnerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
@RestController
@Api(value = "业主信息相关接口")
@RequestMapping("alpha/owner")
public class OwnerInfoController extends BaseController<OwnerInfo> {

    @Autowired
    private OwnerInfoService ownerInfoService;

    @Override
    @ApiOperation(value = "新增", notes = "", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OwnerInfo add(@RequestBody OwnerInfo ownerInfo) {
        return super.add(ownerInfo);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public OwnerInfo entity(@PathVariable String id) {
        OwnerInfo ownerInfo = new OwnerInfo();
        ownerInfo.setId(id);
        return super.select(ownerInfo);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @PostMapping("post/{id}")
    public OwnerInfo entityget(@PathVariable String id) {
        OwnerInfo ownerInfo = new OwnerInfo();
        ownerInfo.setId(id);
        return super.select(ownerInfo);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody OwnerInfo ownerInfo) {
        super.delete(ownerInfo);
    }


}
