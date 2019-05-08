package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.ParkingRecord;
import com.pjb.service.ParkingRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/7 14:09
 */
@Api("停车记录管理")
@RestController
@RequestMapping("/alpha/ParkingRecord")
public class ParkingRecordController extends BaseController<ParkingRecord> {

    @Autowired
    private ParkingRecordService service;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ParkingRecord add(@RequestBody ParkingRecord info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public ParkingRecord entity(@PathVariable String id) {
        return service.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody ParkingRecord info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @GetMapping("/condition")
    public PageInfo<ParkingRecord> pageByCondition(@ModelAttribute ParkingRecord info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<ParkingRecord> listByCondition = service.selectByAll();
            PageInfo<ParkingRecord> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<ParkingRecord> listByCondition = service.listByCondition(info);
        PageInfo<ParkingRecord> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
