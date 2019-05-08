package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.EquipmentInfo;
import com.pjb.service.EquipmentInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/7 13:59
 */
@Api(description = "基础设备维护实体")
@RestController
@RequestMapping("/alpha/EquipmentInfo")
public class EquipmentInfoController extends BaseController<EquipmentInfo> {

    @Autowired
    private EquipmentInfoService service;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EquipmentInfo add(@RequestBody EquipmentInfo info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public EquipmentInfo entity(@PathVariable String id) {
        return service.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody EquipmentInfo info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @GetMapping("/condition")
    public PageInfo<EquipmentInfo> pageByCondition(@ModelAttribute EquipmentInfo info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<EquipmentInfo> listByCondition = service.selectByAll();
            PageInfo<EquipmentInfo> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<EquipmentInfo> listByCondition = service.listByCondition(info);
        PageInfo<EquipmentInfo> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
