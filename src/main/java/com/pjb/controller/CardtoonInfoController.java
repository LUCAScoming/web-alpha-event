package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.CardtoonInfo;
import com.pjb.service.CardtoonInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/6 14:25
 */
@Api("一卡通管理")
@RestController
@RequestMapping("/alpha/CardtoonInfo")
public class CardtoonInfoController extends BaseController<CardtoonInfo> {

    @Autowired
    private CardtoonInfoService cardtoonInfoService;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CardtoonInfo add(@RequestBody CardtoonInfo announcementInfo) {
        return super.add(announcementInfo);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public CardtoonInfo entity(@PathVariable String id) {
        return cardtoonInfoService.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody CardtoonInfo info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @PostMapping("/condition")
    public PageInfo<CardtoonInfo> pageByCondition(@RequestBody CardtoonInfo info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<CardtoonInfo> listByCondition = cardtoonInfoService.selectByAll();
            PageInfo<CardtoonInfo> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<CardtoonInfo> listByCondition = cardtoonInfoService.listByCondition(info);
        PageInfo<CardtoonInfo> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
