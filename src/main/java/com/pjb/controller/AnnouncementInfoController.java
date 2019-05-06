package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.AnnouncementInfo;
import com.pjb.service.AnnouncementInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/6 14:07
 */
@Api("公告牌管理")
@RestController
@RequestMapping("/alpha/AnnouncementInfo")
public class AnnouncementInfoController extends BaseController<AnnouncementInfo> {

    @Autowired
    private AnnouncementInfoService announcementInfoService;

    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AnnouncementInfo add(@RequestBody AnnouncementInfo announcementInfo) {
        return super.add(announcementInfo);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public AnnouncementInfo entity(@PathVariable String id) {
        return announcementInfoService.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody AnnouncementInfo info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @PostMapping("/condition")
    public PageInfo<AnnouncementInfo> pageByCondition(@RequestBody AnnouncementInfo info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<AnnouncementInfo> listByCondition = announcementInfoService.selectByAll();
            PageInfo<AnnouncementInfo> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<AnnouncementInfo> listByCondition = announcementInfoService.listByCondition(info);
        PageInfo<AnnouncementInfo> infos = new PageInfo<>(listByCondition);
        return infos;
    }


}
