package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.SuggestionComplaints;
import com.pjb.service.SuggestionComplaintService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/7 15:06
 */
@Api("投诉建议管理")
@RestController
@RequestMapping("/alpha/SuggestionComplaints")
public class SuggestionComplaintController extends BaseController<SuggestionComplaints> {

    @Autowired
    private SuggestionComplaintService service;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SuggestionComplaints add(@RequestBody SuggestionComplaints info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public SuggestionComplaints entity(@PathVariable String id) {
        return service.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody SuggestionComplaints info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @GetMapping("/condition")
    public PageInfo<SuggestionComplaints> pageByCondition(@ModelAttribute SuggestionComplaints info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<SuggestionComplaints> listByCondition = service.selectByAll();
            PageInfo<SuggestionComplaints> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<SuggestionComplaints> listByCondition = service.listByCondition(info);
        PageInfo<SuggestionComplaints> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
