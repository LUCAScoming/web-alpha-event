package com.pjb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjb.base.BaseController;
import com.pjb.entity.MusicInfo;
import com.pjb.service.MusicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zl_liao
 * 2019/5/6 15:43
 */
@Api("小区广播管理")
@RestController
@RequestMapping("/alpha/MusicInfo")
public class MusicInfoController extends BaseController<MusicInfo> {
    @Autowired
    private MusicInfoService musicInfoService;


    @Override
    @ApiOperation(value = "新增或者修改", notes = "修改的时候传入实体id", produces = "application/json")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MusicInfo add(@RequestBody MusicInfo info) {
        return super.add(info);
    }


    @ApiOperation(value = "查找", notes = "通过id返回对象实体", produces = "application/json")
    @GetMapping("/{id}")
    public MusicInfo entity(@PathVariable String id) {
        return musicInfoService.selectById(id);
    }


    @Override
    @ApiOperation(value = "删除", notes = "通过实体没有返回", produces = "application/json")
    @DeleteMapping()
    public void delete(@RequestBody MusicInfo info) {
        super.delete(info);
    }


    @ApiOperation(value = "查询分页")
    @GetMapping("/condition")
    public PageInfo<MusicInfo> pageByCondition(@ModelAttribute MusicInfo info) {
        if (info == null) {
            PageHelper.startPage(1, 10);
            List<MusicInfo> listByCondition = musicInfoService.selectByAll();
            PageInfo<MusicInfo> infos = new PageInfo<>(listByCondition);
            return infos;
        }
        PageHelper.startPage(info.getPageNum(), info.getPageSize());
//        List<OwnerInfo> listByCondition = ownerInfoService.selectByAll();
        List<MusicInfo> listByCondition = musicInfoService.listByCondition(info);
        PageInfo<MusicInfo> infos = new PageInfo<>(listByCondition);
        return infos;
    }

}
