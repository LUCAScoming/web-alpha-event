package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.CostInfo;
import com.pjb.service.CostInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/6 14:31
 */
@RestController
@RequestMapping("/alpha/CostInfo")
public class CostInfoController extends BaseController<CostInfo> {

    @Autowired
    private CostInfoService costInfoService;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CostInfo add(@RequestBody CostInfo info) {
        return costInfoService.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public CostInfo entity(@PathVariable String id) {
        return costInfoService.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody CostInfo info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @PostMapping("/condition")
    public PageInfo<CostInfo> pageByCondition(@RequestBody CostInfo info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<CostInfo> listByCondition = costInfoService.selectByAll();
            PageInfo<CostInfo> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<CostInfo> listByCondition = costInfoService.listByCondition(info);
        PageInfo<CostInfo> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
