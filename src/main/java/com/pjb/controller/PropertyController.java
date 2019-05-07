package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.Property;
import com.pjb.service.PropertyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/7 14:34
 */
@Api("物业管理人员信息")
@RestController
@RequestMapping("/alpha/Property")
public class PropertyController extends BaseController<Property> {

    @Autowired
    private PropertyService service;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Property add(@RequestBody Property info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public Property entity(@PathVariable String id) {
        return service.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody Property info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @PostMapping("/condition")
    public PageInfo<Property> pageByCondition(@RequestBody Property info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<Property> listByCondition = service.selectByAll();
            PageInfo<Property> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<Property> listByCondition = service.listByCondition(info);
        PageInfo<Property> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
